class ProblemThree {
    public int countSubstrings(String palindrome) {
        int N = palindrome.length()
        int numPalin = 0;
        for (int mid = 0; mid <= 2*N-1; ++mid) {
            int l = mid / 2;
            int r = l + mid % 2;
            while (l >= 0 && r < N && palindrome.charAt(l) == palindrome.charAt(r)) {
                numPalin++;
                r++;
                l--;
            }
        }
        return numPalin;
    }
}
