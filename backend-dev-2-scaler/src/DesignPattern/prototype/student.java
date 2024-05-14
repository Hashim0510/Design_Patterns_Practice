package DesignPattern.prototype;

public class student implements prototype<student>{

    private String name;
    private int age;
    private String dept;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    public student(){

    }

    public student(student student){

        this.name = student.name;

        this.age = student.age;

        this.dept = student.dept;


    }

    @Override
    public student clone() {
//        student copy = new student();
//        copy.age = this.age;
//        copy.name = this.name;
//        copy.dept = this.dept;
//        return copy;

        //UPDATED CODE FOR PRIVATE ATTRIBUTE HANDLING:::::::
        System.out.println("INTO THE PARENT CLAS CLONE METHOD !!!!!");
        return new student(this);


    }


}
