import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface myname {
    int value() default 0;
    String name() default "Chitkara University";
}
public class ones {
    public void display() {
        System.out.println("Hello World abc");
    }
    @myname(value = 3000)
    class demo {
    }
    public static void main(String[] args) {
        ones obj = new ones();
        demo dm = obj.new demo();  
        Class<?> c = dm.getClass();
        System.out.println(c.getName());

        myname mn = c.getAnnotation(myname.class); 
        System.out.println(mn.value());
        System.out.println(mn.name());
    }
}
