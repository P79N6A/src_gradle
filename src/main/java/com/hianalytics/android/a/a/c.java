package com.hianalytics.android.a.a;

import android.content.Context;
import android.content.SharedPreferences;

public final class c {
    public static SharedPreferences a(Context context, String str) {
        String packageName = context.getPackageName();
        return com.ss.android.ugc.aweme.q.c.a(context, "hianalytics_" + str + "_" + packageName, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b A[SYNTHETIC, Splitter:B:16:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC, Splitter:B:25:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0043 A[SYNTHETIC, Splitter:B:35:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r2, org.json.JSONObject r3, java.lang.String r4) {
        /*
            java.lang.String r4 = d(r2, r4)
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = r2.openFileOutput(r4, r0)     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x0034, all -> 0x0027 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0035, all -> 0x0025 }
            java.lang.String r4 = "UTF-8"
            byte[] r3 = r3.getBytes(r4)     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0035, all -> 0x0025 }
            r2.write(r3)     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0035, all -> 0x0025 }
            r2.flush()     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x0035, all -> 0x0025 }
            if (r2 == 0) goto L_0x0024
            r2.close()     // Catch:{ IOException -> 0x0020 }
            return
        L_0x0020:
            r2 = move-exception
            com.google.a.a.a.a.a.a.b(r2)
        L_0x0024:
            return
        L_0x0025:
            r3 = move-exception
            goto L_0x0029
        L_0x0027:
            r3 = move-exception
            r2 = r1
        L_0x0029:
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r2 = move-exception
            com.google.a.a.a.a.a.a.b(r2)
        L_0x0033:
            throw r3
        L_0x0034:
            r2 = r1
        L_0x0035:
            if (r2 == 0) goto L_0x003f
            r2.close()     // Catch:{ IOException -> 0x003b }
            return
        L_0x003b:
            r2 = move-exception
            com.google.a.a.a.a.a.a.b(r2)
        L_0x003f:
            return
        L_0x0040:
            r2 = r1
        L_0x0041:
            if (r2 == 0) goto L_0x004b
            r2.close()     // Catch:{ IOException -> 0x0047 }
            return
        L_0x0047:
            r2 = move-exception
            com.google.a.a.a.a.a.a.b(r2)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hianalytics.android.a.a.c.a(android.content.Context, org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x00d5 A[SYNTHETIC, Splitter:B:101:0x00d5] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x00e2 A[SYNTHETIC, Splitter:B:109:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x00ec A[SYNTHETIC, Splitter:B:114:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0080 A[SYNTHETIC, Splitter:B:56:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x008a A[SYNTHETIC, Splitter:B:61:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x009e A[SYNTHETIC, Splitter:B:71:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00a8 A[SYNTHETIC, Splitter:B:76:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00b4 A[SYNTHETIC, Splitter:B:83:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00be A[SYNTHETIC, Splitter:B:88:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00cb A[SYNTHETIC, Splitter:B:96:0x00cb] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:68:0x0096=Splitter:B:68:0x0096, B:53:0x007b=Splitter:B:53:0x007b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject b(android.content.Context r5, java.lang.String r6) {
        /*
            r0 = 0
            java.lang.String r1 = d(r5, r6)     // Catch:{ FileNotFoundException -> 0x00de, IOException -> 0x00c7, JSONException -> 0x0093, Exception -> 0x0078, all -> 0x0074 }
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch:{ FileNotFoundException -> 0x00de, IOException -> 0x00c7, JSONException -> 0x0093, Exception -> 0x0078, all -> 0x0074 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0071, IOException -> 0x006e, JSONException -> 0x006b, Exception -> 0x0068, all -> 0x0065 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0071, IOException -> 0x006e, JSONException -> 0x006b, Exception -> 0x0068, all -> 0x0065 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r1, r4)     // Catch:{ FileNotFoundException -> 0x0071, IOException -> 0x006e, JSONException -> 0x006b, Exception -> 0x0068, all -> 0x0065 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0071, IOException -> 0x006e, JSONException -> 0x006b, Exception -> 0x0068, all -> 0x0065 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ FileNotFoundException -> 0x0062, IOException -> 0x005f, JSONException -> 0x005d, Exception -> 0x005b }
            java.lang.String r4 = ""
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0062, IOException -> 0x005f, JSONException -> 0x005d, Exception -> 0x005b }
        L_0x001c:
            java.lang.String r4 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x0062, IOException -> 0x005f, JSONException -> 0x005d, Exception -> 0x005b }
            if (r4 != 0) goto L_0x0057
            int r4 = r3.length()     // Catch:{ FileNotFoundException -> 0x0062, IOException -> 0x005f, JSONException -> 0x005d, Exception -> 0x005b }
            if (r4 != 0) goto L_0x003b
            r2.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0030:
            if (r1 == 0) goto L_0x003a
            r1.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x003a:
            return r0
        L_0x003b:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ FileNotFoundException -> 0x0062, IOException -> 0x005f, JSONException -> 0x005d, Exception -> 0x005b }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0062, IOException -> 0x005f, JSONException -> 0x005d, Exception -> 0x005b }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0062, IOException -> 0x005f, JSONException -> 0x005d, Exception -> 0x005b }
            r2.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x004c:
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0056:
            return r4
        L_0x0057:
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0062, IOException -> 0x005f, JSONException -> 0x005d, Exception -> 0x005b }
            goto L_0x001c
        L_0x005b:
            r5 = move-exception
            goto L_0x007b
        L_0x005d:
            r3 = move-exception
            goto L_0x0096
        L_0x005f:
            goto L_0x00c9
        L_0x0062:
            goto L_0x00e0
        L_0x0065:
            r5 = move-exception
            r2 = r0
            goto L_0x00b2
        L_0x0068:
            r5 = move-exception
            r2 = r0
            goto L_0x007b
        L_0x006b:
            r3 = move-exception
            r2 = r0
            goto L_0x0096
        L_0x006e:
            r2 = r0
            goto L_0x00c9
        L_0x0071:
            r2 = r0
            goto L_0x00e0
        L_0x0074:
            r5 = move-exception
            r1 = r0
            r2 = r1
            goto L_0x00b2
        L_0x0078:
            r5 = move-exception
            r1 = r0
            r2 = r1
        L_0x007b:
            com.google.a.a.a.a.a.a.b(r5)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x0088
            r2.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x0088
        L_0x0084:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0088:
            if (r1 == 0) goto L_0x0092
            r1.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x0092
        L_0x008e:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0092:
            return r0
        L_0x0093:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x0096:
            com.google.a.a.a.a.a.a.b(r3)     // Catch:{ all -> 0x00b1 }
            c(r5, r6)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x00a6
            r2.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x00a6:
            if (r1 == 0) goto L_0x00b0
            r1.close()     // Catch:{ IOException -> 0x00ac }
            goto L_0x00b0
        L_0x00ac:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x00b0:
            return r0
        L_0x00b1:
            r5 = move-exception
        L_0x00b2:
            if (r2 == 0) goto L_0x00bc
            r2.close()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r6 = move-exception
            com.google.a.a.a.a.a.a.b(r6)
        L_0x00bc:
            if (r1 == 0) goto L_0x00c6
            r1.close()     // Catch:{ IOException -> 0x00c2 }
            goto L_0x00c6
        L_0x00c2:
            r6 = move-exception
            com.google.a.a.a.a.a.a.b(r6)
        L_0x00c6:
            throw r5
        L_0x00c7:
            r1 = r0
            r2 = r1
        L_0x00c9:
            if (r2 == 0) goto L_0x00d3
            r2.close()     // Catch:{ IOException -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x00d3:
            if (r1 == 0) goto L_0x00dd
            r1.close()     // Catch:{ IOException -> 0x00d9 }
            goto L_0x00dd
        L_0x00d9:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x00dd:
            return r0
        L_0x00de:
            r1 = r0
            r2 = r1
        L_0x00e0:
            if (r2 == 0) goto L_0x00ea
            r2.close()     // Catch:{ IOException -> 0x00e6 }
            goto L_0x00ea
        L_0x00e6:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x00ea:
            if (r1 == 0) goto L_0x00f4
            r1.close()     // Catch:{ IOException -> 0x00f0 }
            goto L_0x00f4
        L_0x00f0:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x00f4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hianalytics.android.a.a.c.b(android.content.Context, java.lang.String):org.json.JSONObject");
    }

    public static void c(Context context, String str) {
        context.deleteFile(d(context, str));
    }

    private static String d(Context context, String str) {
        String packageName = context.getPackageName();
        return "hianalytics_" + str + "_" + packageName;
    }
}
