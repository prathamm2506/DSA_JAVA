public class PatternHalfPyramid {
    public static void main(String[] args) {
        int row = 4;

        // outer loop
        for(int i = 1; i <= row; i++){
            // inner loop
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
