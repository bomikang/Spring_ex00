package com.dgit.ex00;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dgit.domain.BMICalculator;
import com.dgit.domain.MyInfo;

@Controller
public class BMICalculatorController {
	private static final Logger logger = LoggerFactory.getLogger(CalculatorController.class);
	
	@RequestMapping(value="bmi", method=RequestMethod.GET)
	public String getBmi(){
		logger.info("bmi get 실행");
		return "bmiForm";
	}
	
	@RequestMapping(value="bmi", method=RequestMethod.POST)
	public String postBmi(MyInfo myInfo, Model model){
		logger.info("bmi get 실행");
		
		BMICalculator bmiCal = new BMICalculator();
		String bmiResult = bmiCal.bmiCalculator(myInfo.getWeight(), myInfo.getHeight());
		
		model.addAttribute("myInfo", myInfo);
		model.addAttribute("bmiResult", bmiResult);
		return "bmiResult";
	}
	
}
