public class PatternSolidRhumbus {
    public static void main(String[] args) {
        int row = 5;

        // outer loop
        for(int i=1; i<=row; i++){
            int spaces = row - i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
