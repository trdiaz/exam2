class ProblemThree {
    public int countSubstrings(String palindrome) {
        int N = palindrome.length()
        int numPalin = 0;
        for (int center = 0; center <= 2*N-1; ++center) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < N && palindrome.charAt(left) == palindrome.charAt(right)) {
                numPalin++;
                right++;
                left--;
            }
        }
        return numPalin;
    }
}
