package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {

    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;


    @Override
    public void initialize() {
        setScreenSize(15, 15);
        createGame();
    }
    private void createGame() {
        snake = new Snake(WIDTH / 2,HEIGHT / 2);
        drawScene();


    }

    private void drawScene() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellColor(x, y, Color.RED);
            }

        }
        snake.draw(this);

    }

}
