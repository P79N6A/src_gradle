package com.mapbox.android.gestures;

import android.content.Context;
import android.support.annotation.DimenRes;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Iterator;

@UiThread
public final class f extends e<a> {
    public long g;
    public float h;
    private boolean i;
    private boolean n;
    private int o;

    public interface a {
        boolean a(f fVar, int i);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        super.c();
        this.o = 0;
        this.i = false;
        this.n = false;
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        if (this.o <= 1 || this.i || this.f25944d >= this.g || !super.a(i2)) {
            return false;
        }
        return true;
    }

    public final void c(@DimenRes int i2) {
        this.h = this.f25941a.getResources().getDimension(C0906R.dimen.i3);
    }

    /* access modifiers changed from: protected */
    public final boolean b(MotionEvent motionEvent) {
        boolean z;
        super.b(motionEvent);
        boolean z2 = true;
        boolean z3 = false;
        switch (motionEvent.getActionMasked()) {
            case 1:
                if (a(4)) {
                    z3 = ((a) this.f25946f).a(this, this.o);
                }
                c();
                return z3;
            case 2:
                if (!this.i) {
                    Iterator it2 = this.l.values().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            d dVar = (d) it2.next();
                            float abs = Math.abs(dVar.f25955c - dVar.f25953a);
                            float abs2 = Math.abs(dVar.f25956d - dVar.f25954b);
                            if (abs > this.h || abs2 > this.h) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.i = z;
                            if (this.i) {
                            }
                        } else {
                            z2 = false;
                        }
                    }
                    this.i = z2;
                    break;
                }
                break;
            case 5:
                if (this.n) {
                    this.i = true;
                }
                this.o = this.k.size();
                break;
            case 6:
                this.n = true;
                break;
        }
        return false;
    }

    public f(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }
}
