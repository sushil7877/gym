package com.gpc.jodhpur.gym.controller;

import com.gpc.jodhpur.gym.dto.CustomerDTO;
import com.gpc.jodhpur.gym.dto.CustomerFormDTO;
import com.gpc.jodhpur.gym.service.CustomerService;
import com.gpc.jodhpur.gym.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final CustomerService customerService;

    @Autowired
    public HomeController(CustomerService customerService) {
        this.customerService = customerService;
    }

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
        return "beginner"; // This will look for a template named "beginner.html" in src/main/resources/templates
    }

    @GetMapping("/at-home")
    public String atHome(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "at-home"; // This will look for a template named "at-home.html" in src/main/resources/templates
    }

    @GetMapping("/fat-loss")
    public String fatLoss(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "fat-loss"; // This will look for a template named "fat-loss.html" in src/main/resources/templates
    }

    @GetMapping("/full-body")
    public String fullBody(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "full-body"; // This will look for a template named "full-body.html" in src/main/resources/templates
    }

    @GetMapping("/cardio")
    public String cardio(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "cardio"; // This will look for a template named "cardio.html" in src/main/resources/templates
    }

    @GetMapping("/chest")
    public String chest(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "chest"; // This will look for a template named "chest.html" in src/main/resources/templates
    }

    @GetMapping("/back")
    public String back(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "back"; // This will look for a template named "back.html" in src/main/resources/templates
    }

    @GetMapping("/biceps")
    public String biceps(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "biceps"; // This will look for a template named "biceps.html" in src/main/resources/templates
    }

    @GetMapping("/shoulders")
    public String shoulders(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "shoulders"; // This will look for a template named "shoulders.html" in src/main/resources/templates
    }

    @GetMapping("/legs")
    public String legs(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "legs"; // This will look for a template named "legs.html" in src/main/resources/templates
    }

    @GetMapping("/triceps")
    public String triceps(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "triceps"; // This will look for a template named "triceps.html" in src/main/resources/templates
    }

    @GetMapping("/glute")
    public String glute(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        return "glute"; // This will look for a template named "glute.html" in src/main/resources/templates
    }

    @GetMapping("/customer")
    public String customer(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        model.addAttribute("customers", customerService.getAllCustomerDetails());
        model.addAttribute("customerDto", new com.gpc.jodhpur.gym.dto.CustomerFormDTO());
        return "customer"; // This will look for a template named "customer.html" in src/main/resources/templates
    }

    @PostMapping("/customer")
    public String addCustomer(@ModelAttribute CustomerFormDTO customerFormDTO) {
        CustomerDTO customerDTO = JsonUtil.getObjectMapper().convertValue(customerFormDTO, CustomerDTO.class);
        customerService.addCustomerDetails(customerDTO);
        return "redirect:/customer";
    }

    @PostMapping("/customer/{id}")
    public String deleteCustomer(@PathVariable("id") Long customerId) {
        customerService.deleteCustomer(customerId);
        return "redirect:/customer";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        model.addAttribute("customers", customerService.getAllCustomerDetails());
        model.addAttribute("customerDto", new com.gpc.jodhpur.gym.dto.CustomerFormDTO());
        return "login"; // This will look for a template named "customer.html" in src/main/resources/templates
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("title", "Gym Fitness Center");
        model.addAttribute("customers", customerService.getAllCustomerDetails());
        model.addAttribute("customerDto", new com.gpc.jodhpur.gym.dto.CustomerFormDTO());
        return "signup"; // This will look for a template named "customer.html" in src/main/resources/templates
    }
}
