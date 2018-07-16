package longestpalinsubstr;

class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i = 0;i < s.length();i++){
            for(int j = 0;j < s.length() - i;j++){
                if(i == 0||(s.charAt(j) == s.charAt(j + i))&&(i == 1 || dp[j + 1][j + i - 1])){
                    dp[j][j + i] = true;
                    start = j;
                    end = j + i;
                }
            }
        }
        return s.substring(start,end + 1);
    }
}
