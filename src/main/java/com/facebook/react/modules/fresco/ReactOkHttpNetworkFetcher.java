package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.a.a.b;
import com.facebook.imagepipeline.producers.ah;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class ReactOkHttpNetworkFetcher extends b {
    private final Executor mCancellationExecutor;
    private final OkHttpClient mOkHttpClient;

    public ReactOkHttpNetworkFetcher(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.mOkHttpClient = okHttpClient;
        this.mCancellationExecutor = okHttpClient.dispatcher().executorService();
    }

    private Map<String, String> getHeaders(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    public void fetch(b.a aVar, ah.a aVar2) {
        Map<String, String> map;
        aVar.submitTime = SystemClock.elapsedRealtime();
        Uri uri = aVar.getUri();
        if (aVar.mContext.getImageRequest() instanceof ReactNetworkImageRequest) {
            map = getHeaders(((ReactNetworkImageRequest) aVar.mContext.getImageRequest()).getHeaders());
        } else {
            map = null;
        }
        if (map == null) {
            map = Collections.emptyMap();
        }
        fetchWithRequest(aVar, aVar2, new Request.Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(uri.toString()).headers(Headers.of(map)).get().build());
    }
}
