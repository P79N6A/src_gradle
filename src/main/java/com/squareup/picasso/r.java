package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.picasso.i;
import java.io.File;
import java.io.IOException;

public final class r implements i {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f27436a;

    public r(Context context) {
        this(ad.b(context));
    }

    private r(OkHttpClient okHttpClient) {
        this.f27436a = okHttpClient;
    }

    private r(File file) {
        this(file, ad.a(file));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private r(java.io.File r5, long r6) {
        /*
            r4 = this;
            com.squareup.okhttp.OkHttpClient r0 = new com.squareup.okhttp.OkHttpClient
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 15000(0x3a98, double:7.411E-320)
            r0.setConnectTimeout(r2, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 20000(0x4e20, double:9.8813E-320)
            r0.setReadTimeout(r2, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.setWriteTimeout(r2, r1)
            r4.<init>((com.squareup.okhttp.OkHttpClient) r0)
            com.squareup.okhttp.OkHttpClient r0 = r4.f27436a     // Catch:{ IOException -> 0x0026 }
            com.squareup.okhttp.Cache r1 = new com.squareup.okhttp.Cache     // Catch:{ IOException -> 0x0026 }
            r1.<init>(r5, r6)     // Catch:{ IOException -> 0x0026 }
            r0.setCache(r1)     // Catch:{ IOException -> 0x0026 }
            return
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.r.<init>(java.io.File, long):void");
    }

    public final i.a a(Uri uri, int i) throws IOException {
        CacheControl cacheControl;
        boolean z;
        if (i == 0) {
            cacheControl = null;
        } else if (p.isOfflineOnly(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!p.shouldReadFromDiskCache(i)) {
                builder.noCache();
            }
            if (!p.shouldWriteToDiskCache(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.f27436a.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            if (execute.cacheResponse() != null) {
                z = true;
            } else {
                z = false;
            }
            ResponseBody body = execute.body();
            return new i.a(body.byteStream(), z, body.contentLength());
        }
        execute.body().close();
        throw new i.b(code + " " + execute.message(), i, code);
    }
}
