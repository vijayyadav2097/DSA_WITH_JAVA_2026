package OOPS;
 class fraction{
     int num;
     int den;

     fraction(int num , int den){
         this.num = num;
         this.den = den;
     simplyfy();
     }
     void print(){
         System.out.println(num+"/"+den);
     }
     void add(fraction f){
         num  = num*f.den + den*f.num;
         den = den * f.den;
         num = num* f.num;
         den = den * f.den;
         simplyfy();
 }
     void multiply(fraction f){
         num = num* f.num;
         den = den * f.den;
         simplyfy();
     }
     void division(fraction f){
         num = num* f.num;
         den = den * f.den;
         simplyfy();
     }
     void simplyfy(){
         int gcd =  hcf(num,den);
         num = num/gcd;
         den = den/gcd;
     }
     int hcf(int a, int b){
         if( a== 0) return b;
         return hcf(b%a,a);
     }
 }
public class fractionClass {
    public static void main(String args[]){
        fraction f1 = new fraction(3,7);
        f1.print();
        fraction f2 = new fraction(7,3);
//          f1.add(f2);
//          f1.print();
          f1.multiply(f2);
          f1.print();
          fraction f3 = new fraction(50,100);
          f3.print();
    }
}
