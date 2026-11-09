package Lecture_from_11_07.SeaWar;
import java.util.Scanner;

public class Battle {
    public SeaWarField seaWarField;
    Scanner scanner = new Scanner(System.in);

    public Battle() {
        System.out.println("Battle");
        seaWarField = new SeaWarField();
        while (true){
            seaWarField.showField();
            System.out.println("введите X куда бить");
            int x = scanner.nextInt();
            System.out.println("введите Y куда бить");
            int y = scanner.nextInt();
            shot(x,y);
            if(seaWarField.count == 0){
                System.out.println("Вы расстреляли все корабли");
                break;
            }
        }

    }

    public void shot(int x, int y){
        int a = seaWarField.getFieldState(x,y);
        if((a==1 || a==2) || (a==4)){
            System.out.println("Вы уже стреляли сюда");
        }
        if(a==0){
            seaWarField.setFieldState(x,y,4);
        }
        if(a==3){
            seaWarField.setFieldState(x,y,1);
            int index = seaWarField.indexShip(x,y);
            seaWarField.ships[index].setState();
            if (seaWarField.ships[index].getStatePart()==seaWarField.ships[index].getSize()){ //если количество раненых клеток корабля равно его размеру
                seaWarField.changeState(index);
            }

        }
    }
}
