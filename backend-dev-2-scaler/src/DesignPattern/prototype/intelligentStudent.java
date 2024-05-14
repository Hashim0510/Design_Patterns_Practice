package DesignPattern.prototype;

public class intelligentStudent extends student{

    int iq;

    public intelligentStudent(){

    }

    public intelligentStudent(intelligentStudent IntelligentStudent){

        super(IntelligentStudent);

        this.iq = IntelligentStudent.iq;

    }

    @Override
    public intelligentStudent clone() {
//        intelligentStudent copy = new intelligentStudent();
//        copy.setDept(this.getDept()); //setting the parent class attributes also when deep copy of child class needed
//        copy.setName(this.getName());
//        copy.setAge(this.getAge());
//        copy.iq = this.iq;
//        return copy;

        /*

        what if student(parent) attribute is private(both getters and attributes's access modifier) ?

        then we could not able to access it, then how to set the attribute ?

        */

        //UPDATED CODE FOR PRIVATE ATTRIBUTES OF PARENT CLASS SETTING ::::

        // create a student/intelligent arg constructor to set the respective class attribute values within the class itself

        //for example parent class arg constructor will set its values and child class arg constructor will set it attribute values

        System.out.println("INTO THE CHILD CLAS CLONE METHOD !!!!!" + this.iq);
        return new intelligentStudent(this);


    }


    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
