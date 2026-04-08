class Solution {
    public int solution(int[] numbers) {
        boolean[] arr = new boolean[10];
        for (int n: numbers) arr[n] = true;
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == false) answer += i;
        }
        return answer;
    }
}