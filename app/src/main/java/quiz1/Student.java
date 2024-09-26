package quiz1;

import quiz1.model.User;
import java.util.ArrayList;
import quiz1.interfaces.DetailView;

public class Student extends User implements DetailView {

    private int studentId;
    private ArrayList<Course> courses;

    public Student(String name, String email, int studentId) {
        super(name, email);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void addCourse(Course courses) {
        this.courses.add(courses);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public void showDetails() {
        System.out.println("Student Id: " + studentId);
        super.showDetails();
        System.out.println("Courses: ");

        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }


}
