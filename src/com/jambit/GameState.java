package com.jambit;

public class GameState {
    /**
     *
     */
    //playername
    public static String name;
    //difficulty
    public static String difficulty = "";
    //shows in which room the player is
    public static String whereAmI = "Elevator";
    public static int liveCount;
    public static int xp = 0;
    public static String[] currentItems = {"⍰", "⍰", "⍰", "⍰", "⍰", "⍰", "⍰", "⍰"};
    //shows if the player has turned on the power of the elevator
    public static boolean powerIsON = false;
    public static boolean hatSichSchonInElevatorUmgesehen = false;
    public static boolean bageloserDead = false;
    public static boolean adalIsDead = false;
    public static boolean firstTimeInElevator = true;
    public static boolean kitchenSearched = false;
    public static boolean printerIsDead = false;
    public static boolean cherry1Dead = false;

}
