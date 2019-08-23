package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;

public final class b extends ForwardingDrawable implements c, Runnable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f23715a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    float f23716b;

    /* renamed from: c  reason: collision with root package name */
    private int f23717c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f23718d;

    public final /* synthetic */ Drawable a() {
        return new b(DrawableUtils.cloneDrawable(getDrawable()), this.f23717c, this.f23715a);
    }

    public final void run() {
        this.f23718d = false;
        this.f23716b += (float) ((int) ((20.0f / ((float) this.f23717c)) * 360.0f));
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f2 = this.f23716b;
        if (!this.f23715a) {
            f2 = 360.0f - this.f23716b;
        }
        canvas.rotate(f2, (float) (bounds.left + (i / 2)), (float) (bounds.top + (i2 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.f23718d) {
            this.f23718d = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public b(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    private b(Drawable drawable, int i, boolean z) {
        super((Drawable) Preconditions.checkNotNull(drawable));
        this.f23716b = 0.0f;
        this.f23718d = false;
        this.f23717c = i;
        this.f23715a = z;
    }
}
