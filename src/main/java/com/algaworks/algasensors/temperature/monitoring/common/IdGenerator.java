package com.algaworks.algasensors.temperature.monitoring.common;

import io.hypersistence.tsid.TSID;

import java.util.Optional;

public class IdGenerator {

    private static final TSID.Factory tsidFactory;
    private static final String TSID_NODE = "tsid.node";
    private static final String TSID_NODE_COUNT = "tsid.node.count";

    static {
        Optional.ofNullable(System.getenv(TSID_NODE))
                .ifPresent(tsidNode -> System.setProperty(TSID_NODE, tsidNode));
        Optional.ofNullable(System.getenv(TSID_NODE_COUNT))
                .ifPresent(tsidNodeCount -> System.setProperty(TSID_NODE_COUNT, tsidNodeCount));
        tsidFactory = TSID.Factory.builder().build();
    }

    private IdGenerator() {

    }

    public static TSID generateTSID() {
        return tsidFactory.generate();
    }
}
