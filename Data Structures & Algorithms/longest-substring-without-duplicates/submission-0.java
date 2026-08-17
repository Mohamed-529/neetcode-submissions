class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr=new int[128];
        int left=0,res=0;

        for (int i=0;i<s.length();i++){
            char l=s.charAt(i);
            arr[l]++;

            while (arr[l]>1){
                char r=s.charAt(left);
                arr[r]--;
                left++;
            }

            res=Math.max(res,i-left+1);

        }
        return res;
    }
}
