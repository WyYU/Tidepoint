package Modle;

public class TidePoint {
    private long Time;
    private int Heigth;

    public TidePoint(long time, int heigth){
        this.Heigth= heigth;
        this.Time =time;
    }
    public long getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public int getHeigth() {
        return Heigth;
    }

    public void setHeigth(int heigth) {
        Heigth = heigth;
    }

    public String toString(){
        return "[ "+this.getTime()+":"+this.getHeigth()+" ]";
    }
}
