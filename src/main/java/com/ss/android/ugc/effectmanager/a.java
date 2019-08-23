package com.ss.android.ugc.effectmanager;

import android.content.res.AssetManager;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f77202a;

    /* renamed from: b  reason: collision with root package name */
    private final Pattern f77203b;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = com.ss.android.ugc.effectmanager.common.c.a(r3)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            java.util.regex.Pattern r1 = r2.f77203b     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            if (r1 == 0) goto L_0x002c
            java.util.regex.Pattern r1 = r2.f77203b     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            java.util.regex.Matcher r0 = r1.matcher(r0)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            boolean r0 = r0.matches()     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            if (r0 != 0) goto L_0x0015
            goto L_0x002c
        L_0x0015:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            r1.<init>()     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            r1.append(r3)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            java.lang.String r3 = " manually excluded by DownloadableModelSupport.exclusionPattern"
            r1.append(r3)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            java.lang.String r3 = r1.toString()     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            r0.<init>(r3)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            throw r0     // Catch:{ IOException -> 0x003c, all -> 0x003a }
        L_0x002c:
            android.content.res.AssetManager r0 = r2.f77202a     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            r1 = 2
            java.io.InputStream r3 = r0.open(r3, r1)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
            if (r3 == 0) goto L_0x0038
            r3.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            r3 = 1
            return r3
        L_0x003a:
            r3 = move-exception
            throw r3
        L_0x003c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.a.a(java.lang.String):boolean");
    }

    public a(AssetManager assetManager, Pattern pattern) {
        this.f77202a = assetManager;
        this.f77203b = pattern;
    }
}
