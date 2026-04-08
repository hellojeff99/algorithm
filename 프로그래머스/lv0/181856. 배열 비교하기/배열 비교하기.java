class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) return 1;
        else if (arr1.length < arr2.length) return -1;
        else {
            int one = 0;
            int two = 0;
            for (int i = 0; i < arr1.length; i++) {
                one += arr1[i];
                two += arr2[i];
            }
            if (one > two) return 1;
            else if (one < two) return -1;
            else return 0;
        }
    }
}