package completeAtoZ;
public class printReverseString {
    public static void main(String args[]){
        String[] vijay = {"vijay", "ajay","anil", "vishal","kundan"};
      //  Collections.reverse(arr);
        for(int i = vijay.length-1;i>=0;i--){
            System.out.print(vijay[i]+" ");
        }
    }
}

