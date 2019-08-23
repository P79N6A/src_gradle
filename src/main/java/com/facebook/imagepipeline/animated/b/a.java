package com.facebook.imagepipeline.animated.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.a.b;
import com.facebook.imagepipeline.animated.a.e;
import com.facebook.imagepipeline.animated.a.f;
import com.facebook.imagepipeline.animated.a.g;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class a implements com.facebook.imagepipeline.animated.a.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.animated.c.a f23783a;

    /* renamed from: b  reason: collision with root package name */
    private final g f23784b;

    /* renamed from: c  reason: collision with root package name */
    private final e f23785c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f23786d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f23787e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f23788f;
    private final int g;
    private final b[] h;
    private final Rect i = new Rect();
    private final Rect j = new Rect();
    @GuardedBy
    @Nullable
    private Bitmap k;
    private boolean l;
    public int mDecodeType = 2;

    public final int getFrameCount() {
        return this.f23785c.getFrameCount();
    }

    public final int getHeight() {
        return this.f23785c.getHeight();
    }

    public final int getLoopCount() {
        return this.f23785c.getLoopCount();
    }

    public final int getRenderedHeight() {
        return this.f23786d.height();
    }

    public final int getRenderedWidth() {
        return this.f23786d.width();
    }

    public final int getWidth() {
        return this.f23785c.getWidth();
    }

    private synchronized void a() {
        if (this.k != null) {
            if (!this.l) {
                this.k.recycle();
            }
            this.k = null;
        }
    }

    public final int getDurationMsForFrame(int i2) {
        return this.f23787e[i2];
    }

    public final b getFrameInfo(int i2) {
        return this.h[i2];
    }

    public final com.facebook.imagepipeline.animated.a.a forNewBounds(Rect rect) {
        if (a(this.f23785c, rect).equals(this.f23786d)) {
            return this;
        }
        return new a(this.f23783a, this.f23784b, rect);
    }

    private static Rect a(e eVar, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, eVar.getWidth(), eVar.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), eVar.getWidth()), Math.min(rect.height(), eVar.getHeight()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(int r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.graphics.Bitmap r0 = r3.k     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0018
            android.graphics.Bitmap r0 = r3.k     // Catch:{ all -> 0x0041 }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x0041 }
            if (r0 < r4) goto L_0x0015
            android.graphics.Bitmap r0 = r3.k     // Catch:{ all -> 0x0041 }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x0041 }
            if (r0 >= r5) goto L_0x0018
        L_0x0015:
            r3.a()     // Catch:{ all -> 0x0041 }
        L_0x0018:
            android.graphics.Bitmap r0 = r3.k     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x003f
            com.facebook.imagepipeline.animated.factory.d r0 = com.facebook.imagepipeline.animated.factory.AnimatedFactoryProvider.getAnimatedTempBitmapFactory()     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 == 0) goto L_0x002b
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0041 }
            int r2 = r3.mDecodeType     // Catch:{ all -> 0x0041 }
            android.graphics.Bitmap r1 = r0.createBitmap(r4, r5, r1, r2)     // Catch:{ all -> 0x0041 }
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            r3.k = r1     // Catch:{ all -> 0x0041 }
            r4 = 1
            r3.l = r4     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return
        L_0x0034:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0041 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r0)     // Catch:{ all -> 0x0041 }
            r3.k = r4     // Catch:{ all -> 0x0041 }
            r4 = 0
            r3.l = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.animated.b.a.a(int, int):void");
    }

    public final void renderFrame(int i2, Canvas canvas) {
        f frame = this.f23785c.getFrame(i2);
        try {
            if (this.f23785c.doesRenderSupportScaling()) {
                double width = (double) this.f23786d.width();
                double width2 = (double) this.f23785c.getWidth();
                Double.isNaN(width);
                Double.isNaN(width2);
                double d2 = width / width2;
                double height = (double) this.f23786d.height();
                double height2 = (double) this.f23785c.getHeight();
                Double.isNaN(height);
                Double.isNaN(height2);
                double d3 = height / height2;
                double width3 = (double) frame.getWidth();
                Double.isNaN(width3);
                int round = (int) Math.round(width3 * d2);
                double height3 = (double) frame.getHeight();
                Double.isNaN(height3);
                int round2 = (int) Math.round(height3 * d3);
                double xOffset = (double) frame.getXOffset();
                Double.isNaN(xOffset);
                int i3 = (int) (xOffset * d2);
                double yOffset = (double) frame.getYOffset();
                Double.isNaN(yOffset);
                int i4 = (int) (yOffset * d3);
                synchronized (this) {
                    int width4 = this.f23786d.width();
                    int height4 = this.f23786d.height();
                    a(width4, height4);
                    synchronized (this.k) {
                        this.k.eraseColor(0);
                        try {
                            frame.renderFrame(round, round2, this.k);
                            this.i.set(0, 0, width4, height4);
                            this.j.set(i3, i4, width4 + i3, height4 + i4);
                            canvas.drawBitmap(this.k, this.i, this.j, null);
                        } catch (IllegalStateException e2) {
                            throw new IllegalStateException(e2.getMessage() + a(this.k, round, round2, this.f23786d, this.mDecodeType));
                        }
                    }
                }
            } else {
                int width5 = frame.getWidth();
                int height5 = frame.getHeight();
                int xOffset2 = frame.getXOffset();
                int yOffset2 = frame.getYOffset();
                synchronized (this) {
                    a(width5, height5);
                    synchronized (this.k) {
                        this.k.eraseColor(0);
                        try {
                            frame.renderFrame(width5, height5, this.k);
                            this.i.set(0, 0, width5, height5);
                            this.j.set(0, 0, width5, height5);
                            canvas.save();
                            canvas.translate((float) xOffset2, (float) yOffset2);
                            canvas.drawBitmap(this.k, this.i, this.j, null);
                            canvas.restore();
                        } catch (IllegalStateException e3) {
                            throw new IllegalStateException(e3.getMessage() + a(this.k, width5, height5, null, this.mDecodeType));
                        }
                    }
                }
            }
            frame.dispose();
        } catch (Throwable th) {
            frame.dispose();
            throw th;
        }
    }

    public a(com.facebook.imagepipeline.animated.c.a aVar, g gVar, Rect rect) {
        this.f23783a = aVar;
        this.f23784b = gVar;
        this.f23785c = gVar.mImage;
        this.f23787e = this.f23785c.getFrameDurations();
        this.f23783a.fixFrameDurations(this.f23787e);
        this.g = this.f23783a.getTotalDurationFromFrameDurations(this.f23787e);
        this.f23788f = this.f23783a.getFrameTimeStampsFromDurations(this.f23787e);
        this.f23786d = a(this.f23785c, rect);
        this.h = new b[this.f23785c.getFrameCount()];
        for (int i2 = 0; i2 < this.f23785c.getFrameCount(); i2++) {
            this.h[i2] = this.f23785c.getFrameInfo(i2);
        }
    }

    private static String a(Bitmap bitmap, int i2, int i3, Rect rect, int i4) {
        StringBuilder sb = new StringBuilder(", mTempBitmap:");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append(", frame:");
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        if (rect != null) {
            sb.append(", renderedBounds:");
            sb.append(rect.width());
            sb.append("x");
            sb.append(rect.height());
        }
        sb.append(", decodeType:");
        sb.append(i4);
        return sb.toString();
    }
}
