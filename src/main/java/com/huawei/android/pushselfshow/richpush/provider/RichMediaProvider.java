package com.huawei.android.pushselfshow.richpush.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.utils.a.b;

public class RichMediaProvider extends ContentProvider {

    /* renamed from: b  reason: collision with root package name */
    private static final UriMatcher f25348b;

    /* renamed from: a  reason: collision with root package name */
    b f25349a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Uri f25350a = Uri.parse("content://com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider/support_porvider");

        /* renamed from: b  reason: collision with root package name */
        public static final Uri f25351b = Uri.parse("content://com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider/insert_bmp");

        /* renamed from: c  reason: collision with root package name */
        public static final Uri f25352c = Uri.parse("content://com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider/update_bmp");

        /* renamed from: d  reason: collision with root package name */
        public static final Uri f25353d = Uri.parse("content://com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider/query_bmp");

        /* renamed from: e  reason: collision with root package name */
        public static final Uri f25354e = Uri.parse("content://com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider/insert_msg");

        /* renamed from: f  reason: collision with root package name */
        public static final Uri f25355f = Uri.parse("content://com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider/query_msg");
        public static final Uri g = Uri.parse("content://com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider/delete_msg");
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f25348b = uriMatcher;
        uriMatcher.addURI("com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider", "support_porvider", 1);
        f25348b.addURI("com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider", "insert_bmp", 2);
        f25348b.addURI("com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider", "update_bmp", 3);
        f25348b.addURI("com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider", "query_bmp", 4);
        f25348b.addURI("com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider", "insert_msg", 5);
        f25348b.addURI("com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider", "query_msg", 6);
        f25348b.addURI("com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider", "delete_msg", 7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        r0 = r1;
        r9 = r13;
        r13 = r12;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a2, code lost:
        r1.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:9:0x0030, B:24:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.net.Uri a(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, android.content.ContentValues r13, android.net.Uri r14) {
        /*
            r10 = this;
            java.lang.String r0 = "PushSelfShowLog_RichMediaProvider"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "enter insertToDb, table is:"
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)
            r0 = 0
            if (r11 != 0) goto L_0x001e
            java.lang.String r11 = "PushSelfShowLog_RichMediaProvider"
            java.lang.String r12 = "db is null"
            com.huawei.android.pushagent.utils.a.e.d(r11, r12)
            return r0
        L_0x001e:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r11
            r2 = r12
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0078 }
            if (r1 != 0) goto L_0x0043
            java.lang.String r12 = "PushSelfShowLog_RichMediaProvider"
            java.lang.String r13 = "cursor is null"
            com.huawei.android.pushagent.utils.a.e.d(r12, r13)     // Catch:{ Exception -> 0x003f, all -> 0x003c }
            if (r1 == 0) goto L_0x0038
            r1.close()
        L_0x0038:
            r11.close()
            return r0
        L_0x003c:
            r12 = move-exception
            goto L_0x00a0
        L_0x003f:
            r12 = move-exception
            r13 = r0
            r0 = r1
            goto L_0x007a
        L_0x0043:
            int r2 = r1.getCount()     // Catch:{ Exception -> 0x003f, all -> 0x003c }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 >= r3) goto L_0x006b
            long r12 = r11.insert(r12, r0, r13)     // Catch:{ Exception -> 0x003f, all -> 0x003c }
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x006b
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r14, r12)     // Catch:{ Exception -> 0x003f, all -> 0x003c }
            android.content.Context r13 = r10.getContext()     // Catch:{ Exception -> 0x0065, all -> 0x003c }
            android.content.ContentResolver r13 = r13.getContentResolver()     // Catch:{ Exception -> 0x0065, all -> 0x003c }
            r13.notifyChange(r12, r0)     // Catch:{ Exception -> 0x0065, all -> 0x003c }
            goto L_0x006c
        L_0x0065:
            r13 = move-exception
            r0 = r1
            r9 = r13
            r13 = r12
            r12 = r9
            goto L_0x007a
        L_0x006b:
            r12 = r0
        L_0x006c:
            if (r1 == 0) goto L_0x0071
            r1.close()
        L_0x0071:
            r11.close()
            goto L_0x008c
        L_0x0075:
            r12 = move-exception
            r1 = r0
            goto L_0x00a0
        L_0x0078:
            r12 = move-exception
            r13 = r0
        L_0x007a:
            java.lang.String r14 = "PushSelfShowLog_RichMediaProvider"
            java.lang.String r1 = r12.toString()     // Catch:{ all -> 0x0075 }
            com.huawei.android.pushagent.utils.a.e.c(r14, r1, r12)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0088
            r0.close()
        L_0x0088:
            r11.close()
            r12 = r13
        L_0x008c:
            java.lang.String r11 = "PushSelfShowLog_RichMediaProvider"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "resultUri is:"
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.huawei.android.pushagent.utils.a.e.a(r11, r13)
            return r12
        L_0x00a0:
            if (r1 == 0) goto L_0x00a5
            r1.close()
        L_0x00a5:
            r11.close()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.richpush.provider.RichMediaProvider.a(android.database.sqlite.SQLiteDatabase, java.lang.String, android.content.ContentValues, android.net.Uri):android.net.Uri");
    }

    private boolean a(String str) {
        if (str == null || str.length() == 0 || !str.contains("'")) {
            return false;
        }
        e.d("PushSelfShowLog_RichMediaProvider", str + " can be reject, should check sql");
        return true;
    }

    private boolean a(String[] strArr) {
        if (!(strArr == null || strArr.length == 0)) {
            for (String a2 : strArr) {
                if (a(a2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        int i;
        String str2;
        String str3;
        int match = f25348b.match(uri);
        e.a("PushSelfShowLog_RichMediaProvider", "uri is:" + uri + ",match result: " + match);
        if (this.f25349a == null) {
            str2 = "PushSelfShowLog_RichMediaProvider";
            str3 = "dbHelper is null";
        } else if (match != 7) {
            str2 = "PushSelfShowLog_RichMediaProvider";
            str3 = "uri not match!";
        } else {
            SQLiteDatabase writableDatabase = this.f25349a.getWritableDatabase();
            if (writableDatabase == null) {
                str2 = "PushSelfShowLog_RichMediaProvider";
                str3 = "db is null";
            } else {
                try {
                    i = writableDatabase.delete("pushmsg", "_id = ?", strArr);
                    try {
                        getContext().getContentResolver().notifyChange(uri, null);
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    i = 0;
                    try {
                        e.c("PushSelfShowLog_RichMediaProvider", e.toString(), e);
                        writableDatabase.close();
                        return i;
                    } catch (Throwable th) {
                        writableDatabase.close();
                        throw th;
                    }
                }
                writableDatabase.close();
                return i;
            }
        }
        e.d(str2, str3);
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase writableDatabase;
        String str;
        String str2;
        String str3;
        int match = f25348b.match(uri);
        e.a("PushSelfShowLog_RichMediaProvider", "uri is:" + uri + ",match result: " + match);
        if (this.f25349a == null) {
            str2 = "PushSelfShowLog_RichMediaProvider";
            str3 = "dbHelper is null";
        } else {
            if (match == 2) {
                writableDatabase = this.f25349a.getWritableDatabase();
                str = "notify";
            } else if (match != 5) {
                str2 = "PushSelfShowLog_RichMediaProvider";
                str3 = "uri not match!";
            } else {
                writableDatabase = this.f25349a.getWritableDatabase();
                str = "pushmsg";
            }
            return a(writableDatabase, str, contentValues, uri);
        }
        e.d(str2, str3);
        return null;
    }

    public boolean onCreate() {
        e.a("PushSelfShowLog_RichMediaProvider", "onCreate");
        this.f25349a = b.a(getContext());
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        String str4;
        Uri uri2 = uri;
        if (a(str) || a(strArr)) {
            str3 = "PushSelfShowLog_RichMediaProvider";
            str4 = "in query selection:" + r2 + " or projection is invalied";
        } else {
            int match = f25348b.match(uri);
            e.a("PushSelfShowLog_RichMediaProvider", "uri is:" + uri + ",match result: " + match);
            if (this.f25349a == null) {
                str3 = "PushSelfShowLog_RichMediaProvider";
                str4 = "dbHelper is null";
            } else {
                SQLiteDatabase readableDatabase = this.f25349a.getReadableDatabase();
                if (readableDatabase == null) {
                    str3 = "PushSelfShowLog_RichMediaProvider";
                    str4 = "db is null";
                } else if (match != 1) {
                    if (match == 4) {
                        String[] strArr3 = strArr2;
                        try {
                            return readableDatabase.query("notify", new String[]{"bmp"}, "url = ?", strArr2, null, null, str2, null);
                        } catch (Exception e2) {
                            e.c("PushSelfShowLog_RichMediaProvider", e2.toString(), e2);
                        }
                    } else if (match != 6) {
                        e.d("PushSelfShowLog_RichMediaProvider", "uri not match!");
                    } else {
                        try {
                            return readableDatabase.rawQuery("SELECT pushmsg._id,pushmsg.msg,pushmsg.token,pushmsg.url,notify.bmp  FROM pushmsg LEFT OUTER JOIN notify ON pushmsg.url = notify.url and pushmsg.url = ? order by pushmsg._id desc limit 1000;", strArr2);
                        } catch (Exception e3) {
                            Exception exc = e3;
                            e.c("PushSelfShowLog_RichMediaProvider", exc.toString(), exc);
                        }
                    }
                    return null;
                } else {
                    MatrixCursor matrixCursor = new MatrixCursor(new String[]{"isSupport"});
                    matrixCursor.addRow(new Integer[]{1});
                    return matrixCursor;
                }
            }
        }
        e.d(str3, str4);
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        String str2;
        String str3;
        int match = f25348b.match(uri);
        e.a("PushSelfShowLog_RichMediaProvider", "uri is:" + uri + ",match result: " + match);
        if (this.f25349a == null) {
            str2 = "PushSelfShowLog_RichMediaProvider";
            str3 = "dbHelper is null";
        } else if (match != 3) {
            str2 = "PushSelfShowLog_RichMediaProvider";
            str3 = "uri not match!";
        } else {
            SQLiteDatabase writableDatabase = this.f25349a.getWritableDatabase();
            if (writableDatabase == null) {
                str2 = "PushSelfShowLog_RichMediaProvider";
                str3 = "db is null";
            } else {
                try {
                    i = writableDatabase.update("notify", contentValues, "url = ?", strArr);
                    try {
                        getContext().getContentResolver().notifyChange(uri, null);
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    i = 0;
                    try {
                        e.c("PushSelfShowLog_RichMediaProvider", e.toString(), e);
                        writableDatabase.close();
                        return i;
                    } catch (Throwable th) {
                        writableDatabase.close();
                        throw th;
                    }
                }
                writableDatabase.close();
                return i;
            }
        }
        e.d(str2, str3);
        return 0;
    }
}
