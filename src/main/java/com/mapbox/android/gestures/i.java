package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Set;

@UiThread
public abstract class i<L> extends e<L> {
    private boolean g;
    public final Set<Integer> n = a();
    public boolean o;
    VelocityTracker p;
    float q;
    float r;

    /* access modifiers changed from: protected */
    @NonNull
    public abstract Set<Integer> a();

    public void h() {
        if (this.o) {
            this.g = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void g() {
        this.o = true;
        if (this.p == null) {
            this.p = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.o = false;
        if (this.p != null) {
            this.p.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            this.q = this.p.getXVelocity();
            this.r = this.p.getYVelocity();
            this.p.recycle();
            this.p = null;
        }
        c();
    }

    public final void a(boolean z) {
        super.a(z);
        if (!z) {
            h();
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(MotionEvent motionEvent) {
        if (this.g) {
            this.g = false;
            d();
        }
        if (this.p != null) {
            this.p.addMovement(this.f25942b);
        }
        boolean b2 = super.b(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            if (this.p != null) {
                this.p.clear();
            }
        } else if (actionMasked == 1 || actionMasked == 6) {
            if (this.k.size() < e() && this.o) {
                d();
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.p != null) {
                this.p.clear();
            }
            if (this.o) {
                d();
                return true;
            }
        }
        return b2;
    }

    public i(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }
}
