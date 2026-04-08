class Solution {
    public String solution(String new_id) {
        String id = new_id.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c: id.toCharArray()) {
            if (Character.isAlphabetic(c)) sb.append(c);
            else if (Character.isDigit(c)) sb.append(c);
            else if (c == '-') sb.append(c);
            else if (c == '_') sb.append(c);
            else if (c == '.' && sb.length() > 0 && sb.charAt(sb.length() - 1) != '.') sb.append(c);
        }
        id = sb.toString();
        if (id.length() > 0 && id.startsWith(".")) id = id.substring(1);
        if (id.length() > 0 && id.endsWith(".")) id = id.substring(0, id.length() - 1);
        if (id.equals("")) id = "a";
        if (id.length() >= 16) id = id.substring(0, 15);
        if (id.length() > 0 && id.startsWith(".")) id = id.substring(1);
        if (id.length() > 0 && id.endsWith(".")) id = id.substring(0, id.length() - 1);
        if (id.length() < 3) {
            char last = id.charAt(id.length() - 1);
            while (id.length() < 3) id += String.valueOf(last);
        }
        return id;
    }
}