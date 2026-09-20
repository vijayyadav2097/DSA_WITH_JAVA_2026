package OOPS;
class Pokemon{
    int power;
    String   type;
     String name;
     Pokemon(String name, String type,int power){
          this.name = name;
          this.type = type;
          this.power = power;
     }
     void print(){
         System.out.println(name+" "+type+" "+power+" ");
     }
}
public class inheritance {
    public static void   main(String args[]){
        Pokemon p1 = new Pokemon("vijay","fizzaly",110);
        p1.print();
    }
}
