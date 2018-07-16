package letterphonenumber;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private void backTracking(List<String> result, String[] map, String digits, int start, String current){
        if(start == digits.length()){
            result.add(current);
            return;
        }
        for(int i = 0; i < map[Character.getNumericValue(digits.charAt(start))].length(); i++){
            backTracking(result, map, digits, start + 1, current + map[Character.getNumericValue(digits.charAt(start))].charAt(i));
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length() == 0){
            return result;
        }
        backTracking(result, map, digits, 0, "");
        return result;
    }
}
