public class Assignment01Q01 {
    public static void main(String[] args) {
        int n = args.length;
        for (int i = 0; i<n; i++) {
            if (args[i].length() > 0) {
                char first = args[i].charAt(0);
                if (first % 5 == 0) {
                    System.out.println(first); 
                }
            }
        }

    }
}
