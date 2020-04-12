package ru.kpfu.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class MathServer {

    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new MathServerImpl())
                .build();
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread (server::shutdown));
        server.awaitTermination();
    }
}
