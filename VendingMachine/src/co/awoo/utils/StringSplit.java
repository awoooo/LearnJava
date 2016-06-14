package co.awoo.utils;

public class StringSplit {

	public static void main(String[] args) {
		String foodStr = "rice,20,15.5; noodle,20,7";
		String[] tmp = strSplit(foodStr, 3);
		float[] tmpPrice = str2floatArr( strSplit(foodStr, 3));
		for (int i=0; i<tmp.length; i++) {
			System.out.println(tmpPrice[i]);
		}
	}

	private static String[] strSplit( String str, int position) {
		String[] firstArr;
		firstArr = str.replaceAll(" ", "").split(";");
		int count = firstArr.length;
		String[] strArr = new String[count];
		for (int i=0; i<count; i++) {
			String[] secondArr = firstArr[i].split(",");
			strArr[i] = secondArr[position - 1];
		}
		return strArr;
	}

	private static int[] str2intArr( String[] str) {
		int count = str.length;
		int[] num = new int[count];
		for (int i=0; i<count; i++) {
			try {
				num[i] = Integer.parseInt( str[i]);
			} catch(Exception e){
				num[i] = 0;
			}
		}
		return num;
	}

	private static float[] str2floatArr( String[] str) {
		int count = str.length;
		float[] num = new float[count];
		for (int i=0; i<count; i++) {
			try {
				num[i] = Float.parseFloat( str[i]);
			} catch(Exception e){
				num[i] = 0;
			}
		}
		return num;
	}
}
