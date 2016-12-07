package ru.samsung.itschool.game18;

import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by Work on 03.12.2016.
 */

public class Rectangle extends Circle implements Drawable {
    private int height = 100;
    private int width = 40;

    protected Rectangle(float posX, float posY) {
        super(posX, posY);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRect(pos.x, pos.y, pos.x + width, pos.y + height, paint);
        velocity = new Vector(-0.2f, 0.2f);
        paint.setColor(Color.RED);
    }
}