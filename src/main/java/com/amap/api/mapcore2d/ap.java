package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amap.api.maps2d.CameraUpdate;
import com.amap.api.maps2d.model.LatLng;

public class ap extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f5603a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f5604b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f5605c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ImageView f5606d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public y f5607e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f5608f;

    public void a() {
        try {
            if (this.f5603a != null) {
                this.f5603a.recycle();
            }
            if (this.f5604b != null) {
                this.f5604b.recycle();
            }
            if (this.f5605c != null) {
                this.f5605c.recycle();
            }
            this.f5603a = null;
            this.f5604b = null;
            this.f5605c = null;
        } catch (Exception e2) {
            cm.a(e2, "LocationView", "destory");
        }
    }

    public void a(boolean z) {
        this.f5608f = z;
        if (z) {
            this.f5606d.setImageBitmap(this.f5603a);
        } else {
            this.f5606d.setImageBitmap(this.f5605c);
        }
        this.f5606d.invalidate();
    }

    public ap(Context context, as asVar, y yVar) {
        super(context);
        this.f5607e = yVar;
        try {
            this.f5603a = cm.a("location_selected2d.png");
            this.f5604b = cm.a("location_pressed2d.png");
            this.f5603a = cm.a(this.f5603a, q.f6266a);
            this.f5604b = cm.a(this.f5604b, q.f6266a);
            this.f5605c = cm.a("location_unselected2d.png");
            this.f5605c = cm.a(this.f5605c, q.f6266a);
        } catch (Throwable th) {
            cm.a(th, "LocationView", "LocationView");
        }
        this.f5606d = new ImageView(context);
        this.f5606d.setImageBitmap(this.f5603a);
        this.f5606d.setPadding(0, 20, 20, 0);
        this.f5606d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        this.f5606d.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!ap.this.f5608f) {
                    return false;
                }
                if (motionEvent.getAction() == 0) {
                    ap.this.f5606d.setImageBitmap(ap.this.f5604b);
                } else if (motionEvent.getAction() == 1) {
                    try {
                        ap.this.f5606d.setImageBitmap(ap.this.f5603a);
                        ap.this.f5607e.setMyLocationEnabled(true);
                        Location myLocation = ap.this.f5607e.getMyLocation();
                        if (myLocation == null) {
                            return false;
                        }
                        LatLng latLng = new LatLng(myLocation.getLatitude(), myLocation.getLongitude());
                        ap.this.f5607e.showMyLocationOverlay(myLocation);
                        ap.this.f5607e.moveCamera(new CameraUpdate(m.a(latLng, ap.this.f5607e.getZoomLevel())));
                    } catch (Exception e2) {
                        cm.a(e2, "LocationView", "onTouch");
                    }
                }
                return false;
            }
        });
        addView(this.f5606d);
    }
}
