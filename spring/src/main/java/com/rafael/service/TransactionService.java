package com.rafael.service;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TransactionService {
	
	final String uri = "https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions";
		
	
	@SuppressWarnings("rawtypes")
	public List getTransactionList(){
		
		RestTemplate restTemplate =  new RestTemplate();
		Map map = restTemplate.getForObject(uri,LinkedHashMap.class);
		List list = (List) map.get("transactions");
		
		return list;
	}
	

}
