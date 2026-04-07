package com.pluralsight;
import java.util.Scanner;

public class Main {

    // Stats
    public static int health = 100;
    public static int movement = 4;
    public static int inventory = 3;
    public static float damage = 1;

    // UserName
    static String player;

    static boolean end = false;

    static public Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Username: ");

        player = myObj.nextLine();
        System.out.println("Welcome " + player);

        while (health > 1 && !end) {
            System.out.println("It is time to start your adventure!");

            System.out.println("Type Start to begin or Defeat to quit....");
            String starting = myObj.nextLine();

            if (starting.equalsIgnoreCase("start")) {
                System.out.println("Wise Choice!!");

                System.out.println("Now pick your GEAR! \nSword (+3), Spear (+2), Axe (1), or Stick (0.5)");
                String weapon = myObj.nextLine();

                if (weapon.equalsIgnoreCase("sword")) {
                    damage += 3;
                    movement -= 3;

                    System.out.println("So you like Slashing, well then here are your Stats Adventure!\nHealth: " + health + "\nDamage: " + damage + "\nMovement: " + movement + "\nInventory: " + inventory);


                 }
                }
            else if (starting.equalsIgnoreCase("defeat".toLowerCase())) {
                System.out.println("You're Defeated Before You Even Started!");

                return;

                }
            else {
                    System.out.println("You put invalid text!");
                }



                return;

            }
        }
    }
