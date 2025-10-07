class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
       int right = Arrays.stream(piles).max().getAsInt();
        
        while(left<right){
            int mid = (left+right)/2;
            if(minApplePerHour(piles,mid)>h){
                left=mid+1;
            }else{
                right=mid;
            }
           
       }
        return left;
    }

       int minApplePerHour(int[] apples, Integer rate){

        int time = 0;

        for (int i=0; i < apples.length; i++) {
            time += (apples[i]+rate-1)/rate;
        }

        return time;

       
    }
}