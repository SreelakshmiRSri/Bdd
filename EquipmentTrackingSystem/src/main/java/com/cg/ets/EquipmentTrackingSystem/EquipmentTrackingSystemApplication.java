package com.cg.ets.EquipmentTrackingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan("com.cg.ets.beans")
@ComponentScan("com.cg.ets")
@EnableJpaRepositories("com.cg.ets.repo")
@SpringBootApplication

public class EquipmentTrackingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquipmentTrackingSystemApplication.class, args);
	}
}
