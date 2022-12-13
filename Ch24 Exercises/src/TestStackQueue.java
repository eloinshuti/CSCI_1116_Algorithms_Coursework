 /* Eloi Nshuti
  * Exercise 24-5
  * 12/09/2022
  */
 
public class TestStackQueue {
  public static void main(String[] args) {

    GenericQueue<String> queue = new GenericQueue<>();
    
    // Add elements to the queue
    queue.enqueue("Red");
    System.out.println(queue);

    queue.enqueue("Orange");
    System.out.println(queue);
 
    queue.enqueue("Yellow");
    queue.enqueue("Green");
    System.out.println(queue);
    
    // Remove elements from the queue
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    
    //Remaining elements
    System.out.println(queue);
  }
}