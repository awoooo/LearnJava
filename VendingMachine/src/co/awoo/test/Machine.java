package co.awoo.test;

import co.awoo.utils.*;

public class Machine {
	public static void main(String[] args) {
		String foodStr = "rice,20,15.5; noodle,20,7";
		Machine m = new Machine();

		String[] tmp = StringSplit.strSplit(foodStr, 1);
		float[] tmpPrice = StringSplit.str2floatArr( StringSplit.strSplit(foodStr, 3));
		for (int i=0; i<tmp.length; i++) {
			System.out.println(tmp[i]);
		}	
	}
}
