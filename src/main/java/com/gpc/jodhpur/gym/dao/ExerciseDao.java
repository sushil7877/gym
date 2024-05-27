package com.gpc.jodhpur.gym.dao;

import com.gpc.jodhpur.gym.dto.ExerciseTypeDTO;
import com.gpc.jodhpur.gym.dto.ExerciseWidgetDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Slf4j
public class ExerciseDao {

    public List<ExerciseTypeDTO> EXERCISE_TYPE_LIST = Arrays.asList();
//new ExerciseTypeDTO(1, "Abs Beginner", "Beginner", 20, 5)
    public Map<Long, List<ExerciseWidgetDTO>> EXERCISE_WIDGET_MAP = new HashMap<>();

    public List<ExerciseTypeDTO> getExerciseTypes() {
        return EXERCISE_TYPE_LIST;
    }

    public ExerciseTypeDTO addExerciseTypes(ExerciseTypeDTO exerciseTypeDTO) {
        EXERCISE_TYPE_LIST.add(exerciseTypeDTO);
        return exerciseTypeDTO;
    }

    public List<ExerciseWidgetDTO> getExerciseWidget(Long exerciseId) {
        return EXERCISE_WIDGET_MAP.get(exerciseId);
    }

    public ExerciseWidgetDTO addExerciseWidget(Long exerciseId, ExerciseWidgetDTO exerciseTypeDTO) {
        if(EXERCISE_WIDGET_MAP.get(exerciseId) == null) {
            EXERCISE_WIDGET_MAP.put(exerciseId, new ArrayList<>());
        }
        EXERCISE_WIDGET_MAP.get(exerciseId).add(exerciseTypeDTO);
        return exerciseTypeDTO;
    }
}
