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

    public Snake(int x, int y){
        this.x = x;
        this.y = y;
        GameObject go1 = new GameObject(x, y);
        GameObject go2 = new GameObject(x + 1, y);
        GameObject go3 = new GameObject(x + 2, y);
        snakeParts.add(go1);
        snakeParts.add(go2);
        snakeParts.add(go3);

    }
    public void draw( Game game){
        game.setCellValue(snakeParts.get(0).x,snakeParts.get(0).y,HEAD_SIGN);
        for (int i = 1; i < snakeParts.size(); i++) {
            game.setCellValue(snakeParts.get(i).x, snakeParts.get(i).y, BODY_SIGN);
        }

    }


}
