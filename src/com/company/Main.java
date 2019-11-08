package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] names = new String[3];
        names[0] = "Айданек";
        names[1] = "Дария";
        names[2] = "Эмирлан";
        for (int i = 0; i < names.length; i++) {
            switch (i) {

                case 0:

                    System.out.println("Доброе утро," + " " + names[0]);
                    break;
                case 1:
                    System.out.println("Добрый день," + " " + names [1]);
                    break;
                case 2:
                    System.out.println("Добрый вечер," + names [2]);
                    break;



            }
        }
    }
}