package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build;
import com.squareup.picasso.i;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class ac implements i {

    /* renamed from: a  reason: collision with root package name */
    static volatile Object f27394a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f27395b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f27396c = new ThreadLocal<StringBuilder>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new StringBuilder();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final Context f27397d;

    public ac(Context context) {
        this.f27397d = context.getApplicationContext();
    }

    public final i.a a(Uri uri, int i) throws IOException {
        String str;
        if (Build.VERSION.SDK_INT >= 14) {
            Context context = this.f27397d;
            if (f27394a == null) {
                try {
                    synchronized (f27395b) {
                        if (f27394a == null) {
                            File b2 = ad.b(context);
                            HttpResponseCache installed = HttpResponseCache.getInstalled();
                            if (installed == null) {
                                installed = HttpResponseCache.install(b2, ad.a(b2));
                            }
                            f27394a = installed;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setUseCaches(true);
        if (i != 0) {
            if (p.isOfflineOnly(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = f27396c.get();
                sb.setLength(0);
                if (!p.shouldReadFromDiskCache(i)) {
                    sb.append("no-cache");
                }
                if (!p.shouldWriteToDiskCache(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                str = sb.toString();
            }
            httpURLConnection.setRequestProperty("Cache-Control", str);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 300) {
            long headerFieldInt = (long) httpURLConnection.getHeaderFieldInt("Content-Length", -1);
            return new i.a(httpURLConnection.getInputStream(), ad.a(httpURLConnection.getHeaderField("X-Android-Response-Source")), headerFieldInt);
        }
        httpURLConnection.disconnect();
        throw new i.b(responseCode + " " + httpURLConnection.getResponseMessage(), i, responseCode);
    }
}
