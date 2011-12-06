/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelPackage;

/**
 *
 * @author mg300
 */
public class AI extends Player{
    private int[] upperPositions;
    private int[] downerPositions;

    public AI(String name, String playerImage, Player opponent, int[] uppers, int[] downers){
        super(name, playerImage);
    }

    public void move(int roll){
        try {
          throw new Exception("Not yet implemented");
        } catch(Exception e) {
        }
    }
}
