package com.dojo.javapatterns.composite.company.employees;

import com.dojo.javapatterns.composite.company.enums.PositionsEnum;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class Contributor {

    private UUID id;
    private String name;
    private PositionsEnum position;

}
