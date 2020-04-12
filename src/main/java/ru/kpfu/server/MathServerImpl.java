package ru.kpfu.server;

import io.grpc.stub.StreamObserver;
import ru.kpfu.grpc.generated.MathNumber;
import ru.kpfu.grpc.generated.MathRequest;
import ru.kpfu.grpc.generated.MathResponse;
import ru.kpfu.grpc.generated.MathServiceGrpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MathServerImpl extends MathServiceGrpc.MathServiceImplBase {

    private double calcSTD(List<Double> numbersList) {
        double sum1 = 0;
        double sum2 = 0;
        double stdev = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            sum1 += numbersList.get(i);
            sum2 += Math.pow(numbersList.get(i), 2);

            stdev = Math.sqrt(sum1 * sum1 - i * sum2) / i;
        }
        return stdev;
    }


    private List<Integer> calcSimpleFactors(double num) {
        List<Integer> result = new LinkedList<>();
        int x = (int) num;
        double sqrt = Math.sqrt(x);
        int currentValue = x;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt) {
            if (currentValue % multiplier == 0) {
                result.add(currentValue);
                currentValue /= multiplier;
            } else if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if (currentValue != 1) {
            result.add(currentValue);
        }
        return result;
    }


    @Override
    public void sqrt(MathRequest request, StreamObserver<MathResponse> responseObserver) {
        MathNumber mathNumber = request.getNumber();
        double number = mathNumber.getNumber();
        double result = Math.sqrt(number);
        MathResponse response = MathResponse.newBuilder()
                .setResult(result)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void simpleFactors(MathRequest request, StreamObserver<MathResponse> responseObserver) {
        MathNumber mathNumber = request.getNumber();
        double number = mathNumber.getNumber();
        try {
            List<Integer> simpleFactors = calcSimpleFactors(number);
            for (Integer mul : simpleFactors) {
                double result = mul;
                MathResponse response = MathResponse.newBuilder()
                        .setResult(result)
                        .build();
                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();

        }
    }

    @Override
    public StreamObserver<MathRequest> std(StreamObserver<MathResponse> responseObserver) {
        List<Double> nums = new ArrayList<>();

        return new StreamObserver<MathRequest>() {
            double result = 0;

            @Override
            public void onNext(MathRequest mathRequest) {
                nums.add(mathRequest.getNumber().getNumber());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                result = calcSTD(nums);
                responseObserver.onNext(MathResponse.newBuilder()
                        .setResult(result)
                        .build());
                responseObserver.onCompleted();
            }
        };

    }


    @Override
    public StreamObserver<MathRequest> maxNum(StreamObserver<MathResponse> responseObserver) {
        List<Double> numbersList = new LinkedList<>();

        return new StreamObserver<MathRequest>() {
            @Override
            public void onNext(MathRequest value) {
                double number = value.getNumber().getNumber();
                numbersList.add(number);

                double result = Collections.max(numbersList);

                MathResponse mathResponse = MathResponse.newBuilder()
                        .setResult(result)
                        .build();
                responseObserver.onNext(mathResponse);
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
