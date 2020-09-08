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



        Window window = new Window(30,40,5,"Wood",3,2,"Защолка");
        window.setWidth(50);
        System.out.println(window.getArrea());
        System.out.println(window.toString());

    }
}

//від класу Rectangle створити свій клас
//стіл, двері, стіна, підлога, криша, город, монітор.
