package com.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import com.rafael.service.TransactionService;

public class TransactionServiceTest {

	@Test
	public void getTransactionList(){
		
		TransactionService transactionService = new TransactionService();
		assertNotNull(transactionService.getTransactionList());
		
	}
	
	
	
}
