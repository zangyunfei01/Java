package container.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        System.out.println("使用peek方法，返回集合中的第一个元素：" + queue.peek());
        System.out.println("使用poll方法，返回集合中的第一个元素并删除：" + queue.poll());
        queue.add("a");
        for (String q : queue) {
            System.out.println("集合中的元素为" + q);
        }
        queue.add("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for (String q : queue) {
            System.out.println("集合中的元素为" + q);
        }
        System.out.println("使用peek方法，返回集合中的第一个元素：" + queue.element());
        System.out.println("使用revome方法，获取队列头部元素，并删除该元素：" + queue.remove());
        for (String q : queue) {
            System.out.println("集合中的元素为" + q);
        }
    }
}
