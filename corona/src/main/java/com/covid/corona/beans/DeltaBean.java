package com.covid.corona.beans;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeltaBean {

	 private String confirmed;

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}
	
	
}
