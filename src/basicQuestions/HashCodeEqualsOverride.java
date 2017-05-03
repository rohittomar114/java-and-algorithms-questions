package basicQuestions;

import java.util.HashSet;
import java.util.Set;


public class HashCodeEqualsOverride {
	
	
	public static void main(String[] args){
		
		User user1 = new User("mkyong", 35, "111");
	    User user2 = new User("mkyong", 35, "111");

	    System.out.println(user1.equals(user2));
	    
	    
    Set<User> set = new HashSet<User>();
		
		set.add(user1);
		set.add(user2);
		
		
		for( User s : set){
			
			System.out.println(s);
		}
	}
}

    class User {
    private String name;
	private int age;
    private String passport;

    public User(String name, int age, String passport) {
    	
    	this.name = name;
    	this.age = age;
    	this.passport = passport;
	}

	@Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        return user.name.equals(name) &&
                user.age == age &&
                user.passport.equals(passport);
    }

    //Idea from effective Java : Item 9
    /*@Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        result = 31 * result + passport.hashCode();
        return result;
    }*/

    
    // For JDK 7 and above, you can use the new Objects class to generate the equals and hash code values
    
    /*@Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }
    */
    
}
