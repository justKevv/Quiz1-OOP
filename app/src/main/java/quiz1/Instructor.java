package quiz1;

import quiz1.model.User;

public class Instructor extends User {
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

}
