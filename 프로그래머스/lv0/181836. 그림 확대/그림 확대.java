class Solution {
    public String[] solution(String[] picture, int k) {
        String[] result = new String[picture.length * k];
        for (int i = 0; i < result.length; i++) {
            char[] cArr = picture[i / k].toCharArray();
            char[] cArrK = new char[cArr.length * k];
            for (int j = 0; j < cArrK.length; j++) {
                cArrK[j] = cArr[j / k];
            }
            result[i] = String.valueOf(cArrK);
        }
        return result;
    }
}