package com.company;

import java.util.Scanner;
public class Main {
    static String[] operator = {"+","-","*","/",";",",","(",")"};
    static String[] con = {"then","if","else","while","do","for"};
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String test = input.nextLine();
		int len = test.length()-1;
		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) == '0') {//字符串以0开头，一定是数字
				if (i < len && test.charAt(i + 1) == 'x') {//如果第二个数是x则一定是十六进制
					String hex =  "";
					i += 2;

					while ((i <= len && test.charAt(i) >= '0' && test.charAt(i) <= '9')||(i <= len && test.charAt(i) >= 'a' && test.charAt(i) <= 'f')) {
						hex += test.charAt(i) + "";
						i++;
					}
					System.out.println("<3," + hex + ">");
				}
				if (i < len && test.charAt(i + 1) >= '1' && test.charAt(i + 1) <= '9') {//如果第二个数是数字则一定是八进制
					String octal = "";

					i += 1;

					while(i <= len && test.charAt(i) >= '0' && test.charAt(i) <= '9') {
					    octal += test.charAt(i) + "";
					    i++;
                    }
                    System.out.println("<2," + octal + ">");
				}
				if((i + 1 >= len) || test.charAt(i+1) <= '0' || test.charAt(i+1) > '9') {
				    System.out.println("<1,0>");
				    i++;
                }
			}
			else if (test.charAt(i) <= '9' && test.charAt(i) >= '1') { //如何第一位是1到9的数字，则一定是十进制
				String d = "";
				while(i <= len && test.charAt(i) <= '9' && test.charAt(i) >= '1') {
					d += test.charAt(i) + "";
					i++;
				}
				System.out.println("<1," + d + ">");
			}
			else {
			    String st = test.charAt(i) + "";
			    while(i <= len) {
			        boolean op = false;
			        if(isOperation(st)){
			            System.out.println(st);
			            st = "";
                    }
                    /*else {
                        if(!st.equals(" ") && !isInteger(st))
                    }*/
                    i++;
                }
            }

		}
	}

	public static boolean isOperation(String st) {
        for(int j = 0;j < operator.length;j++) {
            if(st.equals(operator[j])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInteger(char  ch) {
        if(ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }
}
