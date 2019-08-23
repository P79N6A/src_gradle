package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import com.amap.api.mapcore2d.q;
import java.io.InputStream;

public class cd extends View {

    /* renamed from: a  reason: collision with root package name */
    private Bitmap f5816a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f5817b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f5818c = new Paint();

    /* renamed from: d  reason: collision with root package name */
    private boolean f5819d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f5820e = 0;

    /* renamed from: f  reason: collision with root package name */
    private b f5821f;
    private int g = 0;
    private int h = 10;

    public int d() {
        return this.g;
    }

    public Bitmap b() {
        if (this.f5819d) {
            return this.f5817b;
        }
        return this.f5816a;
    }

    public Point c() {
        return new Point(this.h, (getHeight() - this.f5820e) - 10);
    }

    public void a() {
        try {
            if (this.f5816a != null) {
                this.f5816a.recycle();
            }
            if (this.f5817b != null) {
                this.f5817b.recycle();
            }
            this.f5816a = null;
            this.f5817b = null;
            this.f5818c = null;
        } catch (Exception e2) {
            cm.a(e2, "WaterMarkerView", "destory");
        }
    }

    public void a(int i) {
        this.g = i;
    }

    public void a(boolean z) {
        this.f5819d = z;
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        if (this.f5817b != null && this.f5816a != null) {
            int width = this.f5817b.getWidth() + 3;
            if (this.g == 1) {
                this.h = (this.f5821f.getWidth() - width) / 2;
            } else if (this.g == 2) {
                this.h = (this.f5821f.getWidth() - width) - 10;
            } else {
                this.h = 10;
            }
            if (b() != null) {
                if (q.f6270e == q.a.ALIBABA) {
                    canvas.drawBitmap(b(), (float) (this.h + 15), (float) ((getHeight() - this.f5820e) - 8), this.f5818c);
                } else {
                    canvas.drawBitmap(b(), (float) this.h, (float) ((getHeight() - this.f5820e) - 8), this.f5818c);
                }
            }
        }
    }

    public cd(Context context, b bVar) {
        super(context);
        InputStream inputStream;
        InputStream inputStream2;
        this.f5821f = bVar;
        AssetManager assets = context.getResources().getAssets();
        try {
            if (q.f6270e == q.a.ALIBABA) {
                inputStream = assets.open("apl2d.data");
            } else {
                inputStream = assets.open("ap2d.data");
            }
            this.f5816a = BitmapFactory.decodeStream(inputStream);
            this.f5816a = cm.a(this.f5816a, q.f6266a);
            inputStream.close();
            if (q.f6270e == q.a.ALIBABA) {
                inputStream2 = assets.open("apl12d.data");
            } else {
                inputStream2 = assets.open("ap12d.data");
            }
            this.f5817b = BitmapFactory.decodeStream(inputStream2);
            this.f5817b = cm.a(this.f5817b, q.f6266a);
            inputStream2.close();
            this.f5820e = this.f5817b.getHeight();
        } catch (Throwable th) {
            cm.a(th, "WaterMarkerView", "WaterMarkerView");
        }
        this.f5818c.setAntiAlias(true);
        this.f5818c.setColor(-16777216);
        this.f5818c.setStyle(Paint.Style.STROKE);
    }
}
