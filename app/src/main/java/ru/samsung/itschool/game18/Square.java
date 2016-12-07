package ru.samsung.itschool.game18;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import static android.graphics.Color.GREEN;

public class Square extends Figure implements Drawable{
    private int size = 30;
    protected Square(float posX, float posY) {
        super(posX, posY);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRect(pos.x, pos.y, pos.x + size, pos.y + size, paint);
        velocity = new Vector(0, 1f);
        paint.setColor(Color.GREEN);

    }

}
