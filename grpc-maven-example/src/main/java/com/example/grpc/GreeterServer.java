package com.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GreeterServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(8080)
                .addService(new GreeterService())
                .build();

        System.out.println("Server started on port 8080");
        server.start();
        server.awaitTermination();
    }
}
