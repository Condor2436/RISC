import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Player {
    public socket clientSocket;

    public int playerID;

    public int status;

    private BufferedReader in;

    private PrintWriter out;

    private BasicChecker attackRuleChecker;

    private BasicChecker moveRuleChecker;

    public socket getSocket() {
        return clientSocket;
    }

    public int getID() {
        return playerID;
    }

    public int getStatus() {
        return status;
    }

    public BufferedReader getIn() {
        return in;
    }

    public PrintWriter getOut() {
        return out;
    }

    public void setID(int playerID) {
        this.playerID = playerID;
    }

    private void playOneTurn(){}

    private void checkBehavior(ArrayList<Behavior> list){}
}
