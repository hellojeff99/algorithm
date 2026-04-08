import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] input = a.toCharArray();
        for (char x : input) {
            if (Character.isUpperCase(x)) System.out.print(Character.toLowerCase(x));
            else System.out.print(Character.toUpperCase(x));
        }
    }
}