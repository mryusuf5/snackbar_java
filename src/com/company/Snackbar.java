package com.company;

public class Snackbar {
    private Snack[] snacks;
    private double totalRevenue;

    public Snackbar()
    {
        snacks = new Snack[3];

        snacks[0] = new Snack("frikandel", 2.50, 10);
        snacks[1] = new Snack("kroket", 1.50, 10);
        snacks[2] = new Snack("loempia", 4.00, 10);
    }

    public void displaySnacks()
    {
        for (Snack snack: snacks)
        {
            System.out.println(snack.displaySnack());
        }
    }

    public Snack getSnack(int snackChoice)
    {
        return this.snacks[snackChoice];
    }
}
