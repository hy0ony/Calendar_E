package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.SawonService;
import vo.SawonVO;

@Controller
@RequestMapping("/sawon/*")
public class SawonController {
	
	@Autowired
	SawonService service;
	
	@RequestMapping(value="/sawonRegister", method=RequestMethod.POST)
	public String sawonRegister(SawonVO vo) throws Exception {
		
		return "/sawon/sawonRegister";
		
	}

}
