package sdetprograms;

import java.util.Scanner;

public class Anagram{
		    
		    public static boolean isAnagram(String str1, String str2) {
		        str1 = str1.replaceAll("\\s", "").toLowerCase();
		        str2 = str2.replaceAll("\\s", "").toLowerCase();
		        
		        if (str1.length() != str2.length()) {
		            return false;
		        }
		        
		        int[] charCount = new int[256];
		        
		        for (int i = 0; i < str1.length(); i++) {
		            charCount[str1.charAt(i)]++;
		        }
		        
		        for (int i = 0; i < str2.length(); i++) {
		            charCount[str2.charAt(i)]--;
		        }
		        
		        for (int i = 0; i < 256; i++) {
		            if (charCount[i] != 0) {
		                return false;
		            }
		        }
		        
		        return true;
		    }
		    
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter first string:  ");
		        String str1 = scanner.nextLine();
		        
		        System.out.print("Enter second string: ");
		        String str2 = scanner.nextLine();
		        
		        if (isAnagram(str1, str2)) {
		            System.out.println("\n\"" + str1 + "\" and \"" + str2 + "\" ARE anagrams.");
		        } else {
		            System.out.println("\n\"" + str1 + "\" and \"" + str2 + "\" are NOT anagrams.");
		        }
		        
		        scanner.close();
		    }
		}


