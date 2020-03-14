import io.GameIO;
import io.PlayerIO;
import locations.towns.*;
import player.Player;
import player.SaveFiles;

public class MainApplication {
    private Cintra cintra = new Cintra();
    private Kaedwen kaedwen = new Kaedwen();
    private Novigrad novigrad = new Novigrad();
    private Oxenfurt oxenfurt = new Oxenfurt();
    private Redania redania = new Redania();
    private Rivia rivia = new Rivia();
    private RuinsOfNilfgaard ruinsOfNilfgaard = new RuinsOfNilfgaard();
    private Temeria temeria = new Temeria();
    private Toussaint toussaint = new Toussaint();
    private static PlayerIO playerIO = new PlayerIO(System.in, System.out);
    private static SaveFiles saveFiles = new SaveFiles();
    private static Player player;

    public static void intro(){
        Integer newOrLoad = playerIO.getIntegerInput("Press 1 for New Game.\nPress 2 to Load Game.");
        if (newOrLoad == 1)
            createPlayer();
        else if (newOrLoad == 2)
            choosePlayer();
        else
            System.out.println("\nPlease Enter 1 or 2.\n");
            intro();
    }

    private static void choosePlayer() {
        System.out.println(saveFiles.toString());

    }

    private static void createPlayer() {
        String name = playerIO.getStringInput("What is the name of our hero?");
        player = new Player(name);
    }

    public static void main(String[] args){
        GameIO.welcome();
        intro();
    }
}
