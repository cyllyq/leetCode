import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */

public class GetRow {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (rowIndex==0){
            return list;
        }else if (rowIndex==1){
            list.add(1);
            return list;
        }else{
            List<Integer> preList = getRow(rowIndex-1);
            for (int x=1; x<=rowIndex; x++){
                if (x==rowIndex){
                    list.add(1);
                }else{
                    list.add(preList.get(x-1)+preList.get(x));
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
