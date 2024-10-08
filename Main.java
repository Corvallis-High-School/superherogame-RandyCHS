public class Main {

  public static void main(String[] args) {

    // Create two Superhero objects
    Superhero spiderman1 = new Superhero("Spiderman", "Red suit", "Super Web");
    System.out.println(spiderman1);
    Superhero batman1 = new Superhero("Batman", "Batsuit", "Super Strength");
    System.out.println(batman1);

    // TODO #4: Have the 2 superheros created above fight.
    // Hint: How would you use the superheroFight() method in Main to do that?
    Main.superheroFight(spiderman1, batman1);    
    
  }
  
  // TODO #5: Change this method so that the fight does not always end in a draw.
  public static void superheroFight(Superhero superhero1, Superhero superhero2) {

    // Hint: What attribute from the superheros could you compare to see who wins?
    // What accessor/getter method would you need to add to the superhero class to
    // get the value of that attribute for each superhero?
    int weapon1Strength = 0;
    int weapon2Strength = 0;
    Superhero winner = superhero1;
    Superhero loser = superhero2;

    if (weapon1Strength > weapon2Strength) {
      winner = superhero1;
      loser = superhero2;
    } else if (weapon1Strength == weapon2Strength) {
      System.out.println("After a mighty struggle, both superheroes concede that the other is equally as strong.");
      return;
    } else {
      winner = superhero2;
      loser = superhero1;
    }
    System.out.println("After a mighty struggle the winning superhero is:");
    System.out.println(winner);
    System.out.println("Their " + weapon1Strength + " was mightier than their opponents " + weapon2Strength);
  }


}
