package ma.sdia.micro_service_project.web;

import lombok.AllArgsConstructor;
import ma.sdia.micro_service_project.DTO.VehicleRequestDTO;
import ma.sdia.micro_service_project.DTO.VehicleResponseDTO;
import ma.sdia.micro_service_project.entities.Owner;
import ma.sdia.micro_service_project.entities.Vehicle;
import ma.sdia.micro_service_project.repositories.OwnerRepository;
import ma.sdia.micro_service_project.repositories.VehicleRepository;
import ma.sdia.micro_service_project.service.VehicleServiceImpl;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class RegistrationGraphqlController {
    private OwnerRepository ownerRepository;
    private VehicleRepository vehicleRepository;
    private VehicleServiceImpl vehicleService;

    @QueryMapping
    public List<Owner> owners() {
        return ownerRepository.findAll();
    }

    @QueryMapping
    public Owner ownerById(@Argument Long id) {
        return ownerRepository.findById(id).get();
    }

    @MutationMapping
    public Owner saveOwner(@Argument Owner owner) {
        return ownerRepository.save(owner);
    }

    /////////////////////////////////////////////

    @QueryMapping
    public List<Vehicle> vehicles() {
        return vehicleRepository.findAll();
    }

    @QueryMapping
    public Vehicle vehicleById(@Argument String id) {
        return vehicleRepository.findById(id).get();
    }

    @MutationMapping
    public VehicleResponseDTO addVehicle(@Argument VehicleRequestDTO vehicle) {
        return vehicleService.addVehicle(vehicle);
    }

    @MutationMapping
    public VehicleResponseDTO updateVehicle(@Argument String id, @Argument VehicleRequestDTO vehicle) {
        return vehicleService.update(id,vehicle);
    }

    @MutationMapping
    public boolean deleteVehicle(@Argument String id) {
        vehicleRepository.deleteById(id);
        return true;
    }
}
