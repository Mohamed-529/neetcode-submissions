class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr=new int[26];
        int left=0,maxfreq=0,ans=0;

        for (int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'A';
            arr[ind]++;

            maxfreq=Math.max(maxfreq,arr[ind]);

            while(i-left+1-maxfreq>k){
                int indd=s.charAt(left)-'A';
                arr[indd]--;
                left++;
            }

            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}
