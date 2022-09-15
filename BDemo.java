package com.epam.hometask.oop;

public class BDemo {
    static int Quantity;


    public static void main(String[] args) {
        Bottle bottle = new Bottle(500, "Vottler", 55, false);

        //   System.out. println(bottle.volume);
        System.out.println(String.format("TOP hit brand %s, %s ml", bottle.brand, bottle.volume));

        Babybottle babybottle = new Babybottle(150, "NUK", 500, true);
        System.out.println(String.format("TOP hit brand %s, %s ml", babybottle.brand, babybottle.volume));

        Sportbottle sportbottle = new Sportbottle(800, "Vottler", 500, false);
        System.out.println(String.format("TOP HIT SPORTSHAKER brand %s, %s ml", sportbottle.brand, sportbottle.volume));

        Papboat papboat = new Papboat(150,"Avent", 79,false);
        System.out.println(String.format("HOT SALE 2022 brand %s, %s ml", papboat.brand, papboat.volume));
        // System.out.println(babybottle.brand);

       // public String getBarcode('400PL') {
        System.out.println(babybottle.getBarcode(babybottle.brand));


    }

}


package com.epam.hometask.oop;

        import javax.swing.*;

//the parent class for my custom object
public class Bottle {
    protected float price;
    protected boolean hasBox;
    int volume;
    String brand;
    static boolean Availability;
    static final boolean isDiscontinued = false;

    // default constructor
    public Bottle() { System.out.println("Bottle()"); }

    //constructor with parameters initialized with 'this'
    public Bottle(int volume, String brand, float price, boolean hasBox) {
        // System.out.println("Bottle(v, b)");
        this.volume = volume;
        this.brand = brand;
        this.price = price;
        this.hasBox = hasBox;
    }

    //constructor with string parameter
    public Bottle(String brand) {
        System.out.println("Bottle(v)");
        this.volume = volume;
    }

    static void print() {
        System.out.println(Availability);
    }

    protected static void collect() {
        System.out.println("Collect started");
    }

    public String getBarcode(String brand) {
        return brand + "00";
    }
}

package com.epam.hometask.oop;

// create inherited object
public class Babybottle extends Bottle {

    Babybottle(int volume, String brand, float price, boolean hasBox) {
        super(volume, brand, price, hasBox);
    }
    public Babybottle() { System.out.println("Babybottle()"); }

}

package com.epam.hometask.oop;

public class Sportbottle extends Bottle {
    Sportbottle(int volume, String brand, float price, boolean hasBox) {
        super(volume, brand, price, hasBox);
    }
}

package com.epam.hometask.oop;

public class Papboat extends Babybottle {
    Papboat(int volume, String brand, float price, boolean hasBox) {
        super(volume, brand, price, hasBox);
    }
}

