import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main2 {
    public static void minmax(int[] array,int n) {
                      // Your code here
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i=0; i < n; i++){
        if(max < array[i]){
            max = array[i];
        }
        if(min > array[i]){
            min = array[i];
        }
    }
    System.out.println(max+" "+min);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0){
            int n =sc.nextInt();
            int[] array =new int[n];
            for(int i=0; i<n; i++){
                array[i]=sc.nextInt();
            }
            minmax(array, n);
            t--;
        }

    }
}