package com.scalend.cloudpublisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scalend.cloudpublisher.publishsource.PublishSource;
import com.scalend.cloudpublisher.request.TestRequest;

@RestController
@RequestMapping("/publish")
public class PublisherController {

	@Autowired
	private PublishSource source;

	@PostMapping
	public void publishMessage(@RequestBody TestRequest request) {
		source.publisher().send(MessageBuilder.withPayload(request).build());
	}
}
