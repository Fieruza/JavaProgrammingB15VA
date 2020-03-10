package Practices;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class ChessBoard {
    public static void main(String[] args) {

                String[][] chessBoard = new String[3][3];
                //WRITE YOUR CODE HERE

                chessBoard[0][0]= "1a";
                chessBoard[0][1]= "1b";
                chessBoard[0][2]= "1c";
               /* chessBoard[0][3]= "1d";
                chessBoard[0][4]= "1e";
                chessBoard[0][5]= "1f";
                chessBoard[0][6]= "1e";
                chessBoard[0][7]= "1g";
                chessBoard[0][8]= "1h";
*/
                chessBoard[1][0]= "2a";
                chessBoard[1][1]= "2b";
                chessBoard[1][2]= "2c";
               /* chessBoard[1][3]= "2d";
                chessBoard[1][4]= "2e";
                chessBoard[1][5]= "2f";
                chessBoard[1][6]= "2e";
                chessBoard[1][7]= "2g";
                chessBoard[1][8]= "2h";
*/
                chessBoard[2][0]= "3a";
                chessBoard[2][1]= "3b";
                chessBoard[2][2]= "3c";
              /*  chessBoard[2][3]= "3d";
                chessBoard[2][4]= "3e";
                chessBoard[2][5]= "3f";
                chessBoard[2][6]= "3e";
                chessBoard[2][7]= "3g";
                chessBoard[2][8]= "3h";
*/
        System.out.println(Arrays.deepToString(chessBoard));
    }

}
