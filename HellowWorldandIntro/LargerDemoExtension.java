public class LargerDemoExtension {
	public int middle;

	public LargerDemoExtension(int m) {
		middle = m;
	}	

	public int larger(int x) {
		
		if (x > middle) {
			return x;
		}
		return middle;
	}

	public static void main(String[] args) {
		LargerDemoExtension l = new LargerDemoExtension(3);		
		System.out.println(l.larger(6));

	}
}