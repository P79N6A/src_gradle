package cn.com.chinatelecom.account.a;

import android.content.Context;
import java.io.File;

public final class b {
    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|16|17|18|19|20|57|59) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0062, code lost:
        if (r2 != null) goto L_0x0033;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0048 A[SYNTHETIC, Splitter:B:33:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004d A[SYNTHETIC, Splitter:B:37:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0052 A[SYNTHETIC, Splitter:B:41:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x005a A[SYNTHETIC, Splitter:B:49:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x005f A[SYNTHETIC, Splitter:B:53:0x005f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r4) {
        /*
            java.io.File r4 = c(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r4 == 0) goto L_0x006a
            boolean r1 = r4.exists()
            if (r1 != 0) goto L_0x0013
            goto L_0x006a
        L_0x0013:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0056, all -> 0x0043 }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x0056, all -> 0x0043 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0041, all -> 0x003e }
            r4.<init>(r2)     // Catch:{ Throwable -> 0x0041, all -> 0x003e }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0058, all -> 0x003c }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0058, all -> 0x003c }
        L_0x0023:
            java.lang.String r1 = r3.readLine()     // Catch:{ Throwable -> 0x003a, all -> 0x0037 }
            if (r1 == 0) goto L_0x002d
            r0.append(r1)     // Catch:{ Throwable -> 0x003a, all -> 0x0037 }
            goto L_0x0023
        L_0x002d:
            r3.close()     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            r4.close()     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            r2.close()     // Catch:{ Exception -> 0x0065 }
            goto L_0x0065
        L_0x0037:
            r0 = move-exception
            r1 = r3
            goto L_0x0046
        L_0x003a:
            r1 = r3
            goto L_0x0058
        L_0x003c:
            r0 = move-exception
            goto L_0x0046
        L_0x003e:
            r0 = move-exception
            r4 = r1
            goto L_0x0046
        L_0x0041:
            r4 = r1
            goto L_0x0058
        L_0x0043:
            r0 = move-exception
            r4 = r1
            r2 = r4
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            if (r4 == 0) goto L_0x0050
            r4.close()     // Catch:{ Exception -> 0x0050 }
        L_0x0050:
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            throw r0
        L_0x0056:
            r4 = r1
            r2 = r4
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            if (r4 == 0) goto L_0x0062
            r4.close()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            if (r2 == 0) goto L_0x0065
            goto L_0x0033
        L_0x0065:
            java.lang.String r4 = r0.toString()
            return r4
        L_0x006a:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.a.b.a(android.content.Context):java.lang.String");
    }

    public static void a(Context context, String str) {
        File c2 = c(context);
        if (c2 == null || !c2.exists()) {
            a(b(context), str);
        } else {
            a(c2, str);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:8|9|(1:11)|12|13|14|15|16|17) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0035 A[SYNTHETIC, Splitter:B:27:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003a A[SYNTHETIC, Splitter:B:31:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0041 A[SYNTHETIC, Splitter:B:39:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0046 A[SYNTHETIC, Splitter:B:43:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.io.File r3, java.lang.String r4) {
        /*
            if (r3 == 0) goto L_0x004a
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x004a
            r0 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ Exception -> 0x003e, all -> 0x0030 }
            r2 = 0
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x003e, all -> 0x0030 }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x003f, all -> 0x002d }
            r3.<init>(r1)     // Catch:{ Exception -> 0x003f, all -> 0x002d }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            if (r0 == 0) goto L_0x001c
            java.lang.String r4 = ""
        L_0x001c:
            r3.write(r4)     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            r3.flush()     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            r3.close()     // Catch:{ Exception -> 0x0025 }
        L_0x0025:
            r1.close()     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            return
        L_0x0029:
            r4 = move-exception
            goto L_0x0033
        L_0x002b:
            r0 = r3
            goto L_0x003f
        L_0x002d:
            r4 = move-exception
            r3 = r0
            goto L_0x0033
        L_0x0030:
            r4 = move-exception
            r3 = r0
            r1 = r3
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            r3.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            r1.close()     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            throw r4
        L_0x003e:
            r1 = r0
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.a.b.a(java.io.File, java.lang.String):void");
    }

    private static File b(Context context) {
        if (context != null) {
            try {
                File file = new File(context.getFilesDir() + "/eAccount/Log/");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, "ipa_ol.ds");
                if (file2.exists()) {
                    file2.delete();
                }
                file2.createNewFile();
                return file2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static File c(Context context) {
        if (context != null) {
            try {
                File file = new File(context.getFilesDir() + "/eAccount/Log/");
                if (!file.exists()) {
                    return null;
                }
                File file2 = new File(file, "ipa_ol.ds");
                if (!file2.exists()) {
                    return null;
                }
                return file2;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
