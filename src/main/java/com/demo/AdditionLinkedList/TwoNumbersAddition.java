package com.demo.AdditionLinkedList;

public class TwoNumbersAddition {
	public LinkedList listX;
	public LinkedList listY;
	

	
	public TwoNumbersAddition(String x, String y) {
		this.listX = GetList(x,new LinkedList());
		this.listY = GetList(y,new LinkedList());
	}
	
	public LinkedList GetList(String str, LinkedList list) {
		
		for(int i = 0; i < str.length(); i++) {
			list.AddListNodeHead(new LinkedList.ListNode(Integer.parseInt(String.valueOf(str.toCharArray()[i]))));
		}
		
		return list;
		
	}
	
	public LinkedList listResult() {
		LinkedList.ListNode currentNodeX = listX.head;
		LinkedList.ListNode currentNodeY = listY.head;
		LinkedList listResult = new LinkedList(); 
		
		int res = 0;
		
		
		while(currentNodeX != null || currentNodeY != null) {
			int val1 = currentNodeX != null ? currentNodeX.val : 0;
			int val2 = currentNodeY != null ? currentNodeY.val : 0;
			
			int sum = val1 + val2 + res;
			
			if(sum > 9) {
				res = 1;
				sum = sum - 10;
				listResult.AddListNodeHead(new LinkedList.ListNode(sum));
			}
			else {
				listResult.AddListNodeHead(new LinkedList.ListNode(sum));
				res = 0;
			}
			
			currentNodeX = currentNodeX != null ? currentNodeX.next : currentNodeX;
			currentNodeY = currentNodeY != null ? currentNodeY.next : currentNodeY;
			
		}
		
		if (res > 0) {
			listResult.AddListNodeHead(new LinkedList.ListNode(res));
		}
		return listResult;
		
		
	}
}
