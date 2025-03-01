public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println("Is the string \"" + str + "\" a palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
