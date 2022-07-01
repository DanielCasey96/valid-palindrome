import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.isPalindrome("`l;`` 1o1 ??;l`");
    }

    public boolean isPalindrome(String s) {

        String variable1 = s.toLowerCase();
        String variable2 = variable1.replaceAll("['.,\\[\\]\\\\:;(){}=!@%$\"&+`*?#_\\-<>^| ]", "");
        String[] letters = variable2.split("");
        System.out.println(Arrays.toString(letters));

        String[] backwardsLetters = new String[letters.length];

        int i;
        for(i=0; i<letters.length; i++) {
            backwardsLetters[i] = letters[letters.length - i - 1];
        }
        System.out.println(Arrays.toString(backwardsLetters));

        return Arrays.equals(letters, backwardsLetters);
    }

}
