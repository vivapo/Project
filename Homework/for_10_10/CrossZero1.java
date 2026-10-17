package for_10_10;


import java.util.Scanner;
import java.util.Random;
public class CrossZero1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        String zero = "\u25EF";
        String cross = "\u2715";

        int[][] field = {
                {-1,-1,-1},
                {-1,-1,-1},
                {-1,-1,-1}
        };
        int row;
        int col;
        int[][][] comb = {
                {{0,0},{1,1},{2,2}},
                {{0,2},{1,1},{2,0}},
                {{0,0},{0,1},{0,2}},
                {{1,0},{1,1},{1,2}},
                {{2,0},{2,1},{2,2}},
                {{0,0},{1,0},{2,0}},
                {{0,1},{1,1},{2,1}},
                {{0,2},{1,2},{2,2}}
        };
        int a;
        int b;
        int c;
        while (true){

            //ход игрока
            System.out.println("Введите номер строки от 1 до 3");
            row = in.nextInt();
            System.out.println("Введите номер столбца от 1 до 3");
            col = in.nextInt();
            System.out.println();

            //проверка на занятость
            if (field[row-1][col-1]==-1){
                field[row-1][col-1]=1;
            }else{
                System.out.println("Это место уже занято, давай другое");
                continue;
            }

            //вывод поля после хода игрока
            for(int i = 0;i<field.length;++i){
                for(int j = 0;j<field[0].length;++j){
                    if(field[i][j]==-1){
                        System.out.print("_");
                    }else if(field[i][j]==0){
                        System.out.print(zero);
                    }else{
                        System.out.print(cross);
                    }
                }
                System.out.println();
            }

            //проверка на победу игрока
            for(int i = 0;i<comb.length;++i){
                a = field[comb[i][0][0]][comb[i][0][1]];
                b = field[comb[i][1][0]][comb[i][1][1]];
                c = field[comb[i][2][0]][comb[i][2][1]];
                if ((a == b)&&(b == c)&&(b!=-1)){
                    System.out.println("Вы победили!");
                    return;
                }
            }

            //проверка на ничью
            int k = 0;
            for(int i = 0;i<field.length;++i) {
                for(int j = 0; j<field[0].length; ++j){
                    if(field[i][j]==-1){
                        k += 1;
                    }
                }
            }
            if(k==0){
                break;
            }

            //ход робота
            System.out.println("Ход робота:");
            while (true){
                int randomrow = random.nextInt(3);
                int randomcol = random.nextInt(3);
                if (field[randomrow][randomcol]==-1){
                    field[randomrow][randomcol]=0;
                    break;
                }
            }

            //вывод поля после хода робота
            for(int i = 0;i<field.length;++i){
                for(int j = 0;j<field[0].length;++j){
                    if(field[i][j]==-1){
                        System.out.print("_");
                    }else if(field[i][j]==0){
                        System.out.print(zero);
                    }else{
                        System.out.print(cross);
                    }
                }
                System.out.println();
            }

            //проверка на победу робота
            for(int i = 0;i<comb.length;++i){
                a = field[comb[i][0][0]][comb[i][0][1]];
                b = field[comb[i][1][0]][comb[i][1][1]];
                c = field[comb[i][2][0]][comb[i][2][1]];
                if ((a == b)&&(b == c)&&(b!=-1)){
                    System.out.println("Вы проиграли...");
                    return;
                }
            }


        }
    }
}
