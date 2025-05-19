import java.util.EmptyStackException;
import java.util.Stack;

public class Task7 {
	
		public static void main(String[] args) throws EmptyStackException
		{
			Stack <String> s = new Stack<>();
			try {
			s.push("a");
			s.push("b");
			 System.out.println(s.pop());
			 System.out.println(s.pop());
			 System.out.println(s.isEmpty());
			 System.out.println(s.peek());
			}
			catch (Exception e) {
				System.out.println("please push something your stack is empty");
			}
			
		}
	}


