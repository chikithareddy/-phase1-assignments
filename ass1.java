package Assignment;

public class ass1 {
public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("started java");
		sb.append(" phase1");
		System.out.println(sb);
		sb.delete(2,5);
		System.out.println(sb);
		sb.replace(5,9,"python");
		System.out.println(sb);
        sb.insert(11," language ");
		System.out.println(sb);
        sb.reverse();
		System.out.println(sb);
       System.out.println(sb.charAt(9));
	}
}
