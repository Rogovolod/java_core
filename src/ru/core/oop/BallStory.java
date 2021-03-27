package ru.core.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        WolfFBall wolf = new WolfFBall();
        Fox fox = new Fox();
        Hare hare = new Hare();

        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
