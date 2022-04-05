/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museuminput;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class MuseumInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        Scanner stdIn = new Scanner(System.in);

        int students, smallShirts, mediumShirts, largeShirts,
                extraLargeShirts, pencils, erasers, notepads, bouncyBalls, dinosaurToys;

        double smallShirtPrice, mediumShirtPrice, largeShirtPrice, extraLargeShirtPrice, pencilPrice,
                eraserPrice, notepadPrice, bouncyBallPrice, dinosaurToyPrice, totalTourPrice, totalGoodyBagPrice,
                goodyBagPrice, adminCosts, subTotalPrice;

        System.out.println("Science Museum Sales Part 2 by Kevin Bell");
        System.out.print("How many students are on this tour? ");

        //prompt user input
        students = stdIn.nextInt();
        System.out.print("How many small T-shirts do you need? ");
        smallShirts = stdIn.nextInt();
        System.out.print("How many medium T-shirts do you need? ");
        mediumShirts = stdIn.nextInt();
        System.out.print("How many large T-shirts do you need? ");
        largeShirts = stdIn.nextInt();
        System.out.print("How many extra-large T-shirts do you need? ");
        extraLargeShirts = stdIn.nextInt();
        //input
        pencils = students;
        erasers = students;
        notepads = students;
        bouncyBalls = students;
        dinosaurToys = students;
        smallShirtPrice = 5.00;
        mediumShirtPrice = 5.50;
        largeShirtPrice = 6.00;
        pencilPrice = 0.25;
        eraserPrice = 1.00;
        notepadPrice = 1.00;
        bouncyBallPrice = 1.25;
        dinosaurToyPrice = 0.75;

        //do the work
        dinosaurToys = dinosaurToys * 2;
        subTotalPrice = (smallShirts * smallShirtPrice) + (mediumShirts * mediumShirtPrice)
                + (largeShirts * largeShirtPrice) + (pencils * pencilPrice) + (erasers * eraserPrice)
                + (notepads * notepadPrice) + (bouncyBalls * bouncyBallPrice)
                + (dinosaurToys * dinosaurToyPrice);
        adminCosts = subTotalPrice * 0.3;
        totalTourPrice = subTotalPrice + adminCosts;

        //output
        System.out.print("Total tour cost = $" + totalTourPrice + " \n");
    }

}
