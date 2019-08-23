package com.ss.android.ugc.aweme.common.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okio.Okio;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40192a;

    /* renamed from: b  reason: collision with root package name */
    private static final OkHttpClient f40193b = ((OkHttpClient) ServiceManager.get().getService(OkHttpClient.class)).newBuilder().connectTimeout(60, TimeUnit.SECONDS).writeTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).retryOnConnectionFailure(true).build();

    /* renamed from: com.ss.android.ugc.aweme.common.b.a$a  reason: collision with other inner class name */
    public interface C0521a {
        void a(String str);

        void a(String str, int i);

        void a(String str, Exception exc);
    }

    public static void a(String str, String str2, C0521a aVar) {
        final String str3 = str;
        String str4 = str2;
        final C0521a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, aVar2}, null, f40192a, true, 33414, new Class[]{String.class, String.class, C0521a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, aVar2}, null, f40192a, true, 33414, new Class[]{String.class, String.class, C0521a.class}, Void.TYPE);
            return;
        }
        try {
            final OutputStream outputStream = Okio.buffer(Okio.sink(new File(str4))).outputStream();
            if (PatchProxy.isSupport(new Object[]{str3, outputStream, aVar2}, null, f40192a, true, 33415, new Class[]{String.class, OutputStream.class, C0521a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, outputStream, aVar2}, null, f40192a, true, 33415, new Class[]{String.class, OutputStream.class, C0521a.class}, Void.TYPE);
                return;
            }
            Request build = new Request.Builder().url(str3).build();
            com.ss.android.ugc.aweme.framework.a.a.a("download url:" + str3);
            f40193b.newCall(build).enqueue(new Callback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f40194a;

                public final void onFailure(Call call, IOException iOException) {
                    if (PatchProxy.isSupport(new Object[]{call, iOException}, this, f40194a, false, 33418, new Class[]{Call.class, IOException.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{call, iOException}, this, f40194a, false, 33418, new Class[]{Call.class, IOException.class}, Void.TYPE);
                        return;
                    }
                    if (aVar2 != null) {
                        aVar2.a(str3, (Exception) iOException);
                    }
                }

                /* JADX WARNING: Removed duplicated region for block: B:54:0x010e A[Catch:{ all -> 0x011c }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onResponse(okhttp3.Call r17, okhttp3.Response r18) throws java.io.IOException {
                    /*
                        r16 = this;
                        r8 = r16
                        r9 = r18
                        r10 = 2
                        java.lang.Object[] r1 = new java.lang.Object[r10]
                        r11 = 0
                        r1[r11] = r17
                        r12 = 1
                        r1[r12] = r9
                        com.meituan.robust.ChangeQuickRedirect r3 = f40194a
                        java.lang.Class[] r6 = new java.lang.Class[r10]
                        java.lang.Class<okhttp3.Call> r2 = okhttp3.Call.class
                        r6[r11] = r2
                        java.lang.Class<okhttp3.Response> r2 = okhttp3.Response.class
                        r6[r12] = r2
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r4 = 0
                        r5 = 33419(0x828b, float:4.683E-41)
                        r2 = r16
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0045
                        java.lang.Object[] r1 = new java.lang.Object[r10]
                        r1[r11] = r17
                        r1[r12] = r9
                        com.meituan.robust.ChangeQuickRedirect r3 = f40194a
                        r4 = 0
                        r5 = 33419(0x828b, float:4.683E-41)
                        java.lang.Class[] r6 = new java.lang.Class[r10]
                        java.lang.Class<okhttp3.Call> r0 = okhttp3.Call.class
                        r6[r11] = r0
                        java.lang.Class<okhttp3.Response> r0 = okhttp3.Response.class
                        r6[r12] = r0
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r2 = r16
                        com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                        return
                    L_0x0045:
                        int r0 = r18.code()
                        r1 = 0
                        okhttp3.ResponseBody r2 = r18.body()     // Catch:{ IOException -> 0x0108, all -> 0x0104 }
                        r3 = 200(0xc8, float:2.8E-43)
                        if (r0 != r3) goto L_0x00ed
                        long r3 = r2.contentLength()     // Catch:{ IOException -> 0x00eb }
                        okio.BufferedSource r0 = r2.source()     // Catch:{ IOException -> 0x00eb }
                        java.io.OutputStream r5 = r0     // Catch:{ IOException -> 0x00eb }
                        okio.Sink r5 = okio.Okio.sink((java.io.OutputStream) r5)     // Catch:{ IOException -> 0x00eb }
                        okio.BufferedSink r5 = okio.Okio.buffer((okio.Sink) r5)     // Catch:{ IOException -> 0x00eb }
                        r6 = 0
                        r10 = r6
                    L_0x0067:
                        okio.Buffer r1 = r5.buffer()     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        r12 = 2048(0x800, double:1.0118E-320)
                        long r12 = r0.read(r1, r12)     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        r14 = -1
                        int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                        if (r1 == 0) goto L_0x0092
                        r5.emit()     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        r1 = 0
                        long r10 = r10 + r12
                        com.ss.android.ugc.aweme.common.b.a$a r1 = r2     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        if (r1 == 0) goto L_0x0067
                        int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                        if (r1 <= 0) goto L_0x0067
                        r12 = 100
                        long r12 = r12 * r10
                        long r12 = r12 / r3
                        int r1 = (int) r12     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        com.ss.android.ugc.aweme.common.b.a$a r12 = r2     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        java.lang.String r13 = r1     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        r12.a((java.lang.String) r13, (int) r1)     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        goto L_0x0067
                    L_0x0092:
                        java.lang.String r1 = "text/plain"
                        java.lang.String r6 = "Content-Type"
                        java.lang.String r6 = r9.header(r6)     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        boolean r1 = r1.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        if (r1 != 0) goto L_0x00cb
                        java.lang.String r1 = "text/json"
                        java.lang.String r6 = "Content-Type"
                        java.lang.String r6 = r9.header(r6)     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        boolean r1 = r1.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        if (r1 != 0) goto L_0x00cb
                        int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                        if (r1 == 0) goto L_0x00cb
                        com.ss.android.ugc.aweme.common.b.a$a r0 = r2     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        if (r0 == 0) goto L_0x00c4
                        com.ss.android.ugc.aweme.common.b.a$a r0 = r2     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        java.lang.String r1 = r1     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        java.lang.Exception r3 = new java.lang.Exception     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        java.lang.String r4 = "totalRead != contentLength"
                        r3.<init>(r4)     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        r0.a((java.lang.String) r1, (java.lang.Exception) r3)     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                    L_0x00c4:
                        com.ss.android.common.util.NetworkUtils.safeClose(r2)
                        com.ss.android.common.util.NetworkUtils.safeClose(r5)
                        return
                    L_0x00cb:
                        r5.writeAll(r0)     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        r5.flush()     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        com.ss.android.common.util.NetworkUtils.safeClose(r5)     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        com.ss.android.ugc.aweme.common.b.a$a r0 = r2     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        if (r0 == 0) goto L_0x00df
                        com.ss.android.ugc.aweme.common.b.a$a r0 = r2     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        java.lang.String r1 = r1     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                        r0.a(r1)     // Catch:{ IOException -> 0x00e8, all -> 0x00e6 }
                    L_0x00df:
                        com.ss.android.common.util.NetworkUtils.safeClose(r2)
                        com.ss.android.common.util.NetworkUtils.safeClose(r5)
                        return
                    L_0x00e6:
                        r0 = move-exception
                        goto L_0x011e
                    L_0x00e8:
                        r0 = move-exception
                        r1 = r5
                        goto L_0x010a
                    L_0x00eb:
                        r0 = move-exception
                        goto L_0x010a
                    L_0x00ed:
                        java.lang.String r3 = "Reason-Phrase"
                        java.lang.String r3 = r9.header(r3)     // Catch:{ IOException -> 0x00eb }
                        com.ss.android.http.a.a.b r4 = new com.ss.android.http.a.a.b     // Catch:{ IOException -> 0x00eb }
                        r4.<init>(r0, r3)     // Catch:{ IOException -> 0x00eb }
                        com.ss.android.ugc.aweme.common.b.a$a r0 = r2     // Catch:{ IOException -> 0x00eb }
                        if (r0 == 0) goto L_0x0103
                        com.ss.android.ugc.aweme.common.b.a$a r0 = r2     // Catch:{ IOException -> 0x00eb }
                        java.lang.String r3 = r1     // Catch:{ IOException -> 0x00eb }
                        r0.a((java.lang.String) r3, (java.lang.Exception) r4)     // Catch:{ IOException -> 0x00eb }
                    L_0x0103:
                        throw r4     // Catch:{ IOException -> 0x00eb }
                    L_0x0104:
                        r0 = move-exception
                        r2 = r1
                        r5 = r2
                        goto L_0x011e
                    L_0x0108:
                        r0 = move-exception
                        r2 = r1
                    L_0x010a:
                        com.ss.android.ugc.aweme.common.b.a$a r3 = r2     // Catch:{ all -> 0x011c }
                        if (r3 == 0) goto L_0x0115
                        com.ss.android.ugc.aweme.common.b.a$a r3 = r2     // Catch:{ all -> 0x011c }
                        java.lang.String r4 = r1     // Catch:{ all -> 0x011c }
                        r3.a((java.lang.String) r4, (java.lang.Exception) r0)     // Catch:{ all -> 0x011c }
                    L_0x0115:
                        com.ss.android.common.util.NetworkUtils.safeClose(r2)
                        com.ss.android.common.util.NetworkUtils.safeClose(r1)
                        return
                    L_0x011c:
                        r0 = move-exception
                        r5 = r1
                    L_0x011e:
                        com.ss.android.common.util.NetworkUtils.safeClose(r2)
                        com.ss.android.common.util.NetworkUtils.safeClose(r5)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.b.a.AnonymousClass1.onResponse(okhttp3.Call, okhttp3.Response):void");
                }
            });
        } catch (FileNotFoundException e2) {
            if (aVar2 != null) {
                aVar2.a(str3, (Exception) e2);
            }
        }
    }
}
