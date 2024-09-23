public class Factorial {
    public static int printFact(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        int factNum = printFact(n-1);
        return n*factNum;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = printFact(n);
        System.out.println(ans);
    }
}
