package chess;


import java.util.Scanner;

public class horsemoves {


    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W" + chessBoardCoord(j, i);
                else chessBoard[i][j] = "B" + chessBoardCoord(j, i);
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положение коня(строка):");
        int locst = sc.nextInt();
        System.out.println("Введите положение коня(колонка):");
        int locCol = sc.nextInt();
        System.out.println("Введите клетку для хода:);
                int target = sc.nextInt();
    }

    public static String chessBoardCoord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7)|| (b>7)) return null;
        else return (Character.toString(letters.charAt(a)) + numbers.charAt(b));
        }


    public boolean solve (int() locst, int() locCol, int() target, String[][] chessBoard){

    }
}