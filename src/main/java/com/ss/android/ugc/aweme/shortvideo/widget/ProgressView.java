package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ProgressView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71353a;

    /* renamed from: b  reason: collision with root package name */
    private int f71354b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f71355c;

    /* renamed from: d  reason: collision with root package name */
    private int f71356d;

    /* renamed from: e  reason: collision with root package name */
    private int f71357e;

    /* renamed from: f  reason: collision with root package name */
    private int f71358f;
    private RectF g;

    public void setProgress(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71353a, false, 81335, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71353a, false, 81335, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i >= 0 && i <= 100 && this.f71354b != i) {
            this.f71354b = i;
            setText(this.f71354b + "%");
        }
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f71353a, false, 81336, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f71353a, false, 81336, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int i = width / 2;
        int i2 = height / 2;
        int i3 = this.f71356d / 2;
        this.f71355c.setColor(this.f71357e);
        this.f71355c.setStrokeWidth((float) this.f71356d);
        this.f71355c.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((float) i, (float) i2, (float) (Math.min(i, i2) - i3), this.f71355c);
        this.f71355c.setColor(this.f71358f);
        float f2 = (float) (i3 + 0);
        this.g.set(f2, f2, (float) (width - i3), (float) (height - i3));
        canvas.drawArc(this.g, 270.0f, (float) ((this.f71354b * 360) / 100), false, this.f71355c);
    }
}
