public class Pattern13 {
    public static void main(String [] dsc){
        for(int i = 1 ; i<=5; i++){
            for(int j = 5 ; j > i ; j--){
                System.out.print("  ");
            }for (int k = 1 ; k<=i ;k++){
                System.out.print(" "+ k);
            }for(int m = 1; m<i ;m++){
                System.out.print(" " + m);
            }
            System.out.println();
        }

    }
}
