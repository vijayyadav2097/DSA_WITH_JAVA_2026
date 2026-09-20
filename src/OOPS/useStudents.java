package OOPS;

public class useStudents {
    public static void main(String args[]) {
        student s1 = new student();
          String name = " vijay";
          int age = 34;
          s1.setStudents(23,"vijay",34,7);
          s1.getStudents();
          student p1 = new student();
          p1.setStudents(2334, "kajal",34,3445.3);
          s1.getStudents();
        student p12 = new student();
        p12.setStudents(2334, "kajal",34,34);
        s1.getStudents();
    }
}
