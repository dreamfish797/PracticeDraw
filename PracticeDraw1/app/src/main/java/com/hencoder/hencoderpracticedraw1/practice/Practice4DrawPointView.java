package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {

    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

        // 打开抗锯齿效果
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        int width = canvas.getWidth() / 2;
        int height = canvas.getHeight() / 2;

        // 将坐标原点移动到中心点
        canvas.save();
        canvas.translate(width, height);

        paint.setStrokeWidth(100f);

        // 1.画圆点
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(-width / 2, -height / 2, paint);

        // 1.画方点 `BUTT`
        paint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(width / 2, -height / 2, paint);

        // 1.画方点 `SQUARE`
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(-width / 2, height / 2, paint);
    }
}
