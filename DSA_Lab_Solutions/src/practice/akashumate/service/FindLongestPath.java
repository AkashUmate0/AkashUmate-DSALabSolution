package practice.akashumate.service;

import java.util.ArrayList;

public class FindLongestPath {
	
	public static ArrayList<Integer> findLongestPath(Node root) {
		
		if(root == null) {
			ArrayList<Integer> output = new ArrayList<>();
			return output;
		}
		ArrayList<Integer> rightNode = findLongestPath(root.rightNode);
		ArrayList<Integer> leftNode = findLongestPath(root.leftNode);
		
		if(rightNode.size() < leftNode.size()) {
			leftNode.add(root.nodeData);
		}else {
			rightNode.add(root.nodeData);
		}
		
		return (leftNode.size() > rightNode.size() ? leftNode : rightNode);
	}
}
