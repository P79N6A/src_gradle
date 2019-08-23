package com.ss.android.ugc.a.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static Context f31513a;

    /* renamed from: com.ss.android.ugc.a.a.a$a  reason: collision with other inner class name */
    static class C0399a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31514a;

        static {
            a aVar = new a(a.f31513a, "okdownload.db", null, 1, (byte) 0);
            f31514a = aVar;
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table downloadinfo (id INTEGER primary key,url TEXT,filePath TEXT,startTime INTEGER,finishTime INTEGER,fileSize INTEGER,status INTEGER)");
    }

    public static a a(Context context) {
        if (context == null) {
            return null;
        }
        if (f31513a == null) {
            f31513a = context;
        }
        return C0399a.f31514a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0062, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        if (r0 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0056, code lost:
        if (r0 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0058, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005d, code lost:
        if (r0 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005f, code lost:
        r0.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x005c A[ExcHandler: all (r7v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.ss.android.ugc.a.e r7) {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.getWritableDatabase()
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "url"
            java.lang.String r3 = r7.f31527b     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "filePath"
            java.lang.String r3 = r7.f31528c     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "startTime"
            long r3 = r7.f31529d     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "finishTime"
            long r3 = r7.f31530e     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "fileSize"
            long r3 = r7.f31531f     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "status"
            int r3 = r7.h     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.lang.String r2 = "downloadinfo"
            java.lang.String r3 = "url = ?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r5 = 0
            java.lang.String r7 = r7.f31527b     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r4[r5] = r7     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            int r7 = r0.update(r2, r1, r3, r4)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r0.close()     // Catch:{ Exception -> 0x0064, all -> 0x005c }
            if (r0 == 0) goto L_0x0067
        L_0x0058:
            r0.close()
            goto L_0x0067
        L_0x005c:
            r7 = move-exception
            if (r0 == 0) goto L_0x0062
            r0.close()
        L_0x0062:
            throw r7
        L_0x0063:
            r7 = -1
        L_0x0064:
            if (r0 == 0) goto L_0x0067
            goto L_0x0058
        L_0x0067:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.a.a.a.a(com.ss.android.ugc.a.e):int");
    }

    public final int b(String str, String str2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            writableDatabase.delete("downloadinfo", str + " = ?", new String[]{str2});
        } catch (Exception unused) {
        } catch (Throwable th) {
            writableDatabase.close();
            throw th;
        }
        writableDatabase.close();
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009a, code lost:
        if (r1 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        if (r1 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b7, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.a.e> a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r5.getWritableDatabase()
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            java.lang.String r4 = "select * from downloadinfo where "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            r3.append(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            java.lang.String r6 = " = ?"
            r3.append(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            r4 = 0
            r3[r4] = r7     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            android.database.Cursor r6 = r1.rawQuery(r6, r3)     // Catch:{ Exception -> 0x00ac, all -> 0x009f }
            int r7 = r6.getCount()     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            if (r7 == 0) goto L_0x0095
            boolean r7 = r6.moveToFirst()     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            if (r7 == 0) goto L_0x0095
        L_0x0033:
            com.ss.android.ugc.a.e r7 = new com.ss.android.ugc.a.e     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.<init>()     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "id"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            int r2 = r6.getInt(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f31526a = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "url"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = r6.getString(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f31527b = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "filePath"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = r6.getString(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f31528c = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "startTime"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            long r2 = r6.getLong(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f31529d = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "finishTime"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            long r2 = r6.getLong(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f31530e = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "fileSize"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            long r2 = r6.getLong(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.f31531f = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            java.lang.String r2 = "status"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            int r2 = r6.getInt(r2)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r7.h = r2     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            r0.add(r7)     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            boolean r7 = r6.moveToNext()     // Catch:{ Exception -> 0x00ad, all -> 0x009d }
            if (r7 != 0) goto L_0x0033
        L_0x0095:
            if (r6 == 0) goto L_0x009a
            r6.close()
        L_0x009a:
            if (r1 == 0) goto L_0x00b7
            goto L_0x00b4
        L_0x009d:
            r7 = move-exception
            goto L_0x00a1
        L_0x009f:
            r7 = move-exception
            r6 = r2
        L_0x00a1:
            if (r6 == 0) goto L_0x00a6
            r6.close()
        L_0x00a6:
            if (r1 == 0) goto L_0x00ab
            r1.close()
        L_0x00ab:
            throw r7
        L_0x00ac:
            r6 = r2
        L_0x00ad:
            if (r6 == 0) goto L_0x00b2
            r6.close()
        L_0x00b2:
            if (r1 == 0) goto L_0x00b7
        L_0x00b4:
            r1.close()
        L_0x00b7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.a.a.a.a(java.lang.String, java.lang.String):java.util.List");
    }

    private a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    /* synthetic */ a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, byte b2) {
        this(context, str, null, 1);
    }
}
