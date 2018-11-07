/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than ed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		ps.surroundMe();
		ps.endsMeet();
		ps.middleMan();
		ps.doubleVision();
		ps.centered();
		ps.upOrDown();
		ps.countMe();
		ps.isNotEqual();
		ps.triplets();
		ps.addMe();
		}

	private void surroundMe() {
		surroundMe("<<>>", "abc");
		surroundMe("[[]]", "xyz");
		surroundMe("abc", "abc");
		surroundMe("(())", "querty");
		surroundMe(null, "abc");
		surroundMe9("<<>>", null);
	}
	public String surroundMe(String in, String out) {
		int outer_length = out.length();
		int inner_length = in.length();
		if (outer+length == 4 && inner_length == 3) {
			String result = out.substring(0, 2) + in + out.substring(2)
			return result;
		} else return null;
		
		
	}
	private void endsMeet() {
	endsMeet("querty", 2);
	endsMeet("basketball", 3);
	endsMeet("querty", -1);
	endsMeet("basketball", 0);
	endsMeet("querty", 9);
	endsMeet("programming", 2);
	endsMeet(null, 1);
}
	public String endsMeet(String str, int n) {
	int string_length = str.length();
	if (n < 0) {
	String result = str.substring(0, n) + str.substring(string_length - n);
	if ((string_length <= 10 && string_length >=1) && (n >= 1 && n <= string_length)) {
		return result;
	} else return null;
}
	private void middleMan() {
	middleMan("candy");
	middleMan("programming");
	middleMan("even");
	middleMan(null);
	}
	
	public middleMan(String str) {
		String result = " ";
		int string_length = str.length();
		if (string_length % 2 == 1) {
			int offset = ((string_length % 3) + (((string_length/3) - 1) * 3)) / 4;
			result = str.substring((offset + 1), (string_length - offset - 1));
			while (result.length() != 3) {
				result = result.substring(1, (result.length())-1);
			}
			return result;
		}
		else if (string_length % 2 == 0) {
			return null;
		}

		private void doubleVision() {
			doubleVision("qwerty");
			doubleVision("a");
			doubleVision(null);
		}
		
		public String doubleVision(String str) {
			String result = " ";
			String x = " ";
			if  (str.length() >= 1 && str != "null") {
				for (int i = 0; i <= str.length(); i++) {
					 x = str.charAt(i) + "";
					 str.replaceFirst(x, x + x);
				} return result;
			} else {
				return null;
			}
		}
		
		private void centered() {
			centered("candy", "and");
			centered("programming", "ram0");
			centered("qwerty", "que");
			centered("qwerty", "er");
			centered("qwerty", null);
			centered(null, null);
		}
		public String centered(String str, String target) {
			
		}
		
		private void upOrDown() {
			upOrDown(12.7, 'r');
			upOrDown(12.2, 'r');
			upOrDown(12.7, 'f');
			upOrDown(12.2, 'c');
			upOrDown(12.7, 'x');
		}
		public static int upOrDown(double number, char operation) {
			switch(operation) {
			case 'r':
				return (int) Math.round(number);
			case 'f':
				return (int) Math.floor(number);
			case'c':
				return (int) Math.ceil(number);
			default:
				return -1;
			}
		}
		
		public int countMe(String text, char target) {
			int lengthText = text.length();
			int count = 0;
			if (text == null || !Character.isLetter(target) ) {
				return -1;
			}
			else {
				for (int i = 0; i < lengthText; i++) {
					if (target == text.charAt(i) && text.charAt(i+1) == ' ' || target == text.charAt(i) && i == lengthText) {
						count += 1;
					}
				}
				return count;
			}
			
		}
		public boolean isNotEqual(String input) {
			int inputLength = input.length();
			if (input == null) {
				return false;
			}
			else { 
			
			String isCheck;
			int isCount = 0;
			String notCheck;
			int notCount = 0;
			for (int i = 0; i < inputLength; i++) {
				if (i < (inputLength - 1)) {
					isCheck = input.substring(i, i+2);
					if (isCheck.equals("is") ) {
						isCount += 1;
					}
				}
			}
			for (int i = 0; i < inputLength; i++) {
				if (i < (inputLength - 2)) {
					notCheck = input.substring(i, i+3);
					if (notCheck.equals("not")) {
						notCount += 1;
					}
				}
			}
			if (isCount == notCount) {
				return true;
			}
			else {
				return false;
			}
		}
		}
		public int triplets(String input) {
			int inputLength = input.length();
			boolean whitespaceCheck = false;
			boolean letterCheck = false;
			char first = 'a';
			char second = 'b';
			char third = 'c';
			int tripletCount = 0;
			for (int i = 0; i < inputLength; i++) {
				if (input.charAt(i) == ' ') {
					whitespaceCheck = true;
				}
			}
			for (int g = 0; g < inputLength; g++) {
				if (Character.isDigit(input.charAt(g)) == true) {
					letterCheck = true;
				}
			}
			if (input == null || whitespaceCheck == true || letterCheck == true) {
				return -1;
			}
			for (int h = 0; h < inputLength; h++) {
				if (h+2 < inputLength) {
					first = input.charAt(h);
					second = input.charAt(h+1);
					third = input.charAt(h+2);
					if (first == second && second == third ) {
						tripletCount += 1;
					}
				}
			}
			return tripletCount;
		}
		public int addMe(String input, boolean add) {
			char jeff = ' ';
			int numberStart = 0;
			int numberEnd = 1;
			String number = null;
			int sum = 0;
			int numberReal = 0;
			boolean whitespaceCheck = false;
			int digit = 0;
			int inputLength = input.length();
			for (int i = 0; i < inputLength; i++) {
				if (input.charAt(i) == ' ') {
					whitespaceCheck = true;
				}
			}
			if (input == null || whitespaceCheck == true) {
				return -1;
			}
			if (add == true) {
				for (int g = 0; g < inputLength; g++) {
					if (Character.isDigit(input.charAt(g)) == true) {
						jeff = input.charAt(g);
						digit = jeff - '0';
						sum += digit;
					}
				}
			}
			else {
				for (int h = 0; h <inputLength; h++) {
					if (Character.isDigit(input.charAt(h)) == true) {
						numberStart = h;
						for (int j = h; j<inputLength; j++) {
							if(Character.isLetter(input.charAt(j)) == true && j < inputLength-1) {
								numberEnd = j;
								break;
							}
							else if (j == inputLength-1 && Character.isDigit(input.charAt(inputLength-1)) == true) {
								numberEnd = inputLength;
								break;
							}
						}
						number = input.substring(numberStart, numberEnd);
						numberReal = Integer.parseInt(number);
						sum += numberReal;
						h = numberEnd;
					}
				}
				
			}
			return sum;
			
	}
	}

