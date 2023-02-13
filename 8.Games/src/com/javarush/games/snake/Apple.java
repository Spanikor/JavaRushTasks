package com.javarush.games.snake;

import com.javarush.engine.cell.*;
import javafx.application.Application;

public class Apple extends GameObject{

   private final String APPLE_SING = "\uD83C\uDF4E";

    public Apple(int x, int y) {
        super(x, y);
    }
    void draw(Game game){
        game.setCellValueEx(x,y, Color.NONE, APPLE_SING,Color.GREEN,75);

    }
}
