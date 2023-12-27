package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AboutController {
	
	@GetMapping("/Contact")
    public String showContactPage() {
        return "Contact";
    }
}
