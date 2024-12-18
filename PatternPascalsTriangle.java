public class PatternPascalsTriangle {
    public static void main(String[] args) {
        int row = 5;

        // outer loop
        for(int i=0; i<row; i++){
            // spaces
            for(int j=0; j<row-i; j++){
                System.out.print(" ");
            }
            // numbers
            int number = 1;
            for(int j=0; j<=i; j++){
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}
