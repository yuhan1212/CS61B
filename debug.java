import java.util.ArrayList;
import java.util.List;

class debug {
    public static boolean checkIfExist(int[] arr) {
        System.out.println("======================== in checkIfExist ========================");
        // int[] twiceI;
        List<Integer> twiceI = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {

            System.out.println(" ####### ");           
            System.out.println("i = " + i);           
            System.out.println(" ####### ");            
            for (int t: twiceI) {     
                System.out.println("======================== ");           
                System.out.println("i = " + i);           
                System.out.println("t = " + t);           
                System.out.println("======================== ");           

                if (arr[i] == t) {
                    return true;
                }
                int twice = arr[i] * 2;
                twiceI.add(twice);
                if (arr[i] % 2 == 0) {
                    int half = arr[i] / 2;
                    twiceI.add(half);
                }   
            }              
        }
         
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Starting ... ");
        int[] a = {10,2,5,3};
        Boolean ans;
        ans = checkIfExist(a);
        System.out.println("ans " + ans);



        // IntList L = new IntList(15, null);
        // L = new IntList(10, L);
        // L = new IntList(5, L);

        // System.out.println(L);
        // System.out.println(L.size());
        // System.out.println(L.get(0));
        // System.out.println(L.printIntList());
    }       
}



