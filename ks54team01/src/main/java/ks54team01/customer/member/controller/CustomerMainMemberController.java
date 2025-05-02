package ks54team01.customer.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/member")
public class CustomerMainMemberController {
	
	@GetMapping("/memberLogin")
	public String getMemberLogin(Model model) {
		
		model.addAttribute("title", "Login");
		
		return "customer/member/memberLoginView";
	}
	
	@GetMapping("/memberRegister")
	public String getMemberRegister(Model model) {
		
		model.addAttribute("title", "회원가입");
		
		return "customer/member/memberRegisterView";
	}
	
	@GetMapping("/customerRegister")
	public String getCustomerRegister(Model model) {
		
		model.addAttribute("title", "일반/기업회원");
		
		return "customer/member/customerRegisterView";
	}
	
	@GetMapping("/entRegister")
	public String getEntRegister(Model model) {
		
		model.addAttribute("title", "입점업체");
		
		return "customer/member/entRegisterView";
		
	}
	
	@GetMapping("/forgotId")
	public String getforgotId(Model model) {
		
		model.addAttribute("title", "아이디찾기");
		
		return "customer/member/forgotIdView";
		
	}
	
	@GetMapping("/forgotPw")
	public String getforgotPw(Model model) {
		
		model.addAttribute("title", "비밀번호찾기");
		
		return "customer/member/forgotPwView";
		
	}
	
	
	
	
}
