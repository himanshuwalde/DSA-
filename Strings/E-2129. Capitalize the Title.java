class Solution {
    public String capitalizeTitle(String title) {
        char[] arr = title.toCharArray();
        int i = 0;
        int j = 0;
        while(i < title.length()){
            while(j < title.length() && arr[j] != ' '){
                j++;
            }
            if((j-i) >= 3){
                arr[i] = Character.toUpperCase(arr[i]);
            }
            else{
                arr[i] = Character.toLowerCase(arr[i]);
            }
            i++;
            while(i < title.length() && arr[i] != ' '){
                arr[i] = Character.toLowerCase(arr[i]);
                i++;
            }
            i++;
            j++;
        }
        return new String(arr);
    }
}
