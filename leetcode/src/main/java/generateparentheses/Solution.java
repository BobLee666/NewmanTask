package generateparentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        backTracking(result,"",0,0,n);
        return result;
    }
    private void backTracking(List<String> result,String str,int left,int right,int max){
        if(left == max && right == max){
            result.add(str);
            return;
        }
        if(left < max){
            backTracking(result,str + "(",left + 1,right,max);
        }
        if(right < left){
            backTracking(result,str + ")",left,right + 1,max);
        }
    }
}
