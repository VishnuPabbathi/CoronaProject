package com.covid.corona.beans;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class DistrictDataBean {


	 private String district;
	 private String confirmed;
	 private String lastupdatedtime;
	 
	 private DeltaBean delta;

	public DeltaBean getDelta() {
		return delta;
	}

	public void setDelta(DeltaBean delta) {
		this.delta = delta;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public String getLastupdatedtime() {
		return lastupdatedtime;
	}

	public void setLastupdatedtime(String lastupdatedtime) {
		this.lastupdatedtime = lastupdatedtime;
	}




}
