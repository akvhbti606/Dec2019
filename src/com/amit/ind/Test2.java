package com.amit.ind;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String A = T;
		// String C = G;

		// GTCAG - > GACTG
		// CTGAC

		StringBuilder sb = new StringBuilder("GTCAG");
		sb = sb.reverse();
		int l = sb.length();
		for (int i = 0; i < l; i++) {
			char c = sb.charAt(i);
			switch (c) {
			case 'A':
				sb.setCharAt(i, 'T');break;
			case 'T':
				sb.setCharAt(i, 'A');break;
			case 'C':
				sb.setCharAt(i, 'G');break;
			case 'G':
				sb.setCharAt(i, 'C');break;
			}

		}
		System.out.println(sb);
	}

}
