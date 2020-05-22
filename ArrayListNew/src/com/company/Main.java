package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

       String[] strArray = new String[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();

        int count = 0;
        while (count <10) {
            count++;
            if(count <=6) {
                stringArrayList.add(scanner.next());
                System.out.println(stringArrayList);
                continue;
            }
            if (count >=7) {
                System.out.println("Enough");
                break;
            }
            }

        }

    }

