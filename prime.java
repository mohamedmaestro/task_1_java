public class prime {

    static void prime_N(int n)
    {
       
        int i, j, flg;

        System.out.println(
            "the Prime numbers within 1 to " + n
            + " are:");
       
        for (i = 2; i <= n; i++) {
            flg = 1;

            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flg = 0;
                    break;
                }
            }
            
            if (flg == 1)
                System.out.print(i + " ");
        }
    }

  
    public static void main(String[] args)
    {
        int n = 99;

        prime_N (n);
    }
}