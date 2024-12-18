public class PatternButterflyPattern {
    public static void main(String[] args) {
        int row = 4;

        // upper half
        for(int i=1; i<=row; i++){
            // 1st half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            int spaces = 2 * (row - i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

             // 2nd half
             for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for(int i=row; i>=1; i--){
            // 1st half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            int spaces = 2 * (row - i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

             // 2nd half
             for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
