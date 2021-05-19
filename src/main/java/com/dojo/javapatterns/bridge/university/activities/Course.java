package com.dojo.javapatterns.bridge.university.activities;

import com.dojo.javapatterns.bridge.university.activities.lectures.Lecture;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Course implements StudyActivity {

    private ActivityInfo activityInfo;
    List<Lecture> lectures;

    @Override
    public void showActivityInfo() {
        System.out.println("Course information");
        System.out.println(activityInfo.toString());
    }

    public List<Lecture> getLectures() {
        return lectures;
    }
}
