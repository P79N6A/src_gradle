package com.dylanvann.fastimage1;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.LazyHeaders;
import com.bumptech.glide.request.RequestOptions;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    static final Map<String, ImageView.ScaleType> f23277a = new HashMap<String, ImageView.ScaleType>() {
        {
            put("contain", ImageView.ScaleType.FIT_CENTER);
            put("cover", ImageView.ScaleType.CENTER_CROP);
            put("stretch", ImageView.ScaleType.FIT_XY);
            put("center", ImageView.ScaleType.CENTER);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static final Drawable f23278b = new ColorDrawable(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, a> f23279c = new HashMap<String, a>() {
        {
            put("immutable", a.IMMUTABLE);
            put("web", a.WEB);
            put("cacheOnly", a.CACHE_ONLY);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, Priority> f23280d = new HashMap<String, Priority>() {
        {
            put("low", Priority.LOW);
            put("normal", Priority.NORMAL);
            put("high", Priority.HIGH);
        }
    };

    private static Headers b(ReadableMap readableMap) {
        Headers headers = Headers.DEFAULT;
        if (!readableMap.hasKey("headers")) {
            return headers;
        }
        ReadableMap map = readableMap.getMap("headers");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        LazyHeaders.Builder builder = new LazyHeaders.Builder();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            builder.addHeader(nextKey, map.getString(nextKey));
        }
        return builder.build();
    }

    static RequestOptions a(ReadableMap readableMap) {
        Priority priority = (Priority) a("priority", "normal", f23280d, readableMap);
        DiskCacheStrategy diskCacheStrategy = DiskCacheStrategy.AUTOMATIC;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.FALSE;
        switch ((a) a("cache", "immutable", f23279c, readableMap)) {
            case WEB:
                diskCacheStrategy = DiskCacheStrategy.NONE;
                bool2 = Boolean.TRUE;
                break;
            case CACHE_ONLY:
                bool = Boolean.TRUE;
                break;
        }
        return new RequestOptions().diskCacheStrategy(diskCacheStrategy).onlyRetrieveFromCache(bool.booleanValue()).skipMemoryCache(bool2.booleanValue()).priority(priority).placeholder(f23278b);
    }

    static e a(Context context, ReadableMap readableMap) {
        return new e(context, readableMap.getString("uri"), b(readableMap));
    }

    private static <T> T a(String str, String str2, Map<String, T> map, ReadableMap readableMap) {
        String str3 = null;
        if (readableMap != null) {
            try {
                str3 = readableMap.getString(str);
            } catch (NoSuchKeyException unused) {
            }
        }
        return a(str, str2, map, str3);
    }

    static <T> T a(String str, String str2, Map<String, T> map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        T t = map.get(str2);
        if (t != null) {
            return t;
        }
        throw new JSApplicationIllegalArgumentException("FastImage, invalid " + str + " : " + str2);
    }
}
