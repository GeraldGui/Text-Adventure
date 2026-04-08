package com.pluralsight;
import java.util.Scanner;

public class Main {

    // User Stats
    public static int health = 10;
    public static int movement = 4;
    public static int inventory = 3;
    public static float damage = 1;

    // Demon Stats
    public static int demon_health;
    public static float demon_damage;
    // UserName
    public static String player;
    public static String attack;
    public static String room;

    static boolean end = false;

    // This makes the scanner to be used later
    static public Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Username: ");

        player = myObj.nextLine();
        System.out.println("Welcome " + player);

        while (health > 1 && !end) {
            System.out.println("It is time to start your adventure!");

            System.out.println("Type Start to begin or Defeat to quit....");
            String starting = myObj.nextLine();

            // If user types start/Start it will continue the game
            if (starting.equalsIgnoreCase("start")) {
                System.out.println("Wise Choice!!\nBut before you start here is a little intro to understanding stats.\nHealth = H\nDamage = dmg\nMovement = M\nInventory = I ");

                System.out.println("Now pick your GEAR! \nSword (+3dmg & -3M), Spear (+2dmg & -2M), Axe (+1dmg & -1M), or Stick (+0.5dmg)");
                String weapon = myObj.nextLine();

                // Picked Sword and prints out Stats
                if (weapon.equalsIgnoreCase("sword")) {
                    damage += 3;
                    movement -= 3;

                    System.out.println("So you like Slashing, well then here are your Stats Adventure!\nHealth: " + health + "\nDamage: " + damage + "\nMovement: " + movement + "\nInventory: " + inventory);

                    // Starts picking the room
                    while (weapon.equalsIgnoreCase("sword")) {
                        System.out.println("Now time to pick the room!\nRoom 1 (Needs 4M)\nRoom 2 (Needs 2M)\nRoom 3 (Needs 1M)");
                        room = myObj.nextLine();

                        // User picked room 1 and has enough movement
                        if (room.equalsIgnoreCase("room 1") && movement == 4) {
                            demon_health = 1;
                            demon_damage = 2;

                            System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                            System.out.println("Will you attack? Yes or no?\nYour damage: " + damage);
                            attack = myObj.nextLine();

                            if (attack.equalsIgnoreCase("yes")) {
                                demon_health -= damage;

                                System.out.println("Nice, you slashed that demon\nDemon Health: " + demon_health);

                                while (demon_health > 1) {
                                    System.out.println("Oh, you didn't kill it\nDemon attacks back!");

                                    health -= demon_damage;

                                    System.out.println(player + "Health: " + health + "\nDemon Health: " + demon_health);

                                    System.out.println("Will you attack? Yes or no?\nYour damage: " + damage);
                                    attack = myObj.nextLine();
                                }

                                if (demon_health == 0) {
                                    System.out.println("WOW, you could actually kill it!");

                                }

                            } else if (attack.equalsIgnoreCase("no")) {
                                System.out.println("Then why did you start your adventure? Go home!");
                                return;
                            }

                        }
                        // User picked room 2 and has enough movement
                        else if (room.equalsIgnoreCase("room 2") && movement == 2) {
                            demon_health = 3;
                            demon_damage = 2;

                            System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                        }
                        // User picked room 3 and has enough movement
                        else if (room.equalsIgnoreCase("room 3") && movement == 4) {
                            demon_health = 2;
                            demon_damage = 2;

                            System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                        }
                    }
                }

                // Picked Spear and prints out Stats
                else if (weapon.equalsIgnoreCase("Spear")) {
                    damage += 2;
                    movement -= 2;

                    System.out.println("So you like Stabbing from afar, well then here are your Stats Adventure!\nHealth: " + health + "\nDamage: " + damage + "\nMovement: " + movement + "\nInventory: " + inventory);

                    while (weapon.equalsIgnoreCase("spear")) {
                        System.out.println("Now time to pick the room!\nRoom 1 (Needs 4M)\nRoom 2 (Needs 2M)\nRoom 3 (Needs 1M)");
                        room = myObj.nextLine();

                        // User picked room 1 and has enough movement
                        if (room.equalsIgnoreCase("room 1") && movement == 4) {
                            demon_health = 1;
                            demon_damage = 2;

                            System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                        }
                        // User picked room 2 and has enough movement
                        else if (room.equalsIgnoreCase("room 2") && movement == 2) {
                            demon_health = 3;
                            demon_damage = 2;

                            System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                        }
                        // User picked room 3 and has enough movement
                        else if (room.equalsIgnoreCase("room 3") && movement == 4) {
                            demon_health = 2;
                            demon_damage = 2;

                            System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                        }
                    }
                }

                // Picked Axe and prints out Stats
                else if (weapon.equalsIgnoreCase("Axe")) {
                    damage += 1;
                    movement -= 1;

                    System.out.println("So you like going on a Rampage, well then here are your Stats Adventure!\nHealth: " + health + "\nDamage: " + damage + "\nMovement: " + movement + "\nInventory: " + inventory);

                    while (weapon.equalsIgnoreCase("Axe")) {
                        System.out.println("Now time to pick the room!\nRoom 1 (Needs 4M)\nRoom 2 (Needs 2M)\nRoom 3 (Needs 1M)");
                        room = myObj.nextLine();

                        // User picked room 1 and has enough movement
                        if (room.equalsIgnoreCase("room 1") && movement == 4) {
                            demon_health = 1;
                            demon_damage = 2;

                            System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                        }
                        // User picked room 2 and has enough movement
                        else if (room.equalsIgnoreCase("room 2") && movement == 2) {
                            demon_health = 3;
                            demon_damage = 2;

                            System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                        }
                        // User picked room 3 and has enough movement
                        else if (room.equalsIgnoreCase("room 3") && movement == 4) {
                            demon_health = 2;
                            demon_damage = 2;

                            System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                        }
                    }
                }

                // Picked Stick and prints and Stats
                else if (weapon.equalsIgnoreCase("Stick")) {
                    damage += 0.5f;

                    System.out.println("So you like being Blunt, well then here are your Stats Adventure!\nHealth: " + health + "\nDamage: " + damage + "\nMovement: " + movement + "\nInventory: " + inventory);

                    while (weapon.equalsIgnoreCase("stick")) {
                        System.out.println("Now time to pick the room!\nRoom 1 (Needs 4M)\nRoom 2 (Needs 2M)\nRoom 3 (Needs 1M)");
                        room = myObj.nextLine();

                        // User picked room 1 and has enough movement
                        if (room.equalsIgnoreCase("room 1") && movement == 4) {
                            demon_health = 1;
                            demon_damage = 2;

                            System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                            System.out.println("Will you attack? Yes or no?\nYour damage: " + damage);
                            attack = myObj.nextLine();

                            if (attack.equalsIgnoreCase("yes")) {
                                demon_health -= damage;

                                System.out.println("Nice, you bonked that demon\nDemon Health: " + demon_health);

                                while (demon_health > 1) {
                                    System.out.println("Oh, you didn't kill it\nDemon attacks back!");

                                    health -= demon_damage;

                                    System.out.println(player + "Health: " + health + "\nDemon Health: " + demon_health);

                                    System.out.println("Will you attack? Yes or no?\nYour damage: " + damage);
                                    attack = myObj.nextLine();

                                    demon_health -= damage;
                                }

                                if (demon_health == 0) {
                                    System.out.println("WOW, you could actually kill it!");

                                    System.out.println("Now time to pick the next room!\nRoom 1 (Needs 4M)\nRoom 2 (Needs 2M)\nRoom 3 (Needs 1M)");
                                    room = myObj.nextLine();

                                    if (room.equalsIgnoreCase("room 1") && movement == 4) {
                                        demon_health = 4;
                                        demon_damage = 3;

                                        System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                                        System.out.println("Will you attack? Yes or no?\nYour damage: " + damage);
                                        attack = myObj.nextLine();

                                        if (attack.equalsIgnoreCase("yes")) {
                                            demon_health -= damage;

                                            System.out.println("Nice, you bonked that demon\nDemon Health: " + demon_health);

                                            while (demon_health > 1) {
                                                System.out.println("Oh, you didn't kill it\nDemon attacks back!");

                                                health -= demon_damage;

                                                System.out.println(player + "Health: " + health + "\nDemon Health: " + demon_health);

                                                System.out.println("Will you attack? Yes or no?\nYour damage: " + damage);
                                                attack = myObj.nextLine();

                                                demon_health -= damage;
                                            }

                                            if (demon_health <= 0) {
                                                System.out.println("You win!");
                                                return;
                                            }
                                        }
                                    }
                                }

                                } else if (attack.equalsIgnoreCase("no")) {
                                    System.out.println("Then why did you start your adventure? Go home!");
                                    return;
                                }

                            }
                            // User picked room 2 and has enough movement
                            else if (room.equalsIgnoreCase("room 2") && movement == 2) {
                                demon_health = 3;
                                demon_damage = 2;

                                System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                            }
                            // User picked room 3 and has enough movement
                            else if (room.equalsIgnoreCase("room 3") && movement == 4) {
                                demon_health = 2;
                                demon_damage = 2;

                                System.out.println("You have entered Room 1, but now you have encountered a DEMON!\nDemon Stats\n" + demon_health + "\n" + demon_damage);

                            }
                        }
                    }
                }

                // If user types defeat/Defeat it will quit the game
                else if (starting.equalsIgnoreCase("defeat".toLowerCase())) {
                    System.out.println("You're Defeated Before You Even Started!");

                    return;

                }

                // Tells the user they put the wrong input so it will send them back
                else {
                    System.out.println("You put invalid text!");
                }

            }
            myObj.close();
        }
    }
