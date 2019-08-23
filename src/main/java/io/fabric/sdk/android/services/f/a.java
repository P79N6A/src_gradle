package io.fabric.sdk.android.services.f;

import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.v;
import io.fabric.sdk.android.services.d.c;
import io.fabric.sdk.android.services.d.d;
import io.fabric.sdk.android.services.d.e;

public abstract class a extends io.fabric.sdk.android.services.b.a {
    public boolean a(d dVar) {
        String str;
        d a2 = a(getHttpRequest().a("X-CRASHLYTICS-API-KEY", dVar.f83306a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.kit.getVersion()), dVar);
        new StringBuilder("Sending app info to ").append(this.url);
        if (dVar.j != null) {
            new StringBuilder("App icon hash is ").append(dVar.j.f83332a);
            StringBuilder sb = new StringBuilder("App icon size is ");
            sb.append(dVar.j.f83334c);
            sb.append("x");
            sb.append(dVar.j.f83335d);
        }
        int b2 = a2.b();
        if ("POST".equals(a2.d())) {
            str = "Create";
        } else {
            str = "Update";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" app request ID: ");
        sb2.append(a2.b("X-REQUEST-ID"));
        new StringBuilder("Result was ").append(b2);
        if (v.a(b2) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x009c */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private io.fabric.sdk.android.services.d.d a(io.fabric.sdk.android.services.d.d r8, io.fabric.sdk.android.services.f.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "app[identifier]"
            java.lang.String r1 = r9.f83307b
            io.fabric.sdk.android.services.d.d r8 = r8.b(r0, r1)
            java.lang.String r0 = "app[name]"
            java.lang.String r1 = r9.f83311f
            io.fabric.sdk.android.services.d.d r8 = r8.b(r0, r1)
            java.lang.String r0 = "app[display_version]"
            java.lang.String r1 = r9.f83308c
            io.fabric.sdk.android.services.d.d r8 = r8.b(r0, r1)
            java.lang.String r0 = "app[build_version]"
            java.lang.String r1 = r9.f83309d
            io.fabric.sdk.android.services.d.d r8 = r8.b(r0, r1)
            java.lang.String r0 = "app[source]"
            int r1 = r9.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.fabric.sdk.android.services.d.d r8 = r8.a((java.lang.String) r0, (java.lang.Number) r1)
            java.lang.String r0 = "app[minimum_sdk_version]"
            java.lang.String r1 = r9.h
            io.fabric.sdk.android.services.d.d r8 = r8.b(r0, r1)
            java.lang.String r0 = "app[built_sdk_version]"
            java.lang.String r1 = r9.i
            io.fabric.sdk.android.services.d.d r8 = r8.b(r0, r1)
            java.lang.String r0 = r9.f83310e
            boolean r0 = io.fabric.sdk.android.services.b.i.b((java.lang.String) r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "app[instance_identifier]"
            java.lang.String r1 = r9.f83310e
            r8.b(r0, r1)
        L_0x004b:
            io.fabric.sdk.android.services.f.n r0 = r9.j
            if (r0 == 0) goto L_0x00b6
            r0 = 0
            io.fabric.sdk.android.i r1 = r7.kit     // Catch:{ NotFoundException -> 0x009c }
            android.content.Context r1 = r1.context     // Catch:{ NotFoundException -> 0x009c }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ NotFoundException -> 0x009c }
            io.fabric.sdk.android.services.f.n r2 = r9.j     // Catch:{ NotFoundException -> 0x009c }
            int r2 = r2.f83333b     // Catch:{ NotFoundException -> 0x009c }
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ NotFoundException -> 0x009c }
            java.lang.String r0 = "app[icon][hash]"
            io.fabric.sdk.android.services.f.n r2 = r9.j     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            java.lang.String r2 = r2.f83332a     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            io.fabric.sdk.android.services.d.d r0 = r8.b(r0, r2)     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            java.lang.String r2 = "app[icon][data]"
            java.lang.String r3 = "icon.png"
            java.lang.String r4 = "application/octet-stream"
            io.fabric.sdk.android.services.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (java.io.InputStream) r1)     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            java.lang.String r2 = "app[icon][width]"
            io.fabric.sdk.android.services.f.n r3 = r9.j     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            int r3 = r3.f83334c     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            io.fabric.sdk.android.services.d.d r0 = r0.a((java.lang.String) r2, (java.lang.Number) r3)     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            java.lang.String r2 = "app[icon][height]"
            io.fabric.sdk.android.services.f.n r3 = r9.j     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            int r3 = r3.f83335d     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            r0.a((java.lang.String) r2, (java.lang.Number) r3)     // Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
            java.lang.String r0 = "Failed to close app icon InputStream."
            io.fabric.sdk.android.services.b.i.a((java.io.Closeable) r1, (java.lang.String) r0)
            goto L_0x00b6
        L_0x0095:
            r8 = move-exception
            goto L_0x00b0
        L_0x0097:
            r0 = r1
            goto L_0x009c
        L_0x0099:
            r8 = move-exception
            r1 = r0
            goto L_0x00b0
        L_0x009c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = "Failed to find app icon with resource ID: "
            r1.<init>(r2)     // Catch:{ all -> 0x0099 }
            io.fabric.sdk.android.services.f.n r2 = r9.j     // Catch:{ all -> 0x0099 }
            int r2 = r2.f83333b     // Catch:{ all -> 0x0099 }
            r1.append(r2)     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "Failed to close app icon InputStream."
            io.fabric.sdk.android.services.b.i.a((java.io.Closeable) r0, (java.lang.String) r1)
            goto L_0x00b6
        L_0x00b0:
            java.lang.String r9 = "Failed to close app icon InputStream."
            io.fabric.sdk.android.services.b.i.a((java.io.Closeable) r1, (java.lang.String) r9)
            throw r8
        L_0x00b6:
            java.util.Collection<io.fabric.sdk.android.k> r0 = r9.k
            if (r0 == 0) goto L_0x00f5
            java.util.Collection<io.fabric.sdk.android.k> r9 = r9.k
            java.util.Iterator r9 = r9.iterator()
        L_0x00c0:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r9.next()
            io.fabric.sdk.android.k r0 = (io.fabric.sdk.android.k) r0
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "app[build][libraries][%s][version]"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r0.f83149a
            r6 = 0
            r4[r6] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2, r4)
            java.lang.String r2 = r0.f83150b
            r8.b(r1, r2)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "app[build][libraries][%s][type]"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r0.f83149a
            r3[r6] = r4
            java.lang.String r1 = java.lang.String.format(r1, r2, r3)
            java.lang.String r0 = r0.f83151c
            r8.b(r1, r0)
            goto L_0x00c0
        L_0x00f5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.f.a.a(io.fabric.sdk.android.services.d.d, io.fabric.sdk.android.services.f.d):io.fabric.sdk.android.services.d.d");
    }

    public a(i iVar, String str, String str2, e eVar, c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }
}
