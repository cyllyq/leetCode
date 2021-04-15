import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-stack
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class MinStack {

    Deque<Integer> queue;
    Deque<Integer> minQueue;

    /** initialize your data structure here. */
    public MinStack() {
        queue = new LinkedList<>();
        minQueue = new LinkedList<>();
        minQueue.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        queue.push(val);
        minQueue.push(Math.min(minQueue.peek(), val));
    }

    public void pop() {
        queue.pop();
        minQueue.pop();
    }

    public int top() {
        return queue.peek();
    }

    public int getMin() {
        return minQueue.peek();
    }

}
