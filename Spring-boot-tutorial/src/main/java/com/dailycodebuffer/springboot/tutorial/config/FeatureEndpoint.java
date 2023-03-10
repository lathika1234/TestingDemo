package com.dailycodebuffer.springboot.tutorial.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

@Component
@Endpoint(id="features")
public class FeatureEndpoint {
    private final Map<String,Feature> featureMap=new ConcurrentMap<>();

    public FeatureEndpoint(){
        
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Feature {
        private boolean isEnabled;
    }
}
