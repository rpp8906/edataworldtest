package com.rafael.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rafael.service.TransactionService;

@Controller
public class WelcomeController {
	
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("transaction", transactionService.getTransactionList());
		model.setViewName("transaction");
		return model;

	}
	

}
