package com.sunbeam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {
	//DEPENDENCY INJECTUIB
	//INVERSE CONTROLLER
	
public void TestController()
{
	System.out.println("in ctor class"+getClass());
}
//add request handling  method for testing model map n req params
	//@requestparam data bind and parse does by container means it will add data coming from client
//method arg levelk annotation it is meant for binding 
//servlet int num1=integer.parseint(request.getparameter("num1")

//@requestparam(name="num2") if we want to change method argumet name and 
//requestparam  then change in name attribute 
	@GetMapping("/multiply")//@requestmapping(method=get)
	public String multiplynos(Model modelMap,@RequestParam int num1,@RequestParam int num2)//to binfd form data
	//o.c.ui.model-i/f ,represents a holder of model attributes)
	{
		System.out.println("in multiply"+ modelMap +" "+num1+" "+num2);//empty map
		modelMap.addAttribute("multiply_result",num1*num2);
		//empty map
		return "/test/result";//AVN :/WEB_INF/VIEWS/TEST/RESULT.JSP
	}
	
	
	

}
