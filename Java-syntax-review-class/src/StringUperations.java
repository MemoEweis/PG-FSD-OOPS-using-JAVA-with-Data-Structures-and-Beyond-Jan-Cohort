
public class StringUperations {

	public static void main(String[] args) {
StringBuilder sb = new StringBuilder("hello");
System.out.println("String sb:" +sb);
sb.append("world");
System.out.println("string sb" +sb);
sb.append("!").append(" are").append(" You ?");
System.out.println("string sb" +sb);
sb.insert(11, " how");
System.out.println("string sb" +sb);
System.out.println("length" +sb.length());
	}

}
