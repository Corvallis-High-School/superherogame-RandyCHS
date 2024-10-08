public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  // TODO #1: Modify the constructor to set a random weapon strength between 1 and 10 for the superhero.  
  public Superhero(String superName, String superCostume, String superWeapon) {
    name = superName;
    costume = superCostume;
    weapon = superWeapon;
    life = true; // Initialize life to true
    weaponStrength = 0;
  }
  // TODO #2: Add missing methods.
  // Accessor methods for the life attribute
  public void loseLife() {
    life = false;
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
