public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to a random number between 1 and 10.
  public Superhero(String name, String costume, String weapon) {
    this.name = name;
    this.costume = costume;
    this.weapon = weapon;
    this.life = true; // Initialize life to true
    this.weaponStrength = (int) (Math.random() * 10) + 1; // Initialize weaponStrength to a random number between 1 and 10
  }
  // TODO #2: Add missing methods.
  // Accessor methods for the life attribute
  public void loseLife() {
    this.life = false;
  }
  
  // TODO #3: Including a toString() method (see 2.7) to help with printing out the Superhero details.
  @Override
  public String toString() {
    return "Superhero{" +
            "name='" + name + '\'' +
            ", costume='" + costume + '\'' +
            ", weapon='" + weapon + '\'' +
            ", life=" + life +
            ", weaponStrength=" + weaponStrength +
            '}';
  }
}
