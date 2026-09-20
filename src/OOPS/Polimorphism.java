package OOPS;

public class Polimorphism {
    public static class dog{
        void speak(){
            System.out.println("bhow bhow");
        }
        public  static class Cat{
            void speak(){
                System.out.println("maoun maoun");
            }
            public static  class human{
                void speak(){
                    System.out.println("Hello");
                }
                    public static void main(String args[]){
                        dog d = new dog();
                        Cat c = new Cat();
                        human H = new human();
                        c.speak();
                        d.speak();
                        H.speak();
                    }
                }
            }
        }
    }

