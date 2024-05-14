package DesignPattern.Builder;


/*
having helper/builder in tha same original resource class in an inner static class and having same thing what we have
in previous version student class
changes are ---> making student constructor private, inner builder class can access all private things

why --->> to make it student(original) constructor private, to eliminate client can student class and try to give
argument null instead of builder object, and we need to handle exception for that, so we are eliminating that thing




 */
public class studentImproved {

    private String name;
    int age;
    String phoneNumber;
    String email;

    builder builder;

    private studentImproved(builder  builder) {

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

    static class builder {

        String name;
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

        public studentImproved build() {

            return new studentImproved(this);

        }
    }
}
