package com.tencent.bugly.proguard;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.bugly.a;
import java.util.List;

public final class q extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static String f79504a = "bugly_db";

    /* renamed from: b  reason: collision with root package name */
    private static int f79505b = 13;

    /* renamed from: c  reason: collision with root package name */
    private Context f79506c;

    /* renamed from: d  reason: collision with root package name */
    private List<a> f79507d;

    public final synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = null;
        int i = 0;
        while (sQLiteDatabase == null && i < 5) {
            i++;
            try {
                sQLiteDatabase = super.getReadableDatabase();
            } catch (Throwable unused) {
                x.d("[Database] Try to get db(count: %d).", Integer.valueOf(i));
                if (i == 5) {
                    x.e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e2) {
                    com.google.a.a.a.a.a.a.b(e2);
                }
            }
        }
        return sQLiteDatabase;
    }

    public final synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = null;
        int i = 0;
        while (sQLiteDatabase == null && i < 5) {
            i++;
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (Throwable unused) {
                x.d("[Database] Try to get db(count: %d).", Integer.valueOf(i));
                if (i == 5) {
                    x.e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e2) {
                    com.google.a.a.a.a.a.a.b(e2);
                }
            }
        }
        if (sQLiteDatabase == null) {
            x.d("[Database] db error delay error record 1min.", new Object[0]);
        }
        return sQLiteDatabase;
    }

    private synchronized boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            String[] strArr = {"t_lr", "t_ui", "t_pf"};
            for (int i = 0; i < 3; i++) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(strArr[i])), new String[0]);
            }
        } catch (Throwable th) {
            x.b(th);
            return false;
        }
        return true;
    }

    public final synchronized void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS t_ui ( _id");
            sb.append(" INTEGER PRIMARY KEY , _tm");
            sb.append(" int , _ut");
            sb.append(" int , _tp");
            sb.append(" int , _dt");
            sb.append(" blob , _pc");
            sb.append(" text ) ");
            x.c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS t_lr ( _id");
            sb.append(" INTEGER PRIMARY KEY , _tp");
            sb.append(" int , _tm");
            sb.append(" int , _pc");
            sb.append(" text , _th");
            sb.append(" text , _dt");
            sb.append(" blob ) ");
            x.c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS t_pf ( _id");
            sb.append(" integer , _tp");
            sb.append(" text , _tm");
            sb.append(" int , _dt");
            sb.append(" blob,primary key(_id");
            sb.append(",_tp )) ");
            x.c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS t_cr ( _id");
            sb.append(" INTEGER PRIMARY KEY , _tm");
            sb.append(" int , _s1");
            sb.append(" text , _up");
            sb.append(" int , _me");
            sb.append(" int , _uc");
            sb.append(" int , _dt");
            sb.append(" blob ) ");
            x.c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS dl_1002 (_id");
            sb.append(" integer primary key autoincrement, _dUrl varchar(100), _sFile");
            sb.append(" varchar(100), _sLen INTEGER, _tLen");
            sb.append(" INTEGER, _MD5 varchar(100), _DLTIME");
            sb.append(" INTEGER)");
            x.c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append("CREATE TABLE IF NOT EXISTS ge_1002 (_id");
            sb.append(" integer primary key autoincrement, _time INTEGER, _datas");
            sb.append(" blob)");
            x.c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS st_1002 ( _id");
            sb.append(" integer , _tp");
            sb.append(" text , _tm");
            sb.append(" int , _dt");
            sb.append(" blob,primary key(_id");
            sb.append(",_tp )) ");
            x.c(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
        } catch (Throwable th) {
            x.b(th);
        }
        if (this.f79507d != null) {
            for (a onDbCreate : this.f79507d) {
                try {
                    onDbCreate.onDbCreate(sQLiteDatabase);
                } catch (Throwable th2) {
                    x.b(th2);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Context context, List<a> list) {
        super(context, f79504a + "_", null, f79505b);
        com.tencent.bugly.crashreport.common.info.a.a(context).getClass();
        this.f79506c = context;
        this.f79507d = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        return;
     */
    @android.annotation.TargetApi(11)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onDowngrade(android.database.sqlite.SQLiteDatabase r6, int r7, int r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = com.tencent.bugly.crashreport.common.info.b.c()     // Catch:{ all -> 0x0065 }
            r1 = 11
            if (r0 < r1) goto L_0x0063
            java.lang.String r0 = "[Database] Downgrade %d to %d drop tables."
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0065 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0065 }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x0065 }
            r2 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0065 }
            r1[r2] = r4     // Catch:{ all -> 0x0065 }
            com.tencent.bugly.proguard.x.d(r0, r1)     // Catch:{ all -> 0x0065 }
            java.util.List<com.tencent.bugly.a> r0 = r5.f79507d     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x003e
            java.util.List<com.tencent.bugly.a> r0 = r5.f79507d     // Catch:{ all -> 0x0065 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0065 }
        L_0x0029:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0065 }
            com.tencent.bugly.a r1 = (com.tencent.bugly.a) r1     // Catch:{ all -> 0x0065 }
            r1.onDbDowngrade(r6, r7, r8)     // Catch:{ Throwable -> 0x0039 }
            goto L_0x0029
        L_0x0039:
            r1 = move-exception
            com.tencent.bugly.proguard.x.b(r1)     // Catch:{ all -> 0x0065 }
            goto L_0x0029
        L_0x003e:
            boolean r7 = r5.a(r6)     // Catch:{ all -> 0x0065 }
            if (r7 == 0) goto L_0x0049
            r5.onCreate(r6)     // Catch:{ all -> 0x0065 }
            monitor-exit(r5)
            return
        L_0x0049:
            java.lang.String r6 = "[Database] Failed to drop, delete db."
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0065 }
            com.tencent.bugly.proguard.x.d(r6, r7)     // Catch:{ all -> 0x0065 }
            android.content.Context r6 = r5.f79506c     // Catch:{ all -> 0x0065 }
            java.lang.String r7 = f79504a     // Catch:{ all -> 0x0065 }
            java.io.File r6 = r6.getDatabasePath(r7)     // Catch:{ all -> 0x0065 }
            if (r6 == 0) goto L_0x0063
            boolean r7 = r6.canWrite()     // Catch:{ all -> 0x0065 }
            if (r7 == 0) goto L_0x0063
            r6.delete()     // Catch:{ all -> 0x0065 }
        L_0x0063:
            monitor-exit(r5)
            return
        L_0x0065:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.q.onDowngrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onUpgrade(android.database.sqlite.SQLiteDatabase r6, int r7, int r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "[Database] Upgrade %d to %d , drop tables!"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x005d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x005d }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x005d }
            r2 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x005d }
            r1[r2] = r4     // Catch:{ all -> 0x005d }
            com.tencent.bugly.proguard.x.d(r0, r1)     // Catch:{ all -> 0x005d }
            java.util.List<com.tencent.bugly.a> r0 = r5.f79507d     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0036
            java.util.List<com.tencent.bugly.a> r0 = r5.f79507d     // Catch:{ all -> 0x005d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x005d }
        L_0x0021:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x005d }
            com.tencent.bugly.a r1 = (com.tencent.bugly.a) r1     // Catch:{ all -> 0x005d }
            r1.onDbUpgrade(r6, r7, r8)     // Catch:{ Throwable -> 0x0031 }
            goto L_0x0021
        L_0x0031:
            r1 = move-exception
            com.tencent.bugly.proguard.x.b(r1)     // Catch:{ all -> 0x005d }
            goto L_0x0021
        L_0x0036:
            boolean r7 = r5.a(r6)     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0041
            r5.onCreate(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return
        L_0x0041:
            java.lang.String r6 = "[Database] Failed to drop, delete db."
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x005d }
            com.tencent.bugly.proguard.x.d(r6, r7)     // Catch:{ all -> 0x005d }
            android.content.Context r6 = r5.f79506c     // Catch:{ all -> 0x005d }
            java.lang.String r7 = f79504a     // Catch:{ all -> 0x005d }
            java.io.File r6 = r6.getDatabasePath(r7)     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x005b
            boolean r7 = r6.canWrite()     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x005b
            r6.delete()     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r5)
            return
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.q.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
