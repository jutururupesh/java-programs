public class LCS {
    public static int lcs(char[] x, char[] y, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (x[m - 1] == y[n - 1]) {
            return 1 + lcs(x, y, m - 1, n - 1);
        } else {
            return Math.max(lcs(x, y, m, n - 1), lcs(x, y, m - 1, n));
        }
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int result = lcs(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
        System.out.println("Length of LCS is: " + result);
    }
}
