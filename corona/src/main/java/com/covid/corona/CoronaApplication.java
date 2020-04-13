package com.covid.corona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.covid.corona.beans.CoronaApplicationBean;
import com.covid.corona.beans.DistrictDataBean;
import com.covid.corona.beans.StateDataBean;
import com.covid.corona.service.CoronaApplicationService;
import com.covid.corona.service.CoronaApplicationServiceImpl;

@SpringBootApplication
public class CoronaApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext applicationContext=SpringApplication.run(CoronaApplication.class, args);
		
		CoronaApplicationServiceImpl coronaApplicationService=applicationContext.getBean(CoronaApplicationServiceImpl.class);
		
		List<CoronaApplicationBean> coronaApplicationBean=coronaApplicationService.getCoronaData();
		
		System.out.println(coronaApplicationBean.size());
		Iterator it= coronaApplicationBean.iterator();
		
		while(it.hasNext()) {
			
			CoronaApplicationBean coronaApplication=(CoronaApplicationBean)it.next();
			System.out.println("State-"+coronaApplication.getState());
			List<DistrictDataBean> districtDataBean=coronaApplication.getDistrictData();
			Iterator it2= districtDataBean.iterator();
			
			while(it2.hasNext()) {
				
				DistrictDataBean districtData=(DistrictDataBean) it2.next();
				
				System.out.println("District::::"+districtData.getDistrict()+"-----Confirmed:::"+districtData.getConfirmed());
				
				
			}
			
			 
		
			
		}
		
	
		/*
		 * ArrayList<StateDataBean>
		 * stateData=coronaApplicationBean.get(1).getStateData();
		 * 
		 * StateDataBean stateDataBean=stateData.get(1);
		 * 
		 * ArrayList<DistrictDataBean> districtData=stateDataBean.getDistrictData();
		 * 
		 * DistrictDataBean districtDataBean=districtData.get(1);
		 * 
		 * System.out.println("districtDataBean");
		 * System.out.println(districtDataBean.getDistrict());
		 * System.out.println(districtDataBean.getConfirmed());
		 */
		
		
	}

}
