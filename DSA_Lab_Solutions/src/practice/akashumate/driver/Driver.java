package practice.akashumate.driver;

import practice.akashumate.service.bracketBalancingSvc;

public class Driver {

	public static void main(String[] args) {
		String bracketExp = "({[]})";
		Boolean result;
		result = bracketBalancingSvc.isBracketBalanced(bracketExp);
		System.out.println("bracketExp: "+bracketExp);
		if(result) {
			System.out.println("The entered String has Balanced Brackets");
		}else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		
	}

}
