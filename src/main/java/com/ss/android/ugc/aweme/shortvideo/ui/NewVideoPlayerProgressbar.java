package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;

public class NewVideoPlayerProgressbar extends ProgressBar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70512a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f70513b;

    /* renamed from: c  reason: collision with root package name */
    private float f70514c;

    /* renamed from: d  reason: collision with root package name */
    private int f70515d;

    /* renamed from: e  reason: collision with root package name */
    private int f70516e;

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f70512a, false, 80252, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70512a, false, 80252, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
    }

    public ObjectAnimator getHideAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f70512a, false, 80250, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f70512a, false, 80250, new Class[0], ObjectAnimator.class);
        }
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    public ObjectAnimator getShowAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f70512a, false, 80251, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f70512a, false, 80251, new Class[0], ObjectAnimator.class);
        }
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
    }

    public void setReachedBarColor(int i) {
        this.f70516e = i;
    }

    public void setReachedProgressBarHeight(float f2) {
        this.f70514c = f2;
    }

    public NewVideoPlayerProgressbar(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f70512a, false, 80246, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f70512a, false, 80246, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        canvas.save();
        float progress = (float) ((int) (((float) this.f70515d) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f70513b.setColor(this.f70516e);
            this.f70513b.setStrokeWidth(this.f70514c);
            canvas.drawLine(0.0f, (float) (getHeight() / 2), progress, (float) (getHeight() / 2), this.f70513b);
        }
        canvas.restore();
    }

    public NewVideoPlayerProgressbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70512a, false, 80243, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70512a, false, 80243, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70512a, false, 80244, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70512a, false, 80244, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824) {
                i3 = size2;
            } else {
                int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f70514c, Math.abs(this.f70513b.descent() - this.f70513b.ascent())));
                if (mode == Integer.MIN_VALUE) {
                    i3 = Math.min(paddingTop, size2);
                } else {
                    i3 = paddingTop;
                }
            }
        }
        setMeasuredDimension(size, i3);
        this.f70515d = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
    }

    public NewVideoPlayerProgressbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f70513b = new Paint();
        if (PatchProxy.isSupport(new Object[]{6}, this, f70512a, false, 80247, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{6}, this, f70512a, false, 80247, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            i2 = (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
        }
        this.f70514c = (float) i2;
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f70512a, false, 80245, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f70512a, false, 80245, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.VideoPlayerProgressbar);
        this.f70516e = obtainStyledAttributes.getColor(0, -261935);
        this.f70514c = obtainStyledAttributes.getDimension(1, this.f70514c);
        obtainStyledAttributes.recycle();
    }
}
