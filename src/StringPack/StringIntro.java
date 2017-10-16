package StringPack;

import javax.swing.JOptionPane;

public class StringIntro {

	public static void main(String[] args) {
		Boolean runAgain = true; // George Boole can only be TRUE or FALSE
		String msg = "";
		String varWord = "Boise";
		String goAgain = "No";
		String Bye = "Thanks for playing!";

		// test block, for testing continue or ext
		// as in "Do you want to go again, Y/N?
		// AP question: What is the difference between a while and do-while loop?
		// do-while MUST at least run at least once
		// while can run zero or many times

		while (runAgain == true) {
			msg = "Please enter a string for us to test";
			varWord = JOptionPane.showInputDialog(msg);

			LearnStrings getIt = new LearnStrings(varWord);
			msg = "First char is: " + getIt.getFirstLetter();
			JOptionPane.showMessageDialog(null, msg);

			// test -- try a little code, test immediately, repeat
			int lengthTest = getIt.getLength();

			msg = "Length = " + lengthTest;
			JOptionPane.showMessageDialog(null, msg);

			char lastLetter = getIt.getLastLetter();
			// msg=("Last Letter is" + lastLetter );
			msg = "Last letter is " + lastLetter;
			JOptionPane.showMessageDialog(null, msg);

			msg = "Middle is " + getIt.getMiddle();
			JOptionPane.showMessageDialog(null, msg);
			msg = "Do you want to go again, Y/N";
			goAgain = JOptionPane.showInputDialog(msg);
			// test goAgain
			// Y, N, y, n, Yes, No, YES, NO
			if (goAgain.equalsIgnoreCase("y")) {
				msg = "Selection is Y or y";
				JOptionPane.showMessageDialog(null, msg);
				runAgain = true;
			} else if (goAgain.equalsIgnoreCase("n")) {
				msg = "Selection is N or n";
				JOptionPane.showMessageDialog(null, msg);
				JOptionPane.showMessageDialog(null, Bye);
				runAgain = false;
			} else if (goAgain.equalsIgnoreCase("yes")) {
				msg = "Selection is Yes or yes or YES";
				JOptionPane.showMessageDialog(null, msg);
				runAgain = true;
			} else if (goAgain.equalsIgnoreCase("no")) {
				msg = "Selection is No or no or NO";
				JOptionPane.showMessageDialog(null, msg);
				JOptionPane.showMessageDialog(null, Bye);
				runAgain = false;
			} else {
				msg = ("Sorry, I don't understand your input, please try again.");
			}
		} // end of while

		/*
		 * thinking, taking notes start: index = 1 that will be the second char
		 * (remember index starts at 0) end: .length()-2 WAIT!! REMEMBER
		 * "INCLUSIVE, EXCLUSIVE"?? .length()-1
		 * 
		 * use: substring(int beginIndex, int endIndex) .substring(1, word.length()-2)
		 * 
		 * int indexOf(String str) Returns the index within this string of the first
		 * occurrence of the specified substring.
		 * 
		 * String toLowerCase() Converts all of the characters in this String to lower
		 * case using the rules of the default locale. String toUpperCase() Converts all
		 * of the characters in this String to upper case using the rules of the default
		 * locale.
		 * 
		 * boolean equals(Object anObject) Compares this string to the specified object.
		 * boolean equalsIgnoreCase(String anotherString) Compares this String to
		 * another String, ignoring case considerations.
		 */

	}

}
