/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelPackage;

/**
 *
 * @author mg300
 */
public abstract class Player {
    private String name;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int gamesDrawn;
    private int bombs;
    private int currentScore;
    private int currentOverallScore;
    private int position;
    private int points;
    private String playerImage;

    public Player(String name, String playerImage){
        this.name = name;
        this.playerImage = playerImage;
        //SVN Change test
        //Also online test
        //Local test
    }

    public String getName(){
        return name;
    }

    public int getGamesWon(){
        return gamesWon;
    }

    public int getGamesPlayed(){
        return gamesPlayed;
    }

    public int getGamesDrawn(){
        return gamesDrawn;
    }

    public abstract void move(int move);

    public int getPosition(){
        return position;
    }

    public void collectBomb(){
        //I guess
        bombs ++;
    }

    public boolean getHasTurn(){
        //Do this
        return true;
    }

    public int getCurrentScore(){
        return currentScore;
    }

    public int getCurrentOverallScore(){
        return currentOverallScore;
    }

    public String getPlayerImage(){
        return playerImage;
    }

    public void hasWon(){
        gamesWon ++;
        gamesPlayed ++;
    }

    public void hasLost(){
        gamesLost ++;
        gamesPlayed ++;
    }

    public void hasDrawn(){
        gamesDrawn ++;
        gamesPlayed ++;
    }

    public void collectPoints(int points){
        this.points += points;
    }

    public void bumpBack(){

    }
}