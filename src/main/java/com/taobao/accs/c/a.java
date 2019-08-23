package com.taobao.accs.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.taobao.accs.utl.ALog;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class a extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f78895c;

    /* renamed from: e  reason: collision with root package name */
    private static final Lock f78896e = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public int f78897a;

    /* renamed from: b  reason: collision with root package name */
    LinkedList<C0848a> f78898b = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    private Context f78899d;

    /* renamed from: com.taobao.accs.c.a$a  reason: collision with other inner class name */
    class C0848a {

        /* renamed from: a  reason: collision with root package name */
        String f78900a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f78901b;

        private C0848a(String str, Object[] objArr) {
            this.f78900a = str;
            this.f78901b = objArr;
        }
    }

    public void a() {
        a("DELETE FROM traffic", null, true);
    }

    public SQLiteDatabase getWritableDatabase() {
        if (!com.taobao.accs.utl.a.a(super.getWritableDatabase().getPath(), 102400)) {
            return null;
        }
        return super.getWritableDatabase();
    }

    public static a a(Context context) {
        if (f78895c == null) {
            synchronized (a.class) {
                if (f78895c == null) {
                    f78895c = new a(context, "accs.db", null, 3);
                }
            }
        }
        return f78895c;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            if (f78896e.tryLock()) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS traffic(_id INTEGER PRIMARY KEY AUTOINCREMENT, date TEXT, host TEXT,serviceid TEXT, bid TEXT, isbackground TEXT, size TEXT)");
            }
        } finally {
            f78896e.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f4, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x001b, B:21:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:13:0x001b] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010a A[SYNTHETIC, Splitter:B:58:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.taobao.accs.ut.monitor.TrafficsMonitor.a> a(boolean r20) {
        /*
            r19 = this;
            monitor-enter(r19)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0115 }
            r1.<init>()     // Catch:{ all -> 0x0115 }
            r2 = 0
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r19.getWritableDatabase()     // Catch:{ Exception -> 0x00fa }
            if (r4 != 0) goto L_0x0010
            monitor-exit(r19)     // Catch:{ all -> 0x0115 }
            return r2
        L_0x0010:
            r0 = 7
            r13 = 6
            r14 = 5
            r12 = 4
            r11 = 3
            r10 = 2
            r9 = 1
            if (r20 == 0) goto L_0x0065
            java.lang.String r5 = "traffic"
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            java.lang.String r0 = "_id"
            r6[r3] = r0     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            java.lang.String r0 = "date"
            r6[r9] = r0     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            java.lang.String r0 = "host"
            r6[r10] = r0     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            java.lang.String r0 = "serviceid"
            r6[r11] = r0     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            java.lang.String r0 = "bid"
            r6[r12] = r0     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            java.lang.String r0 = "isbackground"
            r6[r14] = r0     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            java.lang.String r0 = "size"
            r6[r13] = r0     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            java.lang.String r7 = "date=?"
            java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            java.lang.String r0 = com.taobao.accs.utl.UtilityImpl.a((long) r15)     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            r8[r3] = r0     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            r0 = 0
            r15 = 0
            r16 = 0
            java.lang.String r17 = "100"
            r2 = 1
            r9 = r0
            r0 = 2
            r10 = r15
            r13 = 3
            r11 = r16
            r14 = 4
            r12 = r17
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0061, all -> 0x005d }
            r3 = 2
            goto L_0x0099
        L_0x005d:
            r0 = move-exception
            r4 = 0
            goto L_0x010f
        L_0x0061:
            r0 = move-exception
            r2 = 0
            goto L_0x00fc
        L_0x0065:
            r2 = 1
            r12 = 2
            r13 = 3
            r14 = 4
            java.lang.String r5 = "traffic"
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00f3, all -> 0x005d }
            java.lang.String r0 = "_id"
            r6[r3] = r0     // Catch:{ Exception -> 0x00f3, all -> 0x005d }
            java.lang.String r0 = "date"
            r6[r2] = r0     // Catch:{ Exception -> 0x00f3, all -> 0x005d }
            java.lang.String r0 = "host"
            r6[r12] = r0     // Catch:{ Exception -> 0x00f3, all -> 0x005d }
            java.lang.String r0 = "serviceid"
            r6[r13] = r0     // Catch:{ Exception -> 0x00f3, all -> 0x005d }
            java.lang.String r0 = "bid"
            r6[r14] = r0     // Catch:{ Exception -> 0x00f3, all -> 0x005d }
            java.lang.String r0 = "isbackground"
            r7 = 5
            r6[r7] = r0     // Catch:{ Exception -> 0x00f3, all -> 0x005d }
            java.lang.String r0 = "size"
            r7 = 6
            r6[r7] = r0     // Catch:{ Exception -> 0x00f3, all -> 0x005d }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r0 = "100"
            r3 = 2
            r12 = r0
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00f3, all -> 0x005d }
            r4 = r0
        L_0x0099:
            if (r4 != 0) goto L_0x00a3
            if (r4 == 0) goto L_0x00a0
            r4.close()     // Catch:{ all -> 0x0115 }
        L_0x00a0:
            monitor-exit(r19)     // Catch:{ all -> 0x0115 }
            r4 = 0
            return r4
        L_0x00a3:
            boolean r0 = r4.moveToFirst()     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            if (r0 == 0) goto L_0x00e9
        L_0x00a9:
            java.lang.String r6 = r4.getString(r2)     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            java.lang.String r10 = r4.getString(r3)     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            java.lang.String r8 = r4.getString(r13)     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            java.lang.String r7 = r4.getString(r14)     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            r0 = 5
            java.lang.String r5 = r4.getString(r0)     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            boolean r9 = r5.booleanValue()     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            r11 = 6
            long r15 = r4.getLong(r11)     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            if (r7 == 0) goto L_0x00e1
            r17 = 0
            int r5 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e1
            com.taobao.accs.ut.monitor.TrafficsMonitor$a r12 = new com.taobao.accs.ut.monitor.TrafficsMonitor$a     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            r5 = r12
            r0 = r12
            r17 = 6
            r11 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            r1.add(r0)     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            goto L_0x00e3
        L_0x00e1:
            r17 = 6
        L_0x00e3:
            boolean r0 = r4.moveToNext()     // Catch:{ Exception -> 0x00f1, all -> 0x00ef }
            if (r0 != 0) goto L_0x00a9
        L_0x00e9:
            if (r4 == 0) goto L_0x010d
            r4.close()     // Catch:{ all -> 0x0115 }
            goto L_0x010d
        L_0x00ef:
            r0 = move-exception
            goto L_0x010f
        L_0x00f1:
            r0 = move-exception
            goto L_0x00f5
        L_0x00f3:
            r0 = move-exception
            r4 = 0
        L_0x00f5:
            r2 = r4
            goto L_0x00fc
        L_0x00f7:
            r0 = move-exception
            r4 = r2
            goto L_0x010f
        L_0x00fa:
            r0 = move-exception
            r4 = r2
        L_0x00fc:
            java.lang.String r3 = "DBHelper"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f7 }
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00f7 }
            com.taobao.accs.utl.ALog.w(r3, r0, r4)     // Catch:{ all -> 0x00f7 }
            if (r2 == 0) goto L_0x010d
            r2.close()     // Catch:{ all -> 0x0115 }
        L_0x010d:
            monitor-exit(r19)     // Catch:{ all -> 0x0115 }
            return r1
        L_0x010f:
            if (r4 == 0) goto L_0x0114
            r4.close()     // Catch:{ all -> 0x0115 }
        L_0x0114:
            throw r0     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x0115 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.c.a.a(boolean):java.util.List");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS service");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS network");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ping");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS msg");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ack");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS election");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bindApp");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bindUser");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS traffic");
            onCreate(sQLiteDatabase);
        }
    }

    private synchronized void a(String str, Object[] objArr, boolean z) {
        SQLiteDatabase writableDatabase;
        this.f78898b.add(new C0848a(str, objArr));
        if (this.f78898b.size() > 5 || z) {
            try {
                writableDatabase = getWritableDatabase();
                if (writableDatabase != null) {
                    while (true) {
                        if (this.f78898b.size() > 0) {
                            C0848a removeFirst = this.f78898b.removeFirst();
                            if (removeFirst.f78901b != null) {
                                writableDatabase.execSQL(removeFirst.f78900a, removeFirst.f78901b);
                            } else {
                                writableDatabase.execSQL(removeFirst.f78900a);
                            }
                            if (removeFirst.f78900a.contains("INSERT")) {
                                this.f78897a++;
                                if (this.f78897a > 4000) {
                                    ALog.d("DBHelper", "db is full!", new Object[0]);
                                    onUpgrade(writableDatabase, 0, 1);
                                    this.f78897a = 0;
                                    break;
                                }
                            }
                        }
                    }
                    writableDatabase.close();
                } else {
                    return;
                }
            } catch (Exception e2) {
                ALog.d("DBHelper", e2.toString(), new Object[0]);
            } catch (Throwable th) {
                writableDatabase.close();
                throw th;
            }
        } else {
            return;
        }
    }

    private a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.f78899d = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c A[SYNTHETIC, Splitter:B:32:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083 A[SYNTHETIC, Splitter:B:37:0x0083] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean a(java.lang.String r15, java.lang.String r16, boolean r17, java.lang.String r18) {
        /*
            r14 = this;
            monitor-enter(r14)
            r1 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r14.getWritableDatabase()     // Catch:{ Exception -> 0x006e }
            if (r3 != 0) goto L_0x000b
            monitor-exit(r14)
            return r2
        L_0x000b:
            java.lang.String r4 = "traffic"
            r0 = 7
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ Exception -> 0x006e }
            java.lang.String r0 = "_id"
            r5[r2] = r0     // Catch:{ Exception -> 0x006e }
            java.lang.String r0 = "date"
            r12 = 1
            r5[r12] = r0     // Catch:{ Exception -> 0x006e }
            java.lang.String r0 = "host"
            r6 = 2
            r5[r6] = r0     // Catch:{ Exception -> 0x006e }
            java.lang.String r0 = "serviceid"
            r7 = 3
            r5[r7] = r0     // Catch:{ Exception -> 0x006e }
            java.lang.String r0 = "bid"
            r8 = 4
            r5[r8] = r0     // Catch:{ Exception -> 0x006e }
            r0 = 5
            java.lang.String r9 = "isbackground"
            r5[r0] = r9     // Catch:{ Exception -> 0x006e }
            r0 = 6
            java.lang.String r9 = "size"
            r5[r0] = r9     // Catch:{ Exception -> 0x006e }
            java.lang.String r0 = "date=? AND host=? AND bid=? AND isbackground=?"
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ Exception -> 0x006e }
            r8[r2] = r18     // Catch:{ Exception -> 0x006e }
            r8[r12] = r15     // Catch:{ Exception -> 0x006e }
            r8[r6] = r16     // Catch:{ Exception -> 0x006e }
            java.lang.String r6 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x006e }
            r8[r7] = r6     // Catch:{ Exception -> 0x006e }
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r13 = "100"
            r6 = r0
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r13
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x006e }
            if (r3 == 0) goto L_0x0066
            int r0 = r3.getCount()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r0 <= 0) goto L_0x0066
            if (r3 == 0) goto L_0x005e
            r3.close()     // Catch:{ all -> 0x0087 }
        L_0x005e:
            monitor-exit(r14)
            return r12
        L_0x0060:
            r0 = move-exception
            r1 = r3
            goto L_0x0081
        L_0x0063:
            r0 = move-exception
            r1 = r3
            goto L_0x006f
        L_0x0066:
            if (r3 == 0) goto L_0x007f
            r3.close()     // Catch:{ all -> 0x0087 }
            goto L_0x007f
        L_0x006c:
            r0 = move-exception
            goto L_0x0081
        L_0x006e:
            r0 = move-exception
        L_0x006f:
            java.lang.String r3 = "DBHelper"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006c }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x006c }
            com.taobao.accs.utl.ALog.w(r3, r0, r4)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x007f
            r1.close()     // Catch:{ all -> 0x0087 }
        L_0x007f:
            monitor-exit(r14)
            return r2
        L_0x0081:
            if (r1 == 0) goto L_0x0089
            r1.close()     // Catch:{ all -> 0x0087 }
            goto L_0x0089
        L_0x0087:
            r0 = move-exception
            goto L_0x008a
        L_0x0089:
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x008a:
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.c.a.a(java.lang.String, java.lang.String, boolean, java.lang.String):boolean");
    }

    public void a(String str, String str2, String str3, boolean z, long j, String str4) {
        if (!a(str, str3, z, str4)) {
            a("INSERT INTO traffic VALUES(null,?,?,?,?,?,?)", new Object[]{str4, str, str2, str3, String.valueOf(z), Long.valueOf(j)}, true);
            return;
        }
        a("UPDATE traffic SET size=? WHERE date=? AND host=? AND bid=? AND isbackground=?", new Object[]{Long.valueOf(j), str4, str, str3, String.valueOf(z)}, true);
    }
}
