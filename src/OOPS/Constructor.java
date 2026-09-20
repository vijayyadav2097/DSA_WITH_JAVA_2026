package OOPS;

public class Constructor {
    public  static class Car{
        String name;
        int seats;
        double length;
        Car(String s,int n,double d){
            name = s;
            seats = n;
            length = d;
        }
        void print(){
            System.out.println(name+" "+ seats+" "+ length+" ");
        }
    }
    public static void main(String args[]){
       Car c1 = new Car("honda",34,234.3);
        c1.print();

    }
}
