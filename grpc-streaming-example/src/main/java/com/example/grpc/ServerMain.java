package com.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ServerMain {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(8080)
                .addService(new GreeterService())
                .build();

        System.out.println("Server started...");
        server.start();
        server.awaitTermination();
    }
}
