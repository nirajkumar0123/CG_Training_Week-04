package multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class CourseMain {
    public static void main(String[] args) {
        // Creating courses
        Course<ExamCourse> dsaCourse = new Course<>("Data Structures", 100, new ExamCourse(), 6);
        Course<AssignmentCourse> seCourse = new Course<>("Software Engineering", 120, new AssignmentCourse(), 4);
        Course<ResearchCourse> aiCourse = new Course<>("AI Research", 200, new ResearchCourse(), 12);

        // Adding courses
        List<Course<? extends CourseType>> courses = new ArrayList<>();
        courses.add(dsaCourse);
        courses.add(seCourse);
        courses.add(aiCourse);

        // Display details of all courses
        for (Course<? extends CourseType> course : courses) {
            course.displayCourseDetails();
        }
    }
}

