class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int max = health;
        health -= attacks[0][1];
        if (health <= 0) return -1;
        int prevTime = attacks[0][0];
        for (int i = 1; i < attacks.length; i++) {
            int currentTime = attacks[i][0];
            int healTime = currentTime - prevTime - 1;
            if (healTime > 0) {
                health += healTime * bandage[1] + (healTime / bandage[0]) * bandage[2];
                if (health > max) health = max;                
            }
            
            health -= attacks[i][1];
            prevTime = currentTime;
            if (health <= 0) return -1;
        }
        return health;
    }
}