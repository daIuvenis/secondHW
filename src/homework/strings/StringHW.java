package homework.strings;

public class StringHW {
    private static String arr;

    public static void main(String[] args) {
        System.out.println(getUniqueChar("Five hjh Five bhbh"));
    }

    public static String EngUpperCase() {
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (65 + i);
        }
        arr = new String(alphabet);
        return arr;
    }

    public static String EngLowerCaseReverse() {
        char[] alpha = new char[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }
        arr = new String(alpha);
        return new StringBuilder(arr).reverse().toString();
    }

    public static String RuLowerCase() {
        char[] alpha = new char[32];
        for (int i = 0; i < 32; i++) {
            alpha[i] = (char) (1072 + i);
        }
        arr = new String(alpha);
        return arr;
    }

    public static char[] Integer0to9() {
        char[] numbers = new char[10];
        for (int i = 0; i <= 9; i++) {
            numbers[i] = (char) (48 + i);
        }
        return numbers;
    }

    public static String symbolsASCII() {
        char[] symbols = new char[95];
        for (char i = 0; i <= 94; i++) {
            symbols[i] = (char) (32 + i);
        }
        return new String(symbols);
    }

    public static String intToString(int num) {
        return String.valueOf(num);
    }

    public static String doubleToStr(double doubleNum) {
        return String.valueOf(doubleNum);
    }

    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static double strToDouble(String str) {
        return Double.parseDouble(str);
    }

    public static int lengthOfSmallestWord(String s) {
        String[] words = s.split(" ");
        int min = words[0].length();
        for (int i = 1; i < words.length; i++) {
            min = Math.min(words[i].length(), min);
        }
        return min;
    }

    public static String replaceTo$(String str, int quantity) {
        String[] words = str.split(" ");
        String result = " ";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == quantity) {
                result = words[i].substring(0, words[i].length() - 3);
                result = result + "$$$";
            }
        }
        return result;

    }

    public static String addSpaces(String word){
        word = word.replaceAll("(?<=\\p{Punct})(?=\\w)", " ");
        return word;
    }

    public static String getUniqueChar(String value){
        String result = "";
        for(int i = 0; i < value.length(); i++) {
            if (result.indexOf(value.charAt(i)) == - 1) {
                result += value.charAt(i);
            }
        }
        return result;
    }

    public static int amountOfWords(String str){
        String[] words = str.split(" ");
        int amount = 0;
        for (int i = 0; i < words.length; i++) {
            amount++;
        }
        return amount;
    }

    public static String deletePosition(String str, int startIndex, int amountToDelete){
        return str.replace(str.substring(startIndex, (startIndex + amountToDelete)), "");
    }
    public static String reverse(String str){
        StringBuilder string = new StringBuilder(str);
        return new String(string.reverse());
    }
    public static String deleteLastWord(String str) {
        int a = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                a = i;
                break;
            }
        }
        return str.substring(0, a);
    }
}
