package com.edanurgider.javalearning;

public class Statements {
    public static void main(String[] args) {


        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x*5;
        System.out.println(x);

        int y = 4 ;

        System.out.println(x>y);
        System.out.println(y>x);

        y = 30 ;

        System.out.println(x>y);  // x y den büyük mü diye soruyor
        System.out.println(x>=y);  // x y ye esitmi diye soruyor
        System.out.println(x==y);   // x=y yapamayiz, o zaman x i y ile esitleme yapar.esitmi diye bakmak icin 2 tane esittir koy
        System.out.println(x!=y);  // x y ye esit degil kontrol et demek

        // and &&  ve islemi
        // or ||   veya islemi

        x = 30 ;
        y = 30 ;
        int z = 5 ;

        System.out.println(x<y && y<z);  // iki tarafta dogru ise true verir

        System.out.println(x<y && y>z);  // bir tarafi dogru diger tarafi yanlis false verir

        System.out.println(x<y || z<y);  // veya isleminde bir tarafin dogru olması yeterli true verir

        // if statements   eger islemi

        if (x<y) {  //buradaki parantezin icine kosulu yaz, kosuldan sonra süslü parantez ac her kod blogunun kendi süslü parantez icinde calıstir

            System.out.println("y is bigger");

        }else if (y<x) {  // else if ise eger y x den kücük ise sunu yap demek icin kullanilir
            System.out.println("x is bigger");
        }else {  // hicbiri degilse sadece else yazilmali
            System.out.println("x = y");
                }

        //switch degistirmek

        int day = 3 ;
        String dayString = "";

        /*
        if (day==1){
            dayString="Monday";
        } else if (day==2){
            dayString="Tuesday";
        } else if (day==3) {
            dayString = "Wednesday";
        }else {
                dayString = "Sunday";

            }
        */

        // bir kod blogunu toplu not olarak durması icin silmemek icin /* ile */ arasına koy
        switch (day){              // if ile yapilani switch ile yapmak

            case 1:
                dayString="Monday";
                break;            //break kod blogunu durdur demek
            case 2:
                dayString="Tuesday";
                break;
            case 3:
                dayString="Wednesday";
            default:
                dayString= "Sunday";
                break;

        }
            System.out.println(dayString);

    }

        }


