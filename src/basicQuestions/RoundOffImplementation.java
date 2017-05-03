package basicQuestions;

public class RoundOffImplementation {

	public static void main(String[] args) {

		RoundOffImplementation obj = new RoundOffImplementation();

		String s1 = obj.roundOff(5.6666666, 0); // output 6
		String s2 = obj.roundOff(5.777777, 3); // output 5.778
		String s3 = obj.roundOff(566.37777777, 0);// output 566
		String s4 = obj.roundOff(5.3333333, 2); // output 5.33
		System.out.println(" s1 = "+ s1+ "\n s2 = " + s2 +"\n s3 = " + s3 + "\n s4 = " + s4);
	}

	String finalResult;

	public String roundOff(double d, int rfDigits) {

		String dValue = Double.toString(d);
		char[] darr = dValue.toCharArray();

		String result = "";

		switch (rfDigits) {

		case 0:
			///////////////////////////////////////////
			
			
			//////////////////////////////////////

			for (int i = 0; i < darr.length; i++) {

				result = result + darr[i];

				char c = darr[i];
				char dot = '.';

				if (c == dot) {

					if ((Integer.parseInt("" + dValue.charAt(i + 1))) >= 5) {

						result = result.substring(0, result.length() - 1);
						result = String.valueOf(Integer.parseInt(result) + 1);

						finalResult = result;
						return finalResult;
					} else {

						result = result.substring(0, result.length() - 1);
						finalResult = result;
						return finalResult;
					}
				}
			}

			break;

		default:

			for (int i = 0; i < darr.length; i++) {

				result = result + darr[i];

				char c = darr[i];
				char dot = '.';

				if (c == dot) {
					
					for (int j = i+1; j <= (i+ rfDigits); j++){
							
							result = result + darr[j];
					}	
				  
					if ((Integer.parseInt("" + dValue.charAt(i+ rfDigits+1))) >= 5) {

						result = result.substring(0, result.length() - 1);
						result = result + String.valueOf(Integer.parseInt(""+ dValue.charAt(i+ rfDigits)) + 1);
						
						finalResult = result;
						return finalResult;
					} else {
						
						finalResult = result;
						return finalResult;
					}
				}
			}
		}

		return finalResult;
	}

}
