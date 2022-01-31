package practice.akashumate.driver;

import java.util.ArrayList;
import java.util.Collections;

import practice.akashumate.service.FindLongestPath;
import practice.akashumate.service.Node;

public class DriverTree {

	public static void main(String[] args) {
		
		Node root = new Node(100);
		root.leftNode = new Node(20);
		root.rightNode = new Node(130);
		root.leftNode.leftNode = new Node(10);
		root.leftNode.rightNode = new Node(50);
		root.rightNode.leftNode = new Node(110);
		root.rightNode.rightNode = new Node(140);
		root.leftNode.leftNode.leftNode = new Node(5);
		
		ArrayList<Integer> output = FindLongestPath.findLongestPath(root);
		
		int size = output.size();
		
		System.out.print("Longest path is: "+output.get(size - 1));
		for(int i=size-2; i>=0; i--) {
			System.out.print("->"+output.get(i));
		}
		System.out.println();
		System.out.println("Before Reverse: "+output.toString());
		Collections.reverse(output);
		System.out.println("After Reverse: "+output.toString());
	}

}
