class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<rowIndex+1; i++){
            ans.add(new ArrayList<>());
            for(int j=0; j<=i; j++){
                if(j == 0 || i == j){
                    ans.get(i).add(j, 1);
                }
                else{
                    int t1 = ans.get(i-1).get(j-1);
                    int t2 = ans.get(i-1).get(j);
                    ans.get(i).add(j, t1+t2);
                }
            }
        }
        return ans.get(rowIndex);
    }
}
