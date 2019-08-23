package com.bytedance.ies.b;

import okhttp3.OkHttpClient;
import org.json.JSONArray;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public int f20195a;

    /* renamed from: b  reason: collision with root package name */
    private String f20196b;

    /* renamed from: c  reason: collision with root package name */
    private JSONArray f20197c;

    /* access modifiers changed from: protected */
    public abstract OkHttpClient a();

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cf A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00db A[Catch:{ all -> 0x00dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r5, java.lang.String r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r4.f20196b = r6
            int r0 = r4.f20195a
            if (r0 != 0) goto L_0x0027
            org.json.JSONArray r0 = new org.json.JSONArray
            java.lang.String r1 = "UTF-8"
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r1)
            r0.<init>(r5)
            r4.f20197c = r0
            org.json.JSONArray r5 = r4.f20197c
            if (r5 == 0) goto L_0x0026
            org.json.JSONArray r5 = r4.f20197c
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0027
        L_0x0026:
            return
        L_0x0027:
            okhttp3.Request$Builder r5 = new okhttp3.Request$Builder
            r5.<init>()
            org.json.JSONArray r0 = r4.f20197c
            int r1 = r4.f20195a
            java.lang.String r0 = r0.getString(r1)
            okhttp3.Request$Builder r5 = r5.url((java.lang.String) r0)
            okhttp3.Request r5 = r5.build()
            r0 = 0
            okhttp3.OkHttpClient r1 = r4.a()     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            okhttp3.Call r5 = r1.newCall(r5)     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            okhttp3.Response r5 = r5.execute()     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            boolean r1 = r5.isSuccessful()     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            if (r1 == 0) goto L_0x008f
            okhttp3.ResponseBody r5 = r5.body()     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            java.io.InputStream r5 = r5.byteStream()     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x008d }
            r1.<init>(r6)     // Catch:{ Exception -> 0x008d }
            java.io.File r2 = r1.getParentFile()     // Catch:{ Exception -> 0x008d }
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x008d }
            if (r2 != 0) goto L_0x006d
            java.io.File r2 = r1.getParentFile()     // Catch:{ Exception -> 0x008d }
            r2.mkdirs()     // Catch:{ Exception -> 0x008d }
        L_0x006d:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x008d }
            r2.<init>(r1)     // Catch:{ Exception -> 0x008d }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
        L_0x0076:
            int r1 = r5.read(r0)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r3 = -1
            if (r1 == r3) goto L_0x0082
            r3 = 0
            r2.write(r0, r3, r1)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            goto L_0x0076
        L_0x0082:
            r2.flush()     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            r0 = r2
            goto L_0x00ab
        L_0x0087:
            r6 = move-exception
            r0 = r2
            goto L_0x00dd
        L_0x008a:
            r1 = move-exception
            r0 = r2
            goto L_0x00bf
        L_0x008d:
            r1 = move-exception
            goto L_0x00bf
        L_0x008f:
            int r5 = r4.f20195a     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            int r5 = r5 + 1
            r4.f20195a = r5     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            org.json.JSONArray r5 = r4.f20197c     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            int r1 = r4.f20195a     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            if (r5 <= r1) goto L_0x00b2
            org.json.JSONArray r5 = r4.f20197c     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            int r1 = r4.f20195a     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            java.lang.String r5 = r5.getString(r1)     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            r4.a(r5, r6)     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            r5 = r0
        L_0x00ab:
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r0)
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r5)
            return
        L_0x00b2:
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            java.lang.String r1 = "network error"
            r5.<init>(r1)     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            throw r5     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
        L_0x00ba:
            r6 = move-exception
            r5 = r0
            goto L_0x00dd
        L_0x00bd:
            r1 = move-exception
            r5 = r0
        L_0x00bf:
            int r2 = r4.f20195a     // Catch:{ all -> 0x00dc }
            int r2 = r2 + 1
            r4.f20195a = r2     // Catch:{ all -> 0x00dc }
            org.json.JSONArray r2 = r4.f20197c     // Catch:{ all -> 0x00dc }
            int r2 = r2.length()     // Catch:{ all -> 0x00dc }
            int r3 = r4.f20195a     // Catch:{ all -> 0x00dc }
            if (r2 <= r3) goto L_0x00db
            org.json.JSONArray r1 = r4.f20197c     // Catch:{ all -> 0x00dc }
            int r2 = r4.f20195a     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x00dc }
            r4.a(r1, r6)     // Catch:{ all -> 0x00dc }
            goto L_0x00ab
        L_0x00db:
            throw r1     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r6 = move-exception
        L_0x00dd:
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r0)
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.b.b.a(java.lang.String, java.lang.String):void");
    }
}
