//public class ControlBlocks {
//    public static void main(String[] args){
        //The if block runs if the expression in the brackets valuated to true

     //   if (firstCondition) {
            // Code in block will execute only if
           // firstCondition is true
  //      } else if (secondCondition) {
           // Code in block will execute if firstCondition is false
          // and secondCondition is true

            //THERE IS NO LIMIT TO THE NUMBER OF CONDITIONS THAT CAN BE TESTED
       // } else {
            // Code in block will execute if
            // all conditions above are false

//            THE ELSE BLOCK MUST BE LAST BUT IS OPTIONAL
//        }


 //   }
//}

public class ControlBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

      if(gameOver == true){
          finalScore +=(levelCompleted * bonus);
          System.out.println("Your final score was " + finalScore);
      }
    }
}
