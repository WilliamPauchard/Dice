/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.github.WilliamPauchard.domaine;

/**
 *
 * @author william.pauchard
 */
public class oldDice {
    public static void main(String[] args) {
        dice();
    }

    public static void dice() {
        System.out.println("Le but est d'obtenir les chiffres suivants avec ces 3 dés : 4, 2, 1");

        while (true) {
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            int dice3 = (int) (Math.random() * 6 + 1);

            if (dice1 == 4 && dice2 == 2 && dice3 == 1) {
                System.out.println("Vous avez gagné : \n Dé n°1 : " + dice1 + " \n Dé n°2 : " + dice2 + " \n Dé n°3 : " + dice3);
                break;
            } else if (dice1 == 1 && dice2 == 4 && dice3 == 2) {
                System.out.println("Vous avez gagné : \n Dé n°1 : " + dice1 + " \n Dé n°2 : " + dice2 + " \n Dé n°3 : " + dice3);
                break;
            } else if (dice1 == 2 && dice2 == 1 && dice3 == 4) {
                System.out.println("Vous avez gagné : \n Dé n°1 : " + dice1 + " \n Dé n°2 : " + dice2 + " \n Dé n°3 : " + dice3);
                break;
            } else {
                System.out.println("Vous avez perdu : \n Dé n°1 : " + dice1 + " \n Dé n°2 : " + dice2 + " \n Dé n°3 : " + dice3);
                break;
            }

        }
    }
}
