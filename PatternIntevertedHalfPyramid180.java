public class PatternIntevertedHalfPyramid180 {
    public static void main(String[] args) {
        int row = 4;

        // outer loop
        for(int i=1; i<=row; i++){
            // inner loop -> print space
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
