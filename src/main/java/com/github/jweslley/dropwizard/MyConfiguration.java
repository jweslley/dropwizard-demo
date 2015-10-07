package com.github.jweslley.dropwizard;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

public class MyConfiguration extends Configuration {

	@JsonProperty
	private boolean logRequests;

	@Valid
	@NotNull
	@JsonProperty("database")
	private DataSourceFactory database = new DataSourceFactory();

	public void setLogRequests(boolean logRequests) {
		this.logRequests = logRequests;
	}

	public boolean isLogRequests() {
		return logRequests;
	}

	public DataSourceFactory getDatabase() {
		return database;
	}

	public void setDatabase(DataSourceFactory database) {
		this.database = database;
	}
}
