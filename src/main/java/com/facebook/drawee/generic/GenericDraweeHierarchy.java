package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.drawable.DrawableParent;
import com.facebook.drawee.drawable.FadeDrawable;
import com.facebook.drawee.drawable.ForwardingDrawable;
import com.facebook.drawee.drawable.MatrixDrawable;
import com.facebook.drawee.drawable.Rounded;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.drawable.g;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.SettableDraweeHierarchy;
import com.facebook.imagepipeline.e.b;
import com.ss.android.ugc.bytex.a.a.a;
import javax.annotation.Nullable;

public class GenericDraweeHierarchy implements SettableDraweeHierarchy {
    private final ForwardingDrawable mActualImageWrapper;
    private final Drawable mEmptyActualImageDrawable = new ColorDrawable(0);
    private final FadeDrawable mFadeDrawable;
    private final Resources mResources;
    @Nullable
    private RoundingParams mRoundingParams;
    private final a mTopLevelDrawable;

    @Nullable
    public RoundingParams getRoundingParams() {
        return this.mRoundingParams;
    }

    public Drawable getTopLevelDrawable() {
        return this.mTopLevelDrawable;
    }

    private void resetActualImages() {
        this.mActualImageWrapper.setDrawable(this.mEmptyActualImageDrawable);
    }

    public int getFadeDuration() {
        return this.mFadeDrawable.getTransitionDuration();
    }

    public void reset() {
        resetActualImages();
        resetFade();
    }

    @VisibleForTesting
    public boolean hasImage() {
        if (this.mActualImageWrapper.getDrawable() != this.mEmptyActualImageDrawable) {
            return true;
        }
        return false;
    }

    public boolean hasPlaceholderImage() {
        if (this.mFadeDrawable.getDrawable(1) != null) {
            return true;
        }
        return false;
    }

    private void fadeOutBranches() {
        fadeOutLayer(1);
        fadeOutLayer(2);
        fadeOutLayer(3);
        fadeOutLayer(4);
        fadeOutLayer(5);
    }

    private void resetFade() {
        if (this.mFadeDrawable != null) {
            this.mFadeDrawable.beginBatchMode();
            this.mFadeDrawable.fadeInAllLayers();
            fadeOutBranches();
            fadeInLayer(1);
            this.mFadeDrawable.finishTransitionImmediately();
            this.mFadeDrawable.endBatchMode();
        }
    }

    @Nullable
    public ScalingUtils.ScaleType getActualImageScaleType() {
        if (!hasScaleTypeDrawableAtIndex(2)) {
            return null;
        }
        return getScaleTypeDrawableAtIndex(2).getScaleType();
    }

    private void fadeInLayer(int i) {
        if (i >= 0) {
            this.mFadeDrawable.fadeInLayer(i);
        }
    }

    private void fadeOutLayer(int i) {
        if (i >= 0) {
            this.mFadeDrawable.fadeOutLayer(i);
        }
    }

    private boolean hasScaleTypeDrawableAtIndex(int i) {
        return getParentDrawableAtIndex(i) instanceof ScaleTypeDrawable;
    }

    public void getActualImageBounds(RectF rectF) {
        this.mActualImageWrapper.getTransformedBounds(rectF);
    }

    public void setActualImageColorFilter(ColorFilter colorFilter) {
        this.mActualImageWrapper.setColorFilter(colorFilter);
    }

    public void setBackgroundImage(@Nullable Drawable drawable) {
        setChildDrawableAtIndex(0, drawable);
    }

    public void setControllerOverlay(@Nullable Drawable drawable) {
        a aVar = this.mTopLevelDrawable;
        aVar.f23742a = drawable;
        aVar.invalidateSelf();
    }

    public void setFadeDuration(int i) {
        this.mFadeDrawable.setTransitionDuration(i);
    }

    public void setFailureImage(@Nullable Drawable drawable) {
        setChildDrawableAtIndex(5, drawable);
    }

    public void setOverlayImage(@Nullable Drawable drawable) {
        setOverlayImage(0, drawable);
    }

    public void setPlaceholderImage(@Nullable Drawable drawable) {
        setChildDrawableAtIndex(1, drawable);
    }

    public void setProgressBarImage(@Nullable Drawable drawable) {
        setChildDrawableAtIndex(3, drawable);
    }

    public void setRetryImage(@Nullable Drawable drawable) {
        setChildDrawableAtIndex(4, drawable);
    }

    public void setActualImageFocusPoint(PointF pointF) {
        Preconditions.checkNotNull(pointF);
        getScaleTypeDrawableAtIndex(2).setFocusPoint(pointF);
    }

    public void setActualImageScaleType(ScalingUtils.ScaleType scaleType) {
        Preconditions.checkNotNull(scaleType);
        getScaleTypeDrawableAtIndex(2).setScaleType(scaleType);
    }

    public void setFailureImage(int i) {
        setFailureImage(a.a(this.mResources, i));
    }

    public void setPlaceholderImage(int i) {
        setPlaceholderImage(a.a(this.mResources, i));
    }

    public void setPlaceholderImageFocusPoint(PointF pointF) {
        Preconditions.checkNotNull(pointF);
        getScaleTypeDrawableAtIndex(1).setFocusPoint(pointF);
    }

    public void setProgressBarImage(int i) {
        setProgressBarImage(a.a(this.mResources, i));
    }

    public void setRetryImage(int i) {
        setRetryImage(a.a(this.mResources, i));
    }

    public void setFailure(Throwable th) {
        this.mFadeDrawable.beginBatchMode();
        fadeOutBranches();
        if (this.mFadeDrawable.getDrawable(5) != null) {
            fadeInLayer(5);
        } else {
            fadeInLayer(1);
        }
        this.mFadeDrawable.endBatchMode();
    }

    public void setRetry(Throwable th) {
        this.mFadeDrawable.beginBatchMode();
        fadeOutBranches();
        if (this.mFadeDrawable.getDrawable(4) != null) {
            fadeInLayer(4);
        } else {
            fadeInLayer(1);
        }
        this.mFadeDrawable.endBatchMode();
    }

    private DrawableParent getParentDrawableAtIndex(int i) {
        DrawableParent drawableParentForIndex = this.mFadeDrawable.getDrawableParentForIndex(i);
        if (drawableParentForIndex.getDrawable() instanceof MatrixDrawable) {
            drawableParentForIndex = (MatrixDrawable) drawableParentForIndex.getDrawable();
        }
        if (drawableParentForIndex.getDrawable() instanceof ScaleTypeDrawable) {
            return (ScaleTypeDrawable) drawableParentForIndex.getDrawable();
        }
        return drawableParentForIndex;
    }

    private ScaleTypeDrawable getScaleTypeDrawableAtIndex(int i) {
        DrawableParent parentDrawableAtIndex = getParentDrawableAtIndex(i);
        if (parentDrawableAtIndex instanceof ScaleTypeDrawable) {
            return (ScaleTypeDrawable) parentDrawableAtIndex;
        }
        Drawable a2 = b.a(parentDrawableAtIndex.setDrawable(b.f23744a), ScalingUtils.ScaleType.FIT_XY);
        parentDrawableAtIndex.setDrawable(a2);
        Preconditions.checkNotNull(a2, "Parent has no child drawable!");
        return (ScaleTypeDrawable) a2;
    }

    private void setProgress(float f2) {
        Drawable drawable = this.mFadeDrawable.getDrawable(3);
        if (drawable != null) {
            if (f2 >= 0.999f) {
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).stop();
                }
                fadeOutLayer(3);
            } else {
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
                fadeInLayer(3);
            }
            drawable.setLevel(Math.round(f2 * 10000.0f));
        }
    }

    public void setRoundingParams(@Nullable RoundingParams roundingParams) {
        this.mRoundingParams = roundingParams;
        a aVar = this.mTopLevelDrawable;
        RoundingParams roundingParams2 = this.mRoundingParams;
        Drawable drawable = aVar.getDrawable();
        if (roundingParams2 == null || roundingParams2.getRoundingMethod() != RoundingParams.RoundingMethod.OVERLAY_COLOR) {
            if (drawable instanceof g) {
                aVar.setDrawable(((g) drawable).setCurrent(b.f23744a));
                b.f23744a.setCallback(null);
            }
        } else if (drawable instanceof g) {
            g gVar = (g) drawable;
            b.a((Rounded) gVar, roundingParams2);
            gVar.a(roundingParams2.getOverlayColor());
        } else {
            aVar.setDrawable(b.a(aVar.setDrawable(b.f23744a), roundingParams2));
        }
        for (int i = 0; i < this.mFadeDrawable.getNumberOfLayers(); i++) {
            DrawableParent parentDrawableAtIndex = getParentDrawableAtIndex(i);
            RoundingParams roundingParams3 = this.mRoundingParams;
            Resources resources = this.mResources;
            DrawableParent a2 = b.a(parentDrawableAtIndex);
            Drawable drawable2 = a2.getDrawable();
            if (roundingParams3 == null || roundingParams3.getRoundingMethod() != RoundingParams.RoundingMethod.BITMAP_ONLY) {
                if (drawable2 instanceof Rounded) {
                    Rounded rounded = (Rounded) drawable2;
                    rounded.setCircle(false);
                    rounded.setRadius(0.0f);
                    rounded.setBorder(0, 0.0f);
                    rounded.setPadding(0.0f);
                    rounded.setScaleDownInsideBorders(false);
                }
            } else if (drawable2 instanceof Rounded) {
                b.a((Rounded) drawable2, roundingParams3);
            } else if (drawable2 != null) {
                a2.setDrawable(b.f23744a);
                a2.setDrawable(b.b(drawable2, roundingParams3, resources));
            }
        }
    }

    GenericDraweeHierarchy(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        int i;
        int i2;
        if (b.isTracing()) {
            b.beginSection("GenericDraweeHierarchy()");
        }
        this.mResources = genericDraweeHierarchyBuilder.getResources();
        this.mRoundingParams = genericDraweeHierarchyBuilder.getRoundingParams();
        this.mActualImageWrapper = new ForwardingDrawable(this.mEmptyActualImageDrawable);
        int i3 = 1;
        if (genericDraweeHierarchyBuilder.getOverlays() != null) {
            i = genericDraweeHierarchyBuilder.getOverlays().size();
        } else {
            i = 1;
        }
        if (genericDraweeHierarchyBuilder.getPressedStateOverlay() != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = i + i2;
        Drawable[] drawableArr = new Drawable[(i4 + 6)];
        drawableArr[0] = buildBranch(genericDraweeHierarchyBuilder.getBackground(), null);
        drawableArr[1] = buildBranch(genericDraweeHierarchyBuilder.getPlaceholderImage(), genericDraweeHierarchyBuilder.getPlaceholderImageScaleType());
        drawableArr[2] = buildActualImageBranch(this.mActualImageWrapper, genericDraweeHierarchyBuilder.getActualImageScaleType(), genericDraweeHierarchyBuilder.getActualImageFocusPoint(), genericDraweeHierarchyBuilder.getActualImageColorFilter());
        drawableArr[3] = buildBranch(genericDraweeHierarchyBuilder.getProgressBarImage(), genericDraweeHierarchyBuilder.getProgressBarImageScaleType());
        drawableArr[4] = buildBranch(genericDraweeHierarchyBuilder.getRetryImage(), genericDraweeHierarchyBuilder.getRetryImageScaleType());
        drawableArr[5] = buildBranch(genericDraweeHierarchyBuilder.getFailureImage(), genericDraweeHierarchyBuilder.getFailureImageScaleType());
        if (i4 > 0) {
            if (genericDraweeHierarchyBuilder.getOverlays() != null) {
                i3 = 0;
                for (Drawable buildBranch : genericDraweeHierarchyBuilder.getOverlays()) {
                    drawableArr[i3 + 6] = buildBranch(buildBranch, null);
                    i3++;
                }
            }
            if (genericDraweeHierarchyBuilder.getPressedStateOverlay() != null) {
                drawableArr[i3 + 6] = buildBranch(genericDraweeHierarchyBuilder.getPressedStateOverlay(), null);
            }
        }
        this.mFadeDrawable = new FadeDrawable(drawableArr);
        this.mFadeDrawable.setTransitionDuration(genericDraweeHierarchyBuilder.getFadeDuration());
        this.mTopLevelDrawable = new a(b.a((Drawable) this.mFadeDrawable, this.mRoundingParams));
        this.mTopLevelDrawable.mutate();
        resetFade();
        if (b.isTracing()) {
            b.endSection();
        }
    }

    @Nullable
    private Drawable buildBranch(@Nullable Drawable drawable, @Nullable ScalingUtils.ScaleType scaleType) {
        return b.a(b.a(drawable, this.mRoundingParams, this.mResources), scaleType);
    }

    private void setChildDrawableAtIndex(int i, @Nullable Drawable drawable) {
        if (drawable == null) {
            this.mFadeDrawable.setDrawable(i, null);
            return;
        }
        getParentDrawableAtIndex(i).setDrawable(b.a(drawable, this.mRoundingParams, this.mResources));
    }

    public void setFailureImage(int i, ScalingUtils.ScaleType scaleType) {
        setFailureImage(a.a(this.mResources, i), scaleType);
    }

    public void setOverlayImage(int i, @Nullable Drawable drawable) {
        boolean z;
        if (i < 0 || i + 6 >= this.mFadeDrawable.getNumberOfLayers()) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "The given index does not correspond to an overlay image.");
        setChildDrawableAtIndex(i + 6, drawable);
    }

    public void setPlaceholderImage(int i, ScalingUtils.ScaleType scaleType) {
        setPlaceholderImage(a.a(this.mResources, i), scaleType);
    }

    public void setProgress(float f2, boolean z) {
        if (this.mFadeDrawable.getDrawable(3) != null) {
            this.mFadeDrawable.beginBatchMode();
            setProgress(f2);
            if (z) {
                this.mFadeDrawable.finishTransitionImmediately();
            }
            this.mFadeDrawable.endBatchMode();
        }
    }

    public void setProgressBarImage(int i, ScalingUtils.ScaleType scaleType) {
        setProgressBarImage(a.a(this.mResources, i), scaleType);
    }

    public void setRetryImage(int i, ScalingUtils.ScaleType scaleType) {
        setRetryImage(a.a(this.mResources, i), scaleType);
    }

    public void setFailureImage(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        setChildDrawableAtIndex(5, drawable);
        getScaleTypeDrawableAtIndex(5).setScaleType(scaleType);
    }

    public void setPlaceholderImage(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        setChildDrawableAtIndex(1, drawable);
        getScaleTypeDrawableAtIndex(1).setScaleType(scaleType);
    }

    public void setProgressBarImage(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        setChildDrawableAtIndex(3, drawable);
        getScaleTypeDrawableAtIndex(3).setScaleType(scaleType);
    }

    public void setRetryImage(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        setChildDrawableAtIndex(4, drawable);
        getScaleTypeDrawableAtIndex(4).setScaleType(scaleType);
    }

    public void setImage(Drawable drawable, float f2, boolean z) {
        Drawable a2 = b.a(drawable, this.mRoundingParams, this.mResources);
        a2.mutate();
        this.mActualImageWrapper.setDrawable(a2);
        this.mFadeDrawable.beginBatchMode();
        fadeOutBranches();
        fadeInLayer(2);
        setProgress(f2);
        if (z) {
            this.mFadeDrawable.finishTransitionImmediately();
        }
        this.mFadeDrawable.endBatchMode();
    }

    @Nullable
    private Drawable buildActualImageBranch(Drawable drawable, @Nullable ScalingUtils.ScaleType scaleType, @Nullable PointF pointF, @Nullable ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return b.a(drawable, scaleType, pointF);
    }
}
