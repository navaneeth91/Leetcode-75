class Solution {
    public String reverseVowels(String s) {
        char a[]=s.toCharArray();
        int p1=0,p2=s.length()-1;
        String v="aeiouAEIOU";
        while(p1<p2)
        {
            while(p1<p2 && v.indexOf(a[p1])==-1)
            p1++;
            while(p1<p2 && v.indexOf(a[p2])==-1)
            p2--;

                char t=a[p1];
                a[p1]=a[p2];
                a[p2]=t;
                p1++;
                p2--;
        }
        String ans=new String(a);
        return ans;
    }
}
