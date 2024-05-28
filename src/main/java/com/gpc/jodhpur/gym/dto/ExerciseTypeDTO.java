package com.gpc.jodhpur.gym.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseTypeDTO implements Serializable {

    private Integer id;
    private String name;
    private String type;
    private Integer time;
    private Integer exerciseCount;
}
