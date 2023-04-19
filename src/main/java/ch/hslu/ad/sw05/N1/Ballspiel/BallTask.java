/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw05.N1.Ballspiel;

import ch.hslu.ad.exercise.n1.balls.Circle;
import java.util.Random;

/**
 *
 * @author alexi
 */
public class BallTask extends Circle implements Runnable {

    public static final int MIN_DIAMETER = 20;
    public static final int MAX_DIAMETER = 50;
    private static Random random = new Random();
    public static final String[] colourList = new String[]{"red", "black", "blue", "yellow", "green", "magenta"};

    @Override
    public void run() {
        Circle circle = new Circle(BallTask.randomRangeInteger(MIN_DIAMETER, MAX_DIAMETER), randomRangeInteger(0, BallDemo.WIDTH),
                randomRangeInteger(0, BallDemo.HEIGHT), randomColourString());
        circle.makeVisible();
        int velocity = BallTask.randomRangeInteger(1, 5);
        while (circle.getY() < BallDemo.HEIGHT - circle.getDiameter()) {
            circle.moveVertical(velocity);
        }
        circle.makeInvisible();

    }

    public static int randomRangeInteger(int min, int max) {
        if (random == null) {
            random = new Random();
        }

        return random.nextInt(min + max) + min;
    }

    public static String randomColourString() {
        return colourList[randomRangeInteger(0, colourList.length)];
    }
}
