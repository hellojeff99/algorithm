class Solution {
    public int solution(String s) {
        String[] arr = new String[]{"zero", "one", "two", "three", "four", "five",
                                   "six", "seven", "eight", "nine"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
                continue;
            }
            else {
            	for (int j = 0; j < arr.length; j++) {
                	if (s.substring(i).startsWith(arr[j])) {
                    	sb.append(j);
                        i += arr[j].length() - 1;
                    	break;
                	}
           		}   
            }
        }
        return Integer.parseInt(sb.toString());
    }
}