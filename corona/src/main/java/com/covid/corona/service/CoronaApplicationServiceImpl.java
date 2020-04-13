package com.covid.corona.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.covid.corona.beans.CoronaApplicationBean;
import com.covid.corona.beans.StateDataBean;

@Component
public class CoronaApplicationServiceImpl {
	
	

	public List<CoronaApplicationBean> getCoronaData() {
		
		RestTemplate restTemplate = new RestTemplate();
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();        
		//Add the Jackson Message converter
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

		// Note: here we are making this converter to process any kind of response, 
		// not only application/*json, which is the default behaviour
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));        
		messageConverters.add(converter);  
		restTemplate.setMessageConverters(messageConverters); 
	     
	    final String baseUrl = "https://api.covid19india.org/v2/state_district_wise.json";
	    
	    CoronaApplicationBean coronaApplicationBean=new CoronaApplicationBean();
	    List<CoronaApplicationBean> rates = null;
		try {
		
	    HttpHeaders headers = new HttpHeaders();
	  
	 
	    HttpEntity requestEntity = new HttpEntity<>(null, headers);
	 
	 //   CoronaApplicationBean result = restTemplate.getForObject(baseUrl, CoronaApplicationBean.class);
	    
	    ResponseEntity<List<CoronaApplicationBean>> stateDataBean =
	            restTemplate.exchange(baseUrl,
	                        HttpMethod.GET, null, new ParameterizedTypeReference<List<CoronaApplicationBean>>() {
	                });
	    rates = stateDataBean.getBody();
	   // coronaApplicationBean=result;
	    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rates;
		
	     
	}

}
