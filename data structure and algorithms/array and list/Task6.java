import java.util.Stack;

public class Task6 {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("ramu");
		s.push(87);
		s.push(9.0);
		System.out.println("element in the stack"+s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		}

}
