package Lecture_from_11_14;



public class ChessDesk {

    private Figure[][] field = new Figure[8][8];

    public void setFigure(Figure figure, char c, int pos) {
        int row = pos - 1;
        int column = convertCharToColumnIndex(c);
        field[row][column] = figure;
    }

    public Figure getFigure(char c, int pos){
        int row = pos -1;
        int column = convertCharToColumnIndex(c);
        return field[row][column];
    }

    public static int convertCharToColumnIndex(char c) {
        if ('A' <= c && c <= 'H') return c - 'A';
        else if ('a' <= c && c <= 'h') return c - 'a';
        else return -1;
    }

    public void showField(){
        for(int i = 0; i<field.length; ++i){
            for(int j = 0; j< field[0].length; ++j){
                Figure fig = field[i][j];
                if(fig == null){
                   System.out.print("\u3000");
                } else if(fig.getColor().equals("black")){
                    if(fig instanceof Pawn){
                        System.out.print("♟");
                    }
                    if(fig instanceof Rook){
                        System.out.print("♜");
                    }
                    if(fig instanceof Bishop){
                        System.out.print("♝");
                    }
                    if(fig instanceof Knight){
                        System.out.print("♞");
                    }
                    if(fig instanceof Queen){
                        System.out.print("♛");
                    }
                    if(fig instanceof King){
                        System.out.print("♚");
                    }
                } else if(fig.getColor().equals("white")){
                    if(fig instanceof Pawn){
                        System.out.print("♙");
                    }
                    if(fig instanceof Rook){
                        System.out.print("♖");
                    }
                    if(fig instanceof Bishop){
                        System.out.print("♗");
                    }
                    if(fig instanceof Knight){
                        System.out.print("♘");
                    }
                    if(fig instanceof Queen){
                        System.out.print("♕");
                    }
                    if(fig instanceof King){
                        System.out.print("♔");
                    }
                }
            }
            System.out.println();
        }
    }

    public int kingAlive(){
        int bk = 0;
        int wk = 0;
        for(int i = 0; i<field.length; ++i){
            for(int j = 0; j<field[0].length; ++j){
                Figure fig = field[i][j];
                if((fig instanceof King) && (fig.getColor().equals("white"))){
                    ++wk;
                }else if((fig instanceof King) && (fig.getColor().equals("black"))){
                    ++bk;
                }
            }
        }
        if((wk==bk) && wk==1){
            return 0;
        }else if((wk!=bk) && wk==1){
            return 1;
        }else{
            return 2;
        }
    }

}
