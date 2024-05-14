package DesignPattern.Builder;

public class student {

    String name;
    int age;
    String phoneNumber;
    String email;

    builder builder;

    public student(builder builder) {

        this.name = builder.getName();

        this.age = builder.getAge();

        this.email = builder.getEmail();

        this.phoneNumber = builder.getPhoneNumber();

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public static builder getBuilder(){

        return new builder();

    }
}
