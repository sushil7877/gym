package com.gpc.jodhpur.gym.dao;

import com.gpc.jodhpur.gym.entity.CustomerEntity;
import com.gpc.jodhpur.gym.repository.CustomerRepository;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author Pawan Saini
 * Created on 08/06/24.
 */
@Component
@Slf4j
public class CustomerDao {

    private final CustomerRepository repository;

    @Autowired
    public CustomerDao(CustomerRepository repository) {
        this.repository = repository;
    }

    public Optional<CustomerEntity> get(@NonNull Long id) {
        return repository.findById(id);
    }

    public List<CustomerEntity> getAll() {
        return repository.findAll();
    }

    public CustomerEntity save(@NonNull CustomerEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
