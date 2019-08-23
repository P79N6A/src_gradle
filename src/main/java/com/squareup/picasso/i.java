package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public interface i {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f27419a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f27420b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f27421c;

        /* renamed from: d  reason: collision with root package name */
        public final long f27422d;

        public a(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.f27419a = inputStream;
                this.f27420b = null;
                this.f27421c = z;
                this.f27422d = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }
    }

    public static class b extends IOException {
        final boolean localCacheOnly;
        final int responseCode;

        public b(String str, int i, int i2) {
            super(str);
            this.localCacheOnly = p.isOfflineOnly(i);
            this.responseCode = i2;
        }
    }

    a a(Uri uri, int i) throws IOException;
}
