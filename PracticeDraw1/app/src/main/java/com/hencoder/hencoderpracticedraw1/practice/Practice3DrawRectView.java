package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形

        // 打开抗锯齿效果
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        int width = canvas.getWidth() / 2;
        int height = canvas.getHeight() / 2;

        // 将坐标原点移动到中心点
        canvas.save();
        canvas.translate(width, height);

        // 画实心矩形
        canvas.drawRect(-250, -100, -50, 100, paint);

        // 画空心矩形
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(50, -100, 250, 100, paint);
    }
}
