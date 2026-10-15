package com.kodewala.oops;

public class CopyTest {
	    public static void main(String[] args) {
	        int[] a = {10, 20, 30};
	        int[] b = a;
	        int[] c = java.util.Arrays.copyOf(a, a.length);

	        a[0] = 999;
	        

	        System.out.println(b[0]);
	        System.out.println(c[0]);
	    
	}
}
