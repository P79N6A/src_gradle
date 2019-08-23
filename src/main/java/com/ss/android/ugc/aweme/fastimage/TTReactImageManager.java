package com.ss.android.ugc.aweme.fastimage;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.image.GlobalImageLoadListener;
import com.facebook.react.views.image.ImageResizeMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = "FastImageView")
public class TTReactImageManager extends SimpleViewManager<d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private final Object mCallerContext;
    @Nullable
    private AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    @Nullable
    private GlobalImageLoadListener mGlobalImageLoadListener;

    public String getName() {
        return "FastImageView";
    }

    public TTReactImageManager() {
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39352, new Class[0], AbstractDraweeControllerBuilder.class)) {
            return (AbstractDraweeControllerBuilder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39352, new Class[0], AbstractDraweeControllerBuilder.class);
        }
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        }
        return this.mDraweeControllerBuilder;
    }

    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39356, new Class[0], Map.class)) {
            return MapBuilder.builder().put("onFastImageLoadStart", MapBuilder.of("registrationName", "onFastImageLoadStart")).put("onFastImageProgress", MapBuilder.of("registrationName", "onFastImageProgress")).put("onFastImageLoad", MapBuilder.of("registrationName", "onFastImageLoad")).put("onFastImageError", MapBuilder.of("registrationName", "onFastImageError")).put("onFastImageLoadEnd", MapBuilder.of("registrationName", "onFastImageLoadEnd")).build();
        }
        return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39356, new Class[0], Map.class);
    }

    public void onAfterUpdateTransaction(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, changeQuickRedirect, false, 39357, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, changeQuickRedirect, false, 39357, new Class[]{d.class}, Void.TYPE);
            return;
        }
        super.onAfterUpdateTransaction(dVar);
        dVar.a();
    }

    public d createViewInstance(ThemedReactContext themedReactContext) {
        ThemedReactContext themedReactContext2 = themedReactContext;
        if (!PatchProxy.isSupport(new Object[]{themedReactContext2}, this, changeQuickRedirect, false, 39353, new Class[]{ThemedReactContext.class}, d.class)) {
            return new d(themedReactContext2, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, getCallerContext());
        }
        return (d) PatchProxy.accessDispatch(new Object[]{themedReactContext2}, this, changeQuickRedirect, false, 39353, new Class[]{ThemedReactContext.class}, d.class);
    }

    public TTReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this(abstractDraweeControllerBuilder, null, obj);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(d dVar, @Nullable String str) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, str}, this, changeQuickRedirect, false, 39355, new Class[]{d.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, str}, this, changeQuickRedirect, false, 39355, new Class[]{d.class, String.class}, Void.TYPE);
            return;
        }
        dVar2.setScaleType(ImageResizeMode.toScaleType(str));
    }

    @ReactProp(name = "source")
    public void setSource(d dVar, @Nullable ReadableMap readableMap) {
        if (PatchProxy.isSupport(new Object[]{dVar, readableMap}, this, changeQuickRedirect, false, 39354, new Class[]{d.class, ReadableMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar, readableMap}, this, changeQuickRedirect, false, 39354, new Class[]{d.class, ReadableMap.class}, Void.TYPE);
            return;
        }
        dVar.setSource(readableMap);
    }

    public TTReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, @Nullable GlobalImageLoadListener globalImageLoadListener, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
    }
}
