package com.gpc.jodhpur.gym.service;

import com.gpc.jodhpur.gym.dao.ExerciseDao;
import com.gpc.jodhpur.gym.dto.ExerciseTypeDTO;
import com.gpc.jodhpur.gym.dto.ExerciseWidgetDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ExerciseService {

    private final ExerciseDao exerciseDao;

    @Autowired
    public ExerciseService(ExerciseDao exerciseDao) {
        this.exerciseDao = exerciseDao;
    }

    public List<ExerciseTypeDTO> getExerciseTypes() {
        return exerciseDao.getExerciseTypes();
    }

    public ExerciseTypeDTO addExerciseTypes(ExerciseTypeDTO exerciseTypeDTO) {
        return exerciseDao.addExerciseTypes(exerciseTypeDTO);
    }

    public List<ExerciseWidgetDTO> getExerciseWidget(Long exerciseId) {
        return exerciseDao.getExerciseWidget(exerciseId);
    }

    public ExerciseWidgetDTO addExerciseWidget(Long exerciseId, ExerciseWidgetDTO exerciseTypeDTO) {
        return exerciseDao.addExerciseWidget(exerciseId, exerciseTypeDTO);
    }
}
