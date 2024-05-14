package DesignPattern.prototype;

public class client {

    public static void main(String[] args) {

        //creating prototypes
        //prototype 1
        student studentPrototype1 = new student();
        studentPrototype1.setDept("computer science");

        //prototype 2
        student studentPrototype2 = new student();
        studentPrototype2.setDept("Data science");

        //creating deep copies using prot
        //   ype 1

        student student1 = studentPrototype1.clone();
        student1.setName("Hashim");
        student1.setAge(25);

        //creating deep copies using prototype 2

        student student2 = studentPrototype2.clone();
        student2.setName("shree");
        student2.setAge(25);

        System.out.println("done !!!");

    }
}
