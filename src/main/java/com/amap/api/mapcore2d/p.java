package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amap.api.maps2d.CameraUpdate;
import com.amap.api.maps2d.model.CameraPosition;

public class p extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f6259a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f6260b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ImageView f6261c;

    /* renamed from: d  reason: collision with root package name */
    private as f6262d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public y f6263e;

    public void a() {
        try {
            if (this.f6259a != null) {
                this.f6259a.recycle();
            }
            if (this.f6260b != null) {
                this.f6260b.recycle();
            }
            this.f6259a = null;
            this.f6260b = null;
        } catch (Exception e2) {
            cm.a(e2, "CompassView", "destory");
        }
    }

    public p(Context context, as asVar, y yVar) {
        super(context);
        this.f6262d = asVar;
        this.f6263e = yVar;
        try {
            Bitmap a2 = cm.a("maps_dav_compass_needle_large2d.png");
            this.f6260b = cm.a(a2, q.f6266a * 0.8f);
            if (this.f6260b != null) {
                Bitmap a3 = cm.a(a2, q.f6266a * 0.7f);
                this.f6259a = Bitmap.createBitmap(this.f6260b.getWidth(), this.f6260b.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f6259a);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                canvas.drawBitmap(a3, (float) ((this.f6260b.getWidth() - a3.getWidth()) / 2), (float) ((this.f6260b.getHeight() - a3.getHeight()) / 2), paint);
            }
        } catch (Throwable th) {
            cm.a(th, "CompassView", "CompassView");
        }
        this.f6261c = new ImageView(context);
        this.f6261c.setScaleType(ImageView.ScaleType.MATRIX);
        this.f6261c.setImageBitmap(this.f6259a);
        this.f6261c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        this.f6261c.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    p.this.f6261c.setImageBitmap(p.this.f6260b);
                } else if (motionEvent.getAction() == 1) {
                    try {
                        p.this.f6261c.setImageBitmap(p.this.f6259a);
                        CameraPosition cameraPosition = p.this.f6263e.getCameraPosition();
                        p.this.f6263e.animateCamera(new CameraUpdate(m.a(new CameraPosition(cameraPosition.target, cameraPosition.zoom, 0.0f, 0.0f))));
                    } catch (Exception e2) {
                        cm.a(e2, "CompassView", "onTouch");
                    }
                }
                return false;
            }
        });
        addView(this.f6261c);
    }
}
