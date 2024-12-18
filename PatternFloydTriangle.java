public class PatternFloydTriangle {
    public static void main(String[] args) {
        int row = 5;
        int number = 1;

        // outer loop
        for(int i=1; i<=row; i++){
            // inner loop
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
