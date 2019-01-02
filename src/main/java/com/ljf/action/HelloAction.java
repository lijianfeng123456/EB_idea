package com.ljf.action;

import com.ljf.pojo.Blog;
import com.ljf.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/my")
public class HelloAction {
	@Autowired
	private BlogService service;
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}

	@RequestMapping(value="/index",produces = {"text/html;charset=utf-8"}) //produces解决返回中文乱码问题
	public String index(){
		return "index";
	}

	@ResponseBody
	@RequestMapping("/findbyid")
	public Blog findByid(@RequestParam("id")int id){
		Blog blog=service.findbyID(id);
		return blog;
	}
}
