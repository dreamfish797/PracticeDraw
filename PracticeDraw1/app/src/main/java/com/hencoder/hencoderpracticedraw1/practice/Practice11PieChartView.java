package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paintLine, paint;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int widthCenter = canvas.getWidth() / 2;
        int heightCenter = canvas.getHeight() / 2;
        int radius = heightCenter / 2;

        RectF rectF = new RectF(widthCenter - radius,
                heightCenter - radius, widthCenter + radius, heightCenter + radius);
        RectF rectFRed = new RectF(widthCenter - radius - 10,
                heightCenter - radius - 10, widthCenter + radius - 10, heightCenter + radius - 10);

        paint = new Paint();
        paintLine = new Paint();
        paintLine.setStyle(Paint.Style.STROKE);
        paintLine.setTextSize(15);
        paintLine.setColor(Color.WHITE);

        Path path = new Path();
        path.moveTo(widthCenter - 0.66f * radius, heightCenter + 0.66f * radius);
        path.lineTo(widthCenter - 0.8f * radius, heightCenter + 0.8f * radius);
        path.lineTo(widthCenter - 0.8f * radius - 60, heightCenter + 0.8f * radius);
        canvas.drawPath(path, paintLine);

        canvas.drawText("KitKat", widthCenter - 0.8f * radius - 130, heightCenter + 0.8f * radius+5
                , paintLine);

        //红色
        paint.setColor(Color.parseColor("#EE2B29"));
        canvas.drawArc(rectFRed, 180, 120, true, paint);
        //蓝色
        paint.setColor(Color.parseColor("#1E80F0"));
        canvas.drawArc(rectF, 75, 105, true, paint);
        //绿色
        paint.setColor(Color.parseColor("#118575"));
        canvas.drawArc(rectF, 20, 50, true, paint);
        //灰色
        paint.setColor(Color.parseColor("#8c8c8c"));
        canvas.drawArc(rectF, 10, 8, true, paint);
        //紫色
        paint.setColor(Color.parseColor("#830A9B"));
        canvas.drawArc(rectF, 0, 8, true, paint);
        //背景色
        paint.setColor(Color.parseColor("#506E7A"));
        canvas.drawArc(rectF, 355, 5, true, paint);
        //黄色
        paint.setColor(Color.parseColor("#FDB60D"));
        canvas.drawArc(rectF, 300, 55, true, paint);

    }
}
