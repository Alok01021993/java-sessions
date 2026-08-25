package sdetprograms;

public class ReverseSentence {

	public static void main(String[] args) {
		String str="i am working in google";
		String rev="";
		String words[]=str.split("");
		for(int i=words.length-1;i>=0;i--)
		{
			rev=rev+words[i]+"";
		}
		System.out.println("Reverse sentence:"+rev.trim());

	}

}
