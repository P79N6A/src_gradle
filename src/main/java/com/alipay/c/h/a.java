package com.alipay.c.h;

import android.content.Context;
import com.alipay.d.a.a.d.c;
import java.util.HashMap;
import org.json.JSONObject;

public final class a {
    public static String a(Context context, String str, String str2) {
        String str3;
        if (context == null || com.alipay.d.a.a.a.a.a(str) || com.alipay.d.a.a.a.a.a(str2)) {
            return null;
        }
        try {
            String a2 = c.a(context, str, str2, "");
            if (com.alipay.d.a.a.a.a.a(a2)) {
                return null;
            }
            str3 = com.alipay.d.a.a.a.a.c.b(com.alipay.d.a.a.a.a.c.a(), a2);
            return str3;
        } catch (Exception unused) {
            str3 = null;
        }
    }

    public static String a(String str, String str2) {
        if (!com.alipay.d.a.a.a.a.a(str) && !com.alipay.d.a.a.a.a.a(str2)) {
            try {
                String a2 = com.alipay.d.a.a.d.a.a(str);
                if (com.alipay.d.a.a.a.a.a(a2)) {
                    return null;
                }
                String string = new JSONObject(a2).getString(str2);
                if (com.alipay.d.a.a.a.a.a(string)) {
                    return null;
                }
                return com.alipay.d.a.a.a.a.c.b(com.alipay.d.a.a.a.a.c.a(), string);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (!com.alipay.d.a.a.a.a.a(str) && !com.alipay.d.a.a.a.a.a(str2) && context != null) {
            try {
                String a2 = com.alipay.d.a.a.a.a.c.a(com.alipay.d.a.a.a.a.c.a(), str3);
                HashMap hashMap = new HashMap();
                hashMap.put(str2, a2);
                c.a(context, str, hashMap);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|(2:34|35)|36|37) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|7|(1:9)|10|11|(2:13|(11:15|(1:17)|18|19|20|21|22|23|24|25|26))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0083 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031 A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080 A[SYNTHETIC, Splitter:B:34:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0086 A[SYNTHETIC, Splitter:B:40:0x0086] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            boolean r0 = com.alipay.d.a.a.a.a.a((java.lang.String) r2)
            if (r0 != 0) goto L_0x0089
            boolean r0 = com.alipay.d.a.a.a.a.a((java.lang.String) r3)
            if (r0 == 0) goto L_0x000e
            goto L_0x0089
        L_0x000e:
            java.lang.String r0 = com.alipay.d.a.a.a.a.c.a()     // Catch:{  }
            java.lang.String r4 = com.alipay.d.a.a.a.a.c.a(r0, r4)     // Catch:{  }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{  }
            r0.<init>()     // Catch:{  }
            r0.put(r3, r4)     // Catch:{  }
            java.lang.String r3 = r0.toString()     // Catch:{  }
            boolean r4 = com.alipay.d.a.a.a.a.a((java.lang.String) r3)     // Catch:{ Throwable -> 0x002b }
            if (r4 != 0) goto L_0x002b
            java.lang.System.setProperty(r2, r3)     // Catch:{ Throwable -> 0x002b }
        L_0x002b:
            boolean r4 = com.alipay.d.a.a.d.b.a()     // Catch:{  }
            if (r4 == 0) goto L_0x0089
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{  }
            java.lang.String r0 = ".SystemConfig"
            r4.<init>(r0)     // Catch:{  }
            java.lang.String r0 = java.io.File.separator     // Catch:{  }
            r4.append(r0)     // Catch:{  }
            r4.append(r2)     // Catch:{  }
            java.lang.String r2 = r4.toString()     // Catch:{  }
            boolean r4 = com.alipay.d.a.a.d.b.a()     // Catch:{  }
            if (r4 == 0) goto L_0x0089
            java.io.File r4 = new java.io.File     // Catch:{  }
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{  }
            r4.<init>(r0, r2)     // Catch:{  }
            boolean r2 = r4.exists()     // Catch:{  }
            if (r2 != 0) goto L_0x0060
            java.io.File r2 = r4.getParentFile()     // Catch:{  }
            r2.mkdirs()     // Catch:{  }
        L_0x0060:
            java.lang.String r2 = r4.getAbsolutePath()     // Catch:{  }
            java.io.File r4 = new java.io.File     // Catch:{  }
            r4.<init>(r2)     // Catch:{  }
            r2 = 0
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ Exception -> 0x0084, all -> 0x007d }
            r1 = 0
            r0.<init>(r4, r1)     // Catch:{ Exception -> 0x0084, all -> 0x007d }
            r0.write(r3)     // Catch:{ Exception -> 0x007b, all -> 0x0077 }
            r0.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            return
        L_0x0077:
            r2 = move-exception
            r3 = r2
            r2 = r0
            goto L_0x007e
        L_0x007b:
            r2 = r0
            goto L_0x0084
        L_0x007d:
            r3 = move-exception
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            r2.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            throw r3     // Catch:{  }
        L_0x0084:
            if (r2 == 0) goto L_0x0089
            r2.close()     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.c.h.a.a(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
