package ma.sdia.micro_service_project.web.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: registration.proto")
public final class RegistrationServiceGrpc {

  private RegistrationServiceGrpc() {}

  public static final String SERVICE_NAME = "RegistrationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList> getGetOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOwners",
      requestType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty.class,
      responseType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList> getGetOwnersMethod() {
    io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty, ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList> getGetOwnersMethod;
    if ((getGetOwnersMethod = RegistrationServiceGrpc.getGetOwnersMethod) == null) {
      synchronized (RegistrationServiceGrpc.class) {
        if ((getGetOwnersMethod = RegistrationServiceGrpc.getGetOwnersMethod) == null) {
          RegistrationServiceGrpc.getGetOwnersMethod = getGetOwnersMethod = 
              io.grpc.MethodDescriptor.<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty, ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationService", "getOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationServiceMethodDescriptorSupplier("getOwners"))
                  .build();
          }
        }
     }
     return getGetOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> getGetOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOwner",
      requestType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId.class,
      responseType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> getGetOwnerMethod() {
    io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> getGetOwnerMethod;
    if ((getGetOwnerMethod = RegistrationServiceGrpc.getGetOwnerMethod) == null) {
      synchronized (RegistrationServiceGrpc.class) {
        if ((getGetOwnerMethod = RegistrationServiceGrpc.getGetOwnerMethod) == null) {
          RegistrationServiceGrpc.getGetOwnerMethod = getGetOwnerMethod = 
              io.grpc.MethodDescriptor.<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationService", "getOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationServiceMethodDescriptorSupplier("getOwner"))
                  .build();
          }
        }
     }
     return getGetOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> getSaveOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveOwner",
      requestType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest.class,
      responseType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> getSaveOwnerMethod() {
    io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> getSaveOwnerMethod;
    if ((getSaveOwnerMethod = RegistrationServiceGrpc.getSaveOwnerMethod) == null) {
      synchronized (RegistrationServiceGrpc.class) {
        if ((getSaveOwnerMethod = RegistrationServiceGrpc.getSaveOwnerMethod) == null) {
          RegistrationServiceGrpc.getSaveOwnerMethod = getSaveOwnerMethod = 
              io.grpc.MethodDescriptor.<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationService", "saveOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationServiceMethodDescriptorSupplier("saveOwner"))
                  .build();
          }
        }
     }
     return getSaveOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> getUpdateOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateOwner",
      requestType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest.class,
      responseType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> getUpdateOwnerMethod() {
    io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> getUpdateOwnerMethod;
    if ((getUpdateOwnerMethod = RegistrationServiceGrpc.getUpdateOwnerMethod) == null) {
      synchronized (RegistrationServiceGrpc.class) {
        if ((getUpdateOwnerMethod = RegistrationServiceGrpc.getUpdateOwnerMethod) == null) {
          RegistrationServiceGrpc.getUpdateOwnerMethod = getUpdateOwnerMethod = 
              io.grpc.MethodDescriptor.<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationService", "updateOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationServiceMethodDescriptorSupplier("updateOwner"))
                  .build();
          }
        }
     }
     return getUpdateOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> getDeleteOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteOwner",
      requestType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId.class,
      responseType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> getDeleteOwnerMethod() {
    io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> getDeleteOwnerMethod;
    if ((getDeleteOwnerMethod = RegistrationServiceGrpc.getDeleteOwnerMethod) == null) {
      synchronized (RegistrationServiceGrpc.class) {
        if ((getDeleteOwnerMethod = RegistrationServiceGrpc.getDeleteOwnerMethod) == null) {
          RegistrationServiceGrpc.getDeleteOwnerMethod = getDeleteOwnerMethod = 
              io.grpc.MethodDescriptor.<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationService", "deleteOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationServiceMethodDescriptorSupplier("deleteOwner"))
                  .build();
          }
        }
     }
     return getDeleteOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList> getGetVehiclesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicles",
      requestType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty.class,
      responseType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList> getGetVehiclesMethod() {
    io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty, ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList> getGetVehiclesMethod;
    if ((getGetVehiclesMethod = RegistrationServiceGrpc.getGetVehiclesMethod) == null) {
      synchronized (RegistrationServiceGrpc.class) {
        if ((getGetVehiclesMethod = RegistrationServiceGrpc.getGetVehiclesMethod) == null) {
          RegistrationServiceGrpc.getGetVehiclesMethod = getGetVehiclesMethod = 
              io.grpc.MethodDescriptor.<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty, ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationService", "getVehicles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationServiceMethodDescriptorSupplier("getVehicles"))
                  .build();
          }
        }
     }
     return getGetVehiclesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> getGetVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicle",
      requestType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId.class,
      responseType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> getGetVehicleMethod() {
    io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> getGetVehicleMethod;
    if ((getGetVehicleMethod = RegistrationServiceGrpc.getGetVehicleMethod) == null) {
      synchronized (RegistrationServiceGrpc.class) {
        if ((getGetVehicleMethod = RegistrationServiceGrpc.getGetVehicleMethod) == null) {
          RegistrationServiceGrpc.getGetVehicleMethod = getGetVehicleMethod = 
              io.grpc.MethodDescriptor.<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationService", "getVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationServiceMethodDescriptorSupplier("getVehicle"))
                  .build();
          }
        }
     }
     return getGetVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> getSaveVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveVehicle",
      requestType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest.class,
      responseType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> getSaveVehicleMethod() {
    io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> getSaveVehicleMethod;
    if ((getSaveVehicleMethod = RegistrationServiceGrpc.getSaveVehicleMethod) == null) {
      synchronized (RegistrationServiceGrpc.class) {
        if ((getSaveVehicleMethod = RegistrationServiceGrpc.getSaveVehicleMethod) == null) {
          RegistrationServiceGrpc.getSaveVehicleMethod = getSaveVehicleMethod = 
              io.grpc.MethodDescriptor.<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationService", "saveVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationServiceMethodDescriptorSupplier("saveVehicle"))
                  .build();
          }
        }
     }
     return getSaveVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> getUpdateVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateVehicle",
      requestType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest.class,
      responseType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> getUpdateVehicleMethod() {
    io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> getUpdateVehicleMethod;
    if ((getUpdateVehicleMethod = RegistrationServiceGrpc.getUpdateVehicleMethod) == null) {
      synchronized (RegistrationServiceGrpc.class) {
        if ((getUpdateVehicleMethod = RegistrationServiceGrpc.getUpdateVehicleMethod) == null) {
          RegistrationServiceGrpc.getUpdateVehicleMethod = getUpdateVehicleMethod = 
              io.grpc.MethodDescriptor.<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationService", "updateVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationServiceMethodDescriptorSupplier("updateVehicle"))
                  .build();
          }
        }
     }
     return getUpdateVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> getDeleteVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteVehicle",
      requestType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId.class,
      responseType = ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId,
      ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> getDeleteVehicleMethod() {
    io.grpc.MethodDescriptor<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> getDeleteVehicleMethod;
    if ((getDeleteVehicleMethod = RegistrationServiceGrpc.getDeleteVehicleMethod) == null) {
      synchronized (RegistrationServiceGrpc.class) {
        if ((getDeleteVehicleMethod = RegistrationServiceGrpc.getDeleteVehicleMethod) == null) {
          RegistrationServiceGrpc.getDeleteVehicleMethod = getDeleteVehicleMethod = 
              io.grpc.MethodDescriptor.<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId, ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RegistrationService", "deleteVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationServiceMethodDescriptorSupplier("deleteVehicle"))
                  .build();
          }
        }
     }
     return getDeleteVehicleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegistrationServiceStub newStub(io.grpc.Channel channel) {
    return new RegistrationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegistrationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RegistrationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegistrationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RegistrationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RegistrationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getOwners(ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOwnersMethod(), responseObserver);
    }

    /**
     */
    public void getOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOwnerMethod(), responseObserver);
    }

    /**
     */
    public void saveOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveOwnerMethod(), responseObserver);
    }

    /**
     */
    public void updateOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOwnerMethod(), responseObserver);
    }

    /**
     */
    public void deleteOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOwnerMethod(), responseObserver);
    }

    /**
     */
    public void getVehicles(ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiclesMethod(), responseObserver);
    }

    /**
     */
    public void getVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehicleMethod(), responseObserver);
    }

    /**
     */
    public void saveVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveVehicleMethod(), responseObserver);
    }

    /**
     */
    public void updateVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVehicleMethod(), responseObserver);
    }

    /**
     */
    public void deleteVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVehicleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOwnersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty,
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList>(
                  this, METHODID_GET_OWNERS)))
          .addMethod(
            getGetOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId,
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner>(
                  this, METHODID_GET_OWNER)))
          .addMethod(
            getSaveOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest,
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner>(
                  this, METHODID_SAVE_OWNER)))
          .addMethod(
            getUpdateOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest,
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner>(
                  this, METHODID_UPDATE_OWNER)))
          .addMethod(
            getDeleteOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId,
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty>(
                  this, METHODID_DELETE_OWNER)))
          .addMethod(
            getGetVehiclesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty,
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList>(
                  this, METHODID_GET_VEHICLES)))
          .addMethod(
            getGetVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId,
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle>(
                  this, METHODID_GET_VEHICLE)))
          .addMethod(
            getSaveVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest,
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle>(
                  this, METHODID_SAVE_VEHICLE)))
          .addMethod(
            getUpdateVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest,
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle>(
                  this, METHODID_UPDATE_VEHICLE)))
          .addMethod(
            getDeleteVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId,
                ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty>(
                  this, METHODID_DELETE_VEHICLE)))
          .build();
    }
  }

  /**
   */
  public static final class RegistrationServiceStub extends io.grpc.stub.AbstractStub<RegistrationServiceStub> {
    private RegistrationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistrationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistrationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOwners(ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehicles(ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiclesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId request,
        io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVehicleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RegistrationServiceBlockingStub extends io.grpc.stub.AbstractStub<RegistrationServiceBlockingStub> {
    private RegistrationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistrationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistrationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList getOwners(ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetOwnersMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner getOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId request) {
      return blockingUnaryCall(
          getChannel(), getGetOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner saveOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner updateOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty deleteOwner(ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList getVehicles(ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiclesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle getVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId request) {
      return blockingUnaryCall(
          getChannel(), getGetVehicleMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle saveVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveVehicleMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle updateVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVehicleMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty deleteVehicle(ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVehicleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RegistrationServiceFutureStub extends io.grpc.stub.AbstractStub<RegistrationServiceFutureStub> {
    private RegistrationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistrationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistrationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList> getOwners(
        ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOwnersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> getOwner(
        ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> saveOwner(
        ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner> updateOwner(
        ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> deleteOwner(
        ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList> getVehicles(
        ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiclesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> getVehicle(
        ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehicleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> saveVehicle(
        ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveVehicleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle> updateVehicle(
        ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVehicleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty> deleteVehicle(
        ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVehicleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OWNERS = 0;
  private static final int METHODID_GET_OWNER = 1;
  private static final int METHODID_SAVE_OWNER = 2;
  private static final int METHODID_UPDATE_OWNER = 3;
  private static final int METHODID_DELETE_OWNER = 4;
  private static final int METHODID_GET_VEHICLES = 5;
  private static final int METHODID_GET_VEHICLE = 6;
  private static final int METHODID_SAVE_VEHICLE = 7;
  private static final int METHODID_UPDATE_VEHICLE = 8;
  private static final int METHODID_DELETE_VEHICLE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegistrationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegistrationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_OWNERS:
          serviceImpl.getOwners((ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty) request,
              (io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerList>) responseObserver);
          break;
        case METHODID_GET_OWNER:
          serviceImpl.getOwner((ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId) request,
              (io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner>) responseObserver);
          break;
        case METHODID_SAVE_OWNER:
          serviceImpl.saveOwner((ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerRequest) request,
              (io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner>) responseObserver);
          break;
        case METHODID_UPDATE_OWNER:
          serviceImpl.updateOwner((ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerUpdateRequest) request,
              (io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Owner>) responseObserver);
          break;
        case METHODID_DELETE_OWNER:
          serviceImpl.deleteOwner((ma.sdia.micro_service_project.web.grpc.stubs.Registration.OwnerId) request,
              (io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty>) responseObserver);
          break;
        case METHODID_GET_VEHICLES:
          serviceImpl.getVehicles((ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty) request,
              (io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleList>) responseObserver);
          break;
        case METHODID_GET_VEHICLE:
          serviceImpl.getVehicle((ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId) request,
              (io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle>) responseObserver);
          break;
        case METHODID_SAVE_VEHICLE:
          serviceImpl.saveVehicle((ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleRequest) request,
              (io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle>) responseObserver);
          break;
        case METHODID_UPDATE_VEHICLE:
          serviceImpl.updateVehicle((ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleUpdateRequest) request,
              (io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Vehicle>) responseObserver);
          break;
        case METHODID_DELETE_VEHICLE:
          serviceImpl.deleteVehicle((ma.sdia.micro_service_project.web.grpc.stubs.Registration.VehicleId) request,
              (io.grpc.stub.StreamObserver<ma.sdia.micro_service_project.web.grpc.stubs.Registration.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RegistrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegistrationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.sdia.micro_service_project.web.grpc.stubs.Registration.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegistrationService");
    }
  }

  private static final class RegistrationServiceFileDescriptorSupplier
      extends RegistrationServiceBaseDescriptorSupplier {
    RegistrationServiceFileDescriptorSupplier() {}
  }

  private static final class RegistrationServiceMethodDescriptorSupplier
      extends RegistrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegistrationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RegistrationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegistrationServiceFileDescriptorSupplier())
              .addMethod(getGetOwnersMethod())
              .addMethod(getGetOwnerMethod())
              .addMethod(getSaveOwnerMethod())
              .addMethod(getUpdateOwnerMethod())
              .addMethod(getDeleteOwnerMethod())
              .addMethod(getGetVehiclesMethod())
              .addMethod(getGetVehicleMethod())
              .addMethod(getSaveVehicleMethod())
              .addMethod(getUpdateVehicleMethod())
              .addMethod(getDeleteVehicleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
