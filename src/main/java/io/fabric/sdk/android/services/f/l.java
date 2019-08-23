package io.fabric.sdk.android.services.f;

import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.a;
import io.fabric.sdk.android.services.d.c;
import io.fabric.sdk.android.services.d.d;
import io.fabric.sdk.android.services.d.e;
import org.json.JSONObject;

public final class l extends a implements x {
    private JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            new StringBuilder("Failed to parse settings JSON from ").append(this.url);
            new StringBuilder("Settings response ").append(str);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1 A[Catch:{ c -> 0x00f2, all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb A[Catch:{ c -> 0x00f2, all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject a(io.fabric.sdk.android.services.f.w r6) {
        /*
            r5 = this;
            r0 = 0
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            r1.<init>()     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            java.lang.String r2 = "build_version"
            java.lang.String r3 = r6.h     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            r1.put(r2, r3)     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            java.lang.String r2 = "display_version"
            java.lang.String r3 = r6.g     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            r1.put(r2, r3)     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            java.lang.String r2 = "source"
            int r3 = r6.i     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            r1.put(r2, r3)     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            java.lang.String r2 = r6.j     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            if (r2 == 0) goto L_0x002a
            java.lang.String r2 = "icon_hash"
            java.lang.String r3 = r6.j     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            r1.put(r2, r3)     // Catch:{ c -> 0x00f1, all -> 0x00dc }
        L_0x002a:
            java.lang.String r2 = r6.f83365f     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            boolean r3 = io.fabric.sdk.android.services.b.i.b((java.lang.String) r2)     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            if (r3 != 0) goto L_0x0037
            java.lang.String r3 = "instance"
            r1.put(r3, r2)     // Catch:{ c -> 0x00f1, all -> 0x00dc }
        L_0x0037:
            io.fabric.sdk.android.services.d.d r2 = r5.getHttpRequest(r1)     // Catch:{ c -> 0x00f1, all -> 0x00dc }
            java.lang.String r3 = "X-CRASHLYTICS-API-KEY"
            java.lang.String r4 = r6.f83360a     // Catch:{ c -> 0x00f2, all -> 0x00da }
            a(r2, r3, r4)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r3 = "X-CRASHLYTICS-API-CLIENT-TYPE"
            java.lang.String r4 = "android"
            a(r2, r3, r4)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r3 = "X-CRASHLYTICS-API-CLIENT-VERSION"
            io.fabric.sdk.android.i r4 = r5.kit     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r4 = r4.getVersion()     // Catch:{ c -> 0x00f2, all -> 0x00da }
            a(r2, r3, r4)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r3 = "Accept"
            java.lang.String r4 = "application/json"
            a(r2, r3, r4)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r3 = "X-CRASHLYTICS-DEVICE-MODEL"
            java.lang.String r4 = r6.f83361b     // Catch:{ c -> 0x00f2, all -> 0x00da }
            a(r2, r3, r4)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r3 = "X-CRASHLYTICS-OS-BUILD-VERSION"
            java.lang.String r4 = r6.f83362c     // Catch:{ c -> 0x00f2, all -> 0x00da }
            a(r2, r3, r4)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r3 = "X-CRASHLYTICS-OS-DISPLAY-VERSION"
            java.lang.String r4 = r6.f83363d     // Catch:{ c -> 0x00f2, all -> 0x00da }
            a(r2, r3, r4)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r3 = "X-CRASHLYTICS-INSTALLATION-ID"
            java.lang.String r6 = r6.f83364e     // Catch:{ c -> 0x00f2, all -> 0x00da }
            a(r2, r3, r6)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r3 = "Requesting settings from "
            r6.<init>(r3)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r3 = r5.url     // Catch:{ c -> 0x00f2, all -> 0x00da }
            r6.append(r3)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r3 = "Settings query params were: "
            r6.<init>(r3)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            r6.append(r1)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            int r6 = r2.b()     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r3 = "Settings result was: "
            r1.<init>(r3)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            r1.append(r6)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            r1 = 200(0xc8, float:2.8E-43)
            if (r6 == r1) goto L_0x00ae
            r1 = 201(0xc9, float:2.82E-43)
            if (r6 == r1) goto L_0x00ae
            r1 = 202(0xca, float:2.83E-43)
            if (r6 == r1) goto L_0x00ae
            r1 = 203(0xcb, float:2.84E-43)
            if (r6 != r1) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r6 = 0
            goto L_0x00af
        L_0x00ae:
            r6 = 1
        L_0x00af:
            if (r6 == 0) goto L_0x00bb
            java.lang.String r6 = r2.c()     // Catch:{ c -> 0x00f2, all -> 0x00da }
            org.json.JSONObject r6 = r5.a((java.lang.String) r6)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            r0 = r6
            goto L_0x00c7
        L_0x00bb:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r1 = "Failed to retrieve settings from "
            r6.<init>(r1)     // Catch:{ c -> 0x00f2, all -> 0x00da }
            java.lang.String r1 = r5.url     // Catch:{ c -> 0x00f2, all -> 0x00da }
            r6.append(r1)     // Catch:{ c -> 0x00f2, all -> 0x00da }
        L_0x00c7:
            if (r2 == 0) goto L_0x00fc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Settings request ID: "
            r6.<init>(r1)
        L_0x00d0:
            java.lang.String r1 = "X-REQUEST-ID"
            java.lang.String r1 = r2.b((java.lang.String) r1)
            r6.append(r1)
            goto L_0x00fc
        L_0x00da:
            r6 = move-exception
            goto L_0x00de
        L_0x00dc:
            r6 = move-exception
            r2 = r0
        L_0x00de:
            if (r2 == 0) goto L_0x00f0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Settings request ID: "
            r0.<init>(r1)
            java.lang.String r1 = "X-REQUEST-ID"
            java.lang.String r1 = r2.b((java.lang.String) r1)
            r0.append(r1)
        L_0x00f0:
            throw r6
        L_0x00f1:
            r2 = r0
        L_0x00f2:
            if (r2 == 0) goto L_0x00fc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Settings request ID: "
            r6.<init>(r1)
            goto L_0x00d0
        L_0x00fc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.f.l.a(io.fabric.sdk.android.services.f.w):org.json.JSONObject");
    }

    private static void a(d dVar, String str, String str2) {
        if (str2 != null) {
            dVar.a(str, str2);
        }
    }

    public l(i iVar, String str, String str2, e eVar) {
        this(iVar, str, str2, eVar, c.GET);
    }

    private l(i iVar, String str, String str2, e eVar, c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }
}
