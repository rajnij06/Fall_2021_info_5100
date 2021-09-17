package com.company;

public class Main {

    public static void main(String[] args)
    {
	    System.out.println("Hello World");
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        max = max+1;
        min = min - 1;

        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);
        System.out.println("Min value = " + min);
        short maxS = Short.MAX_VALUE;
        short minS = Short.MIN_VALUE;

        System.out.println("Max value = " + maxS);
        float myFloat = 6.6f;
        float maxF = Float.MAX_VALUE;
        float minF = Float.MIN_VALUE;
        System.out.println("Max value = " + maxF);
        System.out.println("Min value = " + minF);

        char ch = '\u00A9';
        System.out.println(ch);

        int a=2;
        int b=5;
        int sum;
        sum = a + b;
        System.out.println(sum);


    }
}
