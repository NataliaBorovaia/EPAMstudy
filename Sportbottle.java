package com.learning;

public class Sportbottle extends Bottle {
    Sportbottle(int volume, String brand, float price, boolean hasBox) {
        super(volume, brand, price, hasBox);
    }

    public class Straw {

        public void up() {
            System.out.println("Straw is up");
        }
        public void down() {
            System.out.println("Straw is down");
        }
    }

    public static class Mockup {

        public static void MockupDesc() {

            System.out.println("Check the m0ckup in Download folder");
        }
    }
}



