package OOPS;
public class ConstructorOverLoading {
    public static class ajay{
        String name;
        int price;
        ajay(String s, int p){
            name = s;
            price = p;
        }
        ajay(int p, String  s){
            name = s;
            price = p;
        }
        void vijay(){
            System.out.println(name+" "+ price+" ");
        }
    }
    public static void main(String args[]){
        ajay a1 =  new ajay("vijay",2003034);
        a1.vijay();
        ajay a2 = new ajay("maruti",2343454);
        a2.vijay();

    }
}
