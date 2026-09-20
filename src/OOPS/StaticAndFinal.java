package OOPS;
 class Cricketer{
     static String country  = "nz";
     String name ;
     int avg;
}
public class StaticAndFinal {

    public static void main(String args[]){
       Cricketer  c1 = new Cricketer();
        c1.country  = "austriaya";
        Cricketer  c2 = new Cricketer();
        c2.country ="england";
        System.out.println(c1.country);
    }
}
