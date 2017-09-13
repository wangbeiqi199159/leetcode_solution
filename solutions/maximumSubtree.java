/**
 * Created by becky on 9/11/17.
 */
import java.util.ArrayList;
class Node {
    int val;
    ArrayList<Node> children;
    public Node(int val){
        this.val = val;
        children = new ArrayList<Node>();
    }
}
public class maximumSubtree {
    static class SumCount
    {
        int sum;
        int count;
        public SumCount(int sum, int count)
        {
            this.sum = sum;
            this.count = count;
        }
    }
//    static Node ans;
//    static double max = 0;
    public static Node find(Node root)
    {
        // Initialize static variables is very important for AMZAON OA!
        Node ans = new Node(0);
        double max = 0;
        DFS(root, ans, max);
        return ans;
    }
    private static SumCount DFS(Node root, Node ans, double max)
    {
        if(root == null) return new SumCount(0, 0);
        if(root.children == null || root.children.size() == 0) return new SumCount(root.val, 1);
        int sum = root.val;
        int count = 1;
        for(Node itr: root.children)
        {
            SumCount sc = DFS(itr, ans, max);
            sum += sc.sum;
            count += sc.count;
        }
        if(count > 1 && (sum + 0.0) / count > max)
        {
            max = (sum + 0.0) / count;
            ans = root;
        }
        return new SumCount(sum, count);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node l21 = new Node(2);
        Node l22 = new Node(3);
        Node l23 = new Node(4);
        Node l31 = new Node(5);
        Node l32 = new Node(5);
        Node l33 = new Node(5);
        Node l34 = new Node(5);
        Node l35 = new Node(5);
        Node l36 = new Node(5);

        l21.children.add(l31);
        l21.children.add(l32);

        l22.children.add(l33);
        l22.children.add(l34);

        l23.children.add(l35);
        l23.children.add(l36);

        root.children.add(l21);
        root.children.add(l22);
        root.children.add(l23);

        Node res = find(root);
        System.out.println(res.val + " " );
    }
}