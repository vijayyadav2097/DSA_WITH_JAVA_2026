package OOPS;

class Account {
     private int aacid;
     private  double  balance;
     private  String name;
      void setter(int accid, String name,double balance){
          name = "vijay";
          balance = 234.3;
          aacid = 2345;
      }
      void getter(){
          System.out.println("Acid"+aacid);
          System.out.println("balance"+balance);
          System.out.println("name"+name);

      }
      public static void  main(String args[]){
          Account a = new Account();
               a.getter();
      }
}
