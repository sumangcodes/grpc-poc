package com.example.grpc;

import com.example.grpc.GreeterProto.HelloReply;
import com.example.grpc.GreeterProto.HelloRequest;

import io.grpc.stub.StreamObserver;

public class GreeterService extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String name = request.getName();
        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello, " + name + "!")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
