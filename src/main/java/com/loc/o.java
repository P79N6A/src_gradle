package com.loc;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class o extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    static boolean f25863a = false;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static boolean f25864c = true;

    /* renamed from: b  reason: collision with root package name */
    private m f25865b;

    public static class a extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        private String f25866a;

        /* renamed from: b  reason: collision with root package name */
        private Context f25867b;

        public a(Context context, String str) {
            super(context);
            this.f25866a = str;
            this.f25867b = context;
        }

        public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
            SQLiteDatabase sQLiteDatabase;
            if (getDatabasePath(str) != null) {
                try {
                    sQLiteDatabase = SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), null);
                } catch (Throwable unused) {
                    sQLiteDatabase = null;
                }
                if (sQLiteDatabase != null) {
                    return sQLiteDatabase;
                }
            }
            return SQLiteDatabase.openOrCreateDatabase(this.f25867b.getApplicationContext().getDatabasePath(str), null);
        }

        public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
            SQLiteDatabase sQLiteDatabase;
            if (getDatabasePath(str) != null) {
                try {
                    sQLiteDatabase = SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), null);
                } catch (Throwable unused) {
                    sQLiteDatabase = null;
                }
                if (sQLiteDatabase != null) {
                    return sQLiteDatabase;
                }
            }
            return SQLiteDatabase.openOrCreateDatabase(this.f25867b.getApplicationContext().getDatabasePath(str), null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            com.loc.o.b();
            r2 = false;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0083 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.File getDatabasePath(java.lang.String r6) {
            /*
                r5 = this;
                boolean r0 = com.loc.o.f25864c     // Catch:{ Throwable -> 0x009c }
                if (r0 == 0) goto L_0x0097
                android.content.Context r0 = r5.f25867b     // Catch:{ Throwable -> 0x009c }
                java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
                boolean r0 = com.loc.di.a((android.content.Context) r0, (java.lang.String) r1)     // Catch:{ Throwable -> 0x009c }
                if (r0 != 0) goto L_0x0012
                goto L_0x0097
            L_0x0012:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x009c }
                r0.<init>()     // Catch:{ Throwable -> 0x009c }
                java.lang.String r1 = r5.f25866a     // Catch:{ Throwable -> 0x009c }
                r0.append(r1)     // Catch:{ Throwable -> 0x009c }
                java.lang.String r1 = "/"
                r0.append(r1)     // Catch:{ Throwable -> 0x009c }
                r0.append(r6)     // Catch:{ Throwable -> 0x009c }
                java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x009c }
                java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x009c }
                java.lang.String r2 = r5.f25866a     // Catch:{ Throwable -> 0x009c }
                r1.<init>(r2)     // Catch:{ Throwable -> 0x009c }
                boolean r2 = r1.exists()     // Catch:{ Throwable -> 0x009c }
                if (r2 != 0) goto L_0x0038
                r1.mkdirs()     // Catch:{ Throwable -> 0x009c }
            L_0x0038:
                boolean r1 = com.loc.o.f25863a     // Catch:{ Throwable -> 0x009c }
                r2 = 1
                if (r1 == 0) goto L_0x0043
                boolean r1 = com.loc.o.f25864c     // Catch:{ Throwable -> 0x009c }
                if (r1 != 0) goto L_0x0072
            L_0x0043:
                com.loc.o.f25863a = r2     // Catch:{ Throwable -> 0x009c }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x009c }
                r1.<init>()     // Catch:{ Throwable -> 0x009c }
                java.lang.String r3 = r5.f25866a     // Catch:{ Throwable -> 0x009c }
                r1.append(r3)     // Catch:{ Throwable -> 0x009c }
                java.lang.String r3 = java.io.File.separator     // Catch:{ Throwable -> 0x009c }
                r1.append(r3)     // Catch:{ Throwable -> 0x009c }
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x009c }
                r1.append(r3)     // Catch:{ Throwable -> 0x009c }
                java.lang.String r3 = ".db"
                r1.append(r3)     // Catch:{ Throwable -> 0x009c }
                java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x009c }
                java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x009c }
                r3.<init>(r1)     // Catch:{ Throwable -> 0x009c }
                boolean r1 = r3.createNewFile()     // Catch:{ Throwable -> 0x009c }
                if (r1 == 0) goto L_0x008f
                r3.delete()     // Catch:{ Throwable -> 0x009c }
            L_0x0072:
                r1 = 0
                java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x009c }
                r3.<init>(r0)     // Catch:{ Throwable -> 0x009c }
                boolean r0 = r3.exists()     // Catch:{ Throwable -> 0x009c }
                if (r0 != 0) goto L_0x0087
                boolean r2 = r3.createNewFile()     // Catch:{ IOException -> 0x0083 }
                goto L_0x0087
            L_0x0083:
                boolean unused = com.loc.o.f25864c = false     // Catch:{ Throwable -> 0x009c }
                r2 = 0
            L_0x0087:
                if (r2 == 0) goto L_0x008a
                return r3
            L_0x008a:
                java.io.File r0 = super.getDatabasePath(r6)     // Catch:{ Throwable -> 0x009c }
                return r0
            L_0x008f:
                boolean unused = com.loc.o.f25864c = false     // Catch:{ Throwable -> 0x009c }
                java.io.File r0 = super.getDatabasePath(r6)     // Catch:{ Throwable -> 0x009c }
                return r0
            L_0x0097:
                java.io.File r0 = super.getDatabasePath(r6)     // Catch:{ Throwable -> 0x009c }
                return r0
            L_0x009c:
                boolean unused = com.loc.o.f25864c = false
                java.io.File r6 = super.getDatabasePath(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.o.a.getDatabasePath(java.lang.String):java.io.File");
        }
    }

    public o(Context context, String str, m mVar) {
        super(context, str, null, 1);
        this.f25865b = mVar;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f25865b.a(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
