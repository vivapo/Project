package Lecture_from_17_10;
import java.util.Scanner;

public class labirint {
    static int[][] labirint = {
            {1,0,1,1,1},
            {1,0,0,1,1},
            {1,1,0,1,1},
            {1,0,0,0,1},
            {1,1,1,0,1}
    };
    static char[][] gameStatus = {
            {'-','*','-','-','-'},
            {'-','-','-','-','-'},
            {'-','-','-','-','-'},
            {'-','-','-','-','-'},
            {'-','-','-','-','-'}
    };
    static int stepCount = 0;
    static int row  = 0;
    static int column = 1;
    static int rowExit = 4;
    static int columnExit = 3;



    public static void main(String[] args) {
        showStatus();
        while (true){
            char wall = '\u2588';
            String direction = inputDirection();
            switch (direction){
                case "u":
                case "U":
                    if (row > 0){
                        if (labirint[row-1][column] == 0){
                            gameStatus[row][column]= '#';
                            --row;
                            gameStatus[row][column]= '*';
                        }else{
                            gameStatus[row-1][column]= wall;
                        }
                    }else{
                        System.out.println("Сверху стена");
                    }
                    break;
                case "d":
                case "D":
                    if (row <labirint.length-1) {
                        if (labirint[row+1][column] == 0) {
                            gameStatus[row][column]= '#';
                            ++row;
                            gameStatus[row][column]= '*';
                        }else{
                            gameStatus[row+1][column]= wall;
                        }
                    }else{
                        System.out.println("Снизу стена");
                    }
                    break;
                case "l":
                case "L":
                    if (column>0){
                        if(labirint[row][column-1]==0){
                            gameStatus[row][column]= '#';
                            --column;
                            gameStatus[row][column]= '*';
                        }else{
                            gameStatus[row][column-1]= wall;
                        }
                    }else{
                        System.out.println("Слева стена");
                    }
                    break;
                case "r":
                case "R":
                    if (column<labirint[0].length-1){
                        if(labirint[row][column+1]==0){
                            gameStatus[row][column]= '#';
                            ++column;
                            gameStatus[row][column]= '*';
                        }else{
                            gameStatus[row][column+1]= wall;
                        }
                    }else{
                        System.out.println("Справа стена");
                    }
                    break;
            }
            showStatus();
            if (row == rowExit && column==columnExit){
                System.out.println("Победа");
                break;
            }
        }


    }
    public static void showStatus(){
        for(int i = 0; i< gameStatus.length; ++i){
            for(int j = 0; j< gameStatus[0].length; ++j){
                System.out.print(gameStatus[i][j]);
            }
            System.out.println();
        }
    }
    public static String inputDirection(){
        while (true){
            System.out.println("Введите направление");
            Scanner scanner = new Scanner(System.in);
            String direction = scanner.nextLine();
            if ((direction.equals("u")) || (direction.equals("d")) ||
                    (direction.equals("l")) || (direction.equals("r")) ||
                    (direction.equals("U")) || (direction.equals("D")) ||
                    (direction.equals("L")) || (direction.equals("R"))){
                stepCount ++;
                return direction;
            }else{
                System.out.println("Вы ввели неправильный символ, допустимые: U,D,R,L");
            }

        }
    }


}
