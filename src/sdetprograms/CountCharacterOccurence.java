package sdetprograms;

public class CountCharacterOccurence {
	public static void main(String args[]) {

		String s = "Java is a platform independent language";

		int totalcount = s.length();

		int totalcount_afterRemove = s.replace("p", "").length();

		int count = totalcount - totalcount_afterRemove;

		System.out.println("Number occurences of p is:" + count);

	}
}