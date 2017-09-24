package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        // 打开抗锯齿效果
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        int width = canvas.getWidth() / 2;
        int height = canvas.getHeight() / 2;

        float r = Math.min(width, height) * 1.0f / 2 / 4 * 3;

        // 将坐标原点移动到中心点
        canvas.save();
        canvas.translate(width, height);

        // 画分界线
        canvas.drawLine(-width, 0, width, 0, paint);
        canvas.drawLine(0, -height, 0, height, paint);

        // 1.实心圆
        canvas.drawCircle(-width / 2, -height / 2, r, paint);

        // 2.空心圆
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(width / 2, -height / 2, r, paint);

        // 3.蓝色实心圆
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(-width / 2, height / 2, r, paint);

        // 4.线宽为 20 的空心圆
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(20);
        canvas.drawCircle(width / 2, height / 2, r, paint);
    }
}
