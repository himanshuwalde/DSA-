class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int fives = 0;
        int tens = 0;
        //int twenties = 0;
        for(int i=0; i<n; i++){
            if(bills[i] == 5) fives++;
            else if(bills[i] == 10){
                tens++;
                if(fives >= 1){
                    fives--;
                }
                else return false;
            }
            else{
                //twenties++;
                if(tens >= 1 && fives >= 1){
                    tens--;
                    fives--;
                }
                else if(fives >= 3){
                    fives -= 3;
                }
                else return false;
            }   
        }
        return true;
    }
}
