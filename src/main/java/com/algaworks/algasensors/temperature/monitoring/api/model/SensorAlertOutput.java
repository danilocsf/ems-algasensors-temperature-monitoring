package com.algaworks.algasensors.temperature.monitoring.api.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensorAlertOutput {
    private Double maxTemperature;
    private Double minTemperature;
}
