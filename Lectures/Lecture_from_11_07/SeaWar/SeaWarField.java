package Lecture_from_11_07.SeaWar;
import Lecture_from_10_17.Str;

import java.util.Random;

public class SeaWarField {

    public SeaWarField(){
        createField();
    }

    public Ship[] ships = new Ship[10];
    int index = 0;
    Random random = new Random();
    public int count = 10; //количество изначально живых кораблей

    private int[][] fieldState = new int[10][10];


    public void createField(){
        System.out.println("createField");

        int k = 0;
        //однопалубный
        while(k<4){
            while(true){
                int ix = random.nextInt(10);
                int iy = random.nextInt(10);
                if(examintaion(ix,iy,ix, iy)){
                    fieldState[ix][iy]=3;
                    k+=1;
                    ships[index] = new Ship(1,ix,iy,ix,iy);
                    index+=1;
                    break;
                }
            }
        }

        k = 0;
        //двухпалубный
        while(k<3){
            while(true){
                int ix = random.nextInt(10);
                int iy = random.nextInt(10);
                int opr = random.nextInt(2);
                if(opr == 0){
                    if(examintaion(ix,iy,ix+1, iy)){
                        fieldState[ix][iy]=3;
                        fieldState[ix+1][iy]=3;
                        k+=1;
                        ships[index] = new Ship(2,ix,iy,ix+1,iy);
                        index+=1;
                        break;
                    }
                }
                if(opr == 1){
                    if(examintaion(ix,iy,ix, iy+1)){
                        fieldState[ix][iy]=3;
                        fieldState[ix][iy+1]=3;
                        k+=1;
                        ships[index] = new Ship(2,ix,iy,ix,iy+1);
                        index+=1;
                        break;
                    }
                }
            }
        }

        k = 0;
        //трёхпалубный
        while(k<2){
            while(true){
                int ix = random.nextInt(10);
                int iy = random.nextInt(10);
                int opr = random.nextInt(2);
                if(opr == 0){
                    if(examintaion(ix,iy,ix+2, iy)){
                        fieldState[ix][iy]=3;
                        fieldState[ix+1][iy]=3;
                        fieldState[ix+2][iy]=3;
                        k+=1;
                        ships[index] = new Ship(3,ix,iy,ix+2,iy);
                        index+=1;
                        break;
                    }
                }
                if(opr == 1){
                    if(examintaion(ix,iy,ix, iy+2)){
                        fieldState[ix][iy]=3;
                        fieldState[ix][iy+1]=3;
                        fieldState[ix][iy+2]=3;
                        k+=1;
                        ships[index] = new Ship(3,ix,iy,ix,iy+2);
                        index+=1;
                        break;
                    }
                }
            }
        }

        k = 0;
        //четырёхпалубный
        while(k<1){
            while(true){
                int ix = random.nextInt(10);
                int iy = random.nextInt(10);
                int opr = random.nextInt(2);
                if(opr == 0){
                    if(examintaion(ix,iy,ix+3, iy)){
                        fieldState[ix][iy]=3;
                        fieldState[ix+1][iy]=3;
                        fieldState[ix+2][iy]=3;
                        fieldState[ix+3][iy]=3;
                        k+=1;
                        ships[index] = new Ship(4,ix,iy,ix+3,iy);
                        index+=1;
                        break;
                    }
                }
                if(opr == 1){
                    if(examintaion(ix,iy,ix, iy+3)){
                        fieldState[ix][iy]=3;
                        fieldState[ix][iy+1]=3;
                        fieldState[ix][iy+2]=3;
                        fieldState[ix][iy+3]=3;
                        k+=1;
                        ships[index] = new Ship(4,ix,iy,ix,iy+3);
                        index+=1;
                        break;
                    }
                }
            }
        }

    }


    public void showField() {
        String R = "\u2588";
        int color0 =0x16bdc7;
        int color1 =0xdd9710;
        int color2 =0xdd1010;
        int color3 =0xffffff;
        int color4 =0xeaef08;
        for(int i = 0;i<fieldState.length;++i){
            for(int j = 0;j<fieldState[0].length;++j){
                switch (fieldState[i][j]){
                    case 0:System.out.print("\u001B[38;2;"+(color0>>16)+";"+((color0>>8)&(0xFF))+";"+((color0)&(0xFF))+"m"+R+R+R+" "); break;
                    case 1:System.out.print("\u001B[38;2;"+(color1>>16)+";"+((color1>>8)&(0xFF))+";"+((color1)&(0xFF))+"m"+R+R+R+" "); break;
                    case 2:System.out.print("\u001B[38;2;"+(color2>>16)+";"+((color2>>8)&(0xFF))+";"+((color2)&(0xFF))+"m"+R+R+R+" "); break;
                    case 3:System.out.print("\u001B[38;2;"+(color3>>16)+";"+((color3>>8)&(0xFF))+";"+((color3)&(0xFF))+"m"+R+R+R+" "); break;
                    case 4:System.out.print("\u001B[38;2;"+(color4>>16)+";"+((color4>>8)&(0xFF))+";"+((color4)&(0xFF))+"m"+R+R+R+" "); break;
                }
            }
            System.out.println("\u001B[0m");//чтобы сбросился цвет
        }
    }


    public boolean examintaion(int xs, int ys, int xe, int ye) {
        if(xe>=10 || ye>=10){
            return false;
        }
        for(int i = xs; i<=xe; ++i){
            for(int j = ys; j<=ye; ++j){
                if (fieldState[i][j]==3){
                    return false;
                }
            }
        }
        return true;
    }//проверка на то можно ли поставить корабль таким образом


    public int getFieldState(int x, int y){
        return fieldState[x][y];
    }// выводит статус клетки


    public void setFieldState(int x, int y, int state){
        fieldState[x][y] = state;
    }//меняет статус клетки


    public int indexShip(int x, int y){
        for(int index = 0; index<ships.length;++index){
            int xs = ships[index].getxStart();
            int xe = ships[index].getxEnd();
            int ys = ships[index].getyStart();
            int ye = ships[index].getyEnd();
            for(int i = xs; i<=xe; ++i){
                for(int j = ys; j<=ye; ++j){
                    if(x==i && y == j){
                        return index; // последовательно перебираем корабли и ищем какому кораблю принадлежит эта клетка
                    }
                }
            }
        }
        return 999;
    }//выводит индекс корабля, который находится в этой клетке

    public void changeState(int index){
        count-=1; // меняет общее количество живых кораблей
        int xs = ships[index].getxStart();
        int xe = ships[index].getxEnd();
        int ys = ships[index].getyStart();
        int ye = ships[index].getyEnd();
        for(int i = xs; i<=xe; ++i) {
            for (int j = ys; j <= ye; ++j) {
                fieldState[i][j] = 2;
            }
        }
    }//меняет все раненые клетки корабля на убитые клетки


}
