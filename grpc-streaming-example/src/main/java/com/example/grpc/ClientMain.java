package com.example.grpc;

import com.example.grpc.GreeterProto.HelloReply;
import com.example.grpc.GreeterProto.HelloRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ClientMain {
    public static void main(String[] args) {
        // Create a channel to connect to the gRPC server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        // Create an asynchronous stub for the Greeter service
        GreeterGrpc.GreeterStub asyncStub = GreeterGrpc.newStub(channel);

        // Create a request observer for the streaming call
        StreamObserver<HelloRequest> requestObserver = asyncStub.sayStreamHello(new StreamObserver<HelloReply>() {
            @Override
            public void onNext(HelloReply reply) {
                // Handle responses from the server
                System.out.println(reply.getMessage());
            }

            @Override
            public void onError(Throwable throwable) {
                // Handle errors from the server
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                // Handle the completion of the stream
                System.out.println("Stream completed!");
            }
        });

        // Send multiple requests to the server
        for (int i = 0; i < 5; i++) {
            requestObserver.onNext(HelloRequest.newBuilder().setName("Client #" + i).build());
        }

        // Signal that all requests have been sent
        requestObserver.onCompleted();

        // Shut down the channel
        channel.shutdown();
    }
}
