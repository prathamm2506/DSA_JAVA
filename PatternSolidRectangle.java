
public class PatternSolidRectangle{
    public static void main(String[] args) {
        int row = 4;
        int col = 5;
    

    // outer loop
    for (int i=1; i<=row; i++){
        // inner loop
        for(int j=1; j<=col; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}