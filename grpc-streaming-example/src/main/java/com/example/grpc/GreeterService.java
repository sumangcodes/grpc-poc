package com.example.grpc;

import com.example.grpc.GreeterProto.HelloReply;
import com.example.grpc.GreeterProto.HelloRequest;

import io.grpc.stub.StreamObserver;

public class GreeterService  extends GreeterGrpc.GreeterImplBase
{

    public void sayHello(HelloRequest request , StreamObserver<HelloReply> responseObserver)
    {
        String  name = request.getName();

        HelloReply reply = HelloReply.newBuilder().setMessage("Hello "+name+" !").build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }
    

    public void  SayMultiHello(HelloRequest request , StreamObserver<HelloReply> respObserver)
    {
        String name = request.getName();

        for(int i=0;i<5;i++)
        {
            HelloReply helloReply=HelloReply.newBuilder().setMessage("Hello  "+name+"  the number "+i+" !").build();
        
            respObserver.onNext(helloReply);
        }

        respObserver.onCompleted();
    }

    @Override
    public StreamObserver<HelloRequest> sayStreamHello(StreamObserver<HelloReply> responseObserver) {
        return new StreamObserver<>() {
            @Override
            public void onNext(HelloRequest request) {
                String name = request.getName();
                HelloReply reply = HelloReply.newBuilder()
                        .setMessage("Hello, " + name + "!")
                        .build();
                responseObserver.onNext(reply);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
