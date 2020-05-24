package com.zd.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zd.po.Users;
import com.zd.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping({"","/","/index"})
	public String index(){
		this.request.setAttribute("users", this.usersService.findAll());
		return "users/index";
	}
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public String save(){
		return "users/save";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@RequestParam("file") MultipartFile file,Users users){
		System.out.println(file);
		//this.usersService.save(users);
		
		String parent = this.request.getServletContext().getRealPath("/WEB-INF/attachment");
		
		long time = System.currentTimeMillis();
		
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		
//		File dest = new File(parent,file.getName());
		
		//寰楀埌鏂囦欢鍚�
		String name = file.getOriginalFilename();
		
		String ext = "jpg";
		
		String []names = name.split("\\.");
		if(names.length>1){
			ext = names[names.length-1];
		}
		
		File dest = new File(parent,time+"."+ext);
		
		try {
			file.transferTo(dest);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		users.setHead("attachment/"+time+"."+ext);
		
		this.usersService.save(users);
		
		return "redirect:/users/index";
	}

}
