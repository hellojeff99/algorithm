class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int result = 0;
        for (int i = 0; i < timelogs.length; i++) {
            int startTime = (schedules[i]/100)*60 + schedules[i]%100;
            boolean isGood = true;
            int day = startday;
            for (int time: timelogs[i]) {
                int realStartTime = (time/100)*60 + time%100;
                if (startTime + 10 < realStartTime && day != 6 && day != 7) {
                    isGood = false;
                    break;
                }
                day = day%7 + 1;
            }
            if (isGood) result++;
        }
        return result;
    }
}