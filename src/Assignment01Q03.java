public class Assignment01Q03 {
    public static void main(String[] args) {
        //int x = 10; TODO: Read the first string argument (replace this line)
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");        
        long a1 = 1;
        long a2 = 1;
        int numOdd = 2; // a1 and a2 are odd
        for (int i = 0; i < x; i++) {
            if (i==0) {
                System.out.print(a1);
            } else if (i==1) {
                System.out.print(a2);
            } else {
                long next = a1 + a2;
                System.out.print(next);
                a1 = a2;
                a2 = next;
                if (next % 2 != 0) {
                numOdd++;
                } 
            }
            if (i < x - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
