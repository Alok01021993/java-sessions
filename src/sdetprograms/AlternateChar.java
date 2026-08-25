package sdetprograms;

public class AlternateChar {

	public static void main(String[] args) {
		String str="Yashashwi Alok";
		for(int i=0;i<str.length()-1;i+=2)//skip one character from string
		{
			System.out.println("Alternate character:"+str.charAt(i));
		}

	}

}
