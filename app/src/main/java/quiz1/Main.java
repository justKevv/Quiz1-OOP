package quiz1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("John Doe", "lNj0S@example.com", 1, "Java");
        Instructor instructor2 = new Instructor("Jane Doe", "lNj0S@example.com", 2, "Python");
        Instructor instructor3 = new Instructor("Jim Doe", "lNj0S@example.com", 3, "C++");

        Course course1 = new Course(1, "Java", "Java course", instructor1, 3);
        Course course2 = new Course(2, "Python", "Python course", instructor2, 3);
        Course course3 = new Course(3, "C++", "C++ course", instructor3, 3);

        Student student1 = new Student("John", "lNj0S@example.com", 1);
        Student student2 = new Student("Jane", "lNj0S@example.com", 2);
        Student student3 = new Student("Jim", "lNj0S@example.com", 3);

        Content content1course1 = new Content(1, "Video", "Introduction to Java", new Date());
        Content content2course1 = new Content(4, "Article", "Why Java is awesome", new Date());
        Content content2 = new Content(2, "Video", "Introduction to Python", new Date());
        Content content3 = new Content(3, "Video", "Introduction to C++", new Date());

        course1.addContent(content1course1);
        course1.addContent(content2course1);
        course2.addContent(content2);
        course3.addContent(content3);

        student1.addCourse(course1);
        student2.addCourse(course2);
        student3.addCourse(course3);

        course1.addStudent(student1);
        course2.addStudent(student2);
        course3.addStudent(student3);

        student1.showDetails();

        course1.showDetails();

        content1course1.showDetails();

        Payment payment = new Payment(1, new Date(), course1, student1, 100.0);

        payment.showDetails();

        student1.getName();

    }
}
