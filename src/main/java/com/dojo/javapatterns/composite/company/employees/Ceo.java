package com.dojo.javapatterns.composite.company.employees;

import com.dojo.javapatterns.composite.company.business.Business;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Ceo {

    private String name;
    private Business business;

    public void checkEmployees() {
        checkSalesDepartment();
        checkEngineeringDepartment();
        checkOperationsDepartment();
    }

    private void checkSalesDepartment() {
        System.out.println("\n*** Checking Sales department ***");
        business.getSalesDepartment().getSalesStaff()
                .forEach(employee -> System.out.println(
                        employee.getName() + " (ID: " + employee.getId() + ") " +
                        "works as a " + employee.getPosition().toString()));
    }

    private void checkEngineeringDepartment() {
        System.out.println("\n*** Checking Engineering department ***");
        business.getEngineeringDepartment().getEngineeringStaff()
                .forEach(employee -> System.out.println(
                        employee.getName() + " (ID: " + employee.getId() + ") " +
                        "works as a " + employee.getPosition().toString()));
    }

    private void checkOperationsDepartment() {
        System.out.println("\n*** Checking Operations department ***");
        business.getOperationsDepartment().getOperationsStaff()
                .forEach(employee -> System.out.println(
                        employee.getName() + " (ID: " + employee.getId() + ") " +
                        "works as a " + employee.getPosition().toString()));
    }

}
