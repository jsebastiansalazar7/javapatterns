package com.dojo.javapatterns.bridge.university.activities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Research implements StudyActivity {

    private ActivityInfo activityInfo;

    @Override
    public void showActivityInfo() {
        System.out.println("Research information");
        System.out.println(activityInfo.toString());
    }

}
