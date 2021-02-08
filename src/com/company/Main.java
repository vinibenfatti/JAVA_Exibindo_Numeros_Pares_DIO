package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int num =0;

        num = ler.nextInt();

        for (int i = 1 ; i <=num  ; i++) {
            if(i % 2==0)
            {
            System.out.println(i);
            }
        }
    }
}
