package lintcode;

import constant.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alfred.zhang
 * @date 2021/8/12
 *
 * 反转链表
 */
public class ReverseList {

    public static List<Integer> reverseStore(ListNode head) {
        // write your code here
        List<Integer> tempList = new ArrayList<>();
        if(head == null) {
            return tempList;
        }

        if(head.next == null) {
            tempList.add(head.val);
            return tempList;
        }

        ListNode pre = head;
        ListNode cur = head.next;
        ListNode temp = head.next.next;
        while(cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = null;

        List finalList = new ArrayList<>();
        while(pre != null) {
            finalList.add(pre.val);
            pre = pre.next;
        }

        return finalList;
    }

    public static ListNode reverseList (ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode temp = head.next.next;
        while(cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = null;

        return pre;
    }

    /**
     * 给定一个链表，一次反转链表 k 的节点并返回其修改后的列表。
     * 如果节点的数量不是k的倍数，那么最后遗漏的节点应该保持原样。
     * 不能更改节点中的值，只能更改节点本身。
     * 只允许使用常量内存。
     */
    public static ListNode reverseKGroup(ListNode head, int k) {
        // write your code here
        if (head == null || head.next == null || k < 2) {
            return head;
        }

        ListNode first, preFirst, last, cur, reverse, resultNode;
        first = preFirst = last = cur = reverse = resultNode = head;

        boolean firstFlag = true;
        while (cur != null) {
            first = cur;
            for (int i = 0; i < k-1; i++) {
                if (cur == null) {
                    break;
                }
                cur = cur.next;
            }
            if (cur == null) {
                if (firstFlag) {
                    return head;
                } else {
                    preFirst.next = first;
                }
            } else {
                last = cur;
                cur = cur.next;
                last.next = null;
                reverse = reverseList(first);

                if (firstFlag) {
                    resultNode = reverse;
                    firstFlag = false;
                } else {
                    preFirst.next = reverse;
                }
            }
            preFirst = first;

        }

        return resultNode;
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        return;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
//        ListNode node7 = new ListNode(7);
//        ListNode node8 = new ListNode(8);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = node8;

        printList(node1);
        ListNode head = reverseKGroup(node1, 2);
        printList(head);

    }
}
