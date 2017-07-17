public class VMWare1 {



    static int maxLength(final int[] a, final int k) {

        int sum = a[0];



        int start = 0;

        int i;

        final int length = a.length;

        if (length == 0) {

            return 0;

        } else if (length == 1) {

            if (a[0] <= k) {

                return 1;

            } else {

                return 0;

            }

        } else {

            for (i = 1; i < length; i++) {

                sum = sum + a[i];
                System.out.println(sum);
                // while (sum > k && start <= i - 1) {

                //     sum = sum - a[start];
                //     System.out.println(start + " " + sum);
                //     start++;

                // }

            }

            // System.out.println(sum + " " + k);

            // if (sum <= k) {

            //     return (i - start);

            // } else {

            //     return 0;

            // }

        }

        return 0;
    }



    public static void main(final String[] args) {

        new VMWare1();

        VMWare1.maxLength(new int[] { 42, 15, 12, 8, 6, 32 }, 26);

    }



}