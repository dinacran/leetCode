import java.util.Stack;

public class BaseBallPoints {

    public static void main(String[] args) {
        System.out.println(calPoints(new String[] { "5", "2", "C", "D", "+" }));
        System.out.println(calPoints(new String[] { "5", "-2", "4", "C", "D", "9", "+", "+" }));
    }

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int score : stack)
            sum += score;
        return sum;
    }
}
