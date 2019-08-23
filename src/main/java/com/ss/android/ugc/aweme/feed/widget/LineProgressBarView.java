package com.ss.android.ugc.aweme.feed.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LineProgressBarView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46983a;

    /* renamed from: b  reason: collision with root package name */
    private int f46984b;

    /* renamed from: c  reason: collision with root package name */
    private int f46985c;

    /* renamed from: d  reason: collision with root package name */
    private int f46986d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f46987e;

    /* renamed from: f  reason: collision with root package name */
    private Rect f46988f;

    public int getProgress() {
        return this.f46984b;
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f46983a, false, 43682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46983a, false, 43682, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.f46987e = new Paint(1);
        this.f46988f = new Rect();
    }

    public LineProgressBarView(Context context) {
        super(context);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f46983a, false, 43686, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f46983a, false, 43686, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        this.f46988f.set(0, 0, (getMeasuredWidth() * this.f46984b) / this.f46985c, getMeasuredHeight());
        canvas.drawRect(this.f46988f, this.f46987e);
    }

    public void setColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46983a, false, 43683, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46983a, false, 43683, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f46986d = i;
        this.f46987e.setColor(i);
        postInvalidate();
    }

    public void setMaxProgress(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46983a, false, 43685, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46983a, false, 43685, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f46985c = i;
        postInvalidate();
    }

    public void setProgress(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46983a, false, 43684, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46983a, false, 43684, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f46984b = i;
        postInvalidate();
    }

    public LineProgressBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineProgressBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public LineProgressBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
