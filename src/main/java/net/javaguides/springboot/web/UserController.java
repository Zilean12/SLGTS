package net.javaguides.springboot.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class UserController {

    @GetMapping("/check-email-existence")
    public ResponseEntity<String> checkEmailExistence(@RequestParam String email) {
        // Simulate checking email existence (replace with actual logic)
        boolean emailExists = true;  // Replace with your logic to check existence

        if (emailExists) {
            // Return a 409 Conflict status with a user-friendly message
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Email address already exists");
        }

        // If email doesn't exist, return a 200 OK status
        return ResponseEntity.ok("Email address is available");
    }
}
