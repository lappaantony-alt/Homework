package lesson_23;

class Main1 {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase().replaceAll( "\\W", "");  //.replaceAll("[^a-z0-9]", "")

        for (int i = 0; i < t.length() / 2; i++) {
            if (t.charAt(i) !=t.charAt(t.length() - 1 - i))
                return false;
        }
        return true;
    }
}


//class Solution {
//    public boolean isPalindrome(String s) {
//        int l = 0, r = s.length() - 1;
//        while (l < r) {
//            char cl = s.charAt(l), cr = s.charAt(r);
//            if (!Character.isLetterOrDigit(cl)) { l++; continue; }
//            if (!Character.isLetterOrDigit(cr)) { r--; continue; }
//            if (Character.toLowerCase(cl) != Character.toLowerCase(cr)) return false;
//            l++; r--;
//        }
//        return true;
//    }
//}


//class Solution {
//    private boolean isAlnum(char c) {
//        return (c >= '0' && c <= '9') ||
//                (c >= 'A' && c <= 'Z') ||
//                (c >= 'a' && c <= 'z');
//    }
//    private char toLowerAscii(char c) {
//        return (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
//    }
//    public boolean isPalindrome(String s) {
//        int l = 0, r = s.length() - 1;
//        while (l < r) {
//            char cl = s.charAt(l), cr = s.charAt(r);
//            if (!isAlnum(cl)) { l++; continue; }
//            if (!isAlnum(cr)) { r--; continue; }
//            if (toLowerAscii(cl) != toLowerAscii(cr)) return false;
//            l++; r--;
//        }
//        return true;
//    }
//}