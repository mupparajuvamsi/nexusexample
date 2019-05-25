package com.example.crudrestapiexample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages="com.example.crudrestapiexample")
public class Example {


	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

}