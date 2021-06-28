package section4;

import com.sun.source.util.SourcePositions;

public class Methods {
    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score,levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Dudu", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

}

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return  -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playScore){
//        if(playScore >= 1000){
//            return 1;
//        }else if(playScore >= 500){
//            return 2;
//        }else if(playScore >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;

        if(playScore >=1000){
            position = 1;
        } else if (playScore >= 500) {
            position = 2;
        }else if(playScore >= 100){
            position = 3;
        }
        return position;


    }

}
