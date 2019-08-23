package com.facebook.react.flat;

import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.flat.AbstractDrawCommand;
import com.facebook.react.flat.DrawImage;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.image.ImageResizeMode;
import javax.annotation.Nullable;

public class RCTImageView<T extends AbstractDrawCommand & DrawImage> extends FlatShadowNode {
    static Object sCallerContext = RCTImageView.class;
    private T mDrawImage;

    static Object getCallerContext() {
        return sCallerContext;
    }

    private T getMutableDrawImage() {
        if (this.mDrawImage.isFrozen()) {
            this.mDrawImage = this.mDrawImage.mutableCopy();
            invalidate();
        }
        return this.mDrawImage;
    }

    /* access modifiers changed from: package-private */
    public boolean doesDraw() {
        if (((DrawImage) this.mDrawImage).hasImageRequest() || super.doesDraw()) {
            return true;
        }
        return false;
    }

    static void setCallerContext(Object obj) {
        sCallerContext = obj;
    }

    RCTImageView(T t) {
        this.mDrawImage = t;
    }

    @ReactProp(name = "fadeDuration")
    public void setFadeDuration(int i) {
        ((DrawImage) getMutableDrawImage()).setFadeDuration(i);
    }

    @ReactProp(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(boolean z) {
        ((DrawImage) getMutableDrawImage()).setProgressiveRenderingEnabled(z);
    }

    @ReactProp(name = "src")
    public void setSource(@Nullable ReadableArray readableArray) {
        ((DrawImage) getMutableDrawImage()).setSource(getThemedContext(), readableArray);
    }

    @ReactProp(name = "tintColor")
    public void setTintColor(int i) {
        ((DrawImage) getMutableDrawImage()).setTintColor(i);
    }

    @ReactProp(customType = "Color", name = "borderColor")
    public void setBorderColor(int i) {
        if (((DrawImage) this.mDrawImage).getBorderColor() != i) {
            ((DrawImage) getMutableDrawImage()).setBorderColor(i);
        }
    }

    @ReactProp(name = "borderRadius")
    public void setBorderRadius(float f2) {
        if (((DrawImage) this.mDrawImage).getBorderRadius() != f2) {
            ((DrawImage) getMutableDrawImage()).setBorderRadius(PixelUtil.toPixelFromDIP(f2));
        }
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(@Nullable String str) {
        ScalingUtils.ScaleType scaleType = ImageResizeMode.toScaleType(str);
        if (((DrawImage) this.mDrawImage).getScaleType() != scaleType) {
            ((DrawImage) getMutableDrawImage()).setScaleType(scaleType);
        }
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public void setShouldNotifyLoadEvents(boolean z) {
        int i;
        DrawImage drawImage = (DrawImage) getMutableDrawImage();
        if (z) {
            i = getReactTag();
        } else {
            i = 0;
        }
        drawImage.setReactTag(i);
    }

    public void setBorder(int i, float f2) {
        super.setBorder(i, f2);
        if (i == 8 && ((DrawImage) this.mDrawImage).getBorderWidth() != f2) {
            ((DrawImage) getMutableDrawImage()).setBorderWidth(f2);
        }
    }

    /* access modifiers changed from: protected */
    public void collectState(StateBuilder stateBuilder, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        StateBuilder stateBuilder2 = stateBuilder;
        super.collectState(stateBuilder, f2, f3, f4, f5, f6, f7, f8, f9);
        if (((DrawImage) this.mDrawImage).hasImageRequest()) {
            this.mDrawImage = this.mDrawImage.updateBoundsAndFreeze(f2, f3, f4, f5, f6, f7, f8, f9);
            stateBuilder.addDrawCommand(this.mDrawImage);
            stateBuilder.addAttachDetachListener((AttachDetachListener) this.mDrawImage);
        }
    }
}
