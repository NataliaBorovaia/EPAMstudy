package com.learning;

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

    public void printMoto() {
        System.out.println("Now or never");
    }

   /*
     Bottle mybottle = new Bottle()
    {
       public void printMoto()
     {
       System.out.println("Anomymous example moto");
    }
    };
    */


}


