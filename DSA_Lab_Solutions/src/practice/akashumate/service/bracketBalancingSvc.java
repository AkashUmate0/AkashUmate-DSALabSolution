package practice.akashumate.service;

import java.util.Stack;

public class bracketBalancingSvc {
	public static boolean isBracketBalanced(String bracketExp) {
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<bracketExp.length(); i++) {
			char character = bracketExp.charAt(i);
			
			if(character == '(' || character == '[' || character == '{') {
				stack.push(character);
				continue;
			}
			
			if(stack.isEmpty()){
				return false;
			}
			
			char c=stack.pop();
			
			switch(character) {
			case '}':
				if(c !='{')
					return false;
				break;
				
			case ')':
				if(c !='(')
					return false;
				break;
				
			case ']':
				if(c !='[')
					return false;
				break;
			default: return false;
			}
		}
		return (stack.isEmpty());
	}
}
