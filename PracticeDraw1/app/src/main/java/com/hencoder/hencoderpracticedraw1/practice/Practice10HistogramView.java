package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


public class Practice10HistogramView extends View {
    Paint paint1;
    Paint paint2;
    private final int PADDING = 10;//间隔
    private final int WIDTH_ITEM = 80;//宽度

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint1 = new Paint();
        paint1.setColor(Color.GREEN);
        paint1.setStrokeWidth(3);
        paint1.setStyle(Paint.Style.FILL);

        paint2 = new Paint();
        paint2.setColor(Color.WHITE);
        paint2.setStrokeWidth(3);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        int width = canvas.getWidth();
        int height = canvas.getHeight();


        int[] heights = {5, 30, 25, 150, 200, 250, 125};
        String[] lables = {"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};

        canvas.drawLine(width / 10, height * 0.8f, width / 10, height * 0.1f, paint2);
        canvas.drawLine(width / 10, height * 0.8f, width * 0.9f, height * 0.8f, paint2);

        int lastWidth = width / 10 + PADDING;

        for (int i = 0; i < heights.length; i++) {
            canvas.drawRect(lastWidth, height * 0.8f - heights[i], lastWidth + WIDTH_ITEM, height * 0.8f, paint1);
            canvas.drawText(lables[i], lastWidth + 30, height * 0.8f + 20, paint2);
            lastWidth = lastWidth + WIDTH_ITEM + PADDING;
        }

    }
}
