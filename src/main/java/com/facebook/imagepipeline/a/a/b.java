package com.facebook.imagepipeline.a.a;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.ah;
import com.facebook.imagepipeline.producers.am;
import com.facebook.imagepipeline.producers.c;
import com.facebook.imagepipeline.producers.e;
import com.facebook.imagepipeline.producers.s;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class b extends c<a> {
    @Nullable
    private final CacheControl mCacheControl;
    private final Call.Factory mCallFactory;
    public Executor mCancellationExecutor;

    public static class a extends s {
        public long fetchCompleteTime;
        public long responseTime;
        public long submitTime;

        public a(Consumer<com.facebook.imagepipeline.image.b> consumer, am amVar) {
            super(consumer, amVar);
        }
    }

    public b(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.dispatcher().executorService());
    }

    public b(Call.Factory factory, Executor executor) {
        this(factory, executor, true);
    }

    public a createFetchState(Consumer<com.facebook.imagepipeline.image.b> consumer, am amVar) {
        return new a(consumer, amVar);
    }

    public void onFetchCompletion(a aVar, int i) {
        aVar.fetchCompleteTime = SystemClock.elapsedRealtime();
    }

    public Map<String, String> getExtraMap(a aVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(aVar.responseTime - aVar.submitTime));
        hashMap.put("fetch_time", Long.toString(aVar.fetchCompleteTime - aVar.responseTime));
        hashMap.put("total_time", Long.toString(aVar.fetchCompleteTime - aVar.submitTime));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    public void fetch(a aVar, ah.a aVar2) {
        aVar.submitTime = System.currentTimeMillis();
        try {
            Request.Builder builder = new Request.Builder().url(aVar.getUri().toString()).get();
            if (this.mCacheControl != null) {
                builder.cacheControl(this.mCacheControl);
            }
            com.facebook.imagepipeline.common.a bytesRange = aVar.mContext.getImageRequest().getBytesRange();
            if (bytesRange != null) {
                builder.addHeader("Range", bytesRange.toHttpRangeHeaderValue());
            }
            fetchWithRequest(aVar, aVar2, builder.build());
        } catch (Exception e2) {
            aVar2.onFailure(e2);
        }
    }

    public void handleException(Call call, Exception exc, ah.a aVar) {
        if (call.isCanceled()) {
            aVar.onCancellation();
        } else {
            aVar.onFailure(exc);
        }
    }

    public b(Call.Factory factory, Executor executor, boolean z) {
        CacheControl cacheControl;
        this.mCallFactory = factory;
        this.mCancellationExecutor = executor;
        if (z) {
            cacheControl = new CacheControl.Builder().noStore().build();
        } else {
            cacheControl = null;
        }
        this.mCacheControl = cacheControl;
    }

    /* access modifiers changed from: protected */
    public void fetchWithRequest(final a aVar, final ah.a aVar2, Request request) {
        final Call newCall = this.mCallFactory.newCall(request);
        aVar.mContext.addCallbacks(new e() {
            public final void onCancellationRequested() {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    newCall.cancel();
                } else {
                    b.this.mCancellationExecutor.execute(new Runnable() {
                        public final void run() {
                            newCall.cancel();
                        }
                    });
                }
            }
        });
        newCall.enqueue(new Callback() {
            public final void onFailure(Call call, IOException iOException) {
                b.this.handleException(call, iOException, aVar2);
            }

            public final void onResponse(Call call, Response response) throws IOException {
                aVar.responseTime = System.currentTimeMillis();
                ResponseBody body = response.body();
                try {
                    if (!response.isSuccessful()) {
                        b.this.handleException(call, new IOException("Unexpected HTTP code " + response), aVar2);
                        return;
                    }
                    com.facebook.imagepipeline.common.a fromContentRangeHeader = com.facebook.imagepipeline.common.a.fromContentRangeHeader(response.header("Content-Range"));
                    if (!(fromContentRangeHeader == null || (fromContentRangeHeader.from == 0 && fromContentRangeHeader.to == Integer.MAX_VALUE))) {
                        aVar.mResponseBytesRange = fromContentRangeHeader;
                        aVar.mOnNewResultStatusFlags = 8;
                    }
                    long contentLength = body.contentLength();
                    if (contentLength < 0) {
                        contentLength = 0;
                    }
                    aVar2.onResponse(body.byteStream(), (int) contentLength);
                    body.close();
                } catch (Exception e2) {
                    b.this.handleException(call, e2, aVar2);
                } finally {
                    body.close();
                }
            }
        });
    }
}
