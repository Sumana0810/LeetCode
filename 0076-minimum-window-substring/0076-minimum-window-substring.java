class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int[] freq=new int[128];
        for(char c : t.toCharArray()){
            freq[c]++;
        }
        int left=0;
        int right=0;
        int required=t.length();
        int minLength=Integer.MAX_VALUE;
        int start=0;
        while(right<s.length()){
            char c=s.charAt(right);
            if(freq[c]>0){
                required--;
            }
            freq[c]--;
            right++;
            while(required==0){
                if(right-left<minLength){
                    minLength=right-left;
                    start=left;
                }
                char leftChar=s.charAt(left);
                freq[leftChar]++;
                if(freq[leftChar]>0){
                    required++;
                }
                left++;
            }
        }
        if(minLength==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minLength);
    }
}