import java.util.PriorityQueue;
import java.util.Queue;

public class PQ {
    int value;
    
    public static int kthSmallest(PriorityQueue<Integer> ints, int k){
       PriorityQueue<Integer> copy = new PriorityQueue<Integer>(ints);
       if(k < 1 || k > copy.size()){
           System.out.println("Invalid Augument");
           return -1;
       } else {
           for(int i = 1; i < k; i++) {
               copy.remove();
            }
            
           return copy.peek();
       }
    }
    public static void removeDuplicates(PriorityQueue<Integer> ints) {
        PriorityQueue<Integer> temp = new PriorityQueue<Integer>();
       
        while(!ints.isEmpty()) {
            Integer current = ints.remove();
            if(!temp.contains(current)) {
                temp.add(current);
            }
        }
        while(!temp.isEmpty()) {
            ints.add(temp.remove());
        }
    }        
    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(42);
        pq.add(17);
        pq.add(9);
        pq.add(17);
        pq.add(42);
        pq.add(1);
        pq.add(-1);
        pq.add(6);
        pq.add(9);
        pq.add(17);
        pq.add(15);
        pq.add(6);
        
        System.out.println("Original Priority Queue: " + pq);
        System.out.println("Smallest value: " + pq.peek());
        
        System.out.println("Before removing duplicates: " + pq);
        removeDuplicates(pq);
        System.out.println("After removing duplicates: " + pq);
        
        System.out.println("The third smallest value is: " + kthSmallest(pq, 3));
        System.out.println("When 20th is called: ");
        System.out.println(kthSmallest(pq, 20));
        
        
    }
}
