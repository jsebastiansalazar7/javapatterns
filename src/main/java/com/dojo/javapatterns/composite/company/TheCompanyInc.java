package com.dojo.javapatterns.composite.company;

import com.dojo.javapatterns.composite.company.business.Business;
import com.dojo.javapatterns.composite.company.departments.Engineering;
import com.dojo.javapatterns.composite.company.departments.Operations;
import com.dojo.javapatterns.composite.company.departments.Sales;
import com.dojo.javapatterns.composite.company.employees.Ceo;
import com.dojo.javapatterns.composite.company.employees.Contributor;
import com.dojo.javapatterns.composite.company.enums.PositionsEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TheCompanyInc {

    public static void main(String... args) {
        System.out.println("*** Welcome to The Company Inc. ***");

        Sales salesDepartment = Sales.builder()
                .salesStaff(getSalesStaff())
                .build();
        Engineering engineeringDepartment = Engineering.builder()
                .engineeringStaff(getEngineeringStaff())
                .build();
        Operations operationsDepartment = Operations.builder()
                .operationsStaff(getOperationsStaff())
                .build();
        Business business = Business.builder()
                .engineeringDepartment(engineeringDepartment)
                .operationsDepartment(operationsDepartment)
                .salesDepartment(salesDepartment)
                .build();
        Ceo ceo = Ceo.builder()
                .name("Martín Migoya")
                .business(business)
                .build();

        System.out.println("The CEO " + ceo.getName() + " will perform a business review of each of its employees by departent...");
        ceo.checkEmployees();
    }

    private static List<Contributor> getEngineeringStaff() {
        List<Contributor> engineeringStaff = new ArrayList<>();
        Contributor engineeringManager = Contributor.builder()
                .id(UUID.randomUUID())
                .name("Mateo Salazar")
                .position(PositionsEnum.MANAGER)
                .build();
        engineeringStaff.add(engineeringManager);
        Contributor teamLeader = Contributor.builder()
                .id(UUID.randomUUID())
                .name("José Civera")
                .position(PositionsEnum.TEAM_LEADER)
                .build();
        engineeringStaff.add(teamLeader);
        Contributor firstDeveloper = Contributor.builder()
                .id(UUID.randomUUID())
                .name("Pablo Marchant")
                .position(PositionsEnum.DEVELOPER)
                .build();
        engineeringStaff.add(firstDeveloper);
        Contributor secondDeveloper = Contributor.builder()
                .id(UUID.randomUUID())
                .name("Mariano Ariza")
                .position(PositionsEnum.DEVELOPER)
                .build();
        engineeringStaff.add(secondDeveloper);
        return engineeringStaff;
    }
    
    private static List<Contributor> getSalesStaff() {
        List<Contributor> salesStaff = new ArrayList<>();
        Contributor salesManager = Contributor.builder()
                .id(UUID.randomUUID())
                .name("María Iribarren")
                .position(PositionsEnum.MANAGER)
                .build();
        salesStaff.add(salesManager);
        Contributor salesExecutive = Contributor.builder()
                .id(UUID.randomUUID())
                .name("John Jackson")
                .position(PositionsEnum.BOOKKEEPER)
                .build();
        salesStaff.add(salesExecutive);
        return salesStaff;
    }
    
    private static List<Contributor> getOperationsStaff() {
        List<Contributor> operationsStaff = new ArrayList<>();
        Contributor operationsManager = Contributor.builder()
                .id(UUID.randomUUID())
                .name("Juan Zapata")
                .position(PositionsEnum.MANAGER)
                .build();
        operationsStaff.add(operationsManager);
        Contributor sre = Contributor.builder()
                .id(UUID.randomUUID())
                .name("Sergei Li")
                .position(PositionsEnum.SRE)
                .build();
        operationsStaff.add(sre);
        Contributor dba = Contributor.builder()
                .id(UUID.randomUUID())
                .name("Bella Landar")
                .position(PositionsEnum.DBA)
                .build();
        operationsStaff.add(dba);
        return operationsStaff;
    }


}
