package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.view.Gravity;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.gif.GifFrameLoader;
import com.bumptech.glide.util.Preconditions;
import java.nio.ByteBuffer;

public class GifDrawable extends Drawable implements Animatable, GifFrameLoader.FrameCallback {
    private boolean applyGravity;
    private Rect destRect;
    private boolean isRecycled;
    private boolean isRunning;
    private boolean isStarted;
    private boolean isVisible;
    private int loopCount;
    private int maxLoopCount;
    private Paint paint;
    private final GifState state;

    static final class GifState extends Drawable.ConstantState {
        @VisibleForTesting
        final GifFrameLoader frameLoader;

        public final int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public final Drawable newDrawable() {
            return new GifDrawable(this);
        }

        GifState(GifFrameLoader gifFrameLoader) {
            this.frameLoader = gifFrameLoader;
        }

        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    private void resetLoopCount() {
        this.loopCount = 0;
    }

    public int getOpacity() {
        return -2;
    }

    public Drawable.ConstantState getConstantState() {
        return this.state;
    }

    /* access modifiers changed from: package-private */
    public boolean isRecycled() {
        return this.isRecycled;
    }

    public boolean isRunning() {
        return this.isRunning;
    }

    public void stop() {
        this.isStarted = false;
        stopRunning();
    }

    private Drawable.Callback findCallback() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect getDestRect() {
        if (this.destRect == null) {
            this.destRect = new Rect();
        }
        return this.destRect;
    }

    private Paint getPaint() {
        if (this.paint == null) {
            this.paint = new Paint(2);
        }
        return this.paint;
    }

    private void stopRunning() {
        this.isRunning = false;
        this.state.frameLoader.unsubscribe(this);
    }

    public ByteBuffer getBuffer() {
        return this.state.frameLoader.getBuffer();
    }

    public Bitmap getFirstFrame() {
        return this.state.frameLoader.getFirstFrame();
    }

    public int getFrameCount() {
        return this.state.frameLoader.getFrameCount();
    }

    public int getFrameIndex() {
        return this.state.frameLoader.getCurrentIndex();
    }

    public Transformation<Bitmap> getFrameTransformation() {
        return this.state.frameLoader.getFrameTransformation();
    }

    public int getIntrinsicHeight() {
        return this.state.frameLoader.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.state.frameLoader.getWidth();
    }

    public int getSize() {
        return this.state.frameLoader.getSize();
    }

    public void recycle() {
        this.isRecycled = true;
        this.state.frameLoader.clear();
    }

    public void start() {
        this.isStarted = true;
        resetLoopCount();
        if (this.isVisible) {
            startRunning();
        }
    }

    public void startFromFirstFrame() {
        Preconditions.checkArgument(!this.isRunning, "You cannot restart a currently running animation.");
        this.state.frameLoader.setNextStartFromFirstFrame();
        start();
    }

    private void startRunning() {
        Preconditions.checkArgument(!this.isRecycled, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.state.frameLoader.getFrameCount() == 1) {
            invalidateSelf();
            return;
        }
        if (!this.isRunning) {
            this.isRunning = true;
            this.state.frameLoader.subscribe(this);
            invalidateSelf();
        }
    }

    public void onFrameReady() {
        if (findCallback() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (getFrameIndex() == getFrameCount() - 1) {
            this.loopCount++;
        }
        if (this.maxLoopCount != -1 && this.loopCount >= this.maxLoopCount) {
            stop();
        }
    }

    /* access modifiers changed from: package-private */
    public void setIsRunning(boolean z) {
        this.isRunning = z;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyGravity = true;
    }

    public void setAlpha(int i) {
        getPaint().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        getPaint().setColorFilter(colorFilter);
    }

    GifDrawable(GifState gifState) {
        this.isVisible = true;
        this.maxLoopCount = -1;
        this.state = (GifState) Preconditions.checkNotNull(gifState);
    }

    public void draw(@NonNull Canvas canvas) {
        if (!this.isRecycled) {
            if (this.applyGravity) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), getDestRect());
                this.applyGravity = false;
            }
            canvas.drawBitmap(this.state.frameLoader.getCurrentFrame(), null, getDestRect(), getPaint());
        }
    }

    public void setLoopCount(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else if (i == 0) {
            int loopCount2 = this.state.frameLoader.getLoopCount();
            if (loopCount2 == 0) {
                loopCount2 = -1;
            }
            this.maxLoopCount = loopCount2;
        } else {
            this.maxLoopCount = i;
        }
    }

    public void setFrameTransformation(Transformation<Bitmap> transformation, Bitmap bitmap) {
        this.state.frameLoader.setFrameTransformation(transformation, bitmap);
    }

    public boolean setVisible(boolean z, boolean z2) {
        Preconditions.checkArgument(!this.isRecycled, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.isVisible = z;
        if (!z) {
            stopRunning();
        } else if (this.isStarted) {
            startRunning();
        }
        return super.setVisible(z, z2);
    }

    @VisibleForTesting
    GifDrawable(GifFrameLoader gifFrameLoader, Paint paint2) {
        this(new GifState(gifFrameLoader));
        this.paint = paint2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GifDrawable(android.content.Context r10, com.bumptech.glide.gifdecoder.GifDecoder r11, com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r12, int r13, int r14, android.graphics.Bitmap r15) {
        /*
            r9 = this;
            com.bumptech.glide.load.resource.gif.GifDrawable$GifState r0 = new com.bumptech.glide.load.resource.gif.GifDrawable$GifState
            com.bumptech.glide.load.resource.gif.GifFrameLoader r8 = new com.bumptech.glide.load.resource.gif.GifFrameLoader
            com.bumptech.glide.Glide r2 = com.bumptech.glide.Glide.get(r10)
            r1 = r8
            r3 = r11
            r4 = r13
            r5 = r14
            r6 = r12
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r8)
            r9.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.gif.GifDrawable.<init>(android.content.Context, com.bumptech.glide.gifdecoder.GifDecoder, com.bumptech.glide.load.Transformation, int, int, android.graphics.Bitmap):void");
    }

    @Deprecated
    public GifDrawable(Context context, GifDecoder gifDecoder, BitmapPool bitmapPool, Transformation<Bitmap> transformation, int i, int i2, Bitmap bitmap) {
        this(context, gifDecoder, transformation, i, i2, bitmap);
    }
}
