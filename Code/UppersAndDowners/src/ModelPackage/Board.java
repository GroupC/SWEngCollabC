/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelPackage;

/**
 *
 * @author mg300
 */
public class Board {
    private SpecialSquare[] specialSquares;
    private int columns;
    private int rows;
    public String boardImage;

    public Board(int rows, int columns, SpecialSquare[] squares, String img){
        this.rows = rows;
        this.columns = columns;
        this.specialSquares = squares;
        this.boardImage = img;
    }

    public int getRows(){
        return rows;
    }

    public int getColumns(){
        return columns;
    }

    public SpecialSquare getSpecialSquare(int n){
        return specialSquares[n];
    }

    public void explodeColumn(int column){
        try {
          throw new Exception("Not yet implemented");
        } catch(Exception e) {

        }
    }

    public String getBoardImage(){
        return boardImage;
    }

    public boolean landedOnSpecialSquare(int position){
        try {
          throw new Exception("Not yet implemented");
        } catch(Exception e) {
          return false;
        }
    }
}
