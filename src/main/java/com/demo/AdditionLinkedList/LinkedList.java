package com.demo.AdditionLinkedList;

public class LinkedList{
	
	ListNode head;
	ListNode tail;
	
	public static class ListNode {
		public int val;
		public ListNode next;
		
		public ListNode(int val) {
			this.val = val;
			this.next = null;
		}
		
	}
	
	public void AddListNodeTail(ListNode node) {
		
		if(tail == null) {
			head = node;
			tail = node;
		}else {
			tail.next = node;
			tail = tail.next;
		}
		
		
		
	}
	
	public void AddListNodeHead(ListNode node) {
		
		if(head == null) {
			head = node;
			tail = node;
		}else {
			node.next = head;
			head = node;
		}
		
		
		
	}
	
	public void printList() {
		ListNode node = head;
		
		while(node != null) {
			System.out.print(node.val);
			node = node.next;
		}
	}
}
