public class Main
{
    public static void main(String[] args) {
        for (int c = 0; c < 31; c++) {
            System.out.printf("%3d |", c);  // printf format allows print horizontal
        }
        System.out.println("\n"); // newline

        for (int c = 30; c > -1; c--) {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        for (int c = 0; c < 21; c += 3) {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        for (int c = 10; c > -1; c -= 2) {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");
        ////////////////////////////////////////// PART 2 //////////////////////////////////////////
     // int rows = 5;

    //  for (int i = 1; i <= rows; i++)
        {

         // for (int j = 1; j <= i; j++)
            {
           //   System.out.print("*");
            }
         // System.out.println();
        }

//      int rows = 5;

  //    for (int i = 1; i <= rows; i++) {
   //       for (int j = rows; j >= i; j--) {
    //          System.out.print("*");
     //     }

     //     System.out.println();

// OTHER FIGURES HAVE BEEN NOTED OUT, only one works at a time*****
        int rows = 5;
        int columns = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();






    }


}

}








