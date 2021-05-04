package com.dojo.javapatterns.prototype.robots.with_pattern.with_cloneable;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Processor {

    public enum ProcessorArchitectureEnum {
        ARM,
        X86,
        X64,
        INTEL
    }

    private String name;
    private float version;
    private int numberOfCores;
    private ProcessorArchitectureEnum processorArchitecture;
    private float frequency;

}
