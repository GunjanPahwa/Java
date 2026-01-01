package first.idea;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={18,124,9,176,98,1};
        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num=0;num<nums.length;num++){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigits=digits(num);
        if(numberofdigits%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
