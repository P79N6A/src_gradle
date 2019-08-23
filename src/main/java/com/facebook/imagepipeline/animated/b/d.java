package com.facebook.imagepipeline.animated.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.animated.a.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.animated.a.a f23797a;

    /* renamed from: b  reason: collision with root package name */
    private final a f23798b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f23799c = new Paint();

    public interface a {
        CloseableReference<Bitmap> getCachedBitmap(int i);

        void onIntermediateResult(int i, Bitmap bitmap);
    }

    enum b {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    private boolean a(int i) {
        if (i == 0) {
            return true;
        }
        com.facebook.imagepipeline.animated.a.b frameInfo = this.f23797a.getFrameInfo(i);
        com.facebook.imagepipeline.animated.a.b frameInfo2 = this.f23797a.getFrameInfo(i - 1);
        if (frameInfo.blendOperation == b.a.NO_BLEND && a(frameInfo)) {
            return true;
        }
        if (frameInfo2.disposalMethod != b.C0264b.DISPOSE_TO_BACKGROUND || !a(frameInfo2)) {
            return false;
        }
        return true;
    }

    private boolean a(com.facebook.imagepipeline.animated.a.b bVar) {
        if (bVar.xOffset == 0 && bVar.yOffset == 0 && bVar.width == this.f23797a.getRenderedWidth() && bVar.height == this.f23797a.getRenderedHeight()) {
            return true;
        }
        return false;
    }

    private void a(Canvas canvas, com.facebook.imagepipeline.animated.a.b bVar) {
        canvas.drawRect((float) bVar.xOffset, (float) bVar.yOffset, (float) (bVar.xOffset + bVar.width), (float) (bVar.yOffset + bVar.height), this.f23799c);
    }

    public d(com.facebook.imagepipeline.animated.a.a aVar, a aVar2) {
        this.f23797a = aVar;
        this.f23798b = aVar2;
        this.f23799c.setColor(0);
        this.f23799c.setStyle(Paint.Style.FILL);
        this.f23799c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private int a(int i, Canvas canvas) {
        b bVar;
        while (i >= 0) {
            com.facebook.imagepipeline.animated.a.b frameInfo = this.f23797a.getFrameInfo(i);
            b.C0264b bVar2 = frameInfo.disposalMethod;
            if (bVar2 == b.C0264b.DISPOSE_DO_NOT) {
                bVar = b.REQUIRED;
            } else if (bVar2 == b.C0264b.DISPOSE_TO_BACKGROUND) {
                if (a(frameInfo)) {
                    bVar = b.NOT_REQUIRED;
                } else {
                    bVar = b.REQUIRED;
                }
            } else if (bVar2 == b.C0264b.DISPOSE_TO_PREVIOUS) {
                bVar = b.SKIP;
            } else {
                bVar = b.ABORT;
            }
            switch (bVar) {
                case REQUIRED:
                    com.facebook.imagepipeline.animated.a.b frameInfo2 = this.f23797a.getFrameInfo(i);
                    CloseableReference<Bitmap> cachedBitmap = this.f23798b.getCachedBitmap(i);
                    if (cachedBitmap == null) {
                        if (!a(i)) {
                            break;
                        } else {
                            return i;
                        }
                    } else {
                        try {
                            canvas.drawBitmap((Bitmap) cachedBitmap.get(), 0.0f, 0.0f, null);
                            if (frameInfo2.disposalMethod == b.C0264b.DISPOSE_TO_BACKGROUND) {
                                a(canvas, frameInfo2);
                            }
                            return i + 1;
                        } finally {
                            cachedBitmap.close();
                        }
                    }
                case NOT_REQUIRED:
                    return i + 1;
                case ABORT:
                    return i;
            }
            i--;
        }
        return 0;
    }

    public final void renderFrame(int i, Bitmap bitmap) {
        int i2;
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (!a(i)) {
            i2 = a(i - 1, canvas);
        } else {
            i2 = i;
        }
        while (i2 < i) {
            com.facebook.imagepipeline.animated.a.b frameInfo = this.f23797a.getFrameInfo(i2);
            b.C0264b bVar = frameInfo.disposalMethod;
            if (bVar != b.C0264b.DISPOSE_TO_PREVIOUS) {
                if (frameInfo.blendOperation == b.a.NO_BLEND) {
                    a(canvas, frameInfo);
                }
                this.f23797a.renderFrame(i2, canvas);
                this.f23798b.onIntermediateResult(i2, bitmap);
                if (bVar == b.C0264b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, frameInfo);
                }
            }
            i2++;
        }
        com.facebook.imagepipeline.animated.a.b frameInfo2 = this.f23797a.getFrameInfo(i);
        if (frameInfo2.blendOperation == b.a.NO_BLEND) {
            a(canvas, frameInfo2);
        }
        this.f23797a.renderFrame(i, canvas);
    }
}
