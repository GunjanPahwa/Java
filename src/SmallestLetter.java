public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr={'c','e','k','o','v'};
        char target='z';
        char ans=ceiling(arr,target);
        System.out.println(ans);
    }
    static char ceiling(char[] letters,char target){

        int start=0;
        int end=letters.length-1;
        while(start<=end){
            //int mid
            // =(start+end)/2; might be possible start+end exceeds the range of integer in java
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else if (target>letters[mid]){
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
