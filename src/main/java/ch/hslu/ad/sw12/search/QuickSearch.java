package ch.hslu.ad.sw12.search;

public class QuickSearch {

    public static int search(final String a, final String p) {
        final int n = a.length();
        final int m = p.length();
        final int range = 10000; // -> ASCII-Range
        final int[] shift = new int[range];
// init shift-array
        for (int i = 0; i < range; i++) {
            shift[i] = m + 1;
        }
// overwrite fields according pattern
        for (int i = 0; i < m; i++) {
            shift[p.charAt(i)] = m - i;
        }
        int i = 0; // index to string
        int j = 0; // index to pattern p
        do {
            if (a.charAt(i + j) == p.charAt(j)) { // match
                j++;
            } else { // mismatch
                if ((i + m) < n) { // a.charAt(i1+m) is not outside a
                    i += shift[a.charAt(i + m)]; // jump forward
                    j = 0;
                } else {
                    break; // (mismatch) && (no shift is possible)
                }
            }
        } while ((j < m) && ((i + m) <= n));
// (pattern p not found) && (end of a not reached)
        if (j == m) {
            return i; // pattern found
        } else {
            return -1; // pattern not found
        }
    }

    public static int searchOptimalMismatch(final String a, final String pattern) {
        final int n = a.length();
        final int m = pattern.length();
        final int[] optimalMismatchPosition = new int[m];
        final int range = 10000;
        final int[] shift = new int[range];
        // init shift-array
        for (int i = 0; i < range; i++) {
            shift[i] = m + 1;
        }
        // overwrite fields according pattern
        for (int i = 0; i < m; i++) {
            shift[pattern.charAt(i)] = m - i;
        }
        // search
        int i = 0; // index to string
        int j = 0; // index to pattern p
        do {
            if (a.charAt(i + j + optimalMismatchPosition[j]) == pattern.charAt(j + optimalMismatchPosition[j])) { // match
                j++;
            } else { // mismatch
                if (j > 0) { //nicht gefundenes Zeichen 1 nach vorne Schieben
                    int tempPosition = optimalMismatchPosition[j] + 1;
                    optimalMismatchPosition[j] = optimalMismatchPosition[j - 1] - 1;
                    optimalMismatchPosition[j - 1] = tempPosition;
                }
                if ((i + m) < n) {
                    i += shift[a.charAt(i + m)]; // jump forward
                    j = 0;
                } else {
                    break; // (mismatch) && (no shift is possible)
                }
            }
        } while ((j < m) && ((i + m) <= n)); // (pattern p not found) && (end of a not reached)
        if (j == m) {
            return i; // pattern found
        } else {
            return -1; // pattern not found
        }
    }

}
