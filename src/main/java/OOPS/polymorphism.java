package OOPS;


public class polymorphism {

    void sum(int a , int b){
        System.out.println(a+b);
    }
    void sum(float a , float b){
        System.out.println(a+b);
    }
    void sum(int a , int b , int c){
        System.out.println(a+b+c);
    }


  public  static void main(String[] args) {



polymorphism p = new polymorphism();
      p.sum(5,7);

    p.sum(2,35, 45);
 p.sum(56.7f , 67.89f);

    }
}
