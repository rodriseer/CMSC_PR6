/**
 *class to model a Lightsaber, a weapon from the Star Wars universe. The Lightsaber can change colors and be toggled between activated and deactivated states.


 *
 * @author Rodrigo Seer
 * @version 1.0
 */
public class Lightsaber {
    /**color of the lightsaber blade. */
    private String color;
    /**activation state of the lightsaber (true if activated, false otherwise). */
    private boolean isActive;

    /**
     *constructs a new Lightsaber with a specified color.
     * 
     * @param color Initial color of the lightsaber blade.
     */
    public Lightsaber(String color) {
        this.color = color;
        this.isActive = false;
    }

    /**
     *activates the Lightsaber, turning on its blade.
     */
    public void activate() {
        this.isActive = true;
        System.out.println("Lightsaber activated with " + color + " color.");
    }

    /**
     *deactivates the Lightsaber, turning off its blade.
     */
    public void deactivate() {
        this.isActive = false;
        System.out.println("Lightsaber deactivated.");
    }

    /**
     *changes the color of the Lightsaber blade.
     * 
     * @param newColor The new color to which the blade color will be changed.
     */
    public void changeColor(String newColor) {
        this.color = newColor;
        if (isActive) {
            System.out.println("Lightsaber color changed to " + newColor + ".");
        }
    }

    /**
     *returns the current color of the Lightsaber blade.
     * 
     * @return The current color of the Lightsaber blade.
     */
    public String getColor() {
        return color;
    }
}
