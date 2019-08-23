package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.widget.Scroller;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class MarqueeTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71337a;

    /* renamed from: b  reason: collision with root package name */
    public Scroller f71338b;

    /* renamed from: c  reason: collision with root package name */
    public int f71339c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f71340d;

    /* renamed from: e  reason: collision with root package name */
    private int f71341e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f71342f;
    private int g;
    private int h;

    public int getRndDuration() {
        return this.f71341e;
    }

    public int getScrollFirstDelay() {
        return this.h;
    }

    public int getScrollMode() {
        return this.g;
    }

    public void computeScroll() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f71337a, false, 81325, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71337a, false, 81325, new Class[0], Void.TYPE);
            return;
        }
        super.computeScroll();
        if (this.f71338b != null && this.f71338b.isFinished() && !this.f71340d) {
            if (this.g == 101) {
                if (PatchProxy.isSupport(new Object[0], this, f71337a, false, 81323, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f71337a, false, 81323, new Class[0], Void.TYPE);
                } else if (this.f71338b != null) {
                    this.f71340d = true;
                    this.f71338b.startScroll(0, 0, 0, 0, 0);
                }
            } else {
                this.f71340d = true;
                this.f71339c = getWidth() * -1;
                this.f71342f = false;
                if (PatchProxy.isSupport(new Object[0], this, f71337a, false, 81321, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f71337a, false, 81321, new Class[0], Void.TYPE);
                } else if (this.f71340d) {
                    setHorizontallyScrolling(true);
                    if (this.f71338b != null) {
                        setScroller(this.f71338b);
                    }
                    if (PatchProxy.isSupport(new Object[0], this, f71337a, false, 81324, new Class[0], Integer.TYPE)) {
                        i = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71337a, false, 81324, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        TextPaint paint = getPaint();
                        Rect rect = new Rect();
                        String charSequence = getText().toString();
                        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                        i = rect.width();
                    }
                    final int i2 = i - this.f71339c;
                    double d2 = (double) (this.f71341e * i2);
                    Double.isNaN(d2);
                    double d3 = (double) i;
                    Double.isNaN(d3);
                    final int intValue = Double.valueOf((d2 * 1.0d) / d3).intValue();
                    if (this.f71342f) {
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f71343a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f71343a, false, 81326, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f71343a, false, 81326, new Class[0], Void.TYPE);
                                    return;
                                }
                                MarqueeTextView.this.f71338b.startScroll(MarqueeTextView.this.f71339c, 0, i2, 0, intValue);
                                MarqueeTextView.this.invalidate();
                                MarqueeTextView.this.f71340d = false;
                            }
                        }, (long) this.h);
                        return;
                    }
                    this.f71338b.startScroll(this.f71339c, 0, i2, 0, intValue);
                    invalidate();
                    this.f71340d = false;
                }
            }
        }
    }

    public void setRndDuration(int i) {
        this.f71341e = i;
    }

    public void setScrollFirstDelay(int i) {
        this.h = i;
    }

    public void setScrollMode(int i) {
        this.g = i;
    }
}
