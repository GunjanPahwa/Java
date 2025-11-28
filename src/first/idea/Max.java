package first.idea;
import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,2,67,89,100};
        System.out.println(max(arr));
    }
    static int max(int[] array){
        int maxVal=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>maxVal){
                maxVal=array[i];
            }

        }
        return maxVal;
    }
}
