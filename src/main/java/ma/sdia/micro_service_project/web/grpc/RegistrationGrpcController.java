package ma.sdia.micro_service_project.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import ma.sdia.micro_service_project.entities.Owner;
import ma.sdia.micro_service_project.repositories.OwnerRepository;
import ma.sdia.micro_service_project.repositories.VehicleRepository;
import ma.sdia.micro_service_project.web.grpc.stubs.Registration;
import ma.sdia.micro_service_project.web.grpc.stubs.RegistrationServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Collection;


@GrpcService
@AllArgsConstructor
public class RegistrationGrpcController extends RegistrationServiceGrpc.RegistrationServiceImplBase {
    private final OwnerRepository ownerRepository;
    private final VehicleRepository vehicleRepository;

    @Override
    public void getOwners(Registration.Empty request, StreamObserver<Registration.OwnerList> responseObserver) {
        Collection<Owner> owners = ownerRepository.findAll();
        Registration.OwnerList.Builder response = Registration.OwnerList.newBuilder();
        for (Owner owner : owners) {
            Registration.Owner ownerResponse = Registration.Owner.newBuilder()
                    .setId(owner.getId().intValue())
                    .setName(owner.getName())
                    .setEmail(owner.getEmail())
                    .build();
            response.addOwners(ownerResponse);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getOwner(Registration.OwnerId request, StreamObserver<Registration.Owner> responseObserver) {
        Long ownerId = (long)request.getId();
        if(ownerRepository.existsById(ownerId)){
            Owner owner = ownerRepository.findById(ownerId).orElse(null);
            Registration.Owner ownerResponse = Registration.Owner.newBuilder()
                    .setId(owner.getId().intValue())
                    .setName(owner.getName())
                    .setEmail(owner.getEmail())
                    .build();
            responseObserver.onNext(ownerResponse);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void saveOwner(Registration.OwnerRequest request, StreamObserver<Registration.Owner> responseObserver) {
        super.saveOwner(request, responseObserver);
    }

    @Override
    public void updateOwner(Registration.OwnerUpdateRequest request, StreamObserver<Registration.Owner> responseObserver) {
        super.updateOwner(request, responseObserver);
    }

    @Override
    public void deleteOwner(Registration.OwnerId request, StreamObserver<Registration.Empty> responseObserver) {
        super.deleteOwner(request, responseObserver);
    }

    @Override
    public void getVehicles(Registration.Empty request, StreamObserver<Registration.VehicleList> responseObserver) {
        super.getVehicles(request, responseObserver);
    }

    @Override
    public void getVehicle(Registration.VehicleId request, StreamObserver<Registration.Vehicle> responseObserver) {
        super.getVehicle(request, responseObserver);
    }

    @Override
    public void saveVehicle(Registration.VehicleRequest request, StreamObserver<Registration.Vehicle> responseObserver) {
        super.saveVehicle(request, responseObserver);
    }

    @Override
    public void updateVehicle(Registration.VehicleUpdateRequest request, StreamObserver<Registration.Vehicle> responseObserver) {
        super.updateVehicle(request, responseObserver);
    }

    @Override
    public void deleteVehicle(Registration.VehicleId request, StreamObserver<Registration.Empty> responseObserver) {
        super.deleteVehicle(request, responseObserver);
    }
}
