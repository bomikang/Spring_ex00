package com.dgit.ex00;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController3 {
	
	@RequestMapping("doG")
	public String doG(RedirectAttributes attr){
		//redirect로 값을 전달할 때 RedirectAttributes클래스를 사용하여 보낼 수 있음
		attr.addFlashAttribute("msg", "Command가 doG를 작성할 경우 redirect로 result가 실행"); 
		return "redirect:/result"; 
	}//redirect시키기
	
	@RequestMapping("result")
	public String doResult(){
		return "result";
	}//redirect시키기

	
	@RequestMapping("doH")
	public String doH(Model model){
		model.addAttribute("msg", "Command가 doH를 작성할 경우 forward로 result 실행");
		return "forward:/result";		
	}//forward시키기
}
