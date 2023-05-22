package ma.sdia.micro_service_project.service;


import ma.sdia.micro_service_project.DTO.VehicleRequestDTO;
import ma.sdia.micro_service_project.DTO.VehicleResponseDTO;

public interface VehicleService  {
     VehicleResponseDTO addVehicle(VehicleRequestDTO vehicleRequestDTO);
     VehicleResponseDTO update(String id, VehicleRequestDTO vehicleRequestDTO);
}
