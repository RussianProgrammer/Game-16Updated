package ru.samsung.itschool.game18;

import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by vv on 22.11.2016.
 */
class Circle extends Square implements Drawable{
    protected Circle(float posX, float posY) {
        super(posX, posY);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(pos.x, pos.y, 30, paint);
        paint.setColor(Color.BLUE);
    }

}
