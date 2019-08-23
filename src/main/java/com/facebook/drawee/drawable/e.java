package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;

public final class e extends ForwardingDrawable {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final Matrix f23724a;

    /* renamed from: b  reason: collision with root package name */
    private int f23725b;

    /* renamed from: c  reason: collision with root package name */
    private int f23726c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f23727d = new Matrix();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f23728e = new RectF();

    public final int getIntrinsicHeight() {
        if (this.f23726c == 5 || this.f23726c == 7 || this.f23725b % 180 != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        if (this.f23726c == 5 || this.f23726c == 7 || this.f23725b % 180 != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    public final void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        if (!this.f23724a.isIdentity()) {
            matrix.preConcat(this.f23724a);
        }
    }

    public final void draw(Canvas canvas) {
        if (this.f23725b > 0 || !(this.f23726c == 0 || this.f23726c == 1)) {
            int save = canvas.save();
            canvas.concat(this.f23724a);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable current = getCurrent();
        if (this.f23725b > 0 || !(this.f23726c == 0 || this.f23726c == 1)) {
            int i = this.f23726c;
            if (i == 2) {
                this.f23724a.setScale(-1.0f, 1.0f);
            } else if (i != 7) {
                switch (i) {
                    case 4:
                        this.f23724a.setScale(1.0f, -1.0f);
                        break;
                    case 5:
                        this.f23724a.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                        this.f23724a.postScale(1.0f, -1.0f);
                        break;
                    default:
                        this.f23724a.setRotate((float) this.f23725b, (float) rect.centerX(), (float) rect.centerY());
                        break;
                }
            } else {
                this.f23724a.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.f23724a.postScale(-1.0f, 1.0f);
            }
            this.f23727d.reset();
            this.f23724a.invert(this.f23727d);
            this.f23728e.set(rect);
            this.f23727d.mapRect(this.f23728e);
            current.setBounds((int) this.f23728e.left, (int) this.f23728e.top, (int) this.f23728e.right, (int) this.f23728e.bottom);
            return;
        }
        current.setBounds(rect);
    }

    public e(Drawable drawable, int i, int i2) {
        super(drawable);
        boolean z;
        boolean z2 = false;
        if (i % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i2 >= 0 && i2 <= 8) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        this.f23724a = new Matrix();
        this.f23725b = i;
        this.f23726c = i2;
    }
}
