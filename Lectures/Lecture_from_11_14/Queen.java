package Lecture_from_11_14;

public class Queen extends Figure{

    @Override
    public int isPossibleStep(char c1, int pos1, char c2, int pos2) {
        int row1 = pos1 - 1;
        int column1 = convertCharToColumnIndex(c1);
        int row2 = pos2 - 1;
        int column2 = convertCharToColumnIndex(c2);
        if(((row2<=7 && column2<=7)&&(row2>=0 && column2>=0))&&((row2!=row1)&&(column1!=column2))){
            if(row1==row2){
                return 1;
            }
            if(column1==column2){
                return 1;
            }
            if(Math.abs(column1-column2)==Math.abs(row2-row1)){
                return 1;
            }
        }
        return 0;
    }


    Queen(String color){
        this.color = color;
    }
}
