package com.scalend.cloudpublisher.publishsource;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface PublishSource {

	@Output("publisherChannel")
	MessageChannel publisher();
}
