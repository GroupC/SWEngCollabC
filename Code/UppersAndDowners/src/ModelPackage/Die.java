/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelPackage;

/**
 *
 * @author mg300
 */
public class Die {

    private int numberOfSides;
    private int numberRolled;

    public Die(){
        //the default constructor creates a 6-sided die
        this.numberOfSides = 6;
    }

    public Die(Integer numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public void roll(){
        setNumberRolled((int)(this.getNumberOfSides() * Math.random()) + 1);
    }

    /**
     * Get the value of numberRolled
     *
     * @return the value of numberRolled
     */
    public int getNumberRolled() {
        return numberRolled;
    }

    /**
     * Set the value of numberRolled
     *
     * @param numberRolled new value of numberRolled
     */
    public void setNumberRolled(int numberRolled) throws IllegalArgumentException{
        if(numberRolled < 0 || numberRolled > this.getNumberOfSides()){
            throw new IllegalArgumentException("Must be a number between 1 and "+ this.getNumberOfSides());
        } else {
            this.numberRolled = numberRolled;
        }
    }


    /**
     * Get the value of numberOfSides
     *
     * @return the value of numberOfSides
     */
    public int getNumberOfSides() {
        return numberOfSides;
    }

    /**
     * Set the value of numberOfSides
     *
     * @param numberOfSides new value of numberOfSides
     */
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }


}

