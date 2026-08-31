class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0; i<s1.length(); i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
            return true;
        }
        int left=0;
        for(int right=s1.length(); right<s2.length(); right++){
            freq2[s2.charAt(right)-'a']++;
            freq2[s2.charAt(left)-'a']--;
            left++;
            if(Arrays.equals(freq1,freq2)){
            return true;
        }
        }
        return false;
    }
}