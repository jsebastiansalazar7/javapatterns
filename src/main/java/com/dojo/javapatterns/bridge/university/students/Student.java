package com.dojo.javapatterns.bridge.university.students;

import com.dojo.javapatterns.bridge.university.activities.StudyActivity;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Builder
@Data
public class Student {

    private UUID id;
    private String firstName;
    private String lastName;
    private List<StudyActivity> activities;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    /*
     The student has access to the StudyActivity method #showActivityInfo implementation thanks to the 'bridge'
     we built by adding a reference to the StudyActivity interface within the Student class
    */
    public void showStudentFullInfo() {
        System.out.println("\nThe student " + getFullName() + " identified with id " +
                id + " is suscribed to the activities: ");
        activities.forEach(activity -> activity.showActivityInfo());
    }

}
