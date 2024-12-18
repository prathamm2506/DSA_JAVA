public class PatternInvertedHalfPyramid {
    public static void main(String[] args) {
        int row = 4;

        // outer loop
        for(int i=row; i>=1; i--){
            // inner loop
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
