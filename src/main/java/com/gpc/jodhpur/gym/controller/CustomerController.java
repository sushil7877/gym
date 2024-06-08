package com.gpc.jodhpur.gym.controller;

import com.gpc.jodhpur.gym.dto.CustomerDTO;
import com.gpc.jodhpur.gym.dto.ExerciseTypeDTO;
import com.gpc.jodhpur.gym.service.CustomerService;
import com.gpc.jodhpur.gym.service.ExerciseService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pawan Saini
 * Created on 08/06/24.
 */
@Slf4j
@RestController
@RequestMapping(value = "/gym/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/get")
    public ResponseEntity<?> getCustomerDetails(@RequestParam(value = "customer_id") Long customerId) {
        try {
            return new ResponseEntity<>(customerService.getCustomerDetails(customerId), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error occurred while getting customer details.");
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<?> getAllCustomerDetails() {
        try {
            return new ResponseEntity<>(customerService.getAllCustomerDetails(), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error occurred while getting all customer details.");
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> addCustomerDetails(@RequestBody CustomerDTO customerDTO) {
        try {
            return new ResponseEntity<>(customerService.addCustomerDetails(customerDTO), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error occurred while adding customer details.");
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
