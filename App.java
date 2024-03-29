import board.Board;
import player.Player;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First Project -> Tic Tac Toe");
        
        Board b = new Board(3,'-');

        Player p1 = new Player();
        p1.setPlayerDetails("Abhi", 'X');
        p1.getPlayerDetails();

        Player p2 = new Player();
        p2.setPlayerDetails("Bhuvana",'O');
        p2.getPlayerDetails();

        Game game = new Game(new Player[] {p1,p2},b);
        game.play();
           
    }
}
