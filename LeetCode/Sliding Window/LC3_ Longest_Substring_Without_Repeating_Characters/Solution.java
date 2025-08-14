import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int stringLength=s.length();
        HashSet<Character> tracking = new HashSet<Character>();

        int leftPointer = 0;

        for(int rightPointer=0; rightPointer<stringLength;rightPointer++){

            while(tracking.contains(s.charAt(rightPointer))){
                tracking.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            tracking.add(s.charAt(rightPointer));
            maxLength=(rightPointer-leftPointer+1>maxLength)?rightPointer-leftPointer+1:maxLength;
        }
        // RETURN MAX LENGTH
        return maxLength;


    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));
    }
}
