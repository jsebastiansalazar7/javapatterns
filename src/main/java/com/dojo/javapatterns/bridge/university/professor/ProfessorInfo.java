package com.dojo.javapatterns.bridge.university.professor;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class ProfessorInfo {

    private UUID id;
    private String name;

}
