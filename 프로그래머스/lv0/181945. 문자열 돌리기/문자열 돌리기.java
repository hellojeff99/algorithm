import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] input = a.toCharArray();
        for (char x : input) {
            System.out.println(x);
        }
    }
}