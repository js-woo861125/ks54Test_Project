package ks54team01.admin.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminCommonController {

	@GetMapping({"","/"})
	public String adminHome() {
		
		return "admin/main";
	}
	@GetMapping("/enterpriseList")
	public String getenterpriseList(Model model) {
		model.addAttribute("title", "입점업체리스트");
		return "admin/enterprise/enterpriseListView";
	}
	
	@GetMapping("/payment")
	public String getadminpayment() {
		
		return "admin/payment/PaymentView";
	}
}
