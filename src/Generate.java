import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */

public class Generate {

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> geList = new ArrayList<>();
        for (int x=0; x<numRows; x++){
            List<Integer> chList = new ArrayList<>();

            for (int y=0; y<x+1; y++){
                if (y==0 || y==x){
                    chList.add(1);
                }else{
                    chList.add(geList.get(x-1).get(y-1)+geList.get(x-1).get(y));
                }
            }
            geList.add(chList);
        }
        return geList;
    }

    public static void main(String[] args) {
        System.out.println(generate(10));
    }
}