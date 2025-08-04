class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1=0,p2=0;
        StringBuilder ans=new StringBuilder();
        while(p1<word1.length() && p2<word2.length())
        {
            ans.append(word1.charAt(p1));
            ans.append(word2.charAt(p2));
            p1++;
            p2++;
        }
        if(p1<word1.length())
        {
            ans.append(word1.substring(p1));
        }
        if(p2<word2.length())
        {
            ans.append(word2.substring(p1));
        }
        return ans.toString();
    }
}
