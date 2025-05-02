package ks54team01.customer.transferBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/transferBoard")
public class TransferBoardController {

	@GetMapping("/transferBoardList")
	public String getTransferBoardList() {
		
		return "/customer/transferBoard/transferBoardListView";
	}
	
	@GetMapping("/transferBoardDetail")
	public String getTransferBoardDetail() {
		
		return "/customer/transferBoard/transferBoardDetail";
	}
}
