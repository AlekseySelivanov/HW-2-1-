package ru.geekbrains.homework1;

import java.awt.*;

public class BackGround extends Sprite  {
    private final Color color;
BackGround(){
    color = new Color(
           (int) (Math.random() * 255), // R
            (int) (Math.random() * 255), // G
            (int) (Math.random() * 255)  // B
    );
}
    void update(GameCanvas canvas, float deltaTime) {}

}
