package ma.sdia.micro_service_project.service;

import ma.sdia.micro_service_project.DTO.VehicleRequestDTO;
import ma.sdia.micro_service_project.DTO.VehicleResponseDTO;
import ma.sdia.micro_service_project.entities.Vehicle;
import ma.sdia.micro_service_project.mappers.VehicleMapper;
import ma.sdia.micro_service_project.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service  @Transactional
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private VehicleMapper vehicleMapper;

    @Override
    public VehicleResponseDTO addVehicle(VehicleRequestDTO vehicleRequestDTO) {
        Vehicle vehicle= vehicleMapper.newVehicle(vehicleRequestDTO);
        Vehicle saveVehicle=vehicleRepository.save(vehicle);
        VehicleResponseDTO vehicleResponseDTO= vehicleMapper.fromBankAccount(saveVehicle);
        return vehicleResponseDTO;
    }

    @Override
    public VehicleResponseDTO update(String id, VehicleRequestDTO vehicleRequestDTO) {
        Vehicle vehicle= vehicleMapper.newVehicle(vehicleRequestDTO);
        vehicle.setId(id);
        Vehicle saveVehicle=vehicleRepository.save(vehicle);
        VehicleResponseDTO vehicleResponseDTO= vehicleMapper.fromBankAccount(saveVehicle);
        return vehicleResponseDTO;
    }

}
