package com.example.grpc;

import com.example.grpc.GreeterProto.HelloReply;
import com.example.grpc.GreeterProto.HelloRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreeterClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(channel);

        HelloRequest request = HelloRequest.newBuilder().setName("World").build();
        HelloReply reply = stub.sayHello(request);

        System.out.println(reply.getMessage());

        channel.shutdown();
    }
}
