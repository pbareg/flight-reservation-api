package org.airlines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Arrays;

@SpringBootApplication
@EntityScan("org.airlines.bean")
@EnableAspectJAutoProxy
public class AirlinesReservationSystemApplication {

	public static void main(String[] args) {
        SpringApplication.run(AirlinesReservationSystemApplication.class, args);
	}

}
