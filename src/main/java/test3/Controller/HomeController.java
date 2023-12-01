package test3.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

	
	
	
@GetMapping("/")
	public String openRegisterAdminPage() {
		return "index";
	}

}
