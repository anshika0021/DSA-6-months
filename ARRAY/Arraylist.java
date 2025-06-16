
import java.util.*;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(0);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        // int element = list.get(2);
        // int elements = list.remove(2);
        // int element = list.set(3,10);
        // System.out.println(element);
        // System.out.println(list);
        // System.out.println(list.contains(2));
        // System.out.println(list.contains(10));
        // System.out.println(list.contains(13));
        // System.out.println(list.size());
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }
        // int n=list.size();
        // for(int i=n-1;i>=0;i--){
        //     System.out.println(list.get(i));
        // }
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>current=mainList.get(i);
            for(int j=0;j<current.size();j++){
                System.out.print(current.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);

    
       

    }
}