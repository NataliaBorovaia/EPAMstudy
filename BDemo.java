package com.learning;

public class BDemo {

    static int Quantity;


    public static void main(String[] args) {
        Bottle bottle = new Bottle(500, "Vottler", 55, false);

        //   System.out. println(bottle.volume);````
        System.out.println(String.format("TOP hit brand %s, %s ml", bottle.brand, bottle.volume));

        Babybottle babybottle = new Babybottle(150, "NUK", 500, true);
        System.out.println(String.format("TOP hit brand %s, %s ml", babybottle.brand, babybottle.volume));

        Sportbottle sportbottle = new Sportbottle(800, "Vottler", 500, false);
        System.out.println(String.format("TOP HIT SPORTSHAKER brand %s, %s ml", sportbottle.brand, sportbottle.volume));
        // add nested class
        Sportbottle.Straw straw = sportbottle.new Straw();
        straw.up();
        //Static Inner Class usage example
        Sportbottle.Mockup mockup1 = new Sportbottle.Mockup();
        Sportbottle.Mockup.MockupDesc();



        Papboat papboat = new Papboat(150, "Avent", 79, false);
        System.out.println(String.format("HOT SALE 2022 brand %s, %s ml", papboat.brand, papboat.volume));
        // System.out.println(babybottle.brand);

        // public String getBarcode('400PL') {
        System.out.println(babybottle.getBarcode(babybottle.brand));



    }
}
