package com.github.jweslley.dropwizard;

import org.glassfish.jersey.filter.LoggingFilter;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class MyApplication extends Application<MyConfiguration> {

	public static void main(String[] args) throws Exception {
		new MyApplication().run(args);
	}

	@Override
	public void run(MyConfiguration configuration, Environment environment) throws Exception {
		if (configuration.isLogRequests()) {
			environment.jersey().register(new LoggingFilter());
		}
	}
}