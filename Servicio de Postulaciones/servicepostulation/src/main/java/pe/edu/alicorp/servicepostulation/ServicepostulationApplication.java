package pe.edu.alicorp.servicepostulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServicepostulationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicepostulationApplication.class, args);
	}

}
