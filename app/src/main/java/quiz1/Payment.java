package quiz1;

import java.util.Date;

public class Payment {

    private int paymentId;
    private Date paymentDate;
    private Course course;
    private Student student;
    private double amount;

    public Payment(int paymentId, Date paymentDate, Course course, Student student, double amount) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.course = course;
        this.student = student;
        this.amount = amount;
    }

    public void showPaymentDetails() {
        System.out.println("Payment Id: " + paymentId);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Student: " + student.getName());
        System.out.println("Amount: " + amount);
    }
}
