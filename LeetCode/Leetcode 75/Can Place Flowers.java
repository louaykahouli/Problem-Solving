class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n==0)return true;
        if (flowerbed.length==1){

            return flowerbed[0]==0;
        }
        else{
        int nbrest=n;
        
        if (flowerbed[0]==0 && flowerbed[1]==0){
            nbrest --;
            flowerbed[0]=1;


        }
        for (int i=1 ; i<flowerbed.length-1;i++){

            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                nbrest --;


        }
        }
        if (flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            nbrest --;
            flowerbed[flowerbed.length-1]=1;
        }
        return nbrest<=0;
}}}