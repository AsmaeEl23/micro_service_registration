package ma.sdia.micro_service_project.web;

import ma.sdia.micro_service_project.DTO.VehicleRequestDTO;
import ma.sdia.micro_service_project.DTO.VehicleResponseDTO;
import ma.sdia.micro_service_project.entities.Owner;
import ma.sdia.micro_service_project.entities.Vehicle;
import ma.sdia.micro_service_project.repositories.OwnerRepository;
import ma.sdia.micro_service_project.repositories.VehicleRepository;
import ma.sdia.micro_service_project.service.VehicleServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationRestController {
    private OwnerRepository ownerRepository;
    private VehicleRepository vehicleRepository;
    private VehicleServiceImpl vehicleService;
    public RegistrationRestController(OwnerRepository ownerRepository, VehicleRepository vehicleRepository,VehicleServiceImpl vehicleService){
        this.ownerRepository=ownerRepository;
        this.vehicleRepository = vehicleRepository;
        this.vehicleService=vehicleService;
    }
    @GetMapping("/owners")
    public List<Owner> proprietaires(){
        return ownerRepository.findAll();
    }
    @GetMapping("/owners/{id}")
    public Owner owner(@PathVariable Long id){
        return ownerRepository.findById(id).orElseThrow();
    }
    @PostMapping("/owners")
    public Owner save(@RequestBody Owner owner){
        return ownerRepository.save(owner);
    }
    @PutMapping("/owners/{id}")
    public Owner update(@PathVariable Long id, @RequestBody Owner owner){
        Owner owner1=ownerRepository.findById(id).orElseThrow();
        if(owner.getName()!=null) owner1.setName(owner.getName());
        if(owner.getEmail()!=null) owner1.setEmail(owner.getEmail());
        if(owner.getVehicles()!=null) owner1.setVehicles(owner.getVehicles());
        if(owner.getBirthDate()!=null) owner1.setBirthDate(owner.getBirthDate());
        return ownerRepository.save(owner1);
    }
    @DeleteMapping("/owners/{id}")
    public void delete(@PathVariable Long id){
        ownerRepository.deleteById(id);
    }


    //Four vehicles
    @GetMapping("/vehicles")
    public List<Vehicle> vehicles(){
        return vehicleRepository.findAll();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicle vehicle(@PathVariable String id){
        return vehicleRepository.findById(id).orElseThrow();
    }
    @PostMapping("/vehicles")
    public Vehicle save(@RequestBody Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }
    @PutMapping("/vehicles/{id}")
    public VehicleResponseDTO update(@PathVariable String id, @RequestBody VehicleRequestDTO vehicle){
        return vehicleService.update(id,vehicle);
        /*Vehicle v=vehicleRepository.findById(id).orElseThrow();
        if(vehicle.getModel()!=null) v.setModel(vehicle.getModel());
        if(vehicle.getBrand()!=null) v.setBrand(vehicle.getBrand());
        if(vehicle.getLicensePlateNumber()!=null) v.setLicensePlateNumber(vehicle.getLicensePlateNumber());
        v.setFiscalPower(vehicle.getFiscalPower());
        return vehicleRepository.save(v);*/
    }
    @DeleteMapping("/vehicles/{id}")
    public void delete(@PathVariable String id){
        vehicleRepository.deleteById(id);
    }

}
