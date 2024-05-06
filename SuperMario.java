/*
 * Class: CMSC201 
 * Instructor:
 * Description: javadoc program example
 * Due: 05/06/24
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Rodrigo Seer
*/

/**
 * @author Rodrigo Seer
 * 
 * If you have played Super Mario before (Mario from the popular video game series) you know that he has to jump to collect coins
 * Mario can perform actions such as jumping and collecting coins
 */
public class SuperMario {
    /** The number of coins Mario has collected */
    private int coins;

    /**
     * Constructs a new Mario with 0 coins
     */
    public SuperMario() {
        this.coins = 0;
    }

    /**
     * Simulates Mario jumping
     *
     * @return A string describing Mario jumping
     */
    public String jump() {
        return "Mario jumps high into the air!";
    }

    /**
     * Increases the number of coins Mario has collected.
     *
     * @param newCoins The number of coins collected.
     */
    public void collectCoins(int newCoins) {
        this.coins += newCoins;
        System.out.println("Mario collected " + newCoins + " coins. Total coins: " + this.coins);
    }

    /**
     * Returns the total number of coins Mario has collected.
     *
     * @return The total number of coins.
     */
    public int getTotalCoins() {
        return coins;
    }
}
