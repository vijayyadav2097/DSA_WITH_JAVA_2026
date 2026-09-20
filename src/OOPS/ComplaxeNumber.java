package OOPS;
class complexNumber{
    int x ; int y;
    void print(){
        if(y>0)System.out.println(x+" +"+" "+ y+"i");
        else System.out.println(x+" -"+" "+ (-y)+"i");
    }
    complexNumber(int x, int y){
       this.x = x;
       this.y = y;
    }
    void add(complexNumber z){
            x  += z.x;
            y  += z.y;
    }
    void multiplay(complexNumber z){
        x  = x*z.x -y*z.y;
        y  = y*z.y + y*z.x;
    }
}

public class ComplaxeNumber {
    public static void main(String args[]){
        complexNumber  z1 = new complexNumber(23,45);
        complexNumber  z2 = new complexNumber(23,-45);
      //  z1.print();
     //   z2.print();
        z1.add(z2);
        z1.print();
        z2.multiplay(z1);
        z2.print();
        }
    }
