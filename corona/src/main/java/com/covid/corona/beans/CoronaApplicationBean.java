package com.covid.corona.beans;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoronaApplicationBean {

	private String State;
	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	private ArrayList<DistrictDataBean> districtData;

	public ArrayList<DistrictDataBean> getDistrictData() {
		return districtData;
	}

	public void setDistrictData(ArrayList<DistrictDataBean> districtData) {
		this.districtData = districtData;
	}
	
	
	

}
