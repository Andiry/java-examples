/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
import java.util.*;

public class interval {

	public static void main(String [] args)
	{
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		Interval newone = new Interval(0, 10);
		
		intervals.add(new Interval(1,4));
		intervals.add(new Interval(5,6));
		intervals.add(new Interval(7,9));
		insert(intervals, newone);
	}

  public static class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int len = intervals.size();
        int[] start_array = new int[len];
        int i, index;
        int start, end;
        boolean start_found = false, end_found = false;
        
        if (len == 0) {
            intervals.add(newInterval);
            return intervals;
        }
        
        for (i = 0; i < len; i++)
            start_array[i] = intervals.get(i).start;
            
        index = Arrays.binarySearch(start_array, newInterval.start);
        if (index >= 0) {
            //found
            start = index;
            start_found = true;
        } else {
            start = -index - 1;
        }
        
        index = Arrays.binarySearch(start_array, newInterval.end);
        if (index >= 0) {
            //found
            end = index;
            end_found = true;
        } else {
            end = -index - 1;
        }
        
        Interval new_interval = new Interval();
        if (start_found) {
            // start at an existing entry
            new_interval.start = newInterval.start;
        } else {
        if (start == 0) {
            // Insert at first.
            new_interval.start = newInterval.start;
        } else {
            //Check prev entry.
            int prev_start = intervals.get(start - 1).start;
            int prev_end = intervals.get(start - 1).end;
            
            if (prev_end >= newInterval.start) {
                // Merge with prev.
                new_interval.start = prev_start;
            } else {
                new_interval.start = newInterval.start;
            }
        }}
        
        if (end_found) {
            // contiguous with an existing entry
            new_interval.end = intervals.get(end).end;
        } else {
            if (end == 0) {
                new_interval.end = newInterval.end;
            } else {
    
            int prev_start = intervals.get(end - 1).start;
            int prev_end = intervals.get(end - 1).end;
            
            if (prev_end > newInterval.end)
                new_interval.end = prev_end;
            else
                new_interval.end = newInterval.end;

        }}
       
	System.out.println("start: " + start + " end: " + end);
	System.out.println("Interval: " + new_interval.start + " " + new_interval.end);
 
        for (i = 0; i < intervals.size(); i++) {
		System.out.println(intervals.size());
            if (i < start)
                continue;
            if (i == start) {
     //           intervals.remove(i);
                intervals.set(i, new_interval);
                continue;
            }
            if (i >= end)
                continue;
            intervals.remove(i);
		end--;
		i--;
        }
        
        return intervals;
    }
}
