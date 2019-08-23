package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.drawable.DrawableParent;
import com.facebook.drawee.drawable.ForwardingDrawable;
import com.facebook.drawee.drawable.Rounded;
import com.facebook.drawee.drawable.RoundedBitmapDrawable;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.drawable.f;
import com.facebook.drawee.drawable.g;
import com.facebook.drawee.drawable.i;
import com.facebook.drawee.generic.RoundingParams;
import javax.annotation.Nullable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Drawable f23744a = new ColorDrawable(0);

    /* JADX WARNING: type inference failed for: r0v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facebook.drawee.drawable.DrawableParent a(com.facebook.drawee.drawable.DrawableParent r2) {
        /*
        L_0x0000:
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            if (r0 == r2) goto L_0x000e
            boolean r1 = r0 instanceof com.facebook.drawee.drawable.DrawableParent
            if (r1 == 0) goto L_0x000e
            r2 = r0
            com.facebook.drawee.drawable.DrawableParent r2 = (com.facebook.drawee.drawable.DrawableParent) r2
            goto L_0x0000
        L_0x000e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.generic.b.a(com.facebook.drawee.drawable.DrawableParent):com.facebook.drawee.drawable.DrawableParent");
    }

    @Nullable
    static Drawable a(@Nullable Drawable drawable, @Nullable ScalingUtils.ScaleType scaleType) {
        return a(drawable, scaleType, (PointF) null);
    }

    static Drawable a(@Nullable Drawable drawable, @Nullable RoundingParams roundingParams) {
        try {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (!(drawable == null || roundingParams == null)) {
                if (roundingParams.getRoundingMethod() == RoundingParams.RoundingMethod.OVERLAY_COLOR) {
                    g gVar = new g(drawable);
                    a((Rounded) gVar, roundingParams);
                    gVar.a(roundingParams.getOverlayColor());
                    if (com.facebook.imagepipeline.e.b.isTracing()) {
                        com.facebook.imagepipeline.e.b.endSection();
                    }
                    return gVar;
                }
            }
            return drawable;
        } finally {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
    }

    static void a(Rounded rounded, RoundingParams roundingParams) {
        rounded.setCircle(roundingParams.getRoundAsCircle());
        rounded.setRadii(roundingParams.getCornersRadii());
        rounded.setBorder(roundingParams.getBorderColor(), roundingParams.getBorderWidth());
        rounded.setPadding(roundingParams.getPadding());
        rounded.setScaleDownInsideBorders(roundingParams.getScaleDownInsideBorders());
    }

    @Nullable
    static Drawable a(@Nullable Drawable drawable, @Nullable ScalingUtils.ScaleType scaleType, @Nullable PointF pointF) {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || scaleType == null) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
            return drawable;
        }
        ScaleTypeDrawable scaleTypeDrawable = new ScaleTypeDrawable(drawable, scaleType);
        if (pointF != null) {
            scaleTypeDrawable.setFocusPoint(pointF);
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return scaleTypeDrawable;
    }

    static Drawable b(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            RoundedBitmapDrawable roundedBitmapDrawable = new RoundedBitmapDrawable(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            a((Rounded) roundedBitmapDrawable, roundingParams);
            return roundedBitmapDrawable;
        } else if (drawable instanceof NinePatchDrawable) {
            i iVar = new i((NinePatchDrawable) drawable);
            a((Rounded) iVar, roundingParams);
            return iVar;
        } else if (!(drawable instanceof ColorDrawable) || Build.VERSION.SDK_INT < 11) {
            FLog.w("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        } else {
            f a2 = f.a((ColorDrawable) drawable);
            a((Rounded) a2, roundingParams);
            return a2;
        }
    }

    static Drawable a(@Nullable Drawable drawable, @Nullable RoundingParams roundingParams, Resources resources) {
        try {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("WrappingUtils#maybeApplyLeafRounding");
            }
            if (!(drawable == null || roundingParams == null)) {
                if (roundingParams.getRoundingMethod() == RoundingParams.RoundingMethod.BITMAP_ONLY) {
                    if (drawable instanceof ForwardingDrawable) {
                        DrawableParent a2 = a((ForwardingDrawable) drawable);
                        a2.setDrawable(b(a2.setDrawable(f23744a), roundingParams, resources));
                        if (com.facebook.imagepipeline.e.b.isTracing()) {
                            com.facebook.imagepipeline.e.b.endSection();
                        }
                        return drawable;
                    }
                    Drawable b2 = b(drawable, roundingParams, resources);
                    if (com.facebook.imagepipeline.e.b.isTracing()) {
                        com.facebook.imagepipeline.e.b.endSection();
                    }
                    return b2;
                }
            }
            return drawable;
        } finally {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
    }
}
