package com.dojo.javapatterns.bridge.university.professor;

import com.dojo.javapatterns.bridge.university.activities.lectures.Lecture;
import com.dojo.javapatterns.bridge.university.enums.CourseEnum;

public interface Professor {

    void research(String researchTopic);

    void prepareACourse(CourseEnum course);

    void giveACourse(CourseEnum course);

    void prepareALecture(Lecture lecture);

    void giveALecture(Lecture lecture);

}
