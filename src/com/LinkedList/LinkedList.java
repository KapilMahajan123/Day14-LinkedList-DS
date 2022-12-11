package com.LinkedList;

import java.util.*;

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
	 * ADD - FIRST POSITION
	 * create new node to be added
	 */
	public void addFirst(Object data) 
		{
			Node newNode = new Node(data);    //new node with given data 
			newNode.next = head;
			head = newNode;
		}
	
	 /*
	  * ADD - LAST POSITION
	  * if the linked list empty.
	  * then make the new node as head
	  */
	public void addLast(Object data)
		{
			Node newNode = new Node(data);
			Node temp = head;
			if(head == null) {
			head = newNode;
		}
			
		else
			{
				while(temp.next != null)
				{
					temp = temp.next;
				}
				temp.next = newNode;
			}
		}
	//Add position
	public void addPosition(Object data, int position)
		{
			int index =0;
			Node newNode = new Node(data);
			Node left = head;
			Node right = left.next;
			while(index < (position-1)) //initializing the position to index -1
				{
					left = left.next;
					right = right.next;
					index++;
			
				}
					newNode.next = right;
					left.next = newNode;
		
		
		}
	/*
	 * Display position
	 * No insertion will take place if list empty
	 */
	public void display()
		{
			Node temp = head;
			while(temp!=null)
			{
				if(temp.next != null)
					System.out.print(temp.data+" > ");
				else
					System.out.print(temp.data);
				temp = temp.next;  //Advance to next node in the list

			}
		}
	//Delete position
	public void deleteFirst()
			{
				head = head.next;
			}
	public void deletelast()
		{
			if(head == null)
				System.out.println("List is empty");
			else if(head.next == null)
				head = null;
			else
				{
					Node temp = head;
					while(temp.next.next != null)
					{
						temp = temp.next;
					}
						temp.next= null;
				}
		}
	//Search method
	public Object searhElement(Object input)
			{
		
				Node temp = head;
				int index = 0;
				/*
				 * loop is used to search the entire linked
				 * Gradually increases index while
				 * traversing through the linked list
				 * return result of that particular input
				 */
				while(temp != null)
					{
						index++; 
					if(temp.data == input)
					{
						String result = temp.data+" element found at index " +index;
						return result;
					}
					temp = temp.next;
					}
				return null;
			}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Welcome to Linked List Problem");
		Scanner scanner = new Scanner(System.in);  //create an object
		System.out.println("Adding Nodes At First");
		list.addFirst(56);
		list.display();
		list.addFirst(70);
		list.display();
		list.addFirst(127);
		list.display();
		list.addFirst(65);
		list.display();
		list.addFirst(599);
		list.display();
		list.addFirst(20);
		list.display();
		System.out.println("Enter Position Number To Add:- ");
		int position = scanner.nextInt();
		list.addPosition(30, position);
		list.display();
		
		list.deletelast();
		list.display();
		list.deleteFirst();
		list.display();
		System.out.println();
		System.out.println("enter Element Number To Search: ");
		int input = scanner.nextInt();
		System.out.println(list.searhElement(input));  
		
	}

}
