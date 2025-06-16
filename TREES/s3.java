import java.util.*;
public class s3{
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder gtr = new StringBuilder(str);
        
        gtr.reverse();
        String s = gtr+"";
        if(str.equals(s)){
            System.out.println("palindrome");

        }
        else{
            System.out.println("Not A Palindrome");
        }



    }
}