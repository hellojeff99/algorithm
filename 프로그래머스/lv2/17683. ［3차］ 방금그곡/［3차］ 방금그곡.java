class Solution {
    public String solution(String m, String[] musicinfos) {
        m = convert(m);
        String result = "(None)";
        int maxPlayTime = 0;
        for (String str: musicinfos) {
            String[] arr = str.split(",");
            String start = arr[0];
            String end = arr[1];
            String title = arr[2];
            String fullMelody = getMelody(start, end, convert(arr[3]));
            boolean isSame = compareMelody(m, fullMelody);
            if (isSame) {
                int currentPlayTime = getMinutes(end) - getMinutes(start);
                if (currentPlayTime > maxPlayTime) {
                    maxPlayTime = currentPlayTime;
                    result = title;
                }
            }
        }
        return result;
    }
    private boolean compareMelody(String m, String melody) {
        return melody.contains(m);
    }
    private int getMinutes(String time) {
        String[] times = time.split(":");
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }
    private String getMelody(String start, String end, String melody) {
        int minutes = getMinutes(end) - getMinutes(start);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minutes; i++) {
            sb.append(melody.charAt(i % melody.length()));
        }
        return sb.toString();
    }
    private String convert(String str) {
        return str.replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("G#", "g").replace("A#", "a").replace("B#", "b").replace("E#", "e");
    }
}