class Solution {
    public String solution(String code) {
        char mode = '0';
        String ret = "";
        char[] codeArr = code.toCharArray();
        
        for (int i = 0; i < codeArr.length; i++) {
            if (codeArr[i] == '1') {
                if (mode == '1') mode = '0';
                else if (mode == '0') mode = '1';
                continue;
            }
            
            if (mode == '0' && i % 2 == 0) ret += String.valueOf(codeArr[i]);
            else if (mode == '1' && i % 2 == 1) ret += String.valueOf(codeArr[i]);
        }
        if (ret.equals("")) ret = "EMPTY";
        return ret;
        
    }
}