package com.dojo.javapatterns.bridge.university;

import com.dojo.javapatterns.bridge.university.activities.ActivityInfo;
import com.dojo.javapatterns.bridge.university.activities.Course;
import com.dojo.javapatterns.bridge.university.activities.lectures.Lecture;
import com.dojo.javapatterns.bridge.university.enums.CourseEnum;
import com.dojo.javapatterns.bridge.university.professor.Dean;
import com.dojo.javapatterns.bridge.university.professor.Professor;
import com.dojo.javapatterns.bridge.university.professor.ProfessorInfo;
import com.dojo.javapatterns.bridge.university.students.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class University {

    public static void main(String... args) {
        System.out.println("*** Welcome to the University ***");

        // Professor
        ProfessorInfo professorInfo = ProfessorInfo.builder()
                .id(UUID.randomUUID())
                .name("John Von Neumann")
                .build();

        Professor deanVonNeumann = new Dean(professorInfo);

        // Course
        CourseEnum course = CourseEnum.CALCULUS_III;
        ActivityInfo calculusCourseInfo = getCalculusCourseInfo(
                course, 40, 5, deanVonNeumann);

        List<Lecture> calculusCourseLectures = getLecturesForCalculusCourse();

        Course calculusCourse = Course.builder()
                .activityInfo(calculusCourseInfo)
                .lectures(calculusCourseLectures)
                .build();

        // Student
        Student markRuffalo = Student.builder()
                .id(UUID.randomUUID())
                .firstName("Mark")
                .lastName("Ruffalo")
                .activities(Collections.singletonList(calculusCourse))
                .build();

        /*
         The #showStudentFullInfo method uses a StudyActivity method, thanks to the bridge between
         Student and StudyActivity
         */
        markRuffalo.showStudentFullInfo();

        System.out.println("\n* Professor investigations");
        deanVonNeumann.research("Hyper-dimensional figures using numeric analysis iterative methods");

        System.out.println("\n* Professor course");
        deanVonNeumann.prepareACourse(course);
        deanVonNeumann.giveACourse(course);
        calculusCourseLectures.forEach(lecture -> {
            deanVonNeumann.prepareALecture(lecture);
            deanVonNeumann.giveALecture(lecture);
        });

        /*
         The #requestProfessorToGiveMasterClass method uses a Professor method, thanks to the bridge between
         ActivityInfo and Professor
         */
        System.out.println("\n* Professor master class");
        calculusCourseInfo.requestProfessorToGiveMasterClass(calculusCourseLectures.get(16));
    }

    private static List<Lecture> getLecturesForCalculusCourse() {
        return Arrays.asList(
                new Lecture("1. Introduction"),
                new Lecture("2. Fundamental Theorem of Calculus"),
                new Lecture("3. Functions"),
                new Lecture("4. Domain and Range"),
                new Lecture("5. Uncertainties"),
                new Lecture("6. Critical Points"),
                new Lecture("7. Asymptotes"),
                new Lecture("8. Derivatives"),
                new Lecture("9. Derivatives II"),
                new Lecture("10. Midterm exam"),
                new Lecture("11. Derivatives III"),
                new Lecture("12. Partial Derivatives"),
                new Lecture("13. Integrals"),
                new Lecture("14. Indefinite Integrals"),
                new Lecture("15. Definite Integrals"),
                new Lecture("16. Special Methods for Integrals"),
                new Lecture("17. Mathematical Modeling"),
                new Lecture("18. Optimization"),
                new Lecture("19. Discretization"),
                new Lecture("20. Final exam"));
    }

    private static ActivityInfo getCalculusCourseInfo(CourseEnum course, int hours, int credits, Professor professor) {
        return  ActivityInfo.builder()
                .id(UUID.randomUUID())
                .name(course.name().replace("_", " "))
                .hours(hours)
                .credits(credits)
                .professor(professor)
                .build();
    }
}
