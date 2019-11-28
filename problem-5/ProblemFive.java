public class ProblemFive {
 public int perfectSq(int n)
        {
            int[] num = new int[n + 1];
            num[0] = 0;
            for (int i = 1; i <= n; i++)
            {
                num[i] = Integer.MAX_VALUE;
                for (int j = 1; j * j <= i; j++)
                {
                    if (1 + num[i - j * j] < num[i]) num[i] = 1 + num[i - j * j];
                }
            }
            return num[n];
        }
}
