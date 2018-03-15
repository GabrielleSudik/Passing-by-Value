public class Application {

	public static void main(String[] args) {

		Application app = new Application();

		int value = 7;
		// reminder: names of variable and names of arguments don't have to be
		// the same
		// they frequently are, though

		System.out.println("1. Value is: " + value);

		// remember that the scope of value (7) is limited to what's inside
		// these brackets
		// passing the variable to another method (ie, outside the brackets)
		// sends a copy of the variable
		app.show(value);

		//here it will print 7. why?
		//because THIS value is still 7 from above.
		//it's not affected by the method below
		System.out.println("4. Value is: " + value);

		//==================================
		//new stuff below:
		//it's to show you get the same results
		//regardless of what kind of variable you pass
		//this time we'll try an object of class Person
		
		System.out.println();
		
		Person person = new Person("Betty");
		System.out.println("1. Person: " + person);
	
		app.show(person);
		
		System.out.println("4. Person: " + person);

	}

	public void show(int value) {

		// the scope of value here is limited by these curly brackets
		System.out.println("2. Value is: " + value);
		// passing info this way is called passing by value.
	
		//now let's say we change the passed value within this method:
		value = 8;
		
		//here it will print 8:
		System.out.println("3. Value is: " + value);
	
	}
	
	public void show(Person person){
		//remember that is method overloading
		//they can have the same name, so long as different parameters
		System.out.println("2. Person: " + person);
		
		//last thing done to this program. here's something to note:
		person.setName("Sue");
		//THAT sets the variable person that is outside of these brackets
		//I'm not quite sure why, except the setName method is only in the class Person
		//so maybe it has no choice but to alter the object of that class?
		
		//this next bit will only alter the variable within these brackets, tho.
		person = new Person("Mike");
		
		System.out.println("3. Person: " + person);

	}

}

//frankly, I think this is way more obvious if you don't use the same variable names in different scopes
//but I also see how for continuity, using the same words is easier to understand

//there is no passing by reference in java.
//it happens in other languages
