class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        for(int i=0;i<f.length;i++)
        {
            if (n==0)
             return true;
            if(f[i]==0)
            {
            if ((i ==0||f[i - 1]== 0)&&(i==f.length-1|| f[i + 1] == 0))
            {
                f[i]=1;
                n--;
            }
            }
            
        }
        return n==0;
        
    }
}
