package com.pat.di.profiles;

public class DevEnvironment implements EnvironmentService{

	@Override
	public String getEnvironment() {
		return "Dev";
	}

}
