public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("а роза упала на лапу азора"));
    }

    public static boolean isPalindrom(String str) {
        str = str.replace(" ", "").replace(".", "").trim().toLowerCase();

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            int length = charArray.length;
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                System.out.println("Это не палиндром");
                return false;
            }
        }
        System.out.println("Это палиндром");
        return true;
    }
}
