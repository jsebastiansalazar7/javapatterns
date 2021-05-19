package com.dojo.javapatterns.bridge.university.professor;

import com.dojo.javapatterns.bridge.university.activities.lectures.Lecture;
import com.dojo.javapatterns.bridge.university.enums.CourseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Lecturer implements Professor {

    private ProfessorInfo professorInfo;

    @Override
    public void research(String researchTopic) {
        System.out.println("Lecturer " + this.getProfessorInfo().getName() + " is researching about " + researchTopic);
    }

    @Override
    public void prepareACourse(CourseEnum course) {
        System.out.println("Lecturer is preparing the course " + course.name());
    }

    @Override
    public void giveACourse(CourseEnum course) {
        System.out.println("Lecturer is giving the course " + course.name());
    }

    @Override
    public void prepareALecture(Lecture lecture) {
        System.out.println("Lecturer is preparing the lecture " + lecture.getName());
    }

    @Override
    public void giveALecture(Lecture lecture) {
        System.out.println("Lecturer is giving the lecture " + lecture.getName());
    }

}
