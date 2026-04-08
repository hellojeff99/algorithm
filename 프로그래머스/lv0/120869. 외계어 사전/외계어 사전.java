class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String d: dic) {
            boolean checked = true;
            for (int i = 0; i < spell.length; i++) {
                if (!d.contains(spell[i])) checked = false;
            }
            if (checked) return 1;
        }
        return 2;
    }
}