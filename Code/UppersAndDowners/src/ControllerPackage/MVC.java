/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControllerPackage;
import ModelPackage.*;
import ViewPackage.*;
/**
 *
 * @author mg300
 */
public class MVC {
    private GameDriver gameDriver;
    private FrameController frameController;
    private ConsoleView console;
    private GUI gui;

    public static void main(String [] params){
        MVC mvc = new MVC();
    }

    public MVC(){
        showGUI();
        gameDriver = new GameDriver(console, frameController, "Console");
    }

    public static void showGUI(){
        GUI gui = new GUI();
    }
}
