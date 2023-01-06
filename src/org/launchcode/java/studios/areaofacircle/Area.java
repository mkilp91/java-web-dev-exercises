package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        boolean isDouble = input.hasNextDouble();
        if (isDouble){
            double radius = input.nextDouble();
            while (radius < 0){
                System.out.println("Radius must be positive. ");
                System.out.println("Enter the radius: ");
                radius = input.nextDouble();
            }
            double area = Circle.getArea(radius);
            System.out.println("The area is: " + area);
        } else {
            System.out.println("Radius must be a number.");
        }

//        try {
//            double radius = input.nextDouble();
//        } catch (Exception e){
//            System.out.println();
//            System.exit(1);
//        }

//        double area = Math.PI * radius * radius;

//        if (radius >= 0){
//        System.out.println("The area is: " + Circle.getArea(radius));
//        } else {
//            System.out.println("Your radius is not rad. Try again...");
//        }

        input.close();
    }
}
