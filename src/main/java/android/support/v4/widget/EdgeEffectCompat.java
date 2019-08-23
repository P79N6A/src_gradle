package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.NonNull;
import android.widget.EdgeEffect;

public final class EdgeEffectCompat {
    private EdgeEffect mEdgeEffect;

    @Deprecated
    public final void finish() {
        this.mEdgeEffect.finish();
    }

    @Deprecated
    public final boolean isFinished() {
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated
    public final boolean onRelease() {
        this.mEdgeEffect.onRelease();
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated
    public final boolean draw(Canvas canvas) {
        return this.mEdgeEffect.draw(canvas);
    }

    @Deprecated
    public final boolean onAbsorb(int i) {
        this.mEdgeEffect.onAbsorb(i);
        return true;
    }

    @Deprecated
    public final boolean onPull(float f2) {
        this.mEdgeEffect.onPull(f2);
        return true;
    }

    @Deprecated
    public EdgeEffectCompat(Context context) {
        this.mEdgeEffect = new EdgeEffect(context);
    }

    @Deprecated
    public final void setSize(int i, int i2) {
        this.mEdgeEffect.setSize(i, i2);
    }

    @Deprecated
    public final boolean onPull(float f2, float f3) {
        onPull(this.mEdgeEffect, f2, f3);
        return true;
    }

    public static void onPull(@NonNull EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f2, f3);
        } else {
            edgeEffect.onPull(f2);
        }
    }
}
