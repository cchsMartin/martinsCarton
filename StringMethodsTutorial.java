public class StringMethodsTutorial {
/*
 * ---String Methods---
 * .toUpperCase() --> converts a string to all uppercase letters
 * .toLowerCase() --> converts a string to all lowercase letters
 * .length() --> returns an integer value of the length of the string
 * .indexOf() --> returns the index of the FIRST occurrence of a string
 * .substring(start, end) --> returns a substring beginning at start up to BUT NOT INCLUDING end
 * 
 * Strings are zero indexed:
 * C O M P U T E R (ignore the spaces)
 * 0 1 2 3 4 5 6 7
 */
	
	public static void main(String[] args) {
		String course = "computer";
//		System.out.println(course.indexOf("")); //a value of -1 means the string is not in the whole string
		String paragraph = "Four score and seven years ago...";
		System.out.println(paragraph.indexOf("score"));
	
	}

}
