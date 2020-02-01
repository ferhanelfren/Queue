/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author GOD
 */
public class Body {
    
    Scanner scan;
	Queue queue;
    
    
     void insert() {
		int n;
	
         scan = new Scanner(System.in);
         queue = new LinkedList<>();
		
		System.out.println("Peek head of the Queue");
		
		System.out.println("\nEnter 'n' value :");
		n = scan.nextInt();
		
		System.out.println("Enter the elements");
		
		for(int i=0; i<n; i++) {
			
			queue.add(scan.next());
		}		 
		
	}
             
             
             void peek() {
		
		System.out.println("\nThe head of this queue, " +
				"or null if this queue is empty");
			
		System.out.println(queue.peek());
	}
    
}
