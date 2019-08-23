package com.bytedance.android.livesdk.player;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.c.a.b;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16839a;

    /* renamed from: b  reason: collision with root package name */
    private final OkHttpClient f16840b = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).build();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v6, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0086, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0087, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:8:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e A[ExcHandler: IOException (e java.io.IOException), Splitter:B:8:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.c.a.b.a a(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f16839a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<com.ss.c.a.b$a> r9 = com.ss.c.a.b.a.class
            r6 = 0
            r7 = 12764(0x31dc, float:1.7886E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f16839a
            r15 = 0
            r16 = 12764(0x31dc, float:1.7886E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<com.ss.c.a.b$a> r18 = com.ss.c.a.b.a.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.ss.c.a.b$a r0 = (com.ss.c.a.b.a) r0
            return r0
        L_0x0048:
            r2 = 0
            okhttp3.Request$Builder r3 = new okhttp3.Request$Builder     // Catch:{ IOException -> 0x00c7, JSONException -> 0x00b0, Exception -> 0x00a0 }
            r3.<init>()     // Catch:{ IOException -> 0x00c7, JSONException -> 0x00b0, Exception -> 0x00a0 }
            okhttp3.Request$Builder r0 = r3.url((java.lang.String) r0)     // Catch:{ IOException -> 0x00c7, JSONException -> 0x00b0, Exception -> 0x00a0 }
            java.lang.String r3 = "host"
            okhttp3.Request$Builder r0 = r0.addHeader(r3, r1)     // Catch:{ IOException -> 0x00c7, JSONException -> 0x00b0, Exception -> 0x00a0 }
            okhttp3.Request r0 = r0.build()     // Catch:{ IOException -> 0x00c7, JSONException -> 0x00b0, Exception -> 0x00a0 }
            r1 = r19
            okhttp3.OkHttpClient r3 = r1.f16840b     // Catch:{ IOException -> 0x009e, JSONException -> 0x009c, Exception -> 0x009a }
            okhttp3.Call r0 = r3.newCall(r0)     // Catch:{ IOException -> 0x009e, JSONException -> 0x009c, Exception -> 0x009a }
            okhttp3.Response r0 = r0.execute()     // Catch:{ IOException -> 0x009e, JSONException -> 0x009c, Exception -> 0x009a }
            boolean r3 = r0.isSuccessful()     // Catch:{ IOException -> 0x009e, JSONException -> 0x009c, Exception -> 0x009a }
            if (r3 == 0) goto L_0x008a
            okhttp3.ResponseBody r3 = r0.body()     // Catch:{ IOException -> 0x009e, JSONException -> 0x009c, Exception -> 0x009a }
            java.lang.String r3 = r3.string()     // Catch:{ IOException -> 0x009e, JSONException -> 0x009c, Exception -> 0x009a }
            okhttp3.Headers r0 = r0.headers()     // Catch:{ IOException -> 0x009e, JSONException -> 0x0086, Exception -> 0x009a }
            java.lang.String r4 = r0.toString()     // Catch:{ IOException -> 0x009e, JSONException -> 0x0086, Exception -> 0x009a }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ IOException -> 0x009e, JSONException -> 0x0084, Exception -> 0x009a }
            r2.<init>(r3)     // Catch:{ IOException -> 0x009e, JSONException -> 0x0084, Exception -> 0x009a }
            goto L_0x008b
        L_0x0084:
            r0 = move-exception
            goto L_0x0088
        L_0x0086:
            r0 = move-exception
            r4 = r2
        L_0x0088:
            r2 = r3
            goto L_0x00b4
        L_0x008a:
            r3 = r2
        L_0x008b:
            com.ss.c.a.b$a$a r0 = com.ss.c.a.b.a.a()
            r0.f78289a = r2
            com.ss.c.a.b$a$a r0 = r0.a((java.lang.String) r3)
            com.ss.c.a.b$a r0 = r0.a()
            return r0
        L_0x009a:
            r0 = move-exception
            goto L_0x00a3
        L_0x009c:
            r0 = move-exception
            goto L_0x00b3
        L_0x009e:
            r0 = move-exception
            goto L_0x00ca
        L_0x00a0:
            r0 = move-exception
            r1 = r19
        L_0x00a3:
            com.ss.c.a.b$a$a r2 = com.ss.c.a.b.a.a()
            com.ss.c.a.b$a$a r0 = r2.a((java.lang.Exception) r0)
            com.ss.c.a.b$a r0 = r0.a()
            return r0
        L_0x00b0:
            r0 = move-exception
            r1 = r19
        L_0x00b3:
            r4 = r2
        L_0x00b4:
            com.ss.c.a.b$a$a r3 = com.ss.c.a.b.a.a()
            com.ss.c.a.b$a$a r2 = r3.a((java.lang.String) r2)
            r2.f78291c = r4
            com.ss.c.a.b$a$a r0 = r2.a((java.lang.Exception) r0)
            com.ss.c.a.b$a r0 = r0.a()
            return r0
        L_0x00c7:
            r0 = move-exception
            r1 = r19
        L_0x00ca:
            com.ss.c.a.b$a$a r2 = com.ss.c.a.b.a.a()
            com.ss.c.a.b$a$a r0 = r2.a((java.lang.Exception) r0)
            com.ss.c.a.b$a r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.player.m.a(java.lang.String, java.lang.String):com.ss.c.a.b$a");
    }
}
