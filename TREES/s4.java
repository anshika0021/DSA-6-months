import java.util.*;
public class s4{
    public static void main(String[] args) {
        String str = "I am an online educator";
        String ans ="";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch !=' '){
                sb.append(ch);
            }
            else{
                sb.reverse(); 
                ans += sb;
                ans +=" ";
            }
        }
    }
}
