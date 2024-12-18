public class PatternPalindromePattern {
    public static void main(String[] args) {
        int row = 5;

        // outer loop
        for(int i=1; i<=5; i++){
            // spaces
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }

            //backwards half pyaramid
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            // forward half pyramid
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
