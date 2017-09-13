/**
 * Created by becky on 8/31/17.
 */
public class print {
    public static void print2(int row) {
        
        char ch = 'a';
        char print;
        for (int i = 1; i <= row; i++) {
            print = ch;
            for (int j = 1; j <= i; j++) {
                System.out.print((print++));
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        print2(4);
    }
}
