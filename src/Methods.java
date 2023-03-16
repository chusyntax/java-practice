public class Methods {

//This whole class is a method.
//The key word void is used when a method takes no data in and returns no data
// It is accessible to the outside "world" because of the word public
//It can be called directly using its classname because it uses the keyword static
// Can't have a method within another method.

//A Parameter is the definition as shown in the method declaration, and the argument will be the value that's passed to the method when we call it.

            public static void main(String[] args) {

                boolean gameOver = true;
                int score = 800;
                int levelCompleted = 5;
                int bonus = 100;

                int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
                System.out.println("The highScore is " + highScore);

                score = 10000;
                levelCompleted = 8;
                bonus = 200;

                System.out.println("The next highScore is " +
                        calculateScore(gameOver, score, levelCompleted, bonus));
            }

            public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

                int finalScore = score;

                if (gameOver) {
                    finalScore += (levelCompleted * bonus);
                    finalScore += 1000;
                }

                return finalScore;
            }
//Method return type is a declared data type for the data that will be returned from the method
//We have to declare the method with a data type. The type is declared before the variable name
//In addition, a return statement is required in the code block, which returns the result of that method
// Return is required for methods that do return data
//Return is used to return a value back from a method
    //Method and function in Java are used interchangeably
    // The calling code must pass arguments in the same order as the declaration
//One common practice is to declare a default return value at the start of a method, and only have a single return statement from a method, returning that variable.

// A method is uniquely defined in a class by its name, and the number and type of parameters that are declared for it.

//This is called the method signature.

//You can have multiple methods with the same method name, as long as the method signature (meaning the parameters declared) are different.


}
