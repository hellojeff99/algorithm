class Solution
{
    public int solution(int n, int a, int b)
    {
        int count = 0;
        while (a != b) {
            count++;
            a = (a + 1)/2;
            b = (b + 1)/2;
        }
        return count;
    }
}