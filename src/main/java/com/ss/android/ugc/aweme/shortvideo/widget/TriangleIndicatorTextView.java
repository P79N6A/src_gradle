package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TriangleIndicatorTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71387a;

    /* renamed from: b  reason: collision with root package name */
    final RectF f71388b;

    /* renamed from: c  reason: collision with root package name */
    final Paint f71389c;

    /* renamed from: d  reason: collision with root package name */
    float f71390d;

    /* renamed from: e  reason: collision with root package name */
    float f71391e;

    /* renamed from: f  reason: collision with root package name */
    float f71392f;
    public boolean g;

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f71387a, false, 81461, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71387a, false, 81461, new Class[0], Void.TYPE);
            return;
        }
        animate().alpha(0.0f).setDuration(300).start();
        this.g = false;
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f71387a, false, 81458, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f71387a, false, 81458, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        canvas.save();
        canvas.clipRect(0, measuredHeight, measuredWidth, measuredHeight * 2);
        canvas.translate(this.f71390d, ((float) measuredHeight) - this.f71392f);
        canvas.rotate(-45.0f);
        this.f71388b.right = this.f71391e;
        this.f71388b.bottom = this.f71391e;
        canvas.drawRoundRect(this.f71388b, this.f71392f, this.f71392f, this.f71389c);
        canvas.restore();
    }

    public void setIndicatorOffset(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71387a, false, 81459, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71387a, false, 81459, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f71390d = f2 - (this.f71391e / 1.41421f);
        invalidate();
    }
}
