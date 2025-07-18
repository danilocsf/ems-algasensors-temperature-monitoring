package com.algaworks.algasensors.temperature.monitoring.api.config.web;

import io.hypersistence.tsid.TSID;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;


public class StringToTSIDConverter implements Converter<String, TSID> {

    @Override
    public TSID convert(@NonNull String source) {
        return TSID.from(source);
    }
}
