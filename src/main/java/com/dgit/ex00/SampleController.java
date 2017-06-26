package com.dgit.ex00;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")
	public void doA(){
		System.out.println("doA 실행");
		logger.info("doA실행");
	}
	
	/*
	 * String 타입이면 return으로 연결이 됨.
	@RequestMapping("doA")
	public String doA(){
		System.out.println("doA 실행");
		return "doB";
	}
	*/
	
	@RequestMapping("doB")
	public void doB(){
		System.out.println("doB 실행");
	}
	
	@RequestMapping("doC")
	public String doC(String msg, Model model){ //model은 request대용
		System.out.println("msg : "+ msg);
		model.addAttribute("msg", msg);
		return "result";
	}
	
	@RequestMapping("doD")
	public String doD(@ModelAttribute("msg") String msg){
		//@ModelAttribute("매개변수명")을 이용하면 파라미터 값을 자동으로 result에 전달함
		return "result";
	}
	
	@RequestMapping("doD2")
	public String doD2(@ModelAttribute("msg") int msg){
		return "result";
	}
	
	@RequestMapping("doD3")
	public String doD3(@ModelAttribute("msg") float msg){
		return "result";
	}
	
	@RequestMapping("doD4")
	public String doD4(@ModelAttribute("msg") double msg){
		return "result";
	}
	
	@RequestMapping("doD5")
	public String doD5(@ModelAttribute("msg") char msg){
		return "result";
	}
}
