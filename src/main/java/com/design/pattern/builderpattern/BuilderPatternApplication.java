package com.design.pattern.builderpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author muhammad bilal
 * @email bilal.hobnail@gmail.com
 */
@SpringBootApplication
public class BuilderPatternApplication {


	public static void main(String[] args) {
		SpringApplication.run(BuilderPatternApplication.class, args);
        System.out.println();
		System.out.println("Starting Spring-Boot Application: Builder Design Pattern...!");

		Driver.builder().setName("Bilal").setAge(20)
				.setGender(Gender.MALE.name())
				.setMaritalStatus(MaritalStatus.SINGLE.name())
				.build();


	}
}
