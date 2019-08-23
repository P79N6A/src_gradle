package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amap.api.maps2d.CameraUpdate;

public class ce extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f5822a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f5823b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f5824c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f5825d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f5826e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f5827f;
    /* access modifiers changed from: private */
    public ImageView g;
    /* access modifiers changed from: private */
    public ImageView h;
    /* access modifiers changed from: private */
    public aq i;
    /* access modifiers changed from: private */
    public y j;
    private int k;

    public int b() {
        return this.k;
    }

    public void a() {
        try {
            if (this.f5822a != null) {
                this.f5822a.recycle();
            }
            if (this.f5823b != null) {
                this.f5823b.recycle();
            }
            if (this.f5824c != null) {
                this.f5824c.recycle();
            }
            if (this.f5825d != null) {
                this.f5825d.recycle();
            }
            if (this.f5826e != null) {
                this.f5826e.recycle();
            }
            if (this.f5827f != null) {
                this.f5827f.recycle();
            }
            this.f5822a = null;
            this.f5823b = null;
            this.f5824c = null;
            this.f5825d = null;
            this.f5826e = null;
            this.f5827f = null;
        } catch (Exception e2) {
            cm.a(e2, "ZoomControllerView", "destory");
        }
    }

    public void a(int i2) {
        this.k = i2;
        removeView(this.g);
        removeView(this.h);
        addView(this.g);
        addView(this.h);
    }

    public void a(float f2) {
        try {
            if (f2 < this.j.getMaxZoomLevel() && f2 > this.j.getMinZoomLevel()) {
                this.g.setImageBitmap(this.f5822a);
                this.h.setImageBitmap(this.f5824c);
            } else if (f2 <= this.j.getMinZoomLevel()) {
                this.h.setImageBitmap(this.f5825d);
                this.g.setImageBitmap(this.f5822a);
            } else {
                if (f2 >= this.j.getMaxZoomLevel()) {
                    this.g.setImageBitmap(this.f5823b);
                    this.h.setImageBitmap(this.f5824c);
                }
            }
        } catch (Throwable th) {
            cm.a(th, "ZoomControllerView", "setZoomBitmap");
        }
    }

    public ce(Context context, aq aqVar, y yVar) {
        super(context);
        setWillNotDraw(false);
        this.i = aqVar;
        this.j = yVar;
        try {
            this.f5822a = cm.a("zoomin_selected2d.png");
            this.f5822a = cm.a(this.f5822a, q.f6266a);
            this.f5823b = cm.a("zoomin_unselected2d.png");
            this.f5823b = cm.a(this.f5823b, q.f6266a);
            this.f5824c = cm.a("zoomout_selected2d.png");
            this.f5824c = cm.a(this.f5824c, q.f6266a);
            this.f5825d = cm.a("zoomout_unselected2d.png");
            this.f5825d = cm.a(this.f5825d, q.f6266a);
            this.f5826e = cm.a("zoomin_pressed2d.png");
            this.f5827f = cm.a("zoomout_pressed2d.png");
            this.f5826e = cm.a(this.f5826e, q.f6266a);
            this.f5827f = cm.a(this.f5827f, q.f6266a);
            this.g = new ImageView(context);
            this.g.setImageBitmap(this.f5822a);
            this.g.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ce.this.h.setImageBitmap(ce.this.f5824c);
                    if (ce.this.j.getZoomLevel() > ((float) (((int) ce.this.j.getMaxZoomLevel()) - 2))) {
                        ce.this.g.setImageBitmap(ce.this.f5823b);
                    } else {
                        ce.this.g.setImageBitmap(ce.this.f5822a);
                    }
                    ce.this.a(ce.this.j.getZoomLevel() + 1.0f);
                    ce.this.i.c();
                }
            });
            this.h = new ImageView(context);
            this.h.setImageBitmap(this.f5824c);
            this.h.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ce.this.g.setImageBitmap(ce.this.f5822a);
                    ce.this.a(ce.this.j.getZoomLevel() - 1.0f);
                    if (ce.this.j.getZoomLevel() < ((float) (((int) ce.this.j.getMinZoomLevel()) + 2))) {
                        ce.this.h.setImageBitmap(ce.this.f5825d);
                    } else {
                        ce.this.h.setImageBitmap(ce.this.f5824c);
                    }
                    ce.this.i.d();
                }
            });
            this.g.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (ce.this.j.getZoomLevel() >= ce.this.j.getMaxZoomLevel()) {
                        return false;
                    }
                    if (motionEvent.getAction() == 0) {
                        ce.this.g.setImageBitmap(ce.this.f5826e);
                    } else if (motionEvent.getAction() == 1) {
                        ce.this.g.setImageBitmap(ce.this.f5822a);
                        try {
                            ce.this.j.animateCamera(new CameraUpdate(m.b()));
                        } catch (RemoteException e2) {
                            cm.a(e2, "ZoomControllerView", "ontouch");
                        }
                    }
                    return false;
                }
            });
            this.h.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (ce.this.j.getZoomLevel() <= ce.this.j.getMinZoomLevel()) {
                        return false;
                    }
                    if (motionEvent.getAction() == 0) {
                        ce.this.h.setImageBitmap(ce.this.f5827f);
                    } else if (motionEvent.getAction() == 1) {
                        ce.this.h.setImageBitmap(ce.this.f5824c);
                        try {
                            ce.this.j.animateCamera(new CameraUpdate(m.c()));
                        } catch (RemoteException e2) {
                            cm.a(e2, "ZoomControllerView", "onTouch");
                        }
                    }
                    return false;
                }
            });
            this.g.setPadding(0, 0, 20, -2);
            this.h.setPadding(0, 0, 20, 20);
            setOrientation(1);
            addView(this.g);
            addView(this.h);
        } catch (Throwable th) {
            cm.a(th, "ZoomControllerView", "ZoomControllerView");
        }
    }
}
