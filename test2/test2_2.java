public class test2_2{
    public static void main(String[] args) {
        int limit = 10;

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series up to " + limit + ": ");
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 3; i <= limit; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}