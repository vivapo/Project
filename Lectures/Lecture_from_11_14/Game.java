package Lecture_from_11_14;
import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private ChessDesk desk = new ChessDesk();


    public Game() {

        start();

    }

    public void start() {
        creationFigure();
        desk.showField();
        int s = random.nextInt(2);
        if(s == 0){
            System.out.println("Вы делаете первый ход");
        }else{
            System.out.println("Компьютер делает первый ход");
        }
        while(true){
            if(s==0){
                personsMove();
                s=1;
            }
            else{
                robotMove();
                s=0;
            }
            desk.showField();

            if(desk.kingAlive()==1){
                System.out.println("Белые проиграли");
                break;
            }else if(desk.kingAlive()==2){
                System.out.println("Чёрные проиграли");
                break;
            }
        }

    }

    public void personsMove(){
        while(true){
            System.out.println("Введите букву и цифру фигуры, которой хотите сходить");
            char a = scanner.next().charAt(0);
            int b = scanner.nextInt();
            System.out.println("Введите букву и цифру куда хотите сходить");
            char a1 = scanner.next().charAt(0);
            int b1 = scanner.nextInt();
            if(desk.getFigure(a,b) != null){
                if(desk.getFigure(a,b).getColor().equals("white")){
                    if((desk.getFigure(a,b).isPossibleStep(a,b,a1,b1)==1)&&){
                        desk.setFigure(desk.getFigure(a,b),a1,b1);
                        desk.setFigure(null,a,b);
                        break;
                    } else if(desk.getFigure(a,b).isPossibleStep(a,b,a1,b1)==2){
                        if(desk.getFigure(a1,b1) != null){
                            desk.setFigure(desk.getFigure(a,b),a1,b1);
                            desk.setFigure(null,a,b);
                        }
                        break;
                    }else{
                        System.out.println("Сюда не может сходить фигура");
                    }
                }else{
                    System.out.println("Это не ваша фигура");
                }
            }else{
                System.out.println("В этой клетке нет фигуры");
            }
        }
    }

    public void robotMove(){
        while(true){
            char[] simv = {'a','b','c','d','e','f','g','h'};
            int a = random.nextInt(8);
            int b = random.nextInt(8)+1;
            if(desk.getFigure(simv[a],b) != null){
                if(desk.getFigure(simv[a],b).getColor().equals("black")){
                    int a1 = random.nextInt(8);
                    int b1 = random.nextInt(8)+1;
                    if(desk.getFigure(simv[a],b).isPossibleStep(simv[a],b,simv[a1],b1)==1){
                        desk.setFigure(desk.getFigure(simv[a],b),simv[a1],b1);
                        desk.setFigure(null,simv[a],b);
                        break;
                    } else if(desk.getFigure(simv[a],b).isPossibleStep(simv[a],b,simv[a1],b1)==2){
                        if(desk.getFigure(simv[a1],b1) != null){
                            desk.setFigure(desk.getFigure(simv[a],b),simv[a1],b1);
                            desk.setFigure(null,simv[a],b);
                            break;
                        }
                    }
                }
            }
        }
    }

    public void creationFigure(){
        Figure pawnBlack1 = new Pawn("black");
        desk.setFigure(pawnBlack1,'a',2);
        Figure pawnBlack2 = new Pawn("black");
        desk.setFigure(pawnBlack2,'b',2);
        Figure pawnBlack3 = new Pawn("black");
        desk.setFigure(pawnBlack3,'c',2);
        Figure pawnBlack4 = new Pawn("black");
        desk.setFigure(pawnBlack4,'d',2);
        Figure pawnBlack5 = new Pawn("black");
        desk.setFigure(pawnBlack5,'e',2);
        Figure pawnBlack6 = new Pawn("black");
        desk.setFigure(pawnBlack6,'f',2);
        Figure pawnBlack7 = new Pawn("black");
        desk.setFigure(pawnBlack7,'g',2);
        Figure pawnBlack8 = new Pawn("black");
        desk.setFigure(pawnBlack8,'h',2);
        Figure rookBlack1 = new Rook("black");
        desk.setFigure(rookBlack1,'a',1);
        Figure knightBlack1 = new Knight("black");
        desk.setFigure(knightBlack1,'b',1);
        Figure bishopBlack1 = new Bishop("black");
        desk.setFigure(bishopBlack1,'c',1);
        Figure kingBlack = new King("black");
        desk.setFigure(kingBlack,'d',1);
        Figure queenBlack = new Queen("black");
        desk.setFigure(queenBlack,'e',1);
        Figure bishopBlack2 = new Bishop("black");
        desk.setFigure(bishopBlack2,'f',1);
        Figure knightBlack2 = new Knight("black");
        desk.setFigure(knightBlack2,'g',1);
        Figure rookBlack2 = new Rook("black");
        desk.setFigure(rookBlack2,'h',1);

        Figure pawnWhite1 = new Pawn("white");
        desk.setFigure(pawnWhite1,'a',7);
        Figure pawnWhite2 = new Pawn("white");
        desk.setFigure(pawnWhite2,'b',7);
        Figure pawnWhite3 = new Pawn("white");
        desk.setFigure(pawnWhite3,'c',7);
        Figure pawnWhite4 = new Pawn("white");
        desk.setFigure(pawnWhite4,'d',7);
        Figure pawnWhite5 = new Pawn("white");
        desk.setFigure(pawnWhite5,'e',7);
        Figure pawnWhite6 = new Pawn("white");
        desk.setFigure(pawnWhite6,'f',7);
        Figure pawnWhite7 = new Pawn("white");
        desk.setFigure(pawnWhite7,'g',7);
        Figure pawnWhite8 = new Pawn("white");
        desk.setFigure(pawnWhite8,'h',7);
        Figure rookWhite1 = new Rook("white");
        desk.setFigure(rookWhite1,'a',8);
        Figure knightWhite1 = new Knight("white");
        desk.setFigure(knightWhite1,'b',8);
        Figure bishopWhite1 = new Bishop("white");
        desk.setFigure(bishopWhite1,'c',8);
        Figure kingWhite = new King("white");
        desk.setFigure(kingWhite,'d',8);
        Figure queenWhite = new Queen("white");
        desk.setFigure(queenWhite,'e',8);
        Figure bishopWhite2 = new Bishop("white");
        desk.setFigure(bishopWhite2,'f',8);
        Figure knightWhite2 = new Knight("white");
        desk.setFigure(knightWhite2,'g',8);
        Figure rookWhite2 = new Rook("white");
        desk.setFigure(rookWhite2,'h',8);
    }

    public boolean noBorder(char a1, int b1, char a2, int b2, String myColor){
        // прописать циклом перебор клеток от клетки где стоит эта фигура и до клетки куда хотим сходить и учесть, что, если
        // фигура стоит в последней клетке, то она другого цвета
    }

}
