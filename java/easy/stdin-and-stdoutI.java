import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vector = new int[3];
        
        for (int i = 0; i < 3; i++){
            vector[i] = scan.nextInt();
        }
        for(int i : vector){
            System.out.println(i);
        }
        scan.close();
    }
}
