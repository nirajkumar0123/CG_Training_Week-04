package multileveluniversitycoursemanagementsystem;

abstract class CourseType {
    private String courseType;

    public CourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getTypeName() {
        return courseType;
    }
}





