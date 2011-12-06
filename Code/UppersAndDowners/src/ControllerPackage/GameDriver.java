/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControllerPackage;
import ModelPackage.*;
import ViewPackage.*;
import java.util.ArrayList;
/**
 *
 * @author mg300
 */
public class GameDriver {
    private GameScores game;
    private String[] saves;
    private Player Human;
    private Player AI;
    private Die die;
    private Board board;
    private ConsoleView console;
    private FrameController gui;
    private String mode;
    private String saveFileName;

    public GameDriver(ConsoleView console, FrameController gui, String mode){
        this.mode = mode;
        this.console = console;
        this.gui = gui;
        initialiseGame();
    }

    public void newGame(){

    }

    public ArrayList<String> readSaveFile(){
        return null;
    }

    public Player rollToStart(){
        return null;
    }

    public void runGame(){

    }

    private int getSaves(){
        return -1;
    }

    public void initialiseGame(){

    }

    public void selectPlayerMode(){

    }

    private void load(){

    }

    private void save(){

    }

    private void quit(){
        
    }

}
