package basicQuestions;

//Java program to implement solution of producer consumer problem.
import java.util.LinkedList;

public class ThreadsProducerConsumer
{
 public static void main(String[] args) throws InterruptedException{
     
     final ProducerConsumer pc = new ProducerConsumer();
     
     Thread t1 = new Thread(new Runnable()
     {
         @Override
         public void run()
         {
             try
             {
                 pc.produce();
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
             }
         }
     });

     // Create consumer thread
     Thread t2 = new Thread(new Runnable()
     {
         @Override
         public void run()
         {
             try
             {
                 pc.consume();
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
             }
         }
     });

     t1.start();
     t2.start();

     // t1 finishes before t2
     t1.join();
     t2.join();
 }

 public static class ProducerConsumer
 {
     // Create a list shared by producer and consumer Size of list is 2.
     LinkedList<Integer> list = new LinkedList<>();
     int capacity = 2;

     public void produce() throws InterruptedException{
         int value = 0;
         
         int j= 0;
         while (j<10)
         {
             synchronized (this){

                 while (list.size()==capacity)
                     wait();

                 System.out.println("Producer produced-" + value);
                 list.add(value++);
                 notify();
                 
                 j++;
             }
         }
     }

     public void consume() throws InterruptedException{
    	 
    	 int i= 0;
         while (i<10)
         {
             synchronized (this){
                 while (list.size()==0){
                	 wait();
                	 }
                 
                 int val = list.removeFirst();

                 System.out.println("Consumer consumed-" + val);
                 notify();
                 
                 i++;

             }
         }
     }
 }
}