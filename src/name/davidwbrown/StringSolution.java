package name.davidwbrown;

public class StringSolution {

    public static void main(String[] args) {
	    String S = "we test coders";

        String S1 = solution(S);
        System.out.println(S1);

    }

    static String solution(String S) {
        String[] sArry;

        sArry = S.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sArry.length; i++) {
            sArry[i] = reverse(sArry[i]);
            sb.append(sArry[i] + " ");
        }

        return sb.toString();
    }

    static String reverse(String str) {
        String reverse = "";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + str.charAt(i);

        return reverse;
    }
}
