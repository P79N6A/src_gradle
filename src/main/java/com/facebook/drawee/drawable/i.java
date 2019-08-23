package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.imagepipeline.e.b;

public final class i extends h {
    public i(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    public final void draw(Canvas canvas) {
        if (b.isTracing()) {
            b.beginSection("RoundedNinePatchDrawable#draw");
        }
        if (!shouldRound()) {
            super.draw(canvas);
            if (b.isTracing()) {
                b.endSection();
            }
            return;
        }
        updateTransform();
        updatePath();
        canvas.clipPath(this.mPath);
        super.draw(canvas);
        if (b.isTracing()) {
            b.endSection();
        }
    }
}
