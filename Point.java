package cracking;

/**
 * Created by abhis_000 on 10/23/15.
 */
public class Point {
    int x;
    int y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
