package ru.anton.test2;

public class User {
    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private int role;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static  UserBuilder builder(){
        return new UserBuilder();
    }

    public  static class UserBuilder{
        private String firstName;

        private String lastName;

        private String email;

        private String password;

        private int role;
    }
}
