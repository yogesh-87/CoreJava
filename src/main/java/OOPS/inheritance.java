package OOPS;

class person{
//    String name;
//     int age;
//    float weight;

    public void speak(){
        System.out.print("Person speaking ");
    }
}

class Student1 extends person{
    public void speak(){
//        System.out.println("Student name : " + name);
//        System.out.println("Student age : " + age);
//        System.out.print("Student weight : " + weight + " KG");

        System.out.print("Student speaking ");

    }
}

public class inheritance {
    public static void main(String[] args){
  person p = new Student1();
//     // person p = new Student();
//        p.name = ("bharat");
//        p.age = (23);
//        p.weight = (54.78f);
    p.speak();

    }
}
