package com.dojo.javapatterns.composite.company.departments;

import com.dojo.javapatterns.composite.company.employees.Contributor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Operations {

    private List<Contributor> operationsStaff;

}
