# grpc-poc
Here’s a short and clear GitHub README for your gRPC project:

---

# gRPC Maven Example

This is an example of how to set up a gRPC server and client using Maven. The project demonstrates the use of **gRPC** and **Protocol Buffers (Protobuf)** for communication between a client and a server.

## Requirements

- Java 8 or higher
- Maven 3.x
- Protocol Buffers compiler (`protoc`)

## Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/grpc-maven-example.git
   cd grpc-maven-example
   ```

2. **Install dependencies**:
   ```bash
   mvn clean install
   ```

3. **Generate gRPC Stubs**:
   The stubs will be automatically generated when you run the build with Maven. This includes client and server code based on the `.proto` file.

4. **Run the Server**:
   Start the gRPC server:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.grpc.GreeterServer"
   ```

5. **Run the Client**:
   Run the client to send a request to the server:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.grpc.GreeterClient"
   ```

## Files

- `src/main/proto/greeter.proto`: The Protocol Buffers definition file.
- `src/main/java/com/example/grpc/GreeterServer.java`: gRPC server implementation.
- `src/main/java/com/example/grpc/GreeterClient.java`: gRPC client implementation.
- `src/main/java/com/example/grpc/GreeterService.java`: Service implementation for handling the RPC.

## Protocol Buffers Definition

```proto
syntax = "proto3";

service Greeter {
    rpc sayHello (HelloRequest) returns (HelloReply);
}

message HelloRequest {
    string name = 1;
}

message HelloReply {
    string message = 1;
}
```

