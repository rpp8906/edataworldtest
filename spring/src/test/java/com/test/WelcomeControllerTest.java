package com.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.View;

import com.rafael.controller.WelcomeController;
import com.rafael.service.TransactionService;


public class WelcomeControllerTest {
 
	@Mock
	private View mockView;
	
	@Mock
	private TransactionService transactionService; 
	
	@InjectMocks
	private WelcomeController welcomeController;

	private MockMvc mockMvc;
    
    @Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(welcomeController).setSingleView(mockView).build();
	}
    
 
    @Test
    public void welcomePageTest() throws Exception {
      
    	mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }
}