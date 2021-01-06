public class DogLauncher {
	/** DogLauncher should run with Dog in which contains Dog class and methods
	*/
	public static void main(String[] args) {
		Dog d = new Dog(20);
		d.makeNoise();

		Dog e = new Dog(51);
		e.makeNoise();

		Dog smallDog;
		new Dog(20);  // useless line, GC cleans it 
	   	smallDog = new Dog(5);

	   	Dog hugeDog = new Dog(150);
	   	smallDog.makeNoise();
	   	hugeDog.makeNoise();
	}
}



