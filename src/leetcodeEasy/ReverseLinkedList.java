package leetcodeEasy;

public class ReverseLinkedList {
//	Reverse a singly linked list.
	
	public ListNode reverseList(ListNode head) {
		if(head==null){
			return null;
		}
		if(head.next==null){
			return head;
		}
		ListNode temp=reverseList(head.next);
		head.next.next=head;
		head.next=null;
		return temp;
	}
}
