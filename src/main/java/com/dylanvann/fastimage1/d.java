package com.dylanvann.fastimage1;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.ImageViewTarget;
import com.bumptech.glide.request.target.Target;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.ss.android.ugc.aweme.framework.ReactInstance;

public final class d implements RequestListener<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    private String f23274a;

    d(String str) {
        this.f23274a = str;
    }

    public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
        b.a(this.f23274a);
        if (!(target instanceof ImageViewTarget)) {
            return false;
        }
        if (ReactInstance.getConfig() != null && FastImageViewManager.URL_CACHE_MAP.containsKey(this.f23274a)) {
            ReactInstance.getConfig().a(this.f23274a);
        }
        FastImageViewWithUrl fastImageViewWithUrl = (FastImageViewWithUrl) ((ImageViewTarget) target).getView();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) fastImageViewWithUrl.getContext()).getJSModule(RCTEventEmitter.class);
        int id = fastImageViewWithUrl.getId();
        rCTEventEmitter.receiveEvent(id, "onFastImageError", new WritableNativeMap());
        rCTEventEmitter.receiveEvent(id, "onFastImageLoadEnd", new WritableNativeMap());
        return false;
    }

    public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, Target target, DataSource dataSource, boolean z) {
        Drawable drawable = (Drawable) obj;
        if (!(target instanceof ImageViewTarget)) {
            return false;
        }
        if (ReactInstance.getConfig() != null && FastImageViewManager.URL_CACHE_MAP.containsKey(this.f23274a)) {
            FastImageViewManager.URL_CACHE_MAP.remove(this.f23274a);
            ReactInstance.getConfig().a(this.f23274a, true);
        }
        FastImageViewWithUrl fastImageViewWithUrl = (FastImageViewWithUrl) ((ImageViewTarget) target).getView();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) fastImageViewWithUrl.getContext()).getJSModule(RCTEventEmitter.class);
        int id = fastImageViewWithUrl.getId();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", drawable.getIntrinsicWidth());
        writableNativeMap.putInt("height", drawable.getIntrinsicHeight());
        rCTEventEmitter.receiveEvent(id, "onFastImageLoad", writableNativeMap);
        rCTEventEmitter.receiveEvent(id, "onFastImageLoadEnd", new WritableNativeMap());
        return false;
    }
}
