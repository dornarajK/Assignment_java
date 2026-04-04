package DataStreamsAndExceptions_3_4.Task3.model;

import java.io.Serializable;

public class Course implements Serializable {
    String courseCode;
    String courseName;
    String instructor;

    public Course(String courseCode,String courseName, String instructor ) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode(){
        return courseCode;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getInstructor(){return instructor; }

    public void setCourseCode(String courseCode){this.courseCode = courseCode;}
    public void setCourseName(String courseName ){this.courseName = courseName;}
    public void setInstructor(String instructor){this.instructor = instructor;}

    @Override
    public String toString() {
        return "Course{code='" + courseCode + "', name='" + courseName + "', instructor='" + instructor + "'}";
    }
}
