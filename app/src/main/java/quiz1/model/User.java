package quiz1.model;

import quiz1.interfaces.DetailView;

public abstract class User implements DetailView {
    private String name;
    private String email;
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
