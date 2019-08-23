package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;

public class bk extends View {

    /* renamed from: a  reason: collision with root package name */
    private String f5751a = "";

    /* renamed from: b  reason: collision with root package name */
    private int f5752b;

    /* renamed from: c  reason: collision with root package name */
    private b f5753c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f5754d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f5755e;

    /* renamed from: f  reason: collision with root package name */
    private Rect f5756f;

    public void a() {
        this.f5754d = null;
        this.f5755e = null;
        this.f5756f = null;
        this.f5751a = null;
    }

    public void a(int i) {
        this.f5752b = i;
    }

    public void a(String str) {
        this.f5751a = str;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        try {
            if (!this.f5753c.c().isScaleControlsEnabled()) {
                return;
            }
        } catch (RemoteException unused) {
        }
        if (!this.f5751a.equals("") && this.f5752b != 0) {
            int i2 = this.f5752b;
            try {
                if (i2 > this.f5753c.getWidth() / 5) {
                    i2 = this.f5753c.getWidth() / 5;
                }
            } catch (Exception e2) {
                cm.a(e2, "ScaleView", "onDraw");
            }
            Point f2 = this.f5753c.f();
            this.f5755e.getTextBounds(this.f5751a, 0, this.f5751a.length(), this.f5756f);
            if (f2.x + i2 > this.f5753c.getWidth() - 10) {
                i = (this.f5753c.getWidth() - 10) - ((this.f5756f.width() + i2) / 2);
            } else {
                i = f2.x + ((i2 - this.f5756f.width()) / 2);
            }
            int height = (f2.y - this.f5756f.height()) + 5;
            canvas.drawText(this.f5751a, (float) i, (float) height, this.f5755e);
            int width = i - ((i2 - this.f5756f.width()) / 2);
            int height2 = height + (this.f5756f.height() - 5);
            float f3 = (float) width;
            float f4 = (float) (height2 - 2);
            float f5 = (float) (height2 + 2);
            Canvas canvas2 = canvas;
            float f6 = f3;
            canvas2.drawLine(f6, f4, f3, f5, this.f5754d);
            float f7 = (float) height2;
            float f8 = (float) (width + i2);
            float f9 = f8;
            canvas2.drawLine(f6, f7, f9, f7, this.f5754d);
            canvas2.drawLine(f8, f4, f9, f5, this.f5754d);
        }
    }

    public bk(Context context, b bVar) {
        super(context);
        this.f5753c = bVar;
        this.f5754d = new Paint();
        this.f5756f = new Rect();
        this.f5754d.setAntiAlias(true);
        this.f5754d.setColor(-16777216);
        this.f5754d.setStrokeWidth(q.f6266a * 2.0f);
        this.f5754d.setStyle(Paint.Style.STROKE);
        this.f5755e = new Paint();
        this.f5755e.setAntiAlias(true);
        this.f5755e.setColor(-16777216);
        this.f5755e.setTextSize(q.f6266a * 20.0f);
    }
}
