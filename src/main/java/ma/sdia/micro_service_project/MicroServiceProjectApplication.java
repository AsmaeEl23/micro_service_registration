package ma.sdia.micro_service_project;

import ma.sdia.micro_service_project.entities.Owner;
import ma.sdia.micro_service_project.entities.Vehicle;
import ma.sdia.micro_service_project.repositories.OwnerRepository;
import ma.sdia.micro_service_project.repositories.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class MicroServiceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProjectApplication.class, args);
	}
	@Bean
	CommandLineRunner start(OwnerRepository ownerRepository, VehicleRepository vehicleRepository){
		return args -> {
			Stream.of("Ahmed Salem","Narjiss Halimi","Omar bader","Salima Morahid").forEach(c->{
				Owner owner=Owner.builder()
						.name(c)
						.birthDate(new Date())
						.email(c.trim()+"@gmail.com")
						.build();
				ownerRepository.save(owner);
			});
			ownerRepository.findAll().forEach(proprietaire -> {
				for(int i=0;i<3;i++){
					Vehicle vehicle=Vehicle.builder()
							.id(UUID.randomUUID().toString())
							.brand("brand"+(i+1))
							.model("model"+(i+1))
							.licensePlateNumber(UUID.randomUUID().toString())
							.owner(proprietaire)
							.fiscalPower(Math.random()*100)
							.build();
					vehicleRepository.save(vehicle);
				}
			});
			vehicleRepository.findAll().forEach(vehicle -> {
				System.out.println(vehicle.getOwner().getName());
			});
		};
	}

}
