package cracking;

import cracking.TreesGraphs.Graph;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by abhis_000 on 10/23/15.
 */

public class TestClass {
    public static void main(String[] args){
        int[] input = new int[3];
        input[0] = 1;
        input[1] = 5;
        input[2] = 7;
        Point[] points = new Point[5];
        points[0] = new Point(0,3);
        points[1] = new Point(1,1);
        points[2] = new Point(3,2);
        points[3] = new Point(8,10);
        points[4] = new Point(9,100);
        CareercupQuestions instance = new CareercupQuestions();
        instance.getNearestPoint(input,points);
    }


}
