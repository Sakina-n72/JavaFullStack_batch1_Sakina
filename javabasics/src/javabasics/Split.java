package javabasics;

public class Split {
	public static void main(String[] args) {
		System.out.println(mySplit("vineet","n"));
		
	}
	
	static String mySplit(String str,String delimeter) {
		String result="";
		String[] arr = str.split("");
		for(int i = 0; i < str.length(); i++) {
			//result += arr[i]+delimeter;
			if(arr[i].equals(delimeter) == false) {
				//System.out.println();
				result += arr[i];
			}
			else {
				result += " ";
				continue;
			}
		}
		return result;
	}

}
