package OOPS;

public class userdefinedDatatype {
    public  static class Students{
        String name;
        int rollnumber ;
        double cgpa;
        int age;

    }
    public static void main(String args[]){
        Students s1 = new Students();
        s1.name ="vijay";
        s1.age = 23;
        s1.cgpa = 7.93;
        s1.rollnumber = 180;


        Students s2 = new Students();
        s2.name ="khushi";
        s2.age = 23;
        s2.cgpa = 7.93;
        s2.rollnumber = 180;


        Students s3 = new Students();
        s3.name ="kajal";
        s3.age = 23;
        s3.cgpa = 7.93;
        s3.rollnumber = 180;
        System.out.println(s1.name +"  "+ s1.age +" "+ s1.rollnumber+" "+s1.cgpa+" ");
        System.out.println(s2.name +"  "+ s2.age +" "+ s2.rollnumber+" "+s2.cgpa+" ");
        System.out.println(s3.name +"  "+ s3.age +" "+ s3.rollnumber+" "+s3.cgpa+" ");
    }
}
