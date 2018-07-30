package Nutrimetic.POC.SpringcloudeurekaserviceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServiceDiscoveryApplication.class, args);
	}
}
