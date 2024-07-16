
public class PracticalString3 {

	public static void main(String[] args) {
		String test = "This cat is the friendliest cat I have seen";
		String[] array = test.split(" ");
		int capitalLetter = 0;
		double longWord = 0;
		for (int i = 0; i < array.length; i++) {
			String firstLetter = array[i].substring(0, 1);
			if (firstLetter.equals(firstLetter.toUpperCase())) {
				capitalLetter++;
			}
			if (array[i].length() > 4) {
				longWord++;
			}
		}

		double percentage = (longWord / array.length) * 100;
		System.out.println("In the sentence: " + test);
		System.out.println(capitalLetter + " words start with a capital letter and " + percentage
				+ "% of the words are longer than 4 symbols.");

	}

}
