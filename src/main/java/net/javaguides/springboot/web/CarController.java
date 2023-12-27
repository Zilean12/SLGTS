package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class CarController {
	
	@GetMapping("/Car")
    public String showCarPage() {
        return "Car";
    }
}