package com.ctwokm.test;

public class TestOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 6;
		for (int i = 0; i < 5; i++) {
			m--;
			for (int j = 0; j < m; j++) {
				System.out.println(i+1+"#"+(j+1));
			}
		}
		int q = 13;
		for (int i = 0; i < 5; i++) {
			q = q - 2;
			for (int j = 0; j < q; j++) {
				System.out.println(i+1+"#"+(j+1));
			}
		}
	}

}
