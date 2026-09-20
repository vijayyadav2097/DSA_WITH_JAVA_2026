package OOPS;

 class pokemon {
    String name;
    //int type;
    private int power;

    pokemon(String name, int power) {
        this.  name = name;
        this. power = power;
    }
    void print () {
        System.out.println(name + " " + power + " ");
    }
}
public class revisionOOPS {

    public  static void main(String args[]){
         pokemon   p1 = new pokemon("vijay",110);
//         p1.power = 23;
         p1.print();
    }
}
