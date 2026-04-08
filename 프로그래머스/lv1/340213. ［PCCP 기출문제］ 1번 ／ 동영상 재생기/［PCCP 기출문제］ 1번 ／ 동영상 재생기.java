class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = getSec(video_len);
        int current = getSec(pos);
        int start = getSec(op_start);
        int end = getSec(op_end);
        
        if (current >= start && current <= end) current = end;
        
        for (String cmd: commands) {
            if (cmd.equals("next")) {
                current += 10;
                if (current >= start && current <= end) current = end;
                if (current > video) current = video;
            }
            else {
                current -= 10;
                if (current >= start && current <= end) current = end;
                if (current < 0) current = 0;
            }
        }
        int m = current / 60;
        int s = current % 60;
        return String.format("%02d:%02d", m, s);
    }
    private static int getSec(String str) {
        String[] arr = str.split(":");
        int m = Integer.parseInt(arr[0]);
        int s = Integer.parseInt(arr[1]);
        return m * 60 + s;
    }
}