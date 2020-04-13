package com.covid.corona.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.covid.corona.beans.CoronaApplicationBean;

@Component
public interface CoronaApplicationService {
	
	public List<CoronaApplicationBean> getCoronaData();
	
}
