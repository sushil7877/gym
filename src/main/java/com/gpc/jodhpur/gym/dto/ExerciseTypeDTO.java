package com.gpc.jodhpur.gym.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseTypeDTO implements Serializable {

    private Long id;
    private String name;
    private String type;
    private Long time;
    private Long exerciseCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getExerciseCount() {
        return exerciseCount;
    }

    public void setExerciseCount(Long exerciseCount) {
        this.exerciseCount = exerciseCount;
    }
}
