package com.dojo.javapatterns.bridge.university.activities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Internship implements StudyActivity {

    private ActivityInfo activityInfo;

    @Override
    public void showActivityInfo() {
        System.out.println("Internship information");
        System.out.println(activityInfo.toString());
    }

}
