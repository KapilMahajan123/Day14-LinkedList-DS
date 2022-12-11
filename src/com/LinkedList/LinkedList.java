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
	public void CreatList(Object data) {
		Node newNode = new Node(data);    //new node with given data 
		System.out.print(newNode.data + " ");  //print data at current node

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Welcome to Linked List Problem");
		list.CreatList(56);  
		list.CreatList(30);
		list.CreatList(70);
	}

}
