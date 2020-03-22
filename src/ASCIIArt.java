import java.util.Scanner;

/**
 * Created by Arsen Adzhiametov on 7/31/13.
 */
public class ASCIIArt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();

        String[][] matrix = new String[height][27*width];

        char[] chars = sc.nextLine().toCharArray();
        int k = 0;

        for(int i=0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = String.valueOf(chars[k++]);
            }
        }

        for(int i=0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }



    }

}
