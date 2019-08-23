package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.android.livesdk.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LiveRoundImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18260a;

    /* renamed from: b  reason: collision with root package name */
    private int f18261b;

    /* renamed from: c  reason: collision with root package name */
    private int f18262c;

    /* renamed from: d  reason: collision with root package name */
    private int f18263d;

    /* renamed from: e  reason: collision with root package name */
    private int f18264e;

    public LiveRoundImageView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18260a, false, 14497, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18260a, false, 14497, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(this.f18261b, this.f18263d) + Math.max(this.f18262c, this.f18264e);
        int max2 = Math.max(this.f18261b, this.f18262c) + Math.max(this.f18263d, this.f18264e);
        if (width >= max && height > max2) {
            Path path = new Path();
            path.moveTo((float) this.f18261b, 0.0f);
            path.lineTo((float) (width - this.f18262c), 0.0f);
            float f2 = (float) width;
            path.quadTo(f2, 0.0f, f2, (float) this.f18262c);
            path.lineTo(f2, (float) (height - this.f18264e));
            float f3 = (float) height;
            path.quadTo(f2, f3, (float) (width - this.f18264e), f3);
            path.lineTo((float) this.f18263d, f3);
            path.quadTo(0.0f, f3, 0.0f, (float) (height - this.f18263d));
            path.lineTo(0.0f, (float) this.f18261b);
            path.quadTo(0.0f, 0.0f, (float) this.f18261b, 0.0f);
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    public LiveRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_LiveRoundImageView);
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            this.f18261b = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f18262c = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
            this.f18263d = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            this.f18264e = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            if (this.f18261b == 0) {
                this.f18261b = dimensionPixelOffset;
            }
            if (this.f18262c == 0) {
                this.f18262c = dimensionPixelOffset;
            }
            if (this.f18263d == 0) {
                this.f18263d = dimensionPixelOffset;
            }
            if (this.f18264e == 0) {
                this.f18264e = dimensionPixelOffset;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
