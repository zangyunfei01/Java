package containerTest;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<String>();
        System.out.println("peek方法获取队列头部元素:" + linkedList.peek());
        linkedList.add("a");
        System.out.println("poll方法获取队列元素并删除：" + linkedList.poll());
        linkedList.add("b");
        linkedList.offer("c");
        linkedList.offer("d");
        for (String q : linkedList) {
            System.out.println("队列中的元素为：" + q);
        }
        linkedList.offer("e");
        System.out.println("队列头部的元素为：" + linkedList.element());
        System.out.println("队列中的元素为：" + linkedList);

    }
}
