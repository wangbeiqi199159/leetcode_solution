/**
 * Created by becky on 9/5/17.
 */
public class removeVowel {
    public static String removeVowel(String s) {
        if(s == null || s.length() == 0) {
            return s;
        }
        String vowel = "aeiouAEIOU";
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(vowel.indexOf(s.charAt(i)) != -1) {
                continue;
            }
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeVowel("apple"));
    }
}
