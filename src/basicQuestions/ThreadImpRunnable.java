package basicQuestions;

// Java code for thread creation by implementing the Runnable Interface

class ThreadImpRunnable{
 public static void main(String[] args)
 {
     //to run 4 threads
     
     for (int i=0; i<4; i++)
     {
         Thread object = new Thread(new MultithreadingDemo());
         object.start();
     }
 }
}

class MultithreadingDemo implements Runnable{
 
	public void run(){
		
     try
     {
         System.out.println ("Thread " +Thread.currentThread().getId() + " is running");
     }
     catch (Exception e)
     {
         System.out.println ("Exception is caught");
     }
 }
}

