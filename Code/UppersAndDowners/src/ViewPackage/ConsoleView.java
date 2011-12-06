/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewPackage;

/**
 *
 * @author mg300
 */
import java.util.*;
public class ConsoleView {
    private Scanner in;

    public ConsoleView(){
        showOpeningMessage();
    }

    public void printHelp(String val){
        System.out.println(val);
    }

    public void showOpeningMessage(){
        System.out.println("Welcome to Uppers & Downers.\nYour options are as follows:");
        System.out.println("Type '/help' to see the help message");
        System.out.println("Type '/new' to start a new game");
        /*TODO implement */
        //System.out.println("Type '/load' to load an existing game (NOT YET)");
        System.out.println("Type '/exit' to quit");
        //This is a test!
    }

    public String getPlayerMode(){
        return "Not yet implemented";
    }

    public String getMoveDirection(){
        return "Not yet implemented";
    }

    public String getInput(){
        return in.next();
    }
}
