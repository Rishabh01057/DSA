class Solution {
    public int largestAltitude(int[] gain) {
       int newAltitude=0;
       int maxAltitude=0;
        for(int i=0;i<gain.length;i++){
            newAltitude=newAltitude+gain[i];
            if(maxAltitude<newAltitude){
                maxAltitude=newAltitude;
            }
        }
        return maxAltitude;
    }
}