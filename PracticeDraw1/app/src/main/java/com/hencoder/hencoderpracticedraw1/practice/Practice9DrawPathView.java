package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        练习内容：使用 canvas.drawPath() 方法画心形

        float w = canvas.getWidth() / 2;
        float h = canvas.getHeight() / 2;

        canvas.save();
        canvas.translate(w, h);

        Paint paint = new Paint();

        // 画分界线
        canvas.drawLine(-w, 0, w, 0, paint);
        canvas.drawLine(0, -h, 0, h, paint);

        Path path = new Path(); // 初始化 Path 对象

        // 画图形线框
        path.addArc(50, -100, 150, 0, -225, 225);
        path.arcTo(150, -100, 250, 0, -180, 225, false);
        path.lineTo(150, 102);
        path.close();
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path, paint);

        // 画填充图形
        Path path2 = new Path(); // 初始化 Path 对象
        path2.addArc(-250, -100, -150, 0, -225, 225);
        path2.arcTo(-150, -100, -50, 0, -180, 225, false);
        path2.lineTo(-150, 102);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path2, paint);

    }
}
