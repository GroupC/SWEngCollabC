/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelPackage;

/**
 *
 * @author mg300
 */
public class ModifierSquare {
    private int takesTo;
    private String modifierType;
    private int position;
    private int points;

    public ModifierSquare(int position, int takesTo, int points, String type){
        this.position = position;
        this.takesTo = takesTo;
        this.points = points;
        this.modifierType = type;
    }

    public int getTakesTo(){
        return takesTo;
    }

    public String getType(){
        return modifierType;
    }
}
