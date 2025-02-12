package multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

class Course<T extends CourseType> {
    private final String courseName;
    private final double coursePrice;
    private final T courseCategory;
    private final int courseDuration; // Duration in months

    public Course(String courseName, double coursePrice, T courseCategory, int courseDuration) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseCategory = courseCategory;
        this.courseDuration = courseDuration;
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Price: Rs" + coursePrice);
        System.out.println("Course Category: " + courseCategory.getTypeName());
        System.out.println("Course Duration: " + courseDuration + " months");
        System.out.println("---------------------------------");
    }
}

