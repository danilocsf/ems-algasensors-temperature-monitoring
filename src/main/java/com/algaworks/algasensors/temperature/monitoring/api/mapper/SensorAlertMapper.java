package com.algaworks.algasensors.temperature.monitoring.api.mapper;

import com.algaworks.algasensors.temperature.monitoring.api.model.SensorAlertInput;
import com.algaworks.algasensors.temperature.monitoring.api.model.SensorAlertOutput;
import com.algaworks.algasensors.temperature.monitoring.domain.model.SensorAlert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface SensorAlertMapper {
    SensorAlertOutput sensorAlertoToSensorAlertOutput(SensorAlert sensorAlert);

    @Mapping(target = "id", ignore = true)
    void updateSensorAlertFromSensorAlertInput(SensorAlertInput sensorAlertInput, @MappingTarget SensorAlert sensorAlert);
}
