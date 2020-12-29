public class DrawTriangle {
	public static void main (String[] args) {


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
	
} 
