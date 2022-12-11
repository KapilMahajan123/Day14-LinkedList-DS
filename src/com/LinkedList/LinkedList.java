package com.LinkedList;

/**
 * 
 * @author Kapil
 *
 */
public class LinkedList {
	Node head;	//head of list
	
	/* Linked list Node*/
	class Node {	
		Object data; 
		Node next;	//reference to next object in the sequence
		Node(Object data) 
		{	
			this.data = data;
		}
	}
	/*
	 * Create list method
	 * create new node to be added
	 */
	public void addFirst(Object data) 
		{
			Node newNode = new Node(data);    //new node with given data 
			newNode.next = head;
			head = newNode;
		}
	public void display()
		{
			Node temp = head;
			while(temp!=null)
			{
				if(temp.next != null)
					System.out.print(temp.data+" > ");
				else
					System.out.print(temp.data);
				temp = temp.next;

			}
		}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Welcome to Linked List Problem");
		list.addFirst(70);
		list.display();
		list.addFirst(30);
		list.display();
		list.addFirst(56);
		list.display();
		
	}

}
