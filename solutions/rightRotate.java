/**
 * Created by becky on 9/5/17.
 */
public class rightRotate {
    public static int rightRotate(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() == 0 ||
                s2.length() == 0 || s1.length() != s2.length())
        {
            return -1;
        }

        String s = s1 + s1;
        return s.indexOf(s2) != -1 ? 1 : -1;
    }

    public static void main(String[] args) {
        System.out.println(rightRotate("waterbottle", "erbottlewat"));
        System.out.println(rightRotate("waterbottle", "etbotrlewat"));
    }
}
