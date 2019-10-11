package Array;

public class FlippingImage {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int row = 0; row < A.length; row++) {
            for (int col =A.length-1 ; col >= 0; col--) {
                if(A[row][col] == 0)
                {
                    A[row][col] =1;
                }else {
                    A[row][col] =0;
                }
                System.out.print(A[row][col]);

            }
            System.out.println("\n");


        }
        return A;
    }
    public static void main(String args[]) {
      int[][] inputs =  {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        System.out.println(new FlippingImage().flipAndInvertImage(inputs));


      }
    }


