package kr.or.ksmart.ksmartshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("git test", "Hello gitWorld");
		model.addAttribute("git test", "test git");		
		return "index";
	}
}
