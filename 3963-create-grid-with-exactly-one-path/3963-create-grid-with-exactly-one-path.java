class Solution {
    public String[] createGrid(int m, int n) {
        String[] arr=new String[m];
        arr[0]=".".repeat(n);
        for(int i=1;i<m;i++){
            arr[i]="#".repeat(n-1)+".";
        }
        return arr;
    }
}