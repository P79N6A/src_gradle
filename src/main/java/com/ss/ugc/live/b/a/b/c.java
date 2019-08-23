package com.ss.ugc.live.b.a.b;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import com.ss.ugc.live.b.a.b.b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f78630a = h.a(m.a(p.FIXED).a(3).a());

    static class a extends IOException {
        private int code;

        public final int getCode() {
            return this.code;
        }

        public a(String str, int i) {
            super(str);
            this.code = i;
        }
    }

    private static boolean a(int i) {
        return i >= 200 && i < 300;
    }

    private static boolean b(int i) {
        switch (i) {
            case com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f:
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

    public final void a(final a aVar, final b.a aVar2) {
        if (com.ss.ugc.live.b.a.e.c.a(aVar.f78628a)) {
            aVar2.a((Throwable) new IllegalArgumentException("request is not valid"), 0);
        } else {
            this.f78630a.submit(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:29:0x003d A[Catch:{ all -> 0x0057 }] */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x0045 A[Catch:{ all -> 0x0057 }] */
                /* JADX WARNING: Removed duplicated region for block: B:33:0x004b A[SYNTHETIC, Splitter:B:33:0x004b] */
                /* JADX WARNING: Removed duplicated region for block: B:37:0x0052  */
                /* JADX WARNING: Removed duplicated region for block: B:42:0x005a A[SYNTHETIC, Splitter:B:42:0x005a] */
                /* JADX WARNING: Removed duplicated region for block: B:46:0x0061  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r5 = this;
                        com.ss.ugc.live.b.a.b.c r0 = com.ss.ugc.live.b.a.b.c.this
                        com.ss.ugc.live.b.a.b.a r1 = r3
                        com.ss.ugc.live.b.a.b.b$a r2 = r4
                        r3 = 5
                        r4 = 0
                        java.net.HttpURLConnection r0 = r0.a((com.ss.ugc.live.b.a.b.a) r1, (int) r3)     // Catch:{ IOException -> 0x0037, all -> 0x0034 }
                        if (r0 == 0) goto L_0x0026
                        java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x0024 }
                        java.lang.String r3 = "Content-Length"
                        r4 = -1
                        int r3 = r0.getHeaderFieldInt(r3, r4)     // Catch:{ IOException -> 0x0021, all -> 0x001e }
                        long r3 = (long) r3     // Catch:{ IOException -> 0x0021, all -> 0x001e }
                        r2.a((java.io.InputStream) r1, (long) r3)     // Catch:{ IOException -> 0x0021, all -> 0x001e }
                        goto L_0x0027
                    L_0x001e:
                        r2 = move-exception
                        r4 = r1
                        goto L_0x0058
                    L_0x0021:
                        r3 = move-exception
                        r4 = r1
                        goto L_0x0039
                    L_0x0024:
                        r3 = move-exception
                        goto L_0x0039
                    L_0x0026:
                        r1 = r4
                    L_0x0027:
                        if (r1 == 0) goto L_0x002e
                        r1.close()     // Catch:{ IOException -> 0x002d }
                        goto L_0x002e
                    L_0x002d:
                    L_0x002e:
                        if (r0 == 0) goto L_0x0056
                        r0.disconnect()
                        return
                    L_0x0034:
                        r2 = move-exception
                        r0 = r4
                        goto L_0x0058
                    L_0x0037:
                        r3 = move-exception
                        r0 = r4
                    L_0x0039:
                        boolean r1 = r3 instanceof com.ss.ugc.live.b.a.b.c.a     // Catch:{ all -> 0x0057 }
                        if (r1 == 0) goto L_0x0045
                        r1 = r3
                        com.ss.ugc.live.b.a.b.c$a r1 = (com.ss.ugc.live.b.a.b.c.a) r1     // Catch:{ all -> 0x0057 }
                        int r1 = r1.getCode()     // Catch:{ all -> 0x0057 }
                        goto L_0x0046
                    L_0x0045:
                        r1 = 0
                    L_0x0046:
                        r2.a((java.lang.Throwable) r3, (int) r1)     // Catch:{ all -> 0x0057 }
                        if (r4 == 0) goto L_0x0050
                        r4.close()     // Catch:{ IOException -> 0x004f }
                        goto L_0x0050
                    L_0x004f:
                    L_0x0050:
                        if (r0 == 0) goto L_0x0056
                        r0.disconnect()
                        return
                    L_0x0056:
                        return
                    L_0x0057:
                        r2 = move-exception
                    L_0x0058:
                        if (r4 == 0) goto L_0x005f
                        r4.close()     // Catch:{ IOException -> 0x005e }
                        goto L_0x005f
                    L_0x005e:
                    L_0x005f:
                        if (r0 == 0) goto L_0x0064
                        r0.disconnect()
                    L_0x0064:
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.live.b.a.b.c.AnonymousClass1.run():void");
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection a(a aVar, int i) throws IOException {
        String str;
        String str2 = aVar.f78628a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        long j = aVar.f78629b;
        if (j > 0) {
            httpURLConnection.setRequestProperty("range", "bytes=" + j + "-");
        }
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(5000);
        int responseCode = httpURLConnection.getResponseCode();
        if (a(responseCode)) {
            return httpURLConnection;
        }
        if (b(responseCode)) {
            String headerField = httpURLConnection.getHeaderField("Location");
            httpURLConnection.disconnect();
            if (headerField == null || i <= 0) {
                if (i == 0) {
                    str = String.format("URL %1$s too many redirects", new Object[]{str2});
                } else {
                    str = String.format("URL %1$s invalid redirect", new Object[]{str2});
                }
                throw new IOException(str);
            }
            aVar.f78628a = headerField;
            a(aVar, i - 1);
            return httpURLConnection;
        }
        httpURLConnection.disconnect();
        throw new a("error response code:" + responseCode, responseCode);
    }
}
