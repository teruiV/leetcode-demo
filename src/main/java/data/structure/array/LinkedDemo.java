package data.structure.array;

/**
 * @description: <p>链表相关练习</p>
 * @author: terui
 * @date: 2020/9/2 9:01 下午
 */
public class LinkedDemo {
    private static class ListNode {
        /**
         * 链表当前值
         */
        int val;

        /**
         * 链表指针，指向下一个节点
         */
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * # 19 删除链表倒数第N个节点(给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点)
     * 给定一个链表: 1->2->3->4->5, 和 n = 2.
     * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
     *
     * @param head 链表头结点
     * @param n    倒数第n个数字移除
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        /**
         * 哨兵节点
         */
        pre.next = head;

        ListNode start = pre;
        ListNode end = pre;
        while (n > 0) {
            start = start.next;
            n--;
        }
        while (start.next != null) {
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }

}
