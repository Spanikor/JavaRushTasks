package com.javarush.games.snake;


import java.util.ArrayList;
import java.util.List;

public class Snake {
    public int x;
    public int y;

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
    private List<GameObject> snakeParts = new ArrayList<>();

}
