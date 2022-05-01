import java.util.NoSuchElementException;

public class Main {

    public static int integerParser(String num) {

        int numAsInt = 0;

        for (int i = 0, j = num.length()-1; i < num.length(); i++, j--){

            if (num.charAt(i) == '1') {
                numAsInt += (1 * (int)Math.pow(10, j));
            }
            else if (num.charAt(i) == '2') {
                numAsInt += (2* (int)Math.pow(10, j));
            }
            else if (num.charAt(i) == '3') {
                numAsInt += (3* (int)Math.pow(10, j));
            }
            else if (num.charAt(i) == '4') {
                numAsInt += (4* (int)Math.pow(10, j));
            }
            else if (num.charAt(i) == '5') {
                numAsInt += (5* (int)Math.pow(10, j));
            }
            else if (num.charAt(i) == '6') {
                numAsInt += (6* (int)Math.pow(10, j));
            }
            else if (num.charAt(i) == '7') {
                numAsInt += (7* (int)Math.pow(10, j));
            }
            else if (num.charAt(i) == '8') {
                numAsInt += (8* (int)Math.pow(10, j));
            }
            else if (num.charAt(i) == '9') {
                numAsInt += (9* (int)Math.pow(10, j));
            }
            else if (num.charAt(i) == '0') {
                numAsInt += (0 * (int)Math.pow(10, j));
            }
            else {
                throw new NoSuchElementException();
            }
        }

        return numAsInt;
    }

    public static void main(String[] args) {

        int myNum = integerParser("67432");

        System.out.println(myNum+1);

    }
}
