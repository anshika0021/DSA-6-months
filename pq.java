import java.util.*;
public class pq{
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int x = arr.size() - 1;
            int par =(x-1)/2;
            while(arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

            }
            public int peek(){
                return arr.get(0);
            }
            public int remove(){
                int data = arr.get(0);
                int temp =  arr.get(0);
                arr.set(0, arr.get(arr.size()-1));
                arr.remove(arr.size()-1);
                return data;
            }

        }
    }
    public static void main(String[] args){

    }
}