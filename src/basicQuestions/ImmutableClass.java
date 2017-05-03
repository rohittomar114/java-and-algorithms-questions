package basicQuestions;
// make class final do not use any method that can instance like setters
public final class ImmutableClass {

    private final String[] array;

    public ImmutableClass(String[] arr){
        this.array = arr.clone(); // defensive copy
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Characters in array are: ");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i] + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] array = {"a","b"};
        ImmutableClass immutableClass = new ImmutableClass(array) ;
        System.out.println("Before constructing " + immutableClass);
        array[1] = "c"; // change (i.e. mutate) the element
        System.out.println("After constructing " + immutableClass);
    }
}
