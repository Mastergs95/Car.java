package com.skillsoft.classesandobjects;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String [] args){

        Product phone =new Product(12345,"iphone 6s",
        500, "Mobile");

        Product anotherPhone =new Product(12345,"iphone 6s",
                500, "Mobile");

        Product tv =new Product(23,"Samsung",
                500, "Tv");

        System.out.println(phone.toString());
        System.out.println(tv.toString());

        System.out.println();

        Product phoneCopy=phone;
        Product tvCopy=tv;


        System.out.println("phone==phoneCopy: " + (phone==anotherPhone));
        System.out.println("phone==phoneCopy: " + (phone.equals(anotherPhone)));

        System.out.println("\nWith hashCode(): ");
        System.out.println("phone: " + phone.hashCode());
        System.out.println("phone copy: " + phoneCopy.hashCode());


    }
}
