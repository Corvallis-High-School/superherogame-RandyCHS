# Instructions
## Part 2
Complete the next level of your Superhero game by following the steps below (the steps are also listed as TODOs in each class file of the project)
### Steps
1. Modify the existing _constructor_ for the `Superhero` class to set the superhero's weapon strength to a random number between 1 and 10.
2. Add a new _constructor_ to the `Superhero` class which allows you to set the `weaponStrength` for a superhero to a value of your choosing.
3. Add any missing accessor/getter methods to the superhero class necessary for the `superheroFight()` method in the `Main` class to compile. Please use the method names listed below:
    1. `getWeapon()`
    2. `getWeaponStrength()`
4. Have the 2 superheros created in the Main class's main() method fight using `superheroFight()` 
    1. Hint1: superheroFight() is a [static method](https://runestone.academy/ns/books/published/CSAwesomeCSD2023/Unit5-Writing-Classes/topic-5-7-static-vars-methods.html) in Main
    2. Hint2: you have already used static methods in the [Math Class](https://runestone.academy/ns/books/published/CSAwesomeCSD2023/Unit2-Using-Objects/topic-2-9-Math.html)
5. Change the superheroFight() method in the Main class so that the fight does not always end in a draw. Hint: What attribute from the superheros could you compare to see who wins? What accessor/getter method would you need to add to the superhero class to get the value of that attribute for each superhero?
6. Modify the superheroFight() method in the Main class to use the weapon strength provided by each player.
## Part 1
Complete the Superhero game by following the steps below (the steps are also listed as TODOs in each class file of the project)
### Steps
1. Add any missing constructors to the Superhero class so that the code in the Main class compiles. Note that the Superhero's life attribute should default to true and the weaponStrength attribute should default to 0.
2. Add any missing methods to the Superhero class so that the code in the Main class compiles.
3. Make sure that each superhero's details are printed out nicely to the command line. Hint: a toString() method can help with this.

Your output be similar to the following to pass the input / output test:

```
Superhero details
    name: Spiderman
    costume: Red suit
    weapon: Super Web
    life: true
    weapon strength: 0

Superhero details
    name: Batman
    costume: Batsuit
    weapon: Super Strength
    life: false
    weapon strength: 0
```
