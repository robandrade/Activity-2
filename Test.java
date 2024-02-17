package app;

public class Test {

	public static void main(String[] args) {
		// Create new Person Objects
		Person person1 = new Person("Justine", "Reha");
		Person person2 = new Person("Brianna", "Reha");
		Person person3 = new Person(person1);
		
		// Test Object equality 
		if(person1 == person2)
			System.out.println("These persons are identical using ==");
		else 
			System.out.println("These persons are not identical using ==");
		
		// Test Object equality
		if (person1.equals(person2))
			System.out.println("These persosn are identical using equals()");
		else 
			System.out.println("These persons are not identcial using equals()");
		
		//Test Object Constructor 
		if (person1.equals(person3))
			System.out.println("These copied person is identical using equals()");
		else
			System.out.println("These copied person is not identcial using equals()");
		
		// Print the Objects 
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3);

	}

}
