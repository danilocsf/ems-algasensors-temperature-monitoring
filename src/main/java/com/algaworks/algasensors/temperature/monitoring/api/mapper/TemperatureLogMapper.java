package com.algaworks.algasensors.temperature.monitoring.api.mapper;

import com.algaworks.algasensors.temperature.monitoring.api.model.TemperatureLogOutput;
import com.algaworks.algasensors.temperature.monitoring.domain.model.TemperatureLog;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper()
public interface TemperatureLogMapper {
    @Mapping(target = "id", source = "temperatureLog.id.value")
    @Mapping(target = "sensorId", source = "temperatureLog.sensorId.value")
    TemperatureLogOutput temperatureLogToTemperatureLogOuput(TemperatureLog temperatureLog);
}
