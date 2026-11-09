package Lecture_from_11_07.SeaWar;

public class Ship {
    private final int size;

    private final int xStart; // final просто чтобы было красивее
    private final int yStart;
    private final int xEnd;
    private final int yEnd;

    private int statePart;

    public Ship(int size, int xStart, int yStart, int xEnd, int yEnd){
        this.size = size;
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        this.statePart = 0;
    }

    public int getSize(){
        return size;
    }

    public int getxStart(){
        return this.xStart;
    }
    public int getyStart(){
        return yStart;
    }
    public int getxEnd(){
        return xEnd;
    }
    public int getyEnd(){
        return yEnd;
    }
    public int getStatePart(){
        return statePart;
    }

    public void setState(){
        statePart+=1;
    }



}
