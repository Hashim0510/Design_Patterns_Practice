package DesignPattern.Builder;

public class client {

    public static void main(String[] args) {

        student s = student
                .getBuilder()
                .setName("Hashim")
                .build();

        System.out.println(s.getAge());

        builder b = new builder();

        b.setName("Shreee");

        dummy d = new dummy(b);

        d.method();


    }
}
