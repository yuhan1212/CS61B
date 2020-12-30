public class LargerDemo {
	/** Returns the larger of x and y. 
		@precondition */
	public static int larger(int x, int y) {
		// must assign type to variables and fuction return type
		if (x > y) {
			return x;
		}
		return y;
	}

	public static void main(String[] args) {
		System.out.println(larger(-5, 10));

	}
}

/*
1. Function must be declared as part of a class in Java.
	A function that is part of a class is called a "method".
	So in Jave all functios are methods.
2. To define a function in Java, we use "public static".
3. All parameters of a function must have a declared type,
	and the return value of the function must have a declared type.
	Fuction in Java return only one value!
*/


