package ma.sdia.micro_service_project.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Vehicle {
    @Id
    private String id;
    private String licensePlateNumber;
    private String brand;
    private double fiscalPower;
    private String model;
    @ManyToOne
    private Owner owner;
}
