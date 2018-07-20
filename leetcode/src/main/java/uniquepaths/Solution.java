package uniquepaths;

class Solution {
    public int uniquePaths(int m, int n) {
        long accu = 1;
        int tmp = 1;
        if(m < n){
            tmp = m;
            m = n;
            n = tmp;
        }
        //(m + n - 2)!/(m - 1)!/(n - 1)!
        for(int i = m ; i <= m + n - 2; i++){
            accu *= i;
        }
        for(int j = n - 1; j >= 1; j--){
            accu /= j;
        }
        return (int)accu;
    }
}
