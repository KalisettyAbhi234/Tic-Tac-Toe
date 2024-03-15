package player;

public class Player {
   private String playerName;
   private char playerSymbol;

   public void setPlayerDetails(String playerName,char playerSymbol){
      this.playerName=playerName;
      this.playerSymbol=playerSymbol;
   }

   public void getPlayerDetails() {
      System.out.println("Player Name: "+this.playerName);
      System.out.println("Player Symbol: "+this.playerSymbol);
   }

   public void changeSymbol(char symbol) {
      this.playerSymbol = symbol;
   }

   public char getPlayerSymbol() {
      return this.playerSymbol;
   }

   public String getPlayerName() {
      return this.playerName;
   }




}