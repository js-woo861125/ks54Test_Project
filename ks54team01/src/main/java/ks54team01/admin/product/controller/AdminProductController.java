package ks54team01.admin.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/product")
public class AdminProductController {

	@GetMapping("productList")
	public String productList(Model model) {
		
		return "admin/product/productListView";
	}
}
