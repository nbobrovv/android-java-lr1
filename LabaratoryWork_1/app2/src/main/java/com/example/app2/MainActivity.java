package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));
    }
    class DrawView extends View {
        Paint p;
        Rect rect;

        public DrawView(Context context) {
            super(context);
            p = new Paint();
            rect = new Rect();
        }
        @Override
        protected void onDraw(Canvas canvas){
            canvas.drawARGB(80, 168, 216, 234);

            p.setColor(Color.DKGRAY);
            canvas.drawRect(260, 805, 805, 1350, p);

            p.setColor(Color.rgb(228,208,58));
            canvas.drawRect(343, 872, 465, 985, p);
            canvas.drawRect(343, 1012, 465, 1124, p);
            canvas.drawRect(343, 1153, 465, 1265, p);
            canvas.drawCircle(698, 1249, 10, p);

            p.setColor(Color.rgb(48, 56, 65));
            canvas.drawRect(595, 1127, 718, 1340, p);

            p.setColor(Color.rgb(87, 83, 41));
            canvas.drawCircle(698, 1249, 10, p);

            Path path = new Path();
            path.moveTo(260, 805);
            path.lineTo(534, 528);
            path.lineTo(805, 805);
            p.setColor(Color.rgb(197,208,230));
            canvas.drawPath(path, p);

            p.setColor(Color.rgb(250,235,127));
            p.setStrokeWidth(10);
            float[] points = new float[] {402, 873, 402, 983};
            canvas.drawLines(points, p);

            float[] points2 = new float[] {402, 1014, 402, 1124};
            canvas.drawLines(points2, p);

            float[] points3 = new float[] {402, 1155, 402, 1264};
            canvas.drawLines(points3, p);

        }
    }
}