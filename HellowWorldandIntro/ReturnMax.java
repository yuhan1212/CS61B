public class ReturnMax {
    /** Returns the maximum value from m. */
    public static void max(int[] m) {
       int maximun = 0;
       int x = m.length - 1;
       while (x >= 0){
       		if (m[x] > maximun) {
       			maximun = m[x];	
       		}
       		x = x - 1;
       }
       System.out.println(maximun); 
    }

    public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};  
	   max(numbers);

      int[] numbers_2 = new int[]{9, 2, 15, 2, 22, 10, 65};  
	   max(numbers_2);

	   int[] numbers_3 = new int[]{90, 2, 15, 2, 22, 10, 65};  
	   max(numbers_3);
       
       return;
    }
}
