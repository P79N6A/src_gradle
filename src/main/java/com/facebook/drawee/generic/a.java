package com.facebook.drawee.generic;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.drawable.ForwardingDrawable;
import com.facebook.drawee.drawable.VisibilityAwareDrawable;
import com.facebook.drawee.drawable.VisibilityCallback;
import javax.annotation.Nullable;

public final class a extends ForwardingDrawable implements VisibilityAwareDrawable {
    @VisibleForTesting
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    Drawable f23742a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private VisibilityCallback f23743b;

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public a(Drawable drawable) {
        super(drawable);
    }

    public final void setVisibilityCallback(@Nullable VisibilityCallback visibilityCallback) {
        this.f23743b = visibilityCallback;
    }

    @SuppressLint({"WrongCall"})
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            if (this.f23743b != null) {
                this.f23743b.onDraw();
            }
            super.draw(canvas);
            if (this.f23742a != null) {
                this.f23742a.setBounds(getBounds());
                this.f23742a.draw(canvas);
            }
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f23743b != null) {
            this.f23743b.onVisibilityChange(z);
        }
        return super.setVisible(z, z2);
    }
}
