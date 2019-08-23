package com.ss.android.ad.splash.core;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.ss.android.ad.splash.core.c.b;
import com.ss.android.ad.splash.core.c.c;

public class BDASplashImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public b f27524a;

    /* renamed from: b  reason: collision with root package name */
    private l f27525b;

    /* renamed from: c  reason: collision with root package name */
    private float f27526c;

    /* renamed from: d  reason: collision with root package name */
    private float f27527d;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public boolean performClick() {
        return super.performClick();
    }

    public BDASplashImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public void setInteraction(l lVar) {
        this.f27525b = lVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.f27524a.p() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f27526c = motionEvent.getX();
            this.f27527d = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            c.a aVar = new c.a();
            float f2 = this.f27526c;
            float f3 = this.f27527d;
            int width = getWidth();
            int height = getHeight();
            float f4 = (float) width;
            if (f4 > 0.0f) {
                float f5 = (float) height;
                if (f5 > 0.0f) {
                    float f6 = f2 / f4;
                    float f7 = f3 / f5;
                    int i3 = 2;
                    if (f6 < 0.33f) {
                        i2 = 0;
                    } else if (0.33f > f6 || f6 > 0.67f) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    if (f7 < 0.33f) {
                        i3 = 0;
                    } else if (0.33f <= f7 && f7 <= 0.67f) {
                        i3 = 1;
                    }
                    i = (i3 * 3) + i2;
                    this.f27525b.a(this.f27524a, aVar.a(i).a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
                }
            }
            i = -1;
            this.f27525b.a(this.f27524a, aVar.a(i).a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
        }
        return true;
    }

    public BDASplashImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BDASplashImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
