class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sfreq = new HashMap<>();
        HashMap<Character,Integer> tfreq = new HashMap<>();

        for (int i=0;i<s.length();i++){
            char ss=s.charAt(i);
            sfreq.put(ss,sfreq.getOrDefault(ss,0)+1);
        }

        for (int i=0;i<t.length();i++){
            char tt=t.charAt(i);
            tfreq.put(tt,tfreq.getOrDefault(tt,0)+1);
        }

        return sfreq.equals(tfreq);
    }
}
