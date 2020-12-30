public class Dog {
	/** Dog should run with DogLauncher in which contains 'void main'
	*/

	public int weightInPounds;
	

	/** One integer constructor for dogs. */
	public Dog(int startingWeight) {
		weightInPounds = startingWeight;
	}
	 
	public void makeNoise() {
		if (weightInPounds < 10) {	
			System.out.println("yipyipyip!");
	   	} else if (weightInPounds < 30) {
	      	System.out.println("bark. bark.");
	   	} else {
	      	System.out.println("woof!");
	   	}
	}

	public static Dog returnBiggerDog(Dog d1, Dog d2) {
		if (d1.weightInPounds > d2.weightInPounds) {
			return d1;
		} 
		return d2;
	}
}





public class DogLauncher {
	/** DogLauncher should run with Dog in which contains Dog class and methods
	*/
	public static void main(String[] args) {
		Dog d1 = new Dog(20);
		Dog d2 = new Dog(50);
		
		Dog.returnBiggerDog(d1, d2);




	}
}








/**
crate a class which name is Dog {
	assign an attribute to Dog
	Instance variable. Can have as many of these as you want.;

	construct a Dog(assign it the weight) {
	the attribute to Dog is his weight
	Constructor (similar to a method, but not a method). 
	Determines how to instantiate the class.;
	}

	assign voice to dogs according to their weight {
	Non-static method, a.k.a. Instance Method. 
	Idea: If the method is going to be invoked by an instance of the class 
	, then it should be non-static.;
	}
}

*/

// distinguish：class, instance
// 2 variable types：class variable (static), instance variable (non-static)
// 2 method types：class method (static), instance method (non-static)

