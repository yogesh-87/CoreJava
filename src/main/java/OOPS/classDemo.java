package OOPS;
 class student11{
    int roll;
    String name;

    public void details(){
        System.out.println("Student name :" + name);
        System.out.print("Student roll number:" + roll);
    }
}
public class classDemo {
    public static void main(String[] args){
        student11 s = new student11();
        s.roll = 122;
        s.name = "yogesh";
        s.details();
    }
}
