package crtamojelku;

import java.util.Scanner;

public class CrtamoJelku {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite velicinu jelke:");
        int a;
        a = s.nextInt();


        for (int i = 1; i < a; i++) {
            for (int j = 1; j < a - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }

            for (int e = 1; e < a - i; e++) {
                System.out.print("  ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("  ");
            }
            for (int f = 1; f < a - i; f++) {
                System.out.print("  ");
            }

            for (int r = 0; r < i; r++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}