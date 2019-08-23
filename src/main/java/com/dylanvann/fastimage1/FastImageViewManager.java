package com.dylanvann.fastimage1;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.model.GlideUrl;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.framework.ReactInstance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

public class FastImageViewManager extends SimpleViewManager<FastImageViewWithUrl> implements c {
    static final Map<String, String> URL_CACHE_MAP = new ConcurrentHashMap();
    private static final Map<String, List<FastImageViewWithUrl>> VIEWS_FOR_URLS = new WeakHashMap();
    @Nullable
    private RequestManager requestManager;

    public float getGranularityPercentage() {
        return 0.5f;
    }

    public String getName() {
        return "FastImageView";
    }

    FastImageViewManager() {
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("onFastImageLoadStart", MapBuilder.of("registrationName", "onFastImageLoadStart")).put("onFastImageProgress", MapBuilder.of("registrationName", "onFastImageProgress")).put("onFastImageLoad", MapBuilder.of("registrationName", "onFastImageLoad")).put("onFastImageError", MapBuilder.of("registrationName", "onFastImageError")).put("onFastImageLoadEnd", MapBuilder.of("registrationName", "onFastImageLoadEnd")).build();
    }

    private boolean isNullOrEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public FastImageViewWithUrl createViewInstance(ThemedReactContext themedReactContext) {
        if (isValidContextForGlide(themedReactContext)) {
            this.requestManager = Glide.with((Context) themedReactContext);
        }
        return new FastImageViewWithUrl(themedReactContext);
    }

    private static boolean isActivityDestroyed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (activity.isDestroyed() || activity.isFinishing()) {
                return true;
            }
            return false;
        } else if (activity.isFinishing() || activity.isChangingConfigurations()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isValidContextForGlide(Context context) {
        if (context == null) {
            return false;
        }
        if ((context instanceof Activity) && isActivityDestroyed((Activity) context)) {
            return false;
        }
        if (context instanceof ThemedReactContext) {
            Context baseContext = ((ThemedReactContext) context).getBaseContext();
            if (!(baseContext instanceof Activity) || !isActivityDestroyed((Activity) baseContext)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void onDropViewInstance(FastImageViewWithUrl fastImageViewWithUrl) {
        if (this.requestManager != null) {
            this.requestManager.clear((View) fastImageViewWithUrl);
        }
        if (fastImageViewWithUrl.f23257a != null) {
            String glideUrl = fastImageViewWithUrl.f23257a.toString();
            URL_CACHE_MAP.remove(glideUrl);
            b.a(glideUrl);
            List list = VIEWS_FOR_URLS.get(glideUrl);
            if (list != null) {
                list.remove(fastImageViewWithUrl);
                if (list.size() == 0) {
                    VIEWS_FOR_URLS.remove(glideUrl);
                }
            }
        }
        super.onDropViewInstance(fastImageViewWithUrl);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(FastImageViewWithUrl fastImageViewWithUrl, String str) {
        fastImageViewWithUrl.setScaleType((ImageView.ScaleType) f.a("resizeMode", "cover", f.f23277a, str));
    }

    @ReactProp(name = "source")
    public void setSrc(FastImageViewWithUrl fastImageViewWithUrl, @Nullable ReadableMap readableMap) {
        boolean z;
        Object obj;
        if (readableMap == null || !readableMap.hasKey("uri") || isNullOrEmpty(readableMap.getString("uri"))) {
            if (this.requestManager != null) {
                this.requestManager.clear((View) fastImageViewWithUrl);
            }
            if (fastImageViewWithUrl.f23257a != null) {
                String stringUrl = fastImageViewWithUrl.f23257a.toStringUrl();
                URL_CACHE_MAP.remove(stringUrl);
                b.a(stringUrl);
            }
            fastImageViewWithUrl.setImageDrawable(null);
            return;
        }
        e a2 = f.a(fastImageViewWithUrl.getContext(), readableMap);
        GlideUrl b2 = a2.b();
        fastImageViewWithUrl.f23257a = b2;
        if (this.requestManager != null) {
            this.requestManager.clear((View) fastImageViewWithUrl);
        }
        String stringUrl2 = b2.toStringUrl();
        URL_CACHE_MAP.put(stringUrl2, "");
        b.f23258a.f23260a.put(stringUrl2, this);
        List list = VIEWS_FOR_URLS.get(stringUrl2);
        if (list != null && !list.contains(fastImageViewWithUrl)) {
            list.add(fastImageViewWithUrl);
        } else if (list == null) {
            VIEWS_FOR_URLS.put(stringUrl2, new ArrayList(Collections.singletonList(fastImageViewWithUrl)));
        }
        ((RCTEventEmitter) ((ThemedReactContext) fastImageViewWithUrl.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(fastImageViewWithUrl.getId(), "onFastImageLoadStart", new WritableNativeMap());
        if (this.requestManager != null) {
            RequestManager requestManager2 = this.requestManager;
            boolean z2 = true;
            if (a2.f23276b == null || !PushConstants.CONTENT.equals(a2.f23276b.getScheme())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                obj = a2.getSource();
            } else if (a2.a()) {
                obj = a2.getSource();
            } else if (a2.isResource()) {
                obj = a2.getUri();
            } else {
                if (a2.f23276b == null || !"file".equals(a2.f23276b.getScheme())) {
                    z2 = false;
                }
                if (z2) {
                    obj = a2.getUri().toString();
                } else {
                    obj = a2.b();
                }
            }
            requestManager2.load(obj).apply(f.a(readableMap)).listener(new d(stringUrl2)).into((ImageView) fastImageViewWithUrl);
        }
    }

    public void onProgress(String str, long j, long j2) {
        if (j == j2 && URL_CACHE_MAP.containsKey(str) && ReactInstance.getConfig() != null) {
            URL_CACHE_MAP.remove(str);
            ReactInstance.getConfig().a(str, false);
        }
        List<FastImageViewWithUrl> list = VIEWS_FOR_URLS.get(str);
        if (list != null) {
            for (FastImageViewWithUrl fastImageViewWithUrl : list) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("loaded", (int) j);
                writableNativeMap.putInt("total", (int) j2);
                ((RCTEventEmitter) ((ThemedReactContext) fastImageViewWithUrl.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(fastImageViewWithUrl.getId(), "onFastImageProgress", writableNativeMap);
            }
        }
    }
}
