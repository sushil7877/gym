package com.gpc.jodhpur.gym.repository;

import com.gpc.jodhpur.gym.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pawan Saini
 * Created on 08/06/24.
 */
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
