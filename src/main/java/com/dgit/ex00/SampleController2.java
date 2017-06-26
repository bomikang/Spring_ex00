package com.dgit.ex00;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dgit.domain.ProjectVO;

@Controller
public class SampleController2 {
	
	@RequestMapping("doE")
	public String doE(Model model){
		ProjectVO vo = new ProjectVO("Sample", 10000);
		//model.addAttribute("projectVO", vo);
		
		//Class를 key없이 넣으면, class이름을 key로 인식
		model.addAttribute(vo);
		return "projectDetail";
	}
	
	@RequestMapping("doF")
	public String doF(Model model){
		List<ProjectVO> list = new ArrayList<>();
		list.add(new ProjectVO("삼성디카", 500000));
		list.add(new ProjectVO("LG디카", 600000));
		list.add(new ProjectVO("소니디카", 400000));
		
		model.addAttribute("projectList", list);
		return "projectList";
	}
	
	@RequestMapping("doJson")
	public @ResponseBody List<ProjectVO> doJSON(){ //Json 형태로 보내기
		//ProjectVO vo = new ProjectVO("샤오미", 10000);
		
		List<ProjectVO> list = new ArrayList<>();
		list.add(new ProjectVO("삼성디카", 500000));
		list.add(new ProjectVO("LG디카", 600000));
		list.add(new ProjectVO("소니디카", 400000));
		
		return list;
	}
}
