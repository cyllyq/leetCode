import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class IsValid {

    private Map<Character, Character> map = new HashMap(){
        {
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }
    };
    //使用堆栈先入后出的特点
    public boolean isValid(String s){
        List<Character> list = new ArrayList<>();
        list.add(s.charAt(0));
        for (int x=1; x<s.length(); x++){

        }
        return false;
    }

    public static void main(String[] args) {

    }
}
