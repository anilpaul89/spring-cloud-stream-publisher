package com.scalend.cloudpublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;

import com.scalend.cloudpublisher.publishsource.PublishSource;

@SpringBootApplication
@EnableBinding(PublishSource.class)
@ComponentScan(basePackages="com.scalend.cloudpublisher")
public class CloudpublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudpublisherApplication.class, args);
	}
}
