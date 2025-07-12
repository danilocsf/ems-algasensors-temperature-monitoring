package com.algaworks.algasensors.temperature.monitoring.api.model;

import io.hypersistence.tsid.TSID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensorAlertInput {
    private TSID id;
    private Double maxTemperature;
    private Double minTemperature;
}
