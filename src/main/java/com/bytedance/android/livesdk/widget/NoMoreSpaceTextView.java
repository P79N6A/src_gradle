package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.util.AttributeSet;
import com.bytedance.android.live.core.widget.LiveTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class NoMoreSpaceTextView extends LiveTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18307a;

    /* renamed from: e  reason: collision with root package name */
    private int f18308e;

    /* renamed from: f  reason: collision with root package name */
    private int f18309f;

    public void scrollBy(int i, int i2) {
    }

    public void scrollTo(int i, int i2) {
    }

    private int getSpaceExtra() {
        if (PatchProxy.isSupport(new Object[0], this, f18307a, false, 14604, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18307a, false, 14604, new Class[0], Integer.TYPE)).intValue();
        } else if (getLineCount() == this.f18309f) {
            return this.f18308e;
        } else {
            this.f18309f = getLineCount();
            this.f18308e = 0;
            int i = this.f18309f - 1;
            Layout layout = getLayout();
            if (i >= 0 && getMeasuredHeight() == layout.getHeight()) {
                Paint.FontMetricsInt fontMetricsInt = layout.getPaint().getFontMetricsInt();
                Rect rect = new Rect();
                this.f18308e = (rect.bottom - (fontMetricsInt.ascent - layout.getLineAscent(i))) - (getLineBounds(i, rect) + fontMetricsInt.bottom);
            }
            return this.f18308e;
        }
    }

    public NoMoreSpaceTextView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18307a, false, 14605, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18307a, false, 14605, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (Exception unused) {
        }
    }

    public NoMoreSpaceTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18307a, false, 14603, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f18307a, false, 14603, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() - getSpaceExtra());
    }

    public NoMoreSpaceTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
