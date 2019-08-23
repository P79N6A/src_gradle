package com.ss.android.ugc.effectmanager;

import com.ss.android.ugc.effectmanager.d.a;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    f f77531a;

    /* renamed from: b  reason: collision with root package name */
    private a f77532b;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|(2:24|25)|26|27) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(com.ss.android.ugc.effectmanager.model.ModelInfo r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ss.android.ugc.effectmanager.common.a r0 = new com.ss.android.ugc.effectmanager.common.a     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = "GET"
            com.ss.android.ugc.effectmanager.common.model.UrlModel r2 = r6.getFile_url()     // Catch:{ all -> 0x00b1 }
            java.util.List<java.lang.String> r2 = r2.url_list     // Catch:{ all -> 0x00b1 }
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b1 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00b1 }
            com.ss.android.ugc.effectmanager.d.a r1 = r5.f77532b     // Catch:{ Exception -> 0x0084 }
            java.io.InputStream r0 = r1.a(r0)     // Catch:{ Exception -> 0x0084 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r1.<init>()     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = r6.getName()     // Catch:{ all -> 0x00b1 }
            r1.append(r2)     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "_v"
            r1.append(r2)     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = r6.getVersion()     // Catch:{ all -> 0x00b1 }
            r1.append(r2)     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = ".model"
            r1.append(r2)     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b1 }
            com.ss.android.ugc.effectmanager.f r2 = r5.f77531a     // Catch:{ NoSuchAlgorithmException -> 0x0078, RuntimeException -> 0x0057 }
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0078, RuntimeException -> 0x0057 }
            com.ss.android.ugc.effectmanager.common.model.UrlModel r6 = r6.getFile_url()     // Catch:{ NoSuchAlgorithmException -> 0x0078, RuntimeException -> 0x0057 }
            java.lang.String r6 = r6.uri     // Catch:{ NoSuchAlgorithmException -> 0x0078, RuntimeException -> 0x0057 }
            long r2 = r2.a(r1, r0, r3, r6)     // Catch:{ NoSuchAlgorithmException -> 0x0078, RuntimeException -> 0x0057 }
            if (r0 == 0) goto L_0x0053
            r0.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            monitor-exit(r5)
            return r2
        L_0x0055:
            r6 = move-exception
            goto L_0x007e
        L_0x0057:
            r6 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0055 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = "convertStreamToFile:"
            r3.<init>(r4)     // Catch:{ all -> 0x0055 }
            r3.append(r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = " failed. "
            r3.append(r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r6.getMessage()     // Catch:{ all -> 0x0055 }
            r3.append(r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0055 }
            r2.<init>(r1, r6)     // Catch:{ all -> 0x0055 }
            throw r2     // Catch:{ all -> 0x0055 }
        L_0x0078:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x0055 }
            r6.<init>()     // Catch:{ all -> 0x0055 }
            throw r6     // Catch:{ all -> 0x0055 }
        L_0x007e:
            if (r0 == 0) goto L_0x0083
            r0.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            throw r6     // Catch:{ all -> 0x00b1 }
        L_0x0084:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00b1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            java.lang.String r4 = "download model:"
            r2.<init>(r4)     // Catch:{ all -> 0x00b1 }
            com.ss.android.ugc.effectmanager.common.model.UrlModel r6 = r6.getFile_url()     // Catch:{ all -> 0x00b1 }
            java.util.List<java.lang.String> r6 = r6.url_list     // Catch:{ all -> 0x00b1 }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00b1 }
            r2.append(r6)     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = " failed "
            r2.append(r6)     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = r0.getMessage()     // Catch:{ all -> 0x00b1 }
            r2.append(r6)     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00b1 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x00b1 }
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.m.a(com.ss.android.ugc.effectmanager.model.ModelInfo):long");
    }

    public m(f fVar, a aVar) {
        this.f77531a = fVar;
        this.f77532b = aVar;
    }
}
