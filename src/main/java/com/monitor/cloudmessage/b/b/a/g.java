package com.monitor.cloudmessage.b.b.a;

public final class g {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058 A[SYNTHETIC, Splitter:B:24:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d A[Catch:{ IOException -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065 A[SYNTHETIC, Splitter:B:34:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a A[Catch:{ IOException -> 0x006d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File a(android.content.Context r4, org.json.JSONObject r5) {
        /*
            java.io.File r4 = com.monitor.cloudmessage.e.b.a((android.content.Context) r4)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = "stats.txt"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0061, all -> 0x0054 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0061, all -> 0x0054 }
            boolean r4 = r2.exists()     // Catch:{ IOException -> 0x0061, all -> 0x0054 }
            if (r4 != 0) goto L_0x002d
            r2.mkdirs()     // Catch:{ IOException -> 0x0061, all -> 0x0054 }
        L_0x002d:
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ IOException -> 0x0061, all -> 0x0054 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0061, all -> 0x0054 }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0063, all -> 0x004a }
            r2.write(r5)     // Catch:{ IOException -> 0x0063, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0044 }
            r4.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            return r4
        L_0x004a:
            r5 = move-exception
            r1 = r2
            goto L_0x004e
        L_0x004d:
            r5 = move-exception
        L_0x004e:
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x0056
        L_0x0052:
            r2 = r1
            goto L_0x0063
        L_0x0054:
            r4 = move-exception
            r5 = r1
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ IOException -> 0x0060 }
        L_0x005b:
            if (r5 == 0) goto L_0x0060
            r5.close()     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            throw r4
        L_0x0061:
            r4 = r1
            r2 = r4
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.close()     // Catch:{ IOException -> 0x006d }
        L_0x0068:
            if (r4 == 0) goto L_0x006d
            r4.close()     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.b.b.a.g.a(android.content.Context, org.json.JSONObject):java.io.File");
    }
}
