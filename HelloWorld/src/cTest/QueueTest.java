package cTest;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<String>();
        System.out.println("peek方法获取队列头部元素:" + linkedList.peek());
        linkedList.add("a");
        for (String q : linkedList) {
            System.out.println("队列中的元素为：" + q);
        }
        System.out.println("poll方法获取队列元素并删除：" + linkedList.poll());
        linkedList.add("b");
        linkedList.offer("c");
        for (String q : linkedList) {
            System.out.println("队列中的元素为：" + q);
        }
        linkedList.offer("d");
        linkedList.offer("e");
        System.out.println("队列头部的元素为：" + linkedList.element());
        System.out.println("队列中的元素为：" + linkedList);
    }
}
