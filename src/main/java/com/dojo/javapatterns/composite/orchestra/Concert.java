package com.dojo.javapatterns.composite.orchestra;

import com.dojo.javapatterns.composite.orchestra.director.Director;
import com.dojo.javapatterns.composite.orchestra.enums.InstrumentEnum;
import com.dojo.javapatterns.composite.orchestra.enums.InstrumentGroupEnum;
import com.dojo.javapatterns.composite.orchestra.groups.*;
import com.dojo.javapatterns.composite.orchestra.instruments.Instrument;
import com.dojo.javapatterns.composite.orchestra.orchestra.Orchestra;

public class Concert {

    public static void main (String... args) {
        System.out.println("*** Welcome to the winter season Tchaikovski's Swan's Lake Concert ***");
        waitTime(2000L);

        System.out.println("\nThe orchestra is composed by");
        ConcertOrganizer concertOrganizer = new ConcertOrganizer();
        Orchestra orchestra = concertOrganizer.getOrchestra();
        Director director = concertOrganizer.getDirector(orchestra);
        orchestra.getInstrumentGroups().forEach(InstrumentGroup::showCompositionOfGroup);
        waitTime(6000L);
        System.out.println("The orchestra is directed by the Master " + director.getName());
        waitTime(3000L);

        System.out.println("\nPlease go to your seats, the concert is going to start");
        director.requestSilenceToThePublic();
        director.requestFineTunning();
        waitTime(10000L);

        System.out.println("\n* Act 1 is goint to start");
        director.requestStartPlaying("Swan's Lake Act 1");
        waitTime(10000L);
        director.requestPause();
        waitTime(2000L);

        System.out.println("\n* Act 2 is goint to start");
        director.requestStartPlaying("Swan's Lake Act 2");
        waitTime(8000L);
        director.requestPause();
        waitTime(2000L);
        System.out.println("There will be a 15 minutes pause. Please return in silence and on time");
        waitTime(4000L);

        System.out.println("\nPlease go to your seats, the concert is going to resume");
        director.requestSilenceToThePublic();
        director.requestFineTunning();
        waitTime(10000L);

        System.out.println("\n* Act 3 is goint to start");
        director.requestStartPlaying("Swan's Lake Act 3");
        waitTime(6000L);
        director.requestPause();
        waitTime(1000L);
        System.out.println("- A solo will be performed");
        Instrument solistViolin = orchestra.getInstrumentGroup(InstrumentGroupEnum.STRINGS)
                .getInstrumentsByName(InstrumentEnum.VIOLIN).get(0);
        director.requestSolo(solistViolin);
        waitTime(4000L);
        director.requestPause();
        waitTime(2000L);

        System.out.println("\n* Act 4 is goint to start");
        director.requestStartPlaying("Swan's Lake Act 4");
        waitTime(10000L);
        director.requestPause();
        waitTime(2000L);

        System.out.println("\n* The performance has finished");
        director.requestThanks();
        waitTime(2000L);

        System.out.println("\nThe concert is over. Thanks for coming and we hope we see you back soon");
        System.out.println("Please leave in order through the exits on the back of the theather");
    }

    private static void waitTime(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
