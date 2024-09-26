package quiz1;

import java.util.ArrayList;
import quiz1.interfaces.DetailView;


public class Course implements DetailView {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private Instructor courseInstructor;
    private ArrayList<Student> students;
    private ArrayList<Content> contents;

    public Course(int courseId, String courseName, String courseDescription, Instructor courseInstructor, int duration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseInstructor = courseInstructor;
        this.contents = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    @Override
    public void showDetails() {
        System.out.println("Course Id: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Description: " + courseDescription);
        System.out.println("Course Instructor: " + courseInstructor.getName());
        System.out.println("Contents: ");
        for (Content content : contents) {
            System.out.println("Name: " + content.getContentName());
            System.out.println("Type: " + content.getType());
            System.out.println("+----------------------------+");
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void showStudentDetails() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public void addContent(Content content) {
        contents.add(content);
    }

    public void addStudent(Student student) {
        students.add(student);
    }


}
