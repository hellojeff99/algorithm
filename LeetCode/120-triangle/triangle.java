class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int left = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                int current = triangle.get(i).get(j);
                if (j >= 1) left = triangle.get(i - 1).get(j - 1);
                if (j < i) right = triangle.get(i - 1).get(j);
                
                if (left >= right) triangle.get(i).set(j, current + right);
                else triangle.get(i).set(j, current + left);
            }
        }

        int min = Integer.MAX_VALUE;
        for (int a : triangle.get(triangle.size() - 1)) {
            min = (min > a) ? a : min;
        }

        return min;
    }
}