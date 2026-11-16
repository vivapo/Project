package Lecture_from_11_14;

public abstract class Figure {
    /* black, white */
    protected String color;
    public int convertCharToColumnIndex(char c) {
        if ('A' <= c && c <= 'H') return c - 'A';
        else if ('a' <= c && c <= 'h') return c - 'a';
        else return -1;
    }

    public int isPossibleStep(char c1, int pos1, char c2, int pos2) {
        return 0;
    }

    public String getColor(){
        return color;
    }

}


