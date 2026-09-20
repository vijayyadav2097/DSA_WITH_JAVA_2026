package completeAtoZ;

public class printOneToN {
    public static void print(int x , int n){
        if(x>n) return;
        print(x+1,n);
        System.out.println(x+" ");

    }
    public static void main(String args[]){
        print(1,100);

    }
}
