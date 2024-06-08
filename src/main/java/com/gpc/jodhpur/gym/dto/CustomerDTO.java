package com.gpc.jodhpur.gym.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Pawan Saini
 * Created on 08/06/24.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO implements Serializable {

    private String id;
    private String name;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private Date joiningDate;
    private Date endDate;
    private Date createdTime;
    private Date updatedTime;
}
