public class DrawTriangle {

	public static void built5floor() {
		int floor = 5;
		int x = 1;

		while (floor > 0) {
			int y = x;
			while (y > 1){
				System.out.print('*');
				y = y - 1;
			}
			System.out.println('*');
			floor = floor - 1;
			x = x + 1;
		}
	}

	public static void built(int n) {
		int x = 1;

		while (n > 0) {
			int y = x;
			while (y > 1){
				System.out.print('*');
				y = y - 1;
			}
			System.out.println('*');
			n = n - 1;
			x = x + 1;
		}
	}
	public static void main (String[] args) {
		// DrawTriangle.built5floor();
		DrawTriangle.built(3);
		DrawTriangle.built(7);
		DrawTriangle.built(11);

		

	}
	
} 
