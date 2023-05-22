package ma.sdia.micro_service_project.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class VehicleRequestDTO {
    private String licensePlateNumber;
    private String brand;
    private double fiscalPower;
    private String model;
}
