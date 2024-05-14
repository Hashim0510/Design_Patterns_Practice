package DesignPattern.Builder;

public class builder {

    private String name;
    int age;
    String phoneNumber;
    String email;

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

    public builder setName(String name) {
        this.name = name;
        return this;
    }

    public builder setAge(int age) {
        this.age = age;
        return this;
    }

    public builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public student build(){

        return new student(this);

    }
}
