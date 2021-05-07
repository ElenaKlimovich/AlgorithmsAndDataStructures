import java.util.Arrays;
import java.util.Collections;

public class MaxNumberFromDigits {

    public static void main(String[] args) {
        int[] n = {4, 7, 9, 1, 0, 5, 7};

        System.out.println(maxNumber(n));
        System.out.println(maxNumber(n).equals(maxNumFromStream(n)));
    }

    private static String maxNumber(int[] n) {
        Arrays.sort(n);
        String result = "";

//        for (int i=0; i<n.length; i++)
//            result = n[i] + result;

        for (int i = n.length - 1; i >= 0; i--)
            result += n[i];

        return result;
    }

    private static String maxNumFromStream(int[] n) {
        return String.join("",
                Arrays.stream(n)
                        .boxed()
                        .sorted(Collections.reverseOrder())
                        .map(String::valueOf)
                        .toArray(String[]::new));
    }
}