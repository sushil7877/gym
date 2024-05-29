package com.gpc.jodhpur.gym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Fitness Center");
        model.addAttribute("logo", "/images/logo.png");
        model.addAttribute("message", "Gym Fitness Center");
        return "home"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/beginner")
    public String beginner(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "beginner"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/at-home")
    public String atHome(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "at-home"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/fat-loss")
    public String fatLoss(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "fat-loss"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/full-body")
    public String fullBody(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "full-body"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/cardio")
    public String cardio(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "cardio"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/chest")
    public String chest(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "chest"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/back")
    public String back(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "back"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/biceps")
    public String biceps(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "biceps"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/shoulders")
    public String shoulders(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "shoulders"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/legs")
    public String legs(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "legs"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/triceps")
    public String triceps(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "triceps"; // This will look for a template named "home.html" in src/main/resources/templates
    }

    @GetMapping("/glute")
    public String glute(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "glute"; // This will look for a template named "home.html" in src/main/resources/templates
    }
}
