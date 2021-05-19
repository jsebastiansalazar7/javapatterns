package com.dojo.javapatterns.bridge.university.activities;

import com.dojo.javapatterns.bridge.university.activities.lectures.Lecture;
import com.dojo.javapatterns.bridge.university.professor.Professor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class ActivityInfo {

    private UUID id;
    private String name;
    private int hours;
    private int credits;
    private Professor professor;

    /*
     The activity has access to the Professor #giveALecture implementation thanks to the 'bridge'
     we built by adding a reference to the Professor interface within the ActivityInfo class
    */
    public void requestProfessorToGiveMasterClass(Lecture lecture) {
        professor.giveALecture(lecture);
    }

}
