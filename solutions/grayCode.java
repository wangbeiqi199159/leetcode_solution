/**
 * Created by becky on 9/5/17.
 */
public class grayCode {
    public static int grayCode(int term1, int term2) {
        byte x = (byte)(term1 ^ term2);
        int total = 0;
        while(x != 0) {
            x = (byte) (x & (x - 1));
            total++;
        }
        return total == 1 ? 1 : 0;
    }
}
