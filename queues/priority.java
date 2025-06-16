import java.util.*;
public class priority{
    public static class Students{
        int marks;
        String name;
        Students(int marks,String name){
            this.marks=marks;
            this.name=name;
        }
        public String toString(){
            return name +"-@"+ marks;
        }
        public static class StCompare implements  Comparator<Students>{
            public int compare(Students a,Students b){
                return a.marks-b.marks;
            }
        }
    }
    public static void main(String[] args){
        // PriorityQueue<Students> p = new PriorityQueue<>((a,b)->a.marks-b.marks);
        PriorityQueue<Students> p = new PriorityQueue<>(5, new Students.StCompare());
        p.offer(new Students(10,"Anshika"));
        p.offer(new Students(40,"Ame"));
        p.offer(new Students(5,"bhavya"));
        p.offer(new Students(30,"Aarohi"));
        System.err.println(p);
        System.out.println(p.poll());
        
    }
}