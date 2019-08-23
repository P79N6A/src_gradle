package com.mapbox.mapboxsdk.annotations;

import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Build;
import android.support.annotation.LayoutRes;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.o;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<o> f26443a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<View> f26444b;

    /* renamed from: c  reason: collision with root package name */
    public float f26445c;

    /* renamed from: d  reason: collision with root package name */
    public float f26446d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26447e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Marker> f26448f;
    private float g;
    private float h;
    private PointF i;
    @LayoutRes
    private int j;
    private final ViewTreeObserver.OnGlobalLayoutListener k;

    /* access modifiers changed from: package-private */
    public final Marker c() {
        if (this.f26448f == null) {
            return null;
        }
        return (Marker) this.f26448f.get();
    }

    public final void a() {
        o oVar = (o) this.f26443a.get();
        Marker marker = (Marker) this.f26448f.get();
        if (!(marker == null || oVar == null)) {
            oVar.f26699e.b(marker);
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public final g b() {
        o oVar = (o) this.f26443a.get();
        if (this.f26447e && oVar != null) {
            this.f26447e = false;
            View view = (View) this.f26444b.get();
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            c();
            a(null);
        }
        return this;
    }

    public final void d() {
        o oVar = (o) this.f26443a.get();
        Marker marker = (Marker) this.f26448f.get();
        View view = (View) this.f26444b.get();
        if (oVar != null && marker != null && view != null) {
            this.i = oVar.f26697c.a(marker.position);
            if (view instanceof BubbleLayout) {
                view.setX((this.i.x + this.h) - this.g);
            } else {
                view.setX((this.i.x - ((float) (view.getMeasuredWidth() / 2))) - this.g);
            }
            view.setY(this.i.y + this.f26446d);
        }
    }

    private g a(Marker marker) {
        this.f26448f = new WeakReference<>(marker);
        return this;
    }

    g(View view, o oVar) {
        this.k = new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                View view = (View) g.this.f26444b.get();
                if (view != null) {
                    if (Build.VERSION.SDK_INT >= 16) {
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    g.this.f26446d = ((float) (-view.getMeasuredHeight())) + g.this.f26445c;
                    g.this.d();
                }
            }
        };
        a(view, oVar);
    }

    private void a(View view, o oVar) {
        this.f26443a = new WeakReference<>(oVar);
        this.f26447e = false;
        this.f26444b = new WeakReference<>(view);
        view.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                o oVar = (o) g.this.f26443a.get();
                if (oVar != null) {
                    o.k kVar = oVar.f26699e.f26613b.f26650d;
                    boolean z = false;
                    if (kVar != null) {
                        g.this.c();
                        z = kVar.a();
                    }
                    if (!z) {
                        g.this.a();
                    }
                }
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() {
            public final boolean onLongClick(View view) {
                o oVar = (o) g.this.f26443a.get();
                if (!(oVar == null || oVar.f26699e.f26613b.f26651e == null)) {
                    g.this.c();
                }
                return true;
            }
        });
    }

    g(MapView mapView, int i2, o oVar) {
        this.k = new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                View view = (View) g.this.f26444b.get();
                if (view != null) {
                    if (Build.VERSION.SDK_INT >= 16) {
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    g.this.f26446d = ((float) (-view.getMeasuredHeight())) + g.this.f26445c;
                    g.this.d();
                }
            }
        };
        this.j = C0906R.layout.a_y;
        a(LayoutInflater.from(mapView.getContext()).inflate(C0906R.layout.a_y, mapView, false), oVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(Marker marker, o oVar, MapView mapView) {
        View view = (View) this.f26444b.get();
        if (view == null) {
            view = LayoutInflater.from(mapView.getContext()).inflate(this.j, mapView, false);
            a(view, oVar);
        }
        this.f26443a = new WeakReference<>(oVar);
        String str = marker.f26419e;
        TextView textView = (TextView) view.findViewById(C0906R.id.auo);
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        String str2 = marker.f26418d;
        TextView textView2 = (TextView) view.findViewById(C0906R.id.aun);
        if (!TextUtils.isEmpty(str2)) {
            textView2.setText(str2);
            textView2.setVisibility(0);
            return;
        }
        textView2.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public final g a(MapView mapView, Marker marker, LatLng latLng, int i2, int i3) {
        float f2;
        boolean z;
        float f3;
        boolean z2;
        int i4 = i2;
        int i5 = i3;
        a(marker);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        o oVar = (o) this.f26443a.get();
        View view = (View) this.f26444b.get();
        if (!(view == null || oVar == null)) {
            view.measure(0, 0);
            float f4 = (float) i5;
            this.f26445c = f4;
            this.g = (float) (-i4);
            this.i = oVar.f26697c.a(latLng);
            float f5 = (float) i4;
            float measuredWidth = (this.i.x - ((float) (view.getMeasuredWidth() / 2))) + f5;
            float measuredHeight = (this.i.y - ((float) view.getMeasuredHeight())) + f4;
            if (view instanceof BubbleLayout) {
                Resources resources = mapView.getContext().getResources();
                float measuredWidth2 = ((float) view.getMeasuredWidth()) + measuredWidth;
                float right = (float) mapView.getRight();
                float left = (float) mapView.getLeft();
                float dimension = resources.getDimension(C0906R.dimen.i9);
                float dimension2 = resources.getDimension(C0906R.dimen.i_) / 2.0f;
                float measuredWidth3 = ((float) (view.getMeasuredWidth() / 2)) - dimension2;
                if (this.i.x >= 0.0f && this.i.x <= ((float) mapView.getWidth()) && this.i.y >= 0.0f && this.i.y <= ((float) mapView.getHeight())) {
                    if (measuredWidth2 > right) {
                        float f6 = measuredWidth2 - right;
                        f3 = measuredWidth - f6;
                        measuredWidth3 += f6 + dimension2;
                        f2 = ((float) view.getMeasuredWidth()) + f3;
                        z = true;
                    } else {
                        f3 = measuredWidth;
                        f2 = measuredWidth2;
                        z = false;
                    }
                    if (measuredWidth < left) {
                        float f7 = left - measuredWidth;
                        f3 += f7;
                        measuredWidth3 -= f7 + dimension2;
                        measuredWidth = f3;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        float f8 = right - f2;
                        if (f8 < dimension) {
                            float f9 = dimension - f8;
                            f3 -= f9;
                            measuredWidth3 += f9 - dimension2;
                            measuredWidth = f3;
                        }
                    }
                    if (z2) {
                        float f10 = measuredWidth - left;
                        if (f10 < dimension) {
                            float f11 = dimension - f10;
                            f3 += f11;
                            measuredWidth3 -= f11 - dimension2;
                        }
                    }
                    measuredWidth = f3;
                }
                BubbleLayout bubbleLayout = (BubbleLayout) view;
                int paddingLeft = bubbleLayout.getPaddingLeft();
                int paddingRight = bubbleLayout.getPaddingRight();
                int paddingTop = bubbleLayout.getPaddingTop();
                int paddingBottom = bubbleLayout.getPaddingBottom();
                switch (bubbleLayout.f26412a.f26424a) {
                    case 0:
                        paddingLeft = (int) (((float) paddingLeft) - bubbleLayout.f26413b);
                        break;
                    case 1:
                        paddingRight = (int) (((float) paddingRight) - bubbleLayout.f26413b);
                        break;
                    case 2:
                        paddingTop = (int) (((float) paddingTop) - bubbleLayout.f26414c);
                        break;
                    case 3:
                        paddingBottom = (int) (((float) paddingBottom) - bubbleLayout.f26414c);
                        break;
                }
                if (bubbleLayout.f26416e > 0.0f) {
                    paddingLeft = (int) (((float) paddingLeft) - bubbleLayout.f26416e);
                    paddingRight = (int) (((float) paddingRight) - bubbleLayout.f26416e);
                    paddingTop = (int) (((float) paddingTop) - bubbleLayout.f26416e);
                    paddingBottom = (int) (((float) paddingBottom) - bubbleLayout.f26416e);
                }
                bubbleLayout.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                bubbleLayout.f26415d = measuredWidth3;
                bubbleLayout.a();
            }
            view.setX(measuredWidth);
            view.setY(measuredHeight);
            this.h = (measuredWidth - this.i.x) - f5;
            this.f26446d = (float) ((-view.getMeasuredHeight()) + i5);
            b();
            mapView.addView(view, layoutParams);
            this.f26447e = true;
        }
        return this;
    }
}
