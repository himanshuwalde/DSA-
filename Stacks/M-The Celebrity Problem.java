class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            st.push(i);
        }
        while(st.size() > 1){
            int a = st.pop();
            int b = st.pop();
            boolean aFlag = true;
            boolean bFlag = true;
            if(mat[a][b] == 0){     // b can't be a celeb
                bFlag = false;
            }
            else{       // a can't be a celeb
               aFlag = false; 
            }
            if(mat[b][a] == 0){     // a can't be a celeb
                aFlag = false; 
            }
            else{       // b can't be a celeb
                bFlag = false;
            }
            if(aFlag){
                st.push(a);
            }
            if(bFlag){
                st.push(b);
            }
        }
        if(st.size() == 0){
            return -1;
        }
        int celeb = st.pop();
        for(int i=0; i<n; i++){
            if(i == celeb){
                continue;
            }
            if(mat[celeb][i] == 1){
                return -1;
            }
        }
        for(int i=0; i<n; i++){
            if(i == celeb){
                continue;
            }
            if(mat[i][celeb] == 0){
                return -1;
            }
        }
        return celeb;
    }
}
