package com.gpc.jodhpur.gym.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Pawan Saini
 * Created on 09/06/24.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerFormDTO {

    private String id;
    private String name;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private String joiningDate;
    private String endDate;
}
