class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int[] arr = new int[number.length];

        for (int i = 0; i < discount.length; i++) {
            // add current day
            int addIdx = findIdx(discount[i], want);
            if (addIdx != -1) {
                arr[addIdx]++;
            }

            // remove day that falls out of the 10-day window
            if (i >= 10) {
                int removeIdx = findIdx(discount[i - 10], want);
                if (removeIdx != -1) {
                    arr[removeIdx]--;
                }
            }

            // only start checking when we have a full 10-day window: [i-9 .. i]
            if (i >= 9) {
                boolean ok = true;
                for (int j = 0; j < number.length; j++) {
                    if (arr[j] < number[j]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) answer++;
            }
        }

        return answer;
    }

    private static int findIdx(String item, String[] items) {
        for (int i = 0; i < items.length; i++) {
            if (item.equals(items[i])) return i;
        }
        return -1;
    }
}