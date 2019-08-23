package com.mapbox.mapboxsdk.maps.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.maps.o;

public final class CompassView extends AppCompatImageView implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public float f26741a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26742b = true;

    /* renamed from: c  reason: collision with root package name */
    public ViewPropertyAnimatorCompat f26743c;

    /* renamed from: d  reason: collision with root package name */
    public o.h f26744d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26745e;

    public final Drawable getCompassImage() {
        return getDrawable();
    }

    public final void a() {
        if (this.f26743c != null) {
            this.f26743c.cancel();
        }
        this.f26743c = null;
    }

    public final boolean b() {
        if (!this.f26742b || !c()) {
            return false;
        }
        return true;
    }

    private boolean c() {
        if (((double) Math.abs(this.f26741a)) >= 359.0d || ((double) Math.abs(this.f26741a)) <= 1.0d) {
            return true;
        }
        return false;
    }

    public final void run() {
        if (b()) {
            this.f26744d.b();
            a();
            setLayerType(2, null);
            this.f26743c = ViewCompat.animate(this).alpha(0.0f).setDuration(500);
            this.f26743c.setListener(new ViewPropertyAnimatorListenerAdapter() {
                public void onAnimationEnd(View view) {
                    CompassView.this.setLayerType(0, null);
                    CompassView.this.setVisibility(4);
                    CompassView.this.a();
                }
            });
        }
    }

    public final void setCompassImage(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public CompassView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        setEnabled(false);
        int i = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        setLayoutParams(new ViewGroup.LayoutParams(i, i));
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z || b()) {
            a();
            setAlpha(0.0f);
            setVisibility(4);
            return;
        }
        a();
        setAlpha(1.0f);
        setVisibility(0);
    }

    public CompassView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public CompassView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
