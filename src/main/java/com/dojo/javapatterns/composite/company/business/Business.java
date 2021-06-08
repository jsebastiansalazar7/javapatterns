package com.dojo.javapatterns.composite.company.business;

import com.dojo.javapatterns.composite.company.departments.Engineering;
import com.dojo.javapatterns.composite.company.departments.Operations;
import com.dojo.javapatterns.composite.company.departments.Sales;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Business {

    private Engineering engineeringDepartment;
    private Operations operationsDepartment;
    private Sales salesDepartment;

}
