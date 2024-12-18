public class PatternHollowRhombus {
    public static void main(String[] args) {
        int row = 5;

        // outer loop
        for(int i=1; i<=row; i++){
            int spaces = row - i;
            // spaces
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=row; j++){
                if(i==1 || j==1 || i==row || j==row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
