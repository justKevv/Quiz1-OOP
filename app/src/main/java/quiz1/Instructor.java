package quiz1;

import quiz1.model.User;
import quiz1.interfaces.DetailView;

public class Instructor extends User implements DetailView {
    private int instructorId;
    private String specialise;
    public Instructor(String name, String email, int instructorId, String specialise) {
        super(name, email);
        this.instructorId = instructorId;
        this.specialise = specialise;
    }

    public int getInstructorId() {
        return instructorId;
    }
    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }
    public String getSpecialise() {
        return specialise;
    }
    public void setSpecialise(String specialise) {
        this.specialise = specialise;
    }

    @Override
    public void showDetails() {
        System.out.println("Instructor Id: " + instructorId);
        super.showDetails();
        System.out.println("Specialise: " + specialise);
    }

}
