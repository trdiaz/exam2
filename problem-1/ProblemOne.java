class ProblemOne {
    public int minDelSum(String s1, String s2) {
        int[][] min = new int[s1.length() + 1][s2.length() + 1];

        for (int i = s1.length() - 1; i >= 0; i--) {
            min[i][s2.length()] = min[i+1][s2.length()] +  s1.charAt(i);
        }
        for (int j = s2.length() - 1; j >= 0; j--) {
            min[s1.length()][j] = min[s1.length()][j+1] +  s2.charAt(j);
        }
        for (int i = s1.length() - 1; i >= 0; i--) {
            for (int j = s2.length() - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    min[i][j] = min[i+1][j+1];
                } else {
                    min[i][j] = Math.min(min[i+1][j] +  s1.charAt(i),
                                        min[i][j+1] +  s2.charAt(j));
                }
            }
        }
        return min[0][0];
    }
}
