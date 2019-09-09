package com.dqf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dongqifeng.common.utils.StringUtil;

@Controller
public class MyController {
	
	@RequestMapping("list.do")
	public String list() {
		return "list";
	}
	
	@RequestMapping("add.do")
	public String add(String name) {
		System.out.println(name);
		isEmpiy(name);
		String html = StringUtil.toHtml(name);
		System.out.println(html);
		return name;
		
		
	}
	
	public static boolean isEmpiy(String reString) {
		if(reString!=null && !reString.equals("")) {
			return true;
		}
		return false;
		
	}

}
