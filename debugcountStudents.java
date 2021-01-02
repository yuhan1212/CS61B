import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

class debugcountStudents {
    public static int countStudents(int[] students, int[] sandwiches) {
        System.out.println("======================== in countStudents ========================");

        while (sandwiches[0] == 1) or (sandwiches[0] == 0); {
            System.out.println(" ####### ");           
            System.out.println("sandwiches[0] = " + sandwiches[0]); 
            if (students.contains(sandwiches[0])) {
                for (int i = 0; i < students.length; i++) {
                    System.out.println("i = " + i);
                    if (students[i] == sandwiches[0]) {
                        System.out.println("students[i] = " + students[i]);
                        students = ArrayUtils.remove(students, i);
                        System.out.println(students);
                    }
                }
                sandwiches = ArrayUtils.remove(sandwiches, 0);
                System.out.println(sandwiches);                   
                    
            }
        }
        return sandwiches.length;
    }


    public static void main(String[] args) {
        System.out.println("Starting ... ");
        int[] a = {1,1,1,0,0,1};
        int[] b = {1,0,0,0,1,1};
        int ans = countStudents(a, b);
        System.out.println("countStudents " + ans);
    }       
}



