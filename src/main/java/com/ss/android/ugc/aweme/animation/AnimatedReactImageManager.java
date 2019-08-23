package com.ss.android.ugc.aweme.animation;

import android.graphics.PorterDuff;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.views.image.ImageLoadEvent;
import com.facebook.react.views.image.ImageResizeMethod;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.yoga.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

public class AnimatedReactImageManager extends SimpleViewManager<a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private final Object mCallerContext;
    @Nullable
    private AbstractDraweeControllerBuilder mDraweeControllerBuilder;

    public String getName() {
        return "RCTAnimatedImageView";
    }

    AnimatedReactImageManager() {
    }

    private Object getCallerContext() {
        return this.mCallerContext;
    }

    private AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 21640, new Class[0], AbstractDraweeControllerBuilder.class)) {
            return (AbstractDraweeControllerBuilder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 21640, new Class[0], AbstractDraweeControllerBuilder.class);
        }
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        }
        return this.mDraweeControllerBuilder;
    }

    @Nullable
    public Map<String, Integer> getCommandsMap() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 21657, new Class[0], Map.class)) {
            return MapBuilder.of("start", 1, "stop", 2);
        }
        return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 21657, new Class[0], Map.class);
    }

    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 21655, new Class[0], Map.class)) {
            return MapBuilder.of(ImageLoadEvent.eventNameForType(4), MapBuilder.of("registrationName", "onLoadStart"), ImageLoadEvent.eventNameForType(2), MapBuilder.of("registrationName", "onLoad"), ImageLoadEvent.eventNameForType(3), MapBuilder.of("registrationName", "onLoadEnd"));
        }
        return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 21655, new Class[0], Map.class);
    }

    public void onAfterUpdateTransaction(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 21656, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 21656, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.onAfterUpdateTransaction(aVar);
        aVar.b();
    }

    public a createViewInstance(ThemedReactContext themedReactContext) {
        ThemedReactContext themedReactContext2 = themedReactContext;
        if (!PatchProxy.isSupport(new Object[]{themedReactContext2}, this, changeQuickRedirect, false, 21641, new Class[]{ThemedReactContext.class}, a.class)) {
            return new a(themedReactContext2, getDraweeControllerBuilder(), getCallerContext());
        }
        return (a) PatchProxy.accessDispatch(new Object[]{themedReactContext2}, this, changeQuickRedirect, false, 21641, new Class[]{ThemedReactContext.class}, a.class);
    }

    public AnimatedReactImageManager(@Nullable AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, @Nullable Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
    }

    @ReactProp(customType = "Color", name = "borderColor")
    public void setBorderColor(a aVar, @Nullable Integer num) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, num}, this, changeQuickRedirect, false, 21644, new Class[]{a.class, Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, num}, this, changeQuickRedirect, false, 21644, new Class[]{a.class, Integer.class}, Void.TYPE);
        } else if (num == null) {
            aVar2.setBorderColor(0);
        } else {
            aVar2.setBorderColor(num.intValue());
        }
    }

    @ReactProp(name = "borderWidth")
    public void setBorderWidth(a aVar, float f2) {
        if (PatchProxy.isSupport(new Object[]{aVar, Float.valueOf(f2)}, this, changeQuickRedirect, false, 21646, new Class[]{a.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Float.valueOf(f2)}, this, changeQuickRedirect, false, 21646, new Class[]{a.class, Float.TYPE}, Void.TYPE);
            return;
        }
        aVar.setBorderWidth(f2);
    }

    @ReactProp(name = "fadeDuration")
    public void setFadeDuration(a aVar, int i) {
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, changeQuickRedirect, false, 21652, new Class[]{a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, changeQuickRedirect, false, 21652, new Class[]{a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        aVar.setFadeDuration(i);
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(a aVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 21653, new Class[]{a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 21653, new Class[]{a.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        aVar.setShouldNotifyLoadEvents(z);
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(a aVar, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{aVar, str}, this, changeQuickRedirect, false, 21643, new Class[]{a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, str}, this, changeQuickRedirect, false, 21643, new Class[]{a.class, String.class}, Void.TYPE);
            return;
        }
        aVar.setLoadingIndicatorSource(str);
    }

    @ReactProp(name = "overlayColor")
    public void setOverlayColor(a aVar, @Nullable Integer num) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, num}, this, changeQuickRedirect, false, 21645, new Class[]{a.class, Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, num}, this, changeQuickRedirect, false, 21645, new Class[]{a.class, Integer.class}, Void.TYPE);
        } else if (num == null) {
            aVar2.setOverlayColor(0);
        } else {
            aVar2.setOverlayColor(num.intValue());
        }
    }

    @ReactProp(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(a aVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 21651, new Class[]{a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 21651, new Class[]{a.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        aVar.setProgressiveRenderingEnabled(z);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(a aVar, @Nullable String str) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, str}, this, changeQuickRedirect, false, 21648, new Class[]{a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str}, this, changeQuickRedirect, false, 21648, new Class[]{a.class, String.class}, Void.TYPE);
            return;
        }
        aVar2.setScaleType(ImageResizeMode.toScaleType(str));
    }

    @ReactProp(name = "shouldPlay")
    public void setShouldPlay(a aVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 21654, new Class[]{a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 21654, new Class[]{a.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        aVar.setShouldPlay(z);
    }

    @ReactProp(name = "src")
    public void setSource(a aVar, @Nullable ReadableArray readableArray) {
        if (PatchProxy.isSupport(new Object[]{aVar, readableArray}, this, changeQuickRedirect, false, 21642, new Class[]{a.class, ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, readableArray}, this, changeQuickRedirect, false, 21642, new Class[]{a.class, ReadableArray.class}, Void.TYPE);
            return;
        }
        aVar.setSource(readableArray);
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(a aVar, @Nullable Integer num) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, num}, this, changeQuickRedirect, false, 21650, new Class[]{a.class, Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, num}, this, changeQuickRedirect, false, 21650, new Class[]{a.class, Integer.class}, Void.TYPE);
        } else if (num == null) {
            aVar.clearColorFilter();
        } else {
            aVar2.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(name = "resizeMethod")
    public void setResizeMethod(a aVar, @Nullable String str) {
        a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2}, this, changeQuickRedirect, false, 21649, new Class[]{a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str2}, this, changeQuickRedirect, false, 21649, new Class[]{a.class, String.class}, Void.TYPE);
        } else if (str2 == null || "auto".equals(str2)) {
            aVar2.setResizeMethod(ImageResizeMethod.AUTO);
        } else if ("resize".equals(str2)) {
            aVar2.setResizeMethod(ImageResizeMethod.RESIZE);
        } else if ("scale".equals(str2)) {
            aVar2.setResizeMethod(ImageResizeMethod.SCALE);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid resize method: '" + str2 + "'");
        }
    }

    public void receiveCommand(a aVar, int i, @Nullable ReadableArray readableArray) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, Integer.valueOf(i), readableArray}, this, changeQuickRedirect, false, 21658, new Class[]{a.class, Integer.TYPE, ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Integer.valueOf(i), readableArray}, this, changeQuickRedirect, false, 21658, new Class[]{a.class, Integer.TYPE, ReadableArray.class}, Void.TYPE);
            return;
        }
        switch (i) {
            case 1:
                aVar2.setShouldPlay(true);
                return;
            case 2:
                aVar2.setShouldPlay(false);
                break;
        }
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(a aVar, int i, float f2) {
        float f3;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 21647, new Class[]{a.class, Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Integer.valueOf(i), Float.valueOf(f2)}, this, changeQuickRedirect, false, 21647, new Class[]{a.class, Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (!a.a(f2)) {
            f3 = PixelUtil.toPixelFromDIP(f2);
        } else {
            f3 = f2;
        }
        if (i == 0) {
            aVar2.setBorderRadius(f3);
            return;
        }
        int i2 = i - 1;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f3), Integer.valueOf(i2)}, aVar, a.f33352a, false, 21665, new Class[]{Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f3), Integer.valueOf(i2)}, aVar, a.f33352a, false, 21665, new Class[]{Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (aVar2.f33357f == null) {
            aVar2.f33357f = new float[4];
            Arrays.fill(aVar2.f33357f, 1.0E21f);
        }
        if (!FloatUtil.floatsEqual(aVar2.f33357f[i2], f3)) {
            aVar2.f33357f[i2] = f3;
            aVar2.h = true;
        }
    }
}
