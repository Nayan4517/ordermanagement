package com.springboot_order.springboot_order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class welcomecontroller {
	@GetMapping ("/welcome")
	public String welcome() {
	  return " welcome to spring boot order development";
}
}
