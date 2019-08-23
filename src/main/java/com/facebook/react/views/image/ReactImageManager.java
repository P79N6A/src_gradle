package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.a;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = "RCTImageView")
public class ReactImageManager extends SimpleViewManager<ReactImageView> {
    @Nullable
    private final Object mCallerContext;
    @Nullable
    private AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    @Nullable
    private GlobalImageLoadListener mGlobalImageLoadListener;

    public String getName() {
        return "RCTImageView";
    }

    public ReactImageManager() {
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        }
        return this.mDraweeControllerBuilder;
    }

    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of(ImageLoadEvent.eventNameForType(4), MapBuilder.of("registrationName", "onLoadStart"), ImageLoadEvent.eventNameForType(2), MapBuilder.of("registrationName", "onLoad"), ImageLoadEvent.eventNameForType(1), MapBuilder.of("registrationName", "onError"), ImageLoadEvent.eventNameForType(3), MapBuilder.of("registrationName", "onLoadEnd"));
    }

    public ReactImageView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactImageView(themedReactContext, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, getCallerContext());
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(ReactImageView reactImageView) {
        super.onAfterUpdateTransaction(reactImageView);
        reactImageView.maybeUpdateView();
    }

    @ReactProp(name = "blurRadius")
    public void setBlurRadius(ReactImageView reactImageView, float f2) {
        reactImageView.setBlurRadius(f2);
    }

    @ReactProp(name = "borderWidth")
    public void setBorderWidth(ReactImageView reactImageView, float f2) {
        reactImageView.setBorderWidth(f2);
    }

    @ReactProp(name = "fadeDuration")
    public void setFadeDuration(ReactImageView reactImageView, int i) {
        reactImageView.setFadeDuration(i);
    }

    @ReactProp(name = "headers")
    public void setHeaders(ReactImageView reactImageView, ReadableMap readableMap) {
        reactImageView.setHeaders(readableMap);
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(ReactImageView reactImageView, boolean z) {
        reactImageView.setShouldNotifyLoadEvents(z);
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(ReactImageView reactImageView, @Nullable String str) {
        reactImageView.setLoadingIndicatorSource(str);
    }

    @ReactProp(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(ReactImageView reactImageView, boolean z) {
        reactImageView.setProgressiveRenderingEnabled(z);
    }

    @ReactProp(name = "src")
    public void setSource(ReactImageView reactImageView, @Nullable ReadableArray readableArray) {
        reactImageView.setSource(readableArray);
    }

    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this(abstractDraweeControllerBuilder, null, obj);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(ReactImageView reactImageView, @Nullable String str) {
        reactImageView.setScaleType(ImageResizeMode.toScaleType(str));
    }

    @ReactProp(customType = "Color", name = "borderColor")
    public void setBorderColor(ReactImageView reactImageView, @Nullable Integer num) {
        if (num == null) {
            reactImageView.setBorderColor(0);
        } else {
            reactImageView.setBorderColor(num.intValue());
        }
    }

    @ReactProp(name = "overlayColor")
    public void setOverlayColor(ReactImageView reactImageView, @Nullable Integer num) {
        if (num == null) {
            reactImageView.setOverlayColor(0);
        } else {
            reactImageView.setOverlayColor(num.intValue());
        }
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(ReactImageView reactImageView, @Nullable Integer num) {
        if (num == null) {
            reactImageView.clearColorFilter();
        } else {
            reactImageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(name = "resizeMethod")
    public void setResizeMethod(ReactImageView reactImageView, @Nullable String str) {
        if (str == null || "auto".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.AUTO);
        } else if ("resize".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.RESIZE);
        } else if ("scale".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.SCALE);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid resize method: '" + str + "'");
        }
    }

    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, @Nullable GlobalImageLoadListener globalImageLoadListener, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactImageView reactImageView, int i, float f2) {
        if (!a.a(f2)) {
            f2 = PixelUtil.toPixelFromDIP(f2);
        }
        if (i == 0) {
            reactImageView.setBorderRadius(f2);
        } else {
            reactImageView.setBorderRadius(f2, i - 1);
        }
    }
}
