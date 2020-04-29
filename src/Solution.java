import java.util.*;
import java.lang.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

class Solution {

    public static int[] computeTimes(int n, LogEntry[] entries) {
        // implement your solution here
        Map<Integer, Map<String,Integer>> countMap= new HashMap<>();
        Map<String,Integer> limit= new HashMap<>();
        int[] result= new int[n];
        for(int i=0; i<n; i++){
            LogEntry temp= entries[i];
            if(countMap.containsKey(temp.getMethodId())){
                if(countMap.get(temp.getMethodId()).containsKey("ENTER")){
                    result[i]= (int)temp.getTimeStamp()- countMap.get(temp.getMethodId()).get("ENTER");
                }else if(countMap.get(temp.getMethodId()).containsKey("EXIT")){
                    result[i]=(int) countMap.get(temp.getMethodId()).get("EXIT") - temp.getTimeStamp();
                }
            }else{
                limit.put(temp.getAction(), temp.getTimeStamp());
                countMap.put(temp.getMethodId(),limit);
            }

        }
        return result;
    }


    // object for log entry, parsed from the log string format
    // access as obj.methodId, obj.action, obj.timestamp
    static class LogEntry {
        int methodId;
        String action;    // EXIT/ENTER
        int timestamp;

        LogEntry(int methodId, String action, int timestamp) {
            this.methodId = methodId;
            this.action = action;
            this.timestamp = timestamp;
        }

        public int getMethodId() {
            return this.methodId;
        }

        public int getTimeStamp() {
            return this.timestamp;
        }

        public String getAction() {
            return this.action;
        }
    }

    // boilerplate code to parse log entries
    public static int[] solution(long n, String[] logs) {
        LogEntry[] entries = new LogEntry[logs.length];
        for (int i = 0; i < logs.length; i++) {
            String[] tokens = logs[i].split(",");
            int methodId = Integer.valueOf(tokens[0].trim());
            int timestamp = Integer.valueOf(tokens[2].trim());

            entries[i] = new LogEntry(methodId, tokens[1].trim(), timestamp);
        }
        return computeTimes((int) n, entries);
    }
}

