package basicQuestions;

//Java code for thread creation by extending Thread class

class ThreadsExtendsThread{
public static void main(String[] args)
{
  //to run 4 threads
  
  for (int i=0; i<4; i++)
  {
	  MultithreadingTest object = new MultithreadingTest();
      object.start();
  }
}
}

class MultithreadingTest extends Thread{

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