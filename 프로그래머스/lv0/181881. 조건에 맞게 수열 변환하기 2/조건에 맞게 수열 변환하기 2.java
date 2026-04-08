class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        // 50 미만 짝수, 50 이상 홀수
        // 50 이상 짝수, 50 미만 홀수 => 계산
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            while ((num >= 50 && num % 2 == 0) || (num < 50 && num % 2 == 1)) {
                if (num >= 50 && num % 2 == 0) num /= 2;
                else if (num < 50 && num % 2 == 1) num = num * 2 + 1;
                count++;
            }
            answer = answer < count ? count : answer;
        }
        return answer;
    }
}