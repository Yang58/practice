package com.tp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/*")
public class MainController {
	@RequestMapping("/main")
	public String main() {
		
		return "main";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "/limi/login";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		
		return "/limi/admin";
	}
	
	@RequestMapping("/findid")
	public String findid() {
		
		return "/limi/findid";
	}
	
	@RequestMapping("/foundid")
	public String foundid() {
		
		return "/limi/foundid";
	}
	
	@RequestMapping("/findpw")
	public String findpw() {
		
		return "/limi/findpw";
	}
	
	@RequestMapping("/resetpw")
	public String resetpw() {
		
		return "/limi/resetpw";
	}
	
	@RequestMapping("/join")
	public String join() {
		
		return "/limi/join";
	}
	
	@RequestMapping("/join_agree")
	public String join_agree() {
		
		return "/limi/join_agree";
	}
	
	@RequestMapping("/join_check")
	public String join_check() {
		
		return "/limi/join_check";
	}
	
	@RequestMapping("/join_form")
	public String join_form() {
		
		return "/limi/join_form";
	}
	
	@RequestMapping("/join_done")
	public String join_done() {
		
		return "/limi/join_done";
	}
	
	
	@RequestMapping("/leisure")
	public String leisure() {
		
		return "/Menu_Introduction/leisure";
		
	}
	
	@RequestMapping("/food")
	public String food() {
		
		return "/Menu_Introduction/food";
		
	}
	
	@RequestMapping("/exercise")
	public String exercise() {
		
		return "/Menu_Introduction/exercise";
		
	}
	
	@RequestMapping("/study")
	public String study() {
		
		return "/Menu_Introduction/study";
		
	}
	
	@RequestMapping("/detail")
	public String detail() {
		
		return "/Menu_Introduction/detail";
		
	}


}
