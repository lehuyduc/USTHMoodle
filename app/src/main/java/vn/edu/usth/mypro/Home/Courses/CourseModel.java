package vn.edu.usth.mypro.Home.Courses;

import java.util.ArrayList;

public class CourseModel {
    String subjectName;

    public CourseModel(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public static ArrayList<CourseModel> coursesList = new ArrayList<>();

    public static void init() {
        coursesList.add(new CourseModel("B1 - general information"));
    }
}
