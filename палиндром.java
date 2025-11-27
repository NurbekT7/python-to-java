import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan_text = new Scanner(System.in);
        String text = scan_text.nextLine();
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right  = text.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome);
    }
}
