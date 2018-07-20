package mergeintervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if (intervals.size() == 1 || intervals.size() == 0){
            return new ArrayList<Interval>(intervals);
        }
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval i1, Interval i2) {
                if (i1.start > i2.start) {
                    return 1;
                } else if (i1.start < i2.start) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        result.add(new Interval(intervals.get(0).start,intervals.get(0).end));

        for(int i = 1; i < intervals.size() ; i++){
            if(result.get(result.size() - 1).end < intervals.get(i).start){
                result.add(new Interval(intervals.get(i).start,intervals.get(i).end));
            }else{
                result.get(result.size() - 1).end = Math.max(intervals.get(i).end,result.get(result.size() - 1).end);
                result.get(result.size() - 1).start = Math.min(intervals.get(i).start,result.get(result.size() - 1).start);
            }
        }
        return new ArrayList<Interval>(result);
    }
}
