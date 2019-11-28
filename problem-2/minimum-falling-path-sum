class ProblemTwo {
    public int minPathSum(int[][] A) {
        int N = A.length;
        for (int row = N-2; row >= 0; --row) {
            for (int col = 0; col < N; ++col) {
                int mos = A[row+1][col];
                if (col > 0)
                    mos = Math.min(mos, A[row+1][col-1]);
                if (col+1 < N)
                    mos = Math.min(mos, A[row+1][col+1]);
                A[row][col] += mos;
            }
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= A[i].length; i++)
        {
            result = Math.min(result, i);
        }
        return result;
    }
}
