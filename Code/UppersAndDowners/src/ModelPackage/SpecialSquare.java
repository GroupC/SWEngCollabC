/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelPackage;

/**
 *
 * @author mg300
 */
public class SpecialSquare {
    private int pointsOnLanding;
    private boolean hasBomb;
    private int position;

    public SpecialSquare(int position, int points){
        this.position = position;
        this.pointsOnLanding = points;
    }

    public void collectPoints(Player player){
        try {
          throw new Exception("Not yet implemented");
        } catch(Exception e) {

        }
    }

    public boolean hasBomb(){
        return (hasBomb == true) ? true : false;
    }

    public int getPosition(){
        return position;
    }

    public void setHasBomb(){
        hasBomb = true;
    }
}
