package com.company;

public class Main {

    public static void main(String[] args) {
    Item item = new Item("1","one","pensil");

        System.out.println(item.toString());

        System.out.println(item.toXML());

        System.out.println(item.toJSON());

        int myAge = 20;
        String permision0;
        if (myAge > 18 ){
            permision0 = "Adoult";
        }else {
           permision0 = "No";
        }

        String permision = (myAge > 18) ? "Adoult" : "No Adoult";

    }
}
