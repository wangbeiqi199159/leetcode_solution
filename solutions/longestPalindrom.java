/**
 * Created by becky on 9/5/17.
 */
public class longestPalindrom {

    public static String longestPalindrome(String s) {
        if(s == null || s.length() < 2) return s;
        char[] chars = s.toCharArray();
        int len = s.length();
        while (len >= 0) {
            for (int i = 0; i + len - 1 < chars.length; i++) {
                int left = i;
                int right = i + len - 1;
                boolean good = true;
                while (left < right) {
                    if (chars[left] != chars[right]) {
                        good = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (good)
                    return s.substring(i, i + len);
            }
            --len;
        }
        return "";
    }

    public static int max, start, end;
    public static String longestPalindrome1(String s) {
        max = 0;
        start = 0;
        end = 0;
        if(s == null || s.length() < 2) return s;
        for(int i = 0; i < s.length(); i++)
        {
            findPalindrome(s, i, i);
            if(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) findPalindrome(s, i, i + 1);
        }
        return s.substring(start, end + 1);
    }
    private static void findPalindrome(String s, int l, int r)
    {
        while(l - 1 >= 0 && r + 1 < s.length() && s.charAt(l - 1) == s.charAt(r + 1))
        {
            l--;
            r++;
        }
        if(r - l + 1 > max)
        {
            max = r - l + 1;
            start = l;
            end = r;
        }
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome1("babad"));
    }


}
