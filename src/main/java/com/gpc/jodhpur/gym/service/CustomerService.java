package com.gpc.jodhpur.gym.service;

import com.gpc.jodhpur.gym.dao.CustomerDao;
import com.gpc.jodhpur.gym.dto.CustomerDTO;
import com.gpc.jodhpur.gym.entity.CustomerEntity;
import com.gpc.jodhpur.gym.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Pawan Saini
 * Created on 08/06/24.
 */
@Slf4j
@Service
public class CustomerService {

    private final CustomerDao customerDao;

    @Autowired
    private  CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public CustomerDTO getCustomerDetails(Long customerId) {
        Optional<CustomerEntity> customerEntity = customerDao.get(customerId);
        CustomerDTO customerDTO = JsonUtil.getObjectMapper().convertValue(customerEntity.get(), CustomerDTO.class);
        return customerDTO;
    }

    public CustomerDTO addCustomerDetails(CustomerDTO customerDTO) {
        CustomerEntity customerEntity = JsonUtil.getObjectMapper().convertValue(customerDTO, CustomerEntity.class);
        customerEntity = customerDao.save(customerEntity);
        customerDTO = JsonUtil.getObjectMapper().convertValue(customerEntity, CustomerDTO.class);
        return customerDTO;
    }

    public List<CustomerDTO> getAllCustomerDetails() {
        List<CustomerEntity> customerEntities = customerDao.getAll();
        List<CustomerDTO> customerDTOs = new ArrayList<>();
        for(CustomerEntity entity : customerEntities) {
            CustomerDTO customerDTO = JsonUtil.getObjectMapper().convertValue(entity, CustomerDTO.class);
            customerDTOs.add(customerDTO);
        }
        return customerDTOs;
    }

    public void deleteCustomer(Long customerId) {
        customerDao.delete(customerId);
    }
}
