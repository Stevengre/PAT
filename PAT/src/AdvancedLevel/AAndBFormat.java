package AdvancedLevel;

import java.util.Scanner;

public class AAndBFormat {
	static public void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a + b;
		String string = "";
		string = String.valueOf(c);//将int性可以直接转化为string类型
		char[] ch =	string.toCharArray();//将string对象转化为char数组
		string = "" + ch[0];
		for (int i = 1; i < ch.length; i++) {
			if ((ch.length-i)%3 == 0 && ch[i-1] != '-') {
				string = string + "," + ch[i];
			}else {
				string = string + ch[i];
			}
		}
		System.out.println(string);
	}
}
