package groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String cur : strs){
            String sorted = getSortedString(cur);
            map.putIfAbsent(sorted, new ArrayList<String>());
            map.get(sorted).add(cur);
        }
        return new ArrayList<List<String>>(map.values());
    }
    private String getSortedString(String source){
        char[] sourceArray = source.toCharArray();
        Arrays.sort(sourceArray);
        return new String(sourceArray);
    }
}
