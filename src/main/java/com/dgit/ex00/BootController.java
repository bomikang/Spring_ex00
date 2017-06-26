package com.dgit.ex00;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootController {
	
	@RequestMapping("grid1")
	public String getGrid1(){
		return "grid_1";
	}
	
	@RequestMapping("grid2")
	public String getGrid2(){
		return "grid_2";
	}
}
