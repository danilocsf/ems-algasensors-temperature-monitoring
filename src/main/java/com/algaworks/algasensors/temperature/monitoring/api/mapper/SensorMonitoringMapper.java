package com.algaworks.algasensors.temperature.monitoring.api.mapper;

import com.algaworks.algasensors.temperature.monitoring.api.model.SensorMonitoringOuput;
import com.algaworks.algasensors.temperature.monitoring.domain.model.SensorMonitoring;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper()
public interface SensorMonitoringMapper {
    @Mapping(target = "id", source = "sensorMonitoring.id.value")
    SensorMonitoringOuput sensorMonitoringToSensorMonitoringOuput(SensorMonitoring sensorMonitoring);
}
