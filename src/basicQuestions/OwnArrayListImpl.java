package basicQuestions;


/*
 * Write a program to implement your own ArrayList class. 
 * It should contain add(), get(), remove(), size() methods. 
 * Use dynamic array logic. 
 * It should increase its size when it reaches threshold.
 * See more at: http://www.java2novice.com/java-interview-programs/arraylist-implementation/#sthash.g1qi0CZJ.dpuf
 */
import java.util.Arrays;

public class OwnArrayListImpl {
 
    private Object[] myStore;
    private int actSize = 0;
     
    public OwnArrayListImpl(){
        myStore = new Object[10];
    }
     
   
    public void add(Object obj){
        if(myStore.length-actSize <= 5){
        	
        	myStore = Arrays.copyOf(myStore, myStore.length*2);
            System.out.println("\nNew length: "+myStore.length);
        }
        
        myStore[actSize] = obj;
        actSize++;
    }
    
    public Object remove(int index){
        if(index >= 0 && index < actSize){
            Object obj = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while(tmp < actSize){
                myStore[tmp] = myStore[tmp+1];
                myStore[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
    
    public Object get(int index){
        if(index >= 0 && index < actSize){
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
     
    
     
    public int size(){
        return actSize;
    }
     
    public static void main(String a[]){
        OwnArrayListImpl mal = new OwnArrayListImpl();
        mal.add(new Integer(2));
        mal.add(new Integer(5));
        mal.add(new Integer(1));
        mal.add(new Integer(23));
        mal.add(new Integer(14));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(new Integer(29));
        System.out.println("Element at Index 5 is:"+mal.get(5));
        System.out.println("List size: "+mal.size());
        System.out.println("Removing element at index 2 that is: "+mal.remove(2));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
    }
}