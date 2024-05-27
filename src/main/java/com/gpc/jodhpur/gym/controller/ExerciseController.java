package com.gpc.jodhpur.gym.controller;

import com.gpc.jodhpur.gym.dto.ExerciseTypeDTO;
import com.gpc.jodhpur.gym.dto.ExerciseWidgetDTO;
import com.gpc.jodhpur.gym.service.ExerciseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/gym")
public class ExerciseController {

    private static final Logger log = LoggerFactory.getLogger(ExerciseController.class);
    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping(value = "/exercise/type")
    public ResponseEntity<?> getExerciseTypes() {
        try {
            return new ResponseEntity<>(exerciseService.getExerciseTypes(), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error occurred while getting exercise types.");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/exercise/type")
    public ResponseEntity<?> addExerciseTypes(@RequestBody ExerciseTypeDTO exerciseTypeDTO) {
        try {
            return new ResponseEntity<>(exerciseService.addExerciseTypes(exerciseTypeDTO), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error occurred while adding new exercise types.");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/exercise/widget")
    public ResponseEntity<?> getExerciseWidget(@RequestParam(value = "exercise_id") Long exerciseId) {
        try {
            return new ResponseEntity<>(exerciseService.getExerciseWidget(exerciseId), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error occurred while getting exercise widgets.");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/exercise/widget")
    public ResponseEntity<?> addExerciseWidget(@RequestParam(value = "exercise_id") Long exerciseId,
                                              @RequestBody ExerciseWidgetDTO exerciseTypeDTO) {
        try {
            return new ResponseEntity<>(exerciseService.addExerciseWidget(exerciseId, exerciseTypeDTO), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error occurred while adding new exercise widget.");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
