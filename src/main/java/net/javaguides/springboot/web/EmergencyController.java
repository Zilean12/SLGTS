package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.service.EmergencyService;
import net.javaguides.springboot.web.dto.EmergencyDto;

@Controller
@RequestMapping("/emergency")
public class EmergencyController {

    private EmergencyService emergencyService;

    public EmergencyController(EmergencyService emergencyService) {
        this.emergencyService = emergencyService;
    }

    @ModelAttribute("emergency")
    public EmergencyDto emergencyDto() {
        return new EmergencyDto();
    }

    @GetMapping
    public String showEmergencyPage() {
        return "emergency";
    }

    @PostMapping("/submitEmergency")
    public String submitEmergency(
            @RequestParam("description") String description,
            @RequestParam("Type") String Type,
            @RequestParam("location") String location) {
    
        // Process the emergency form submission (e.g., save to database)

        // Redirect back to the form or any other page
        return "redirect:/emergency?success"; // Change the URL as needed
    }

    @PostMapping("/submit")
    public String emergencydetail(@ModelAttribute("emergency") EmergencyDto emergencyDto) {
        emergencyService.save(emergencyDto);
        return "redirect:/emergency?success"; // Change the URL as needed
    }
}
