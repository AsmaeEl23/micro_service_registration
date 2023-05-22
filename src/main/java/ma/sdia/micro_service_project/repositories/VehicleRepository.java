package ma.sdia.micro_service_project.repositories;

import ma.sdia.micro_service_project.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,String> {
}