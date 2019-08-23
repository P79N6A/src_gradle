package com.ss.ttvideoengine.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.Error;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class TTHTTPNetwork extends TTVNetClient {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static OkHttpClient mClient;
    private Call mCall;

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91570, new Class[0], Void.TYPE);
            return;
        }
        if (this.mCall != null && !this.mCall.isCanceled()) {
            this.mCall.cancel();
        }
    }

    public void startTask(String str, final TTVNetClient.CompletionListener completionListener) {
        if (PatchProxy.isSupport(new Object[]{str, completionListener}, this, changeQuickRedirect, false, 91569, new Class[]{String.class, TTVNetClient.CompletionListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, completionListener}, this, changeQuickRedirect, false, 91569, new Class[]{String.class, TTVNetClient.CompletionListener.class}, Void.TYPE);
            return;
        }
        synchronized (TTHTTPNetwork.class) {
            if (mClient == null) {
                mClient = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
            }
        }
        this.mCall = mClient.newCall(new Request.Builder().url(str).build());
        this.mCall.enqueue(new Callback() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onFailure(Call call, IOException iOException) {
                if (PatchProxy.isSupport(new Object[]{call, iOException}, this, changeQuickRedirect, false, 91571, new Class[]{Call.class, IOException.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{call, iOException}, this, changeQuickRedirect, false, 91571, new Class[]{Call.class, IOException.class}, Void.TYPE);
                    return;
                }
                completionListener.onCompletion(null, new Error("", -9994, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:31:0x0091 A[SYNTHETIC, Splitter:B:31:0x0091] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.Call r12, okhttp3.Response r13) {
                /*
                    r11 = this;
                    r8 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r8]
                    r9 = 0
                    r1[r9] = r12
                    r10 = 1
                    r1[r10] = r13
                    com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                    java.lang.Class[] r6 = new java.lang.Class[r8]
                    java.lang.Class<okhttp3.Call> r2 = okhttp3.Call.class
                    r6[r9] = r2
                    java.lang.Class<okhttp3.Response> r2 = okhttp3.Response.class
                    r6[r10] = r2
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r4 = 0
                    r5 = 91572(0x165b4, float:1.2832E-40)
                    r2 = r11
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x003f
                    java.lang.Object[] r1 = new java.lang.Object[r8]
                    r1[r9] = r12
                    r1[r10] = r13
                    com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                    r4 = 0
                    r5 = 91572(0x165b4, float:1.2832E-40)
                    java.lang.Class[] r6 = new java.lang.Class[r8]
                    java.lang.Class<okhttp3.Call> r0 = okhttp3.Call.class
                    r6[r9] = r0
                    java.lang.Class<okhttp3.Response> r0 = okhttp3.Response.class
                    r6[r10] = r0
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r2 = r11
                    com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                    return
                L_0x003f:
                    r0 = -1
                    r1 = 0
                    okhttp3.ResponseBody r2 = r13.body()     // Catch:{ all -> 0x008d }
                    boolean r3 = r13.isSuccessful()     // Catch:{ all -> 0x008b }
                    if (r3 == 0) goto L_0x005e
                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0057 }
                    java.lang.String r4 = r2.string()     // Catch:{ Exception -> 0x0057 }
                    r3.<init>(r4)     // Catch:{ Exception -> 0x0057 }
                    r0 = r1
                    r4 = -1
                    goto L_0x006b
                L_0x0057:
                    r0 = move-exception
                    r3 = -9994(0xffffffffffffd8f6, float:NaN)
                    r3 = r1
                    r4 = -9994(0xffffffffffffd8f6, float:NaN)
                    goto L_0x006b
                L_0x005e:
                    java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x008b }
                    java.lang.String r3 = "http fail"
                    r0.<init>(r3)     // Catch:{ all -> 0x008b }
                    int r3 = r13.code()     // Catch:{ all -> 0x008b }
                    r4 = r3
                    r3 = r1
                L_0x006b:
                    if (r2 == 0) goto L_0x0072
                    r2.close()     // Catch:{ Exception -> 0x0071 }
                    goto L_0x0072
                L_0x0071:
                L_0x0072:
                    if (r0 != 0) goto L_0x007a
                    com.ss.ttvideoengine.net.TTVNetClient$CompletionListener r0 = r13
                    r0.onCompletion(r3, r1)
                    return
                L_0x007a:
                    com.ss.ttvideoengine.net.TTVNetClient$CompletionListener r2 = r13
                    com.ss.ttvideoengine.utils.Error r3 = new com.ss.ttvideoengine.utils.Error
                    java.lang.String r5 = ""
                    java.lang.String r0 = r0.toString()
                    r3.<init>((java.lang.String) r5, (int) r4, (java.lang.String) r0)
                    r2.onCompletion(r1, r3)
                    return
                L_0x008b:
                    r0 = move-exception
                    goto L_0x008f
                L_0x008d:
                    r0 = move-exception
                    r2 = r1
                L_0x008f:
                    if (r2 == 0) goto L_0x0094
                    r2.close()     // Catch:{ Exception -> 0x0094 }
                L_0x0094:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.net.TTHTTPNetwork.AnonymousClass1.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }
}
