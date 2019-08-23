package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class v {
    v() {
    }

    public static String a(List<String> list) {
        return TextUtils.join("!", list);
    }

    public static List<String> a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    public static String a(Context context) {
        return "/data/data/" + context.getPackageName() + "/databases/.ua/";
    }

    public static List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String next : list) {
                if (Collections.frequency(arrayList, next) <= 0) {
                    arrayList.add(next);
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r4 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r4 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r4, android.database.sqlite.SQLiteDatabase r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r3 = "select count(*) as c from sqlite_master where type ='table' and name ='"
            r2.<init>(r3)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r4 = r4.trim()     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            r2.append(r4)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r4 = "' "
            r2.append(r4)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r4 = r2.toString()     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            android.database.Cursor r4 = r5.rawQuery(r4, r1)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            boolean r5 = r4.moveToNext()     // Catch:{ Exception -> 0x003f, all -> 0x0034 }
            if (r5 == 0) goto L_0x002e
            int r5 = r4.getInt(r0)     // Catch:{ Exception -> 0x003f, all -> 0x0034 }
            if (r5 <= 0) goto L_0x002e
            r5 = 1
            r0 = 1
        L_0x002e:
            if (r4 == 0) goto L_0x0042
        L_0x0030:
            r4.close()
            goto L_0x0042
        L_0x0034:
            r5 = move-exception
            r1 = r4
            goto L_0x0038
        L_0x0037:
            r5 = move-exception
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            r1.close()
        L_0x003d:
            throw r5
        L_0x003e:
            r4 = r1
        L_0x003f:
            if (r4 == 0) goto L_0x0042
            goto L_0x0030
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.v.a(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
    }
}
