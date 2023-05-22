package ma.sdia.micro_service_project.mappers;
import ma.sdia.micro_service_project.DTO.VehicleRequestDTO;
import ma.sdia.micro_service_project.DTO.VehicleResponseDTO;
import ma.sdia.micro_service_project.entities.Vehicle;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class VehicleMapper {
    public Vehicle newVehicle(VehicleRequestDTO vehicleRequestDTO){
        Vehicle vehicle=new Vehicle();
        BeanUtils.copyProperties(vehicleRequestDTO,vehicle);
        vehicle.setId(UUID.randomUUID().toString());
        return vehicle;
    }
    public VehicleResponseDTO fromBankAccount(Vehicle vehicle){
        VehicleResponseDTO vehicleResponseDTO=new VehicleResponseDTO();
        BeanUtils.copyProperties(vehicle,vehicleResponseDTO);
        return vehicleResponseDTO;
    }
}
