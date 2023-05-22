package ma.sdia.micro_service_project.repositories;


import ma.sdia.micro_service_project.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
