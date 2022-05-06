public class App {
    // Write a function that is pased a string, and returns true if the string is a
	// palindrome (the same forwards as backwards), else returns false. For example,
	// "ABBA" is a palindrome, but "ACDC" is not.
	
	public static boolean isPalindrome(String palindrome) {
		for(int i = 0; i < palindrome.length(); i++) {
			if(palindrome.charAt(i) !=palindrome.charAt(palindrome.length() - 1 - i)) {
				return false;
			}
		}
		return true;

		String input;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a palindrome");

		input = sc.nextLine();

		if(isPalindrome(input)) {
			System.out.println(input + " is a palindrome");
		} else {
			System.out.println(input + " is not a palindrome");
		}
	}

    public void alphabetTimer(){
        String userInput;
		String start;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter all the letters of the alphabet, press ENTER to start...");
		
		start = input.nextLine();
		
		System.out.println("started...");

		long startTime = System.nanoTime();
		
		userInput = input.nextLine();

		long endTime = System.nanoTime();

		long duration = (endTime - startTime) / 1000000000;

		if (userInput.equals("abcdefghijklmnopqrstuvwxyz")) {
			System.out.println("matches");
		} else {
			System.out.println("does not match");
		}

		System.out.println(duration + " seconds");
    }

    	// Input a string from the user. Analyse the text to count the words in the
	// text, and display the result.

	public void wordCount() {

		String info;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter some words, and I will count the number of words");

		info = sc.nextLine();

		int wordCount = 1;

		for (int i = 0; i < info.length(); i++) {
			if (info.charAt(i) == ' ') {
				wordCount++;
			}
		}

		System.out.println("Word count is = " + wordCount);
	}

    	// Input date of birth. Calculate and display how many sleeps until next
	// birthday.

	public void sleepsTillNextBirthday() {

		int day;
		int month;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter DAY of Birth");

		day = input.nextInt();

		System.out.println("Please enter MONTH of Birth");

		month = input.nextInt();

		Date birthDay = new GregorianCalendar(2018, month, day).getTime();

		Date today = new Date();

		long diff = (birthDay.getTime() - today.getTime()) / (1000 * 60 * 60 * 24) - 29;

		if (diff <= 0)
			System.out.println(diff * -1 + 365 + " sleep(s) until next birthday");
		else {
			System.out.println(diff + " sleep(s) until next birthday");
		}

	}

    // Write a function that takes a list of numbers, and returns the biggest number
	// in the list.

	public void LargestComparator() {

		System.out.println("Enter three integers");

		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is largest");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is largest");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is largest");
		} else if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("all integers are the same");
		}
		scanner.close();
	}


    
}
