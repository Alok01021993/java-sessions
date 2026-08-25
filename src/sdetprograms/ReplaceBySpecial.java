package sdetprograms;

public class ReplaceBySpecial {

	public static void main(String[] args) {
		
		  String str="aloaak";
	       String rev="";
	       for(int i=str.length()-1;i>=0;i--)
	       {
	           char ch=str.charAt(i);
	           if(ch!='a')
	           
	           rev+=ch;
	           
	       else
	       {
	           rev+='@';
	       }
	    }
	    
	      //String replacedstr = rev.replace('a','@');
	      System.out.println(rev);
	    }
	}
