package com.gpc.jodhpur.gym.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author Pawan Saini
 * Created on 08/06/24.
 */
@Slf4j
public class JsonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private JsonUtil(){
    }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public static String toString(Object value) {
        try {
            if(Objects.nonNull(value)) {
                return objectMapper.writeValueAsString(value);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        return null;
    }
}
