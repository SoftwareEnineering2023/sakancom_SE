package com.example.demo1;

public class TESTINPUT {

    public static boolean PriceTest(String price) {
        boolean g=false;
        int num = Integer.parseInt(price);
        if(num>0) g=true;

        if ( price.length() >0) {
            boolean flag = true;
            for(int i=0;i<price.length();i++){
                if(!Character.isDigit(price.charAt(i))){
                    flag = false ;
                    break;
                }
            }
            return (flag&&g);
        }
        return false;
    }

    public static boolean housePictureTest(String string2) {
        return (string2.indexOf(".png")!=-1 || string2.indexOf(".jpg")!=-1) ;
    }

    public static boolean houseServicesTest(String services) {
        boolean flag = true;
        for (int i = 0; i < services.length(); i++) {
            if (Character.isDigit(services.charAt(i))) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean houseBedroomTest(String string2) {
        return  TESTINPUT. PriceTest(string2);

    }
    public static boolean houseBathroomTest(String string2) {
        return  TESTINPUT. PriceTest(string2);
    }
    public static boolean houseBalconyTest(String string2) {
        int num = Integer.parseInt(string2);
        if(num==0)
            return true;
       return TESTINPUT. PriceTest(string2);
        }


    public static boolean houseNumberTest(String string2) {
        if(string2.length()==7) {
            if (Character.isDigit(string2.charAt(0)))
                if(Character.isDigit(string2.charAt(1)))
                   if( Character.isDigit(string2.charAt(2))|| (string2.charAt(2)=='G')||(string2.charAt(2)=='B')||(string2.charAt(2)=='g')||(string2.charAt(2)=='b'))
                       if(Character.isDigit(string2.charAt(3)))
                           if(Character.isDigit(string2.charAt(4)))
                               if(Character.isDigit(string2.charAt(5)))
                                   if(Character.isDigit(string2.charAt(6)))
                                       return true;
        }
        return false;
    }
}
