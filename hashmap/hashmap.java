// import java.util.*;
// public class hashmap{
//     public static void main(String[] args) {
//         HashMap<String, Integer> map = new HashMap<>();
//         map.put("India",120);
//         map.put("US",20);
//         map.put("China",180);
//         System.out.println(map);
//         map.put("China",290);
//         System.out.println(map);
//         // if(map.containsKey("India")){
//         //     System.out.println("Key is present");
//         // }
//         // else{
//         //     System.out.println("key is not present");
//         // }
//         System.out.println(map.get("China"));
//         System.out.println(map.get("Indonesia"));
//     }
// }
import java.util.*;
public class hashmap{
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true; 
            }
            map.put(num, 1);
        }
        
        return false;
    }
    
}

