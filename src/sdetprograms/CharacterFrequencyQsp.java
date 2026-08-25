package sdetprograms;


public class CharacterFrequencyQsp {

	public static void main(String[] args) {
			String str="aAlok Kumar";
			String  Originalstr= str.toLowerCase();
			String temp="";
			for(int i=0;i<Originalstr.length();i++)
			{
				char ch = Originalstr.charAt(i);
				if(ch == ' ') {
					continue;
			}
			
			if(temp.indexOf(ch) == -1)
			{
				int count=0;
				for(int j=0;j<Originalstr.length();j++)
				{
					
					if(ch == Originalstr.charAt(j))
						count++;
				}
				temp=temp+ch;
				System.out.println(ch + " occurs " + count + " times ");
			}
			

	}

	}
	}
