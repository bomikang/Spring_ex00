package com.dgit.ex00;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorController {
	private static final Logger logger = LoggerFactory.getLogger(CalculatorController.class);
	
	@RequestMapping(value="cal", method=RequestMethod.GET)
	public String getCal(){
		logger.info("cal get 실행");
		return "calculatorForm";
	}
	
	@RequestMapping(value="cal", method=RequestMethod.POST)
	public String postCal(String num1, String num2, Model model){
		logger.info("cal post 실행");
		double result = Double.parseDouble(num1) + Double.parseDouble(num2);
		model.addAttribute("num1", Double.parseDouble(num1));
		model.addAttribute("num2", Double.parseDouble(num2));
		model.addAttribute("result", result);
		return "calculatorResult";
	}
}
