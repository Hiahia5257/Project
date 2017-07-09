package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UserController {

	@RequestMapping(value="/index/{var1}",method = RequestMethod.GET)
	public String index(@PathVariable( "var1" ) String var1) {
		System.out.println("param is " + var1);
		return "index";
	}

}