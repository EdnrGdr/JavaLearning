package com.edanurgider.javalearning;

public class Variables {

    public static void main(String[] args) {
        //Variables
        //Integer
        int age = 20;
        System.out.println(10*age);
        System.out.println(age/5);
        int x = 5;
        int y = 10 ;
        System.out.println(x*y);
        //Double - Float
        double z = 5.0;
        double a = 11.0;
        System.out.println(a/z);
        double pi = 3.14;
        int r = 5;
        System.out.println(2*pi*r);
        //String
        String name = "James";
        String surname = "Hetfield";
        String fullname = name + " " + surname;
        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);

        //Boolean dogru yada yanlis islemi
        boolean isAlive = true;
        isAlive = false ;
        System.out.println(isAlive);

        //Final son degiskenin degeri icin yazilir degerin degismesini istemiyorsak
        int myInteger = 5;
        System.out.println("myInteger:" + myInteger);

        myInteger = 4 ;
        System.out.println("myInteger:" + myInteger);


    }
}
