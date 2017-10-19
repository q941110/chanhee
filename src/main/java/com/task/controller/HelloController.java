package com.task.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.task.service.MemberService;

@Controller
public class HelloController {
	
	static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	private MemberService memberService;
	
	@Autowired
	public HelloController(MemberService memberService) {
		this.memberService = memberService;
	}
	
    @GetMapping(path = "/")
    public String hello(Model model){
    	logger.info("### Hello Controller info ###");
    	memberService.getAll();
    	
        return "hello";
    }
}
