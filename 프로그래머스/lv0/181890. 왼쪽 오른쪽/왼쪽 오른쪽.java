class Solution {
    public String[] solution(String[] str_list) {
        int idx = -1;
        String str = "";
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                str = "l";
                idx = i;
                break;
            } else if (str_list[i].equals("r")) {
                str = "r";
                idx = i;
                break;
            }
        }
        String[] result = {};
        if (str.equals("l")) {
            result = new String[idx];
            for (int i = 0; i < result.length; i++) {
                result[i] = str_list[i];
            }
        }
        else if (str.equals("r")) {
            result = new String[str_list.length - idx - 1];
            for (int i = 0; i < result.length; i++) {
                result[i] = str_list[idx + 1 + i];
            }
        }
        return result;
    }
}