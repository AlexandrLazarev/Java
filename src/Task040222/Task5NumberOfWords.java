package Task040222;

public class Task5NumberOfWords {
    public static void main(String[] args) {
        int numberChar = 0;
        int numberOfWords = 0;

        String str = "Искусство, сессия, огород, стресс";
        String str2 = str + " ";

        for (int i = 0; i <= str2.length() - 1; i++) {
            if (str2.charAt(i) == 'с') {
                numberChar++;
            }
            if (numberChar == 3) {
                numberOfWords++;
                numberChar = 0;
                if (i == str2.length() - 1) {
                    break;
                }
                i = str2.indexOf(' ', i) - 1;
            }
        }
        System.out.println("В предложении " + numberOfWords + " слова с тремя буквами с");
    }
}

