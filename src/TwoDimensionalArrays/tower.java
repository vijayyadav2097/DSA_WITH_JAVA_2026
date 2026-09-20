package TwoDimensionalArrays;

public class tower {
    public static void hanoi(int n, char a, char b, char c){
        if( n== 0) return;
        hanoi(n-1,a ,c,b);
        System.out.println(a+"-->"+c);
        hanoi(n-1,b,a,c);
    }
    public static void main(String args[]){
        hanoi(5,'A','B','C');
    }
}
