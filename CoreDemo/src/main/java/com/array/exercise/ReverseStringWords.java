package com.array.exercise;

import java.util.Arrays;

public class ReverseStringWords {

	public static void main(String[] args) {
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.

//		String s = "komal";
//		char[] c = s.toCharArray();
//		char[] c1 =new char[c.length];
//		
//		System.out.println(Arrays.toString(c));
//		int k=0;
//		for(int i=c.length-1; i>=0; i--) {
//			c1[k]=c[i];
//			k++;
//		}
//		String komal = new String(c1);
//		System.out.println(komal);

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
//		String s1 = "komal yashawant korane";
//		String[] s2 = s1.split(" ");
//		System.out.println(Arrays.toString(s2));
//		String[] c1 = new String[s2.length];
//		int k1 = 0;
//		for (int i = s2.length - 1; i >= 0; i--) {
//			c1[k1] = s2[i];
//			k1++;
//		}
//		System.out.println(Arrays.toString(c1));

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//	String str = "komal yashawant korane";
//	str=str.replaceAll(" ", "");
//	char[] ch = str.toCharArray();
//	char[] ch1 = new char[ch.length];
//	int k3=0;
//	for(int i=ch.length-1; i>=0; i--) {
//		ch1[k3]=ch[i];
//		k3++;
//	}
//	String name = new String(ch1);
//	System.out.println(name);

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>..............

		String r = "komal yashawant korane";
		String[] f = r.split(" ");

		String name = "yashawant";
		String reverse = "";

		for (int i = 0; i < f.length; i++) {
			if (name.equalsIgnoreCase(f[i])) {
				StringBuffer b = new StringBuffer(f[i]);
				b.reverse();

				reverse = reverse + b + " ";

			} else {
				reverse = reverse + f[i] + " ";
			}

		}

		System.out.println(reverse);
	}
}
