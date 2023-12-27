package net.javaguides.springboot.web;

import net.javaguides.springboot.Duplicate.DuplicateEmailException;
import net.javaguides.springboot.service.UserService;
import net.javaguides.springboot.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("user", new UserRegistrationDto());
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("user") UserRegistrationDto registrationDto, Model model) {
        try {
            userService.save(registrationDto);
            return "redirect:/registration?success";
        } catch (DuplicateEmailException e) {
            model.addAttribute("error", e.getMessage());
            return "registration";
        }
    }
}
