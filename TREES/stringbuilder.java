public class stringbuilder{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        // System.out.println(str);
        // str.setCharAt(0,'M');
        // System.out.println(str);
        // str.append(123);
        // System.out.println(str);
        // str.insert(2,'y');
        // System.out.println(str);
        // str.deleteCharAt(3);
        // System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(0,4);
        System.out.println(str); 
    }
 
}