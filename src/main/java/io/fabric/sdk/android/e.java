package io.fabric.sdk.android;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class e implements Callable<Map<String, k>> {

    /* renamed from: a  reason: collision with root package name */
    final String f83146a;

    private static Map<String, k> a() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.AdView");
            k kVar = new k("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(kVar.f83149a, kVar);
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public final /* synthetic */ Object call() throws Exception {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(a());
        hashMap.putAll(b());
        new StringBuilder("finish scanning in ").append(SystemClock.elapsedRealtime() - elapsedRealtime);
        return hashMap;
    }

    private Map<String, k> b() throws Exception {
        HashMap hashMap = new HashMap();
        ZipFile zipFile = new ZipFile(this.f83146a);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > 7) {
                k a2 = a(zipEntry, zipFile);
                if (a2 != null) {
                    hashMap.put(a2.f83149a, a2);
                    String.format("Found kit:[%s] version:[%s]", new Object[]{a2.f83149a, a2.f83150b});
                }
            }
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
        return hashMap;
    }

    e(String str) {
        this.f83146a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        new java.lang.StringBuilder("Error when parsing fabric properties ").append(r5.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        io.fabric.sdk.android.services.b.i.a((java.io.Closeable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static io.fabric.sdk.android.k a(java.util.zip.ZipEntry r5, java.util.zip.ZipFile r6) {
        /*
            r0 = 0
            java.io.InputStream r6 = r6.getInputStream(r5)     // Catch:{ IOException -> 0x0051, all -> 0x004e }
            java.util.Properties r1 = new java.util.Properties     // Catch:{ IOException -> 0x0052 }
            r1.<init>()     // Catch:{ IOException -> 0x0052 }
            r1.load(r6)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r2 = "fabric-identifier"
            java.lang.String r2 = r1.getProperty(r2)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r3 = "fabric-version"
            java.lang.String r3 = r1.getProperty(r3)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r4 = "fabric-build-type"
            java.lang.String r1 = r1.getProperty(r4)     // Catch:{ IOException -> 0x0052 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x0052 }
            if (r4 != 0) goto L_0x0034
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x0052 }
            if (r4 != 0) goto L_0x0034
            io.fabric.sdk.android.k r4 = new io.fabric.sdk.android.k     // Catch:{ IOException -> 0x0052 }
            r4.<init>(r2, r3, r1)     // Catch:{ IOException -> 0x0052 }
            io.fabric.sdk.android.services.b.i.a((java.io.Closeable) r6)
            return r4
        L_0x0034:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0052 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052 }
            java.lang.String r3 = "Invalid format of fabric file,"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r3 = r5.getName()     // Catch:{ IOException -> 0x0052 }
            r2.append(r3)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0052 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0052 }
            throw r1     // Catch:{ IOException -> 0x0052 }
        L_0x004c:
            r5 = move-exception
            goto L_0x0064
        L_0x004e:
            r5 = move-exception
            r6 = r0
            goto L_0x0064
        L_0x0051:
            r6 = r0
        L_0x0052:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "Error when parsing fabric properties "
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x004c }
            r1.append(r5)     // Catch:{ all -> 0x004c }
            io.fabric.sdk.android.services.b.i.a((java.io.Closeable) r6)
            return r0
        L_0x0064:
            io.fabric.sdk.android.services.b.i.a((java.io.Closeable) r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.e.a(java.util.zip.ZipEntry, java.util.zip.ZipFile):io.fabric.sdk.android.k");
    }
}
