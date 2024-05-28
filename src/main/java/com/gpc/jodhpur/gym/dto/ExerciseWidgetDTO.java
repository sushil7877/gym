package com.gpc.jodhpur.gym.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseWidgetDTO implements Serializable {

    private String name;
    private Integer time;
    private Integer count;
    private String photo;
    private String instruction;
    private List<String> focusAreas;
}
