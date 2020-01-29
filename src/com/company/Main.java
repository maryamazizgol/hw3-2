package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = scanner.nextLine();


        Student1 object1 = new Student1();
        if (name != null && name.equals(object1.name1)) {
            object1.avg();
            object1.vahed();
            object1.salvovoud();
            try {
                object1.mashroti();
            } catch (MashrootEXP e) {
                System.err.println(e.getMessage());
            }
        }

        Student2 object2 = new Student2();
        if (name != null && name.equals(object2.name2)) {
            object2.avg();
            object2.vahed();
            object2.salvovoud();
            try {
                object2.mashroti();
            } catch (MashrootEXP e) {
                System.err.println(e.getMessage());
            }
        }

        Student3 object3 = new Student3();
        if (name != null && name.equals(object3.name3)) {
            object3.avg();
            object3.vahed();
            object3.salvovoud();
            try {
                object3.mashroti();
            } catch (MashrootEXP e) {
                System.err.println(e.getMessage());
            }
        }
        
        if(name != null && !name.equals(object3.name3) && !name.equals(object2.name2) && !name.equals(object1.name1)){
            Mojood a = new Mojood() ;
            try{
                a.notfound();
            } catch (MojoodExp mojoodExp) {
                mojoodExp.printStackTrace();
            }
        }


    }
}
