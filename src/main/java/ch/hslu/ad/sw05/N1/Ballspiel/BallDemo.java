/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw05.N1.Ballspiel;

import ch.hslu.ad.exercise.n1.balls.Canvas;

/**
 *
 * @author alexi
 */
public class BallDemo {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;

    public static void main(String[] args) throws InterruptedException {
        Canvas canvas = Canvas.getCanvas();
        BallTask ballTask = new BallTask();

        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(ballTask, "Ball" + i);
            thread.start();
            Thread.sleep(500);
        }
        System.exit(0);
    }
}
