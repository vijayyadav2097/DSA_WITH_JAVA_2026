package OOPS;

public class PassingClassingToMethod {
    public static class car{
        String name;
        double length;
        int   seats;
        int price;
//        void print(){
//            System.out.println(name+" "+ seats+" "+ price+" ");
//        }
    }
    public static void  main(String args[]){
        car s1  = new car();
        s1.length=454554;
        s1.name="lamborgeni";
        s1.seats = 34;
      //  System.out.println(s1.name+" "+s1.price+" "+s1.length+" ");
        change(s1);
        System.out.println(s1.name+" ");
    }
    public static void change(car s1){
        s1.name  ="honda car";
    }
}
