package cracking;

/**
 * Created by abhis_000 on 10/23/15.
 */
public class CareercupQuestions {

    public void getNearestPoint(int[] input,Point[] points){
        double lowestDistance = Double.MAX_VALUE;
        int nearestPoint = 0;

        for(int i = 0;i<input.length;i++){
            for(int j = 0;j < points.length;j++){
                double distance = getDistance(new Point(input[i],0),points[j]);
                if(lowestDistance > distance){
                    lowestDistance = distance;
                    nearestPoint = j;
                }
            }
            System.out.println("x = "+input[i]+ points[nearestPoint].toString());
        }
    }

    private double getDistance(Point p1,Point p2){
        return Math.sqrt((p1.x - p2.x)^2 + (p1.y - p2.y)^2);
    }
}
