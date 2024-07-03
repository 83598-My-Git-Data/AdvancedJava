package com.sunbeam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //mandatory class level annotation to specify this is a spring bena
//containing req handling logic
public class HomePageController {
	//def ctor print
	
	public HomePageController()
	{
		System.out.println("in ctor"+getClass());
	}
	
	//add req handling method with annotaion
	//handlermapping
	//key-/
	//value-fully qualified classname +method name .renderHomePage
	
	@RequestMapping("/")
	public String renderHomePage()
	{
		System.out.println("in render page ");
		return "/index";//handler rets lvn logic view name  to dispatcher servlet->view 
		//resolver->avn(/web-inf/views/inde.jsp)
		//->d.s forward the client to te view layer(jsp)
	}
	

}
