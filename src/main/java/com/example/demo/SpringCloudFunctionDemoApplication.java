package com.example.demo;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudFunctionDemoApplication {
	
	@Bean
	public Function<Lower, Upper> upperCase()
	{
		return lower -> new Upper(lower.getValue().toUpperCase());
	}
	
	@Bean
	public Function<Upper, Lower> lowerCase()
	{
		return upper -> new Lower(upper.getValue().toLowerCase());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionDemoApplication.class, args);
	}
}

class Lower
{
	private String value;

	public Lower()
	{
		
	}
	public Lower(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}

class Upper
{
	private String value;
	
	public Upper()
	{
		
	}

	public Upper(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
