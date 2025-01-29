package assignments;

public class StringAssignment {
	public static void main(String[] args) {
		String strangeString = args[0];
		System.out.println(isPalindrome(strangeString.toLowerCase()));
		
		Integer strangeInteger = Integer.parseInt(args[1]);
		System.out.println(isArmstrong(strangeInteger));
		
//		String str = "Java is very simple langauge";
//		str = str.replace('o', 'v');
//		str = str.toUpperCase();
//		char[] charArray = str.toCharArray();
//		for(int i=0; i<charArray.length; i++) {
//			System.out.print(charArray[i]);
//		}
//		System.out.println(str.replaceAll(" ", ""));
//		System.out.println(str);
//		String[] stringArray = str.split(" ");
//		String s1 = stringArray[0];
//		String s2 = stringArray[1];
//		String s3 = stringArray[2];
//		String s4 = stringArray[3];
//		String s5 = stringArray[4];
//		System.out.println(s1.toLowerCase());
//		System.out.println(s2.toLowerCase());
//		System.out.println(s3.toLowerCase());
//		System.out.println(s4.toLowerCase());
//		System.out.println(s5.toLowerCase());
 }

	public static boolean isArmstrong(int strangeInteger) {
		int cpy = strangeInteger;
		int sum = 0;
		while(cpy != 0) {
			int rem = cpy % 10;
			sum += rem * rem * rem;
			cpy/= 10;
		}
		return sum == strangeInteger;
	}

	public static boolean isPalindrome(String strangeString) {
		for(int i=0; i<strangeString.length()/2; i++) {
			if(strangeString.charAt(i) != strangeString.charAt(strangeString.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
