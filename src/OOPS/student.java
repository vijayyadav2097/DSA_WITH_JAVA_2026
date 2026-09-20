package OOPS;
public class student {
    int  age;
      private String name;
    private double rollnumber;
    private double height;
    public void setStudents(int age,String name,double rollnumber,double height){
        this . rollnumber = rollnumber;
        this.height = height;
       this.  age = age;
       this.name = name;
    }
    public void getStudents(){
        System.out.println(name+ " "+ age+" "+rollnumber+" "+height+" ");
    }

}
