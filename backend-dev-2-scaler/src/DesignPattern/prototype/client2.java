package DesignPattern.prototype;

public class client2 {

    public static void main(String[] args) {

        prototypeHolderOrRegister prototypeHolderOrRegister = new prototypeHolderOrRegister();

        createPrototype(prototypeHolderOrRegister);

        //creating deep copies using prototype 1

        student student1 = prototypeHolderOrRegister.accessPrototype("studentPrototype1").clone();
        student1.setName("Hashim");
        student1.setAge(25);

        //creating deep copies using prototype 2

        student student2 = prototypeHolderOrRegister.accessPrototype("studentPrototype2").clone();
        student2.setName("shree");
        student2.setAge(25);

        //creating deep copy of student with its child class attributes intelligent student prototype 1::::::

        student intelligentstudentPrototype1 =  prototypeHolderOrRegister.accessPrototype("IntelligentstudentPrototype1").clone();

//        intelligentstudentPrototype1.setAge(98);
//
//        intelligentstudentPrototype1.setName("Divya");
//
//        intelligentstudentPrototype1.setDept("Fashion designining");

        System.out.println(intelligentstudentPrototype1.getAge());
        System.out.println(intelligentstudentPrototype1.getName());
        System.out.println(intelligentstudentPrototype1.clone() );





    }

    private static void createPrototype(prototypeHolderOrRegister prototypeHolderOrRegister) {

        //creating prototypes

        //prototype 1
        student studentPrototype1 = new student();
        studentPrototype1.setDept("computer science");

        //prototype 2
        student studentPrototype2 = new student();
        studentPrototype2.setDept("Data science");

        //prototype 2
        intelligentStudent IntelligentstudentPrototype1 = new intelligentStudent();
        IntelligentstudentPrototype1.setDept("Fashion designing");
        IntelligentstudentPrototype1.setName("Divya");
        IntelligentstudentPrototype1.setAge(35);
        IntelligentstudentPrototype1.setIq(180);



        prototypeHolderOrRegister.storeprototypes("studentPrototype1", studentPrototype1);
        prototypeHolderOrRegister.storeprototypes("studentPrototype2", studentPrototype2);
        prototypeHolderOrRegister.storeprototypes("IntelligentstudentPrototype1", IntelligentstudentPrototype1);

    }


}
