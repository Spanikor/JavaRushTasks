package com.javarush.games.snake;


import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public int x;
    public int y;
    private List<GameObject> snakeParts = new ArrayList<>();
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;
   


    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Snake(int x, int y) {
        this.x = x;
        this.y = y;
        GameObject go1 = new GameObject(x, y);
        GameObject go2 = new GameObject(x + 1, y);
        GameObject go3 = new GameObject(x + 2, y);
        snakeParts.add(go1);
        snakeParts.add(go2);
        snakeParts.add(go3);

    }

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++){
            if (isAlive == false){
                if (i == 0){
                    game.setCellValueEx(x, y, Color.NONE, HEAD_SIGN, Color.RED, 75);
                }
                else {
                    game.setCellValueEx(x + i, y, Color.NONE, BODY_SIGN, Color.RED, 75);
                }
            }
            else{
                if (i == 0){
                    game.setCellValueEx(x, y, Color.NONE, HEAD_SIGN, Color.BLACK, 75);
                }
                else {
                    game.setCellValueEx(x + i, y, Color.NONE,BODY_SIGN, Color.BLACK, 75);
                }
            }
        }
    }
}

