package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive(String[] args) {
        System.out.println("Bus goes into Dreamland.");
    }

    @Override
    public void passenger(String[] args) {
        int psngsNmbr = 0;
        System.out.println("Bus have " + psngsNmbr + " passengers.");
    }

    @Override
    public int fill(String question) {
        int fuel = 0;
        int price = 0;
        System.out.println("We need in " + fuel + "l. fuel, please pay " + price + " coins");
        return price;
    }
}
