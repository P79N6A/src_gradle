package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.f.f;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.producers.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class t extends c<s> {

    /* renamed from: a  reason: collision with root package name */
    private int f24194a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f24195b;

    private static boolean a(int i) {
        return i >= 200 && i < 300;
    }

    private static boolean b(int i) {
        switch (i) {
            case c.f69428f /*?: ONE_ARG  (wrap: ?
  ?: SGET   com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f int)*/:
            case 301:
            case 302:
            case 303:
            case 307:
            case 308:
                return true;
            default:
                return false;
        }
    }

    public t() {
        this(u.a(3));
    }

    @VisibleForTesting
    private t(ExecutorService executorService) {
        this.f24195b = executorService;
    }

    public t(int i) {
        this(u.a(3));
        this.f24194a = i;
    }

    @VisibleForTesting
    private static HttpURLConnection a(Uri uri) throws IOException {
        return (HttpURLConnection) f.a(uri).openConnection();
    }

    public final s createFetchState(Consumer<b> consumer, am amVar) {
        return new s(consumer, amVar);
    }

    private static String a(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    public final void fetch(final s sVar, final ah.a aVar) {
        final Future<?> submit = this.f24195b.submit(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0043 A[SYNTHETIC, Splitter:B:31:0x0043] */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x004a  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x0053 A[SYNTHETIC, Splitter:B:41:0x0053] */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x005a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                    com.facebook.imagepipeline.producers.t r0 = com.facebook.imagepipeline.producers.t.this
                    com.facebook.imagepipeline.producers.s r1 = r3
                    com.facebook.imagepipeline.producers.ah$a r2 = r4
                    r3 = 0
                    android.net.Uri r1 = r1.getUri()     // Catch:{ IOException -> 0x003c, all -> 0x0039 }
                    r4 = 5
                    java.net.HttpURLConnection r0 = r0.a((android.net.Uri) r1, (int) r4)     // Catch:{ IOException -> 0x003c, all -> 0x0039 }
                    if (r0 == 0) goto L_0x002b
                    java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                    r3 = -1
                    r2.onResponse(r1, r3)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                    goto L_0x002c
                L_0x001b:
                    r2 = move-exception
                    r3 = r1
                    goto L_0x0051
                L_0x001e:
                    r3 = move-exception
                    r5 = r1
                    r1 = r0
                    r0 = r3
                    r3 = r5
                    goto L_0x003e
                L_0x0024:
                    r2 = move-exception
                    goto L_0x0051
                L_0x0026:
                    r1 = move-exception
                    r5 = r1
                    r1 = r0
                    r0 = r5
                    goto L_0x003e
                L_0x002b:
                    r1 = r3
                L_0x002c:
                    if (r1 == 0) goto L_0x0033
                    r1.close()     // Catch:{ IOException -> 0x0032 }
                    goto L_0x0033
                L_0x0032:
                L_0x0033:
                    if (r0 == 0) goto L_0x004e
                    r0.disconnect()
                    return
                L_0x0039:
                    r2 = move-exception
                    r0 = r3
                    goto L_0x0051
                L_0x003c:
                    r0 = move-exception
                    r1 = r3
                L_0x003e:
                    r2.onFailure(r0)     // Catch:{ all -> 0x004f }
                    if (r3 == 0) goto L_0x0048
                    r3.close()     // Catch:{ IOException -> 0x0047 }
                    goto L_0x0048
                L_0x0047:
                L_0x0048:
                    if (r1 == 0) goto L_0x004e
                    r1.disconnect()
                    return
                L_0x004e:
                    return
                L_0x004f:
                    r2 = move-exception
                    r0 = r1
                L_0x0051:
                    if (r3 == 0) goto L_0x0058
                    r3.close()     // Catch:{ IOException -> 0x0057 }
                    goto L_0x0058
                L_0x0057:
                L_0x0058:
                    if (r0 == 0) goto L_0x005d
                    r0.disconnect()
                L_0x005d:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.t.AnonymousClass1.run():void");
            }
        });
        sVar.mContext.addCallbacks(new e() {
            public final void onCancellationRequested() {
                if (submit.cancel(false)) {
                    aVar.onCancellation();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.HttpURLConnection a(android.net.Uri r8, int r9) throws java.io.IOException {
        /*
            r7 = this;
        L_0x0000:
            java.net.HttpURLConnection r0 = a((android.net.Uri) r8)
            int r1 = r7.f24194a
            r0.setConnectTimeout(r1)
            int r1 = r0.getResponseCode()
            boolean r2 = a((int) r1)
            if (r2 == 0) goto L_0x0014
            return r0
        L_0x0014:
            boolean r2 = b(r1)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x006f
            java.lang.String r2 = "Location"
            java.lang.String r2 = r0.getHeaderField(r2)
            r0.disconnect()
            if (r2 != 0) goto L_0x002a
            r0 = 0
            goto L_0x002e
        L_0x002a:
            android.net.Uri r0 = android.net.Uri.parse(r2)
        L_0x002e:
            java.lang.String r2 = r8.getScheme()
            if (r9 <= 0) goto L_0x0044
            if (r0 == 0) goto L_0x0044
            java.lang.String r6 = r0.getScheme()
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0044
            int r9 = r9 + -1
            r8 = r0
            goto L_0x0000
        L_0x0044:
            if (r9 != 0) goto L_0x0055
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r8 = r8.toString()
            r9[r4] = r8
            java.lang.String r8 = "URL %s follows too many redirects"
            java.lang.String r8 = a((java.lang.String) r8, (java.lang.Object[]) r9)
            goto L_0x0069
        L_0x0055:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r8 = r8.toString()
            r9[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r9[r5] = r8
            java.lang.String r8 = "URL %s returned %d without a valid redirect"
            java.lang.String r8 = a((java.lang.String) r8, (java.lang.Object[]) r9)
        L_0x0069:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r8)
            throw r9
        L_0x006f:
            r0.disconnect()
            java.io.IOException r9 = new java.io.IOException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r8 = r8.toString()
            r0[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r0[r5] = r8
            java.lang.String r8 = "Image URL %s returned HTTP code %d"
            java.lang.String r8 = java.lang.String.format(r8, r0)
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.t.a(android.net.Uri, int):java.net.HttpURLConnection");
    }
}
