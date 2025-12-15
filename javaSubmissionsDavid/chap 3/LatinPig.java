package chap3java2;

import java.util.Scanner;

public class LatinPig {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine().toLowerCase();
        input.close();

        System.out.println("Pig Latin: " + toPigLatin(word));
    }
	
	public static String toPigLatin(String word) {
		 String vowels = "aeiou";
		 
		 // if vowel
		 if(vowels.indexOf(word.charAt(0)) != -1) 
			 return word + "ay";
		 
		 // find the first vowel and rearrange
		 for (int i = 0; i < word.length(); i++) {
			 if (vowels.indexOf(word.charAt(i)) != -1)
				 return word.substring(i) + word.substring(0, i) + "ay";
		 }
		 
		 //no vowels
		 return word + "ay";
	 }   
}
