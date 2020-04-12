package ru.kpfu.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ru.kpfu.grpc.generated.MathNumber;
import ru.kpfu.grpc.generated.MathRequest;
import ru.kpfu.grpc.generated.MathResponse;
import ru.kpfu.grpc.generated.MathServiceGrpc;
import ru.kpfu.utils.InputUtil;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MathClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
            .usePlaintext()
            .build();
        MathClient client = new MathClient();
        client.unaryCall(channel);
        client.clientStreaming(channel);
        client.serverStreaming(channel);
        client.biDirectionalStreaming(channel);
        channel.shutdown();
    }

    private void unaryCall(ManagedChannel channel) {
        System.out.println("Unary call");
        MathServiceGrpc.MathServiceBlockingStub mathClient = MathServiceGrpc.newBlockingStub(channel);

        MathNumber number = MathNumber.newBuilder()
                .setNumber(InputUtil.enterNumber("Enter number:"))
                .build();

        MathRequest mathRequest = MathRequest.newBuilder()
                .setNumber(number)
                .build();

        MathResponse mathResponse = mathClient.sqrt(mathRequest);
        System.out.println("Result of unary call: " +  mathResponse.getResult());
        System.out.println("-------------Unary call completed-------------");
    }

    private void clientStreaming(ManagedChannel channel) {
        System.out.println("Client streaming");
        MathServiceGrpc.MathServiceStub asyncClient = MathServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<MathRequest> requestObserver = asyncClient.std(new StreamObserver<MathResponse>() {
            @Override
            public void onNext(MathResponse mathResponse) {
                System.out.println("Result: " + mathResponse.getResult());
            }

            @Override
            public void onError(Throwable throwable) {}

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });


        requestObserver.onNext(MathRequest.newBuilder()
                .setNumber(MathNumber.newBuilder()
                        .setNumber(InputUtil.enterNumber("Enter first number: "))
                        .build())
                .build());

        requestObserver.onNext(MathRequest.newBuilder()
                .setNumber(MathNumber.newBuilder()
                        .setNumber(InputUtil.enterNumber("Enter second number: "))
                        .build())
                .build());

        requestObserver.onNext(MathRequest.newBuilder()
                .setNumber(MathNumber.newBuilder()
                        .setNumber(InputUtil.enterNumber("Enter third number: "))
                        .build())
                .build());

        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-------------Client streaming completed-------------");
    }

    private void serverStreaming(ManagedChannel channel) {
        System.out.println("Server streaming");
        MathServiceGrpc.MathServiceBlockingStub mathClient = MathServiceGrpc.newBlockingStub(channel);
        MathRequest mathRequest = MathRequest.newBuilder()
                .setNumber(MathNumber.newBuilder().setNumber(123))
                .build();
        mathClient.simpleFactors(mathRequest)
                .forEachRemaining(mathResponse -> {
                    System.out.println("Result: " + mathResponse.getResult());
                });
        System.out.println("-------------Server streaming completed-------------");
    }

    private void biDirectionalStreaming(ManagedChannel channel) {
        System.out.println("Bi-Directional streaming");
        MathServiceGrpc.MathServiceStub asyncclient = MathServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<MathRequest> observer = asyncclient.maxNum(new StreamObserver<MathResponse>() {
            @Override
            public void onNext(MathResponse mathResponse) {
                System.out.println("Result: " + mathResponse.getResult());
            }

            @Override
            public void onError(Throwable throwable) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        List<Integer> numbers = new ArrayList<>();;
        for (int i = 0; i < 10; i++) {
            numbers.add(new Random().nextInt(100));
        }
        System.out.println("Generated numbers: " + Arrays.toString(numbers.toArray()));
        numbers.forEach(
                num -> observer.onNext(MathRequest.newBuilder()
                        .setNumber(MathNumber.newBuilder()
                                .setNumber(num)
                                .build())
                        .build()));

        observer.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
