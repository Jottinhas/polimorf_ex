package application;

import entities.Employees;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees? ");
        int n = sc.nextInt();

        List<Employees> list = new ArrayList<>();

        for (int i = 0; i<n; i++){
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            sc.nextLine();
            char resp = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (resp == 'y'){
               System.out.print("Addtional charge: ");
               double add = sc.nextDouble();
               list.add(new OutSourcedEmployee(name, hours, valuePerHour, add));
            } else {
                list.add(new Employees(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employees emp : list){
            System.out.println(emp.getName() + " - " + "$ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
