package com.codegym;


public class Main {

    public static void main(String[] args) {
        System.out.println("Printing all prime smaller than 100");
        int limit = 100;
        int N = 2;
        for (int j = 1; j < limit; j++) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(N);
            }
            N++;
        }
    }
}
