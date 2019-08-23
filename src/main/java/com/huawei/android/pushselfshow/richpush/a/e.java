package com.huawei.android.pushselfshow.richpush.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.huawei.android.pushselfshow.utils.a.b;

public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private String f25228a;

    public e() {
    }

    protected e(String str) {
        this.f25228a = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r8, android.database.sqlite.SQLiteDatabase r9, java.lang.String r10, android.content.ContentValues r11) throws java.lang.Exception {
        /*
            if (r8 != 0) goto L_0x000a
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.String r9 = "context is null"
        L_0x0006:
            com.huawei.android.pushagent.utils.a.e.d(r8, r9)
            return
        L_0x000a:
            if (r9 != 0) goto L_0x0011
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.String r9 = "db is null"
            goto L_0x0006
        L_0x0011:
            boolean r8 = android.text.TextUtils.isEmpty(r10)
            if (r8 == 0) goto L_0x001c
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.String r9 = "table is null"
            goto L_0x0006
        L_0x001c:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r9
            r1 = r10
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0070, all -> 0x006c }
            if (r0 != 0) goto L_0x003d
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.String r10 = "cursor is null"
            com.huawei.android.pushagent.utils.a.e.d(r8, r10)     // Catch:{ Exception -> 0x003b }
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            r9.close()
            return
        L_0x003b:
            r8 = move-exception
            goto L_0x0073
        L_0x003d:
            int r1 = r0.getCount()     // Catch:{ Exception -> 0x003b }
            java.lang.String r2 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003b }
            java.lang.String r4 = "queryAndInsert, exist rowNumber:"
            r3.<init>(r4)     // Catch:{ Exception -> 0x003b }
            r3.append(r1)     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x003b }
            com.huawei.android.pushagent.utils.a.e.a(r2, r3)     // Catch:{ Exception -> 0x003b }
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 >= r2) goto L_0x005c
            r9.insert(r10, r8, r11)     // Catch:{ Exception -> 0x003b }
            goto L_0x0063
        L_0x005c:
            java.lang.String r8 = "PushSelfShowLog"
            java.lang.String r10 = "queryAndInsert failed"
            com.huawei.android.pushagent.utils.a.e.d(r8, r10)     // Catch:{ Exception -> 0x003b }
        L_0x0063:
            if (r0 == 0) goto L_0x0068
            r0.close()
        L_0x0068:
            r9.close()
            return
        L_0x006c:
            r10 = move-exception
            r0 = r8
            r8 = r10
            goto L_0x0086
        L_0x0070:
            r10 = move-exception
            r0 = r8
            r8 = r10
        L_0x0073:
            java.lang.String r10 = "PushSelfShowLog"
            java.lang.String r11 = r8.toString()     // Catch:{ all -> 0x0085 }
            com.huawei.android.pushagent.utils.a.e.c(r10, r11, r8)     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0081
            r0.close()
        L_0x0081:
            r9.close()
            return
        L_0x0085:
            r8 = move-exception
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            r0.close()
        L_0x008b:
            r9.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.richpush.a.e.a(android.content.Context, android.database.sqlite.SQLiteDatabase, java.lang.String, android.content.ContentValues):void");
    }

    public Cursor a(Context context, Uri uri, String str, String[] strArr) throws Exception {
        SQLiteDatabase readableDatabase = a(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                return readableDatabase.rawQuery(str, strArr);
            } catch (Exception e2) {
                com.huawei.android.pushagent.utils.a.e.c("PushSelfShowLog", e2.toString(), e2);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public b a(Context context) {
        return this.f25228a == null ? b.a(context) : b.a(context, this.f25228a);
    }

    public void a(Context context, Uri uri, String str, ContentValues contentValues) throws Exception {
        a(context, a(context).getWritableDatabase(), str, contentValues);
    }

    public void a(Context context, Uri uri, String str, String str2, String[] strArr) throws Exception {
        SQLiteDatabase writableDatabase = a(context).getWritableDatabase();
        if (writableDatabase != null) {
            try {
                writableDatabase.delete(str, str2, strArr);
            } catch (Exception e2) {
                com.huawei.android.pushagent.utils.a.e.c("PushSelfShowLog", e2.toString(), e2);
            } finally {
                writableDatabase.close();
            }
        }
    }
}
