public class _18_bitmanipulation {

    // check odd even for given number

    public static void OddorEven(int n) {

        int bitmask = 1;

        if ((n & bitmask) == 0) {

            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    // get i th bit of giveen number

    public static void getbit(int n, int i) {
        if ((n & (1 << i)) == 0) {
            System.out.println("ith bit of " + n + " is 0");
        } else {
            System.out.println("ith bit of " + n + " is 1");
        }
    }

    // set ith bit of the number given

    public static void setbit(int n, int i) {
        n = (n | (1 << i));
        System.out.println(n);
    }

    // cleear ith bit from the given number

    public static int clearbit(int n, int i) {
        n = (n & (~(1 << i)));
        System.out.println(n);
        return n;
    }

    // update the ith to th give bit value in given number

    public static int updatebit(int n, int i, int newbit) {
        n = clearbit(n, i);
        int bitmask = newbit << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        // int number = 100;
        // OddorEven(number);

        // getbit(10, 2);
        // setbit(4, 1);
        // clearbit(4, 2);
        updatebit(7, 2, 0);
    }

}
