package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static p f79495a;

    /* renamed from: b  reason: collision with root package name */
    private static q f79496b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f79497c;

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private int f79498a;

        /* renamed from: b  reason: collision with root package name */
        private o f79499b;

        /* renamed from: c  reason: collision with root package name */
        private String f79500c;

        /* renamed from: d  reason: collision with root package name */
        private ContentValues f79501d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f79502e;

        /* renamed from: f  reason: collision with root package name */
        private String[] f79503f;
        private String g;
        private String[] h;
        private String i;
        private String j;
        private String k;
        private String l;
        private String m;
        private String[] n;
        private int o;
        private String p;
        private byte[] q;

        public final void run() {
            switch (this.f79498a) {
                case 1:
                    long unused = p.this.a(this.f79500c, this.f79501d, this.f79499b);
                    return;
                case 2:
                    int unused2 = p.this.a(this.f79500c, this.m, this.n, this.f79499b);
                    return;
                case 3:
                    Cursor unused3 = p.this.a(this.f79502e, this.f79500c, this.f79503f, this.g, this.h, this.i, this.j, this.k, this.l, this.f79499b);
                    return;
                case 4:
                    boolean unused4 = p.this.a(this.o, this.p, this.q, this.f79499b);
                    return;
                case 5:
                    Map unused5 = p.this.a(this.o, this.f79499b);
                    return;
                case 6:
                    boolean unused6 = p.this.a(this.o, this.p, this.f79499b);
                    break;
            }
        }

        public final void a(int i2, String str, byte[] bArr) {
            this.o = i2;
            this.p = str;
            this.q = bArr;
        }

        public a(int i2, o oVar) {
            this.f79498a = i2;
            this.f79499b = oVar;
        }

        public final void a(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
            this.f79502e = z;
            this.f79500c = str;
            this.f79503f = strArr;
            this.g = str2;
            this.h = strArr2;
            this.i = str3;
            this.j = str4;
            this.k = str5;
            this.l = str6;
        }
    }

    public final long a(String str, ContentValues contentValues, o oVar, boolean z) {
        return a(str, contentValues, (o) null);
    }

    public final Cursor a(String str, String[] strArr, String str2, String[] strArr2, o oVar, boolean z) {
        return a(false, str, strArr, str2, null, null, null, null, null, null);
    }

    public final int a(String str, String str2, String[] strArr, o oVar, boolean z) {
        return a(str, str2, (String[]) null, (o) null);
    }

    public final boolean a(int i, String str, byte[] bArr, o oVar, boolean z) {
        if (z) {
            return a(i, str, bArr, (o) null);
        }
        a aVar = new a(4, null);
        aVar.a(i, str, bArr);
        w.a().a(aVar);
        return true;
    }

    public final Map<String, byte[]> a(int i, o oVar, boolean z) {
        return a(i, (o) null);
    }

    public final boolean a(int i, String str, o oVar, boolean z) {
        return a(555, str, (o) null);
    }

    /* access modifiers changed from: private */
    public boolean a(int i, String str, byte[] bArr, o oVar) {
        try {
            r rVar = new r();
            rVar.f79508a = (long) i;
            rVar.f79513f = str;
            rVar.f79512e = System.currentTimeMillis();
            rVar.g = bArr;
            boolean b2 = b(rVar);
            if (oVar == null) {
                return b2;
            }
            Boolean.valueOf(b2);
            return b2;
        } catch (Throwable th) {
            if (oVar != null) {
                Boolean bool = Boolean.FALSE;
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(com.tencent.bugly.proguard.r r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            if (r8 != 0) goto L_0x0006
            monitor-exit(r7)
            return r0
        L_0x0006:
            com.tencent.bugly.proguard.q r1 = f79496b     // Catch:{ Throwable -> 0x0038 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Throwable -> 0x0038 }
            if (r1 == 0) goto L_0x0034
            android.content.ContentValues r2 = c((com.tencent.bugly.proguard.r) r8)     // Catch:{ Throwable -> 0x0038 }
            if (r2 == 0) goto L_0x0034
            java.lang.String r3 = "t_lr"
            java.lang.String r4 = "_id"
            long r1 = r1.replace(r3, r4, r2)     // Catch:{ Throwable -> 0x0038 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0032
            java.lang.String r3 = "[Database] insert %s success."
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0038 }
            java.lang.String r6 = "t_lr"
            r5[r0] = r6     // Catch:{ Throwable -> 0x0038 }
            com.tencent.bugly.proguard.x.c(r3, r5)     // Catch:{ Throwable -> 0x0038 }
            r8.f79508a = r1     // Catch:{ Throwable -> 0x0038 }
            monitor-exit(r7)
            return r4
        L_0x0032:
            monitor-exit(r7)
            return r0
        L_0x0034:
            monitor-exit(r7)
            return r0
        L_0x0036:
            r8 = move-exception
            goto L_0x003e
        L_0x0038:
            r8 = move-exception
            com.tencent.bugly.proguard.x.a(r8)     // Catch:{ all -> 0x0036 }
            monitor-exit(r7)
            return r0
        L_0x003e:
            throw r8     // Catch:{ all -> 0x003f }
        L_0x003f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.p.a(com.tencent.bugly.proguard.r):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a3 A[SYNTHETIC, Splitter:B:47:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa A[Catch:{ all -> 0x00a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.tencent.bugly.proguard.r> a(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.tencent.bugly.proguard.q r0 = f79496b     // Catch:{ all -> 0x00b0 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ all -> 0x00b0 }
            r9 = 0
            if (r0 == 0) goto L_0x00ae
            if (r11 < 0) goto L_0x0022
            java.lang.String r1 = "_tp = "
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Throwable -> 0x001d, all -> 0x0018 }
            java.lang.String r11 = r1.concat(r11)     // Catch:{ Throwable -> 0x001d, all -> 0x0018 }
            r4 = r11
            goto L_0x0023
        L_0x0018:
            r11 = move-exception
            r0 = r11
            r11 = r9
            goto L_0x00a8
        L_0x001d:
            r11 = move-exception
            r0 = r11
            r11 = r9
            goto L_0x009e
        L_0x0022:
            r4 = r9
        L_0x0023:
            java.lang.String r2 = "t_lr"
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x001d, all -> 0x0018 }
            if (r11 != 0) goto L_0x0038
            if (r11 == 0) goto L_0x0036
            r11.close()     // Catch:{ all -> 0x00b0 }
        L_0x0036:
            monitor-exit(r10)
            return r9
        L_0x0038:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x009d }
            r1.<init>()     // Catch:{ Throwable -> 0x009d }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x009d }
            r2.<init>()     // Catch:{ Throwable -> 0x009d }
        L_0x0042:
            boolean r3 = r11.moveToNext()     // Catch:{ Throwable -> 0x009d }
            r4 = 0
            if (r3 == 0) goto L_0x006e
            com.tencent.bugly.proguard.r r3 = a((android.database.Cursor) r11)     // Catch:{ Throwable -> 0x009d }
            if (r3 == 0) goto L_0x0053
            r2.add(r3)     // Catch:{ Throwable -> 0x009d }
            goto L_0x0042
        L_0x0053:
            java.lang.String r3 = "_id"
            int r3 = r11.getColumnIndex(r3)     // Catch:{ Throwable -> 0x0066 }
            long r5 = r11.getLong(r3)     // Catch:{ Throwable -> 0x0066 }
            java.lang.String r3 = " or _id = "
            r1.append(r3)     // Catch:{ Throwable -> 0x0066 }
            r1.append(r5)     // Catch:{ Throwable -> 0x0066 }
            goto L_0x0042
        L_0x0066:
            java.lang.String r3 = "[Database] unknown id."
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x009d }
            com.tencent.bugly.proguard.x.d(r3, r4)     // Catch:{ Throwable -> 0x009d }
            goto L_0x0042
        L_0x006e:
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x009d }
            int r3 = r1.length()     // Catch:{ Throwable -> 0x009d }
            if (r3 <= 0) goto L_0x0096
            r3 = 4
            java.lang.String r1 = r1.substring(r3)     // Catch:{ Throwable -> 0x009d }
            java.lang.String r3 = "t_lr"
            int r0 = r0.delete(r3, r1, r9)     // Catch:{ Throwable -> 0x009d }
            java.lang.String r1 = "[Database] deleted %s illegal data %d"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x009d }
            java.lang.String r5 = "t_lr"
            r3[r4] = r5     // Catch:{ Throwable -> 0x009d }
            r4 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x009d }
            r3[r4] = r0     // Catch:{ Throwable -> 0x009d }
            com.tencent.bugly.proguard.x.d(r1, r3)     // Catch:{ Throwable -> 0x009d }
        L_0x0096:
            if (r11 == 0) goto L_0x009b
            r11.close()     // Catch:{ all -> 0x00b0 }
        L_0x009b:
            monitor-exit(r10)
            return r2
        L_0x009d:
            r0 = move-exception
        L_0x009e:
            com.tencent.bugly.proguard.x.a(r0)     // Catch:{ all -> 0x00a7 }
            if (r11 == 0) goto L_0x00ae
            r11.close()     // Catch:{ all -> 0x00b0 }
            goto L_0x00ae
        L_0x00a7:
            r0 = move-exception
        L_0x00a8:
            if (r11 == 0) goto L_0x00ad
            r11.close()     // Catch:{ all -> 0x00b0 }
        L_0x00ad:
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00ae:
            monitor-exit(r10)
            return r9
        L_0x00b0:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.p.a(int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.List<com.tencent.bugly.proguard.r> r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x006f
            int r0 = r5.size()     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x000a
            goto L_0x006f
        L_0x000a:
            com.tencent.bugly.proguard.q r0 = f79496b     // Catch:{ all -> 0x006c }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x006a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r1.<init>()     // Catch:{ all -> 0x006c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x006c }
        L_0x001b:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x006c }
            com.tencent.bugly.proguard.r r2 = (com.tencent.bugly.proguard.r) r2     // Catch:{ all -> 0x006c }
            java.lang.String r3 = " or _id = "
            r1.append(r3)     // Catch:{ all -> 0x006c }
            long r2 = r2.f79508a     // Catch:{ all -> 0x006c }
            r1.append(r2)     // Catch:{ all -> 0x006c }
            goto L_0x001b
        L_0x0032:
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x006c }
            int r2 = r5.length()     // Catch:{ all -> 0x006c }
            if (r2 <= 0) goto L_0x0041
            r2 = 4
            java.lang.String r5 = r5.substring(r2)     // Catch:{ all -> 0x006c }
        L_0x0041:
            r2 = 0
            r1.setLength(r2)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "t_lr"
            r3 = 0
            int r5 = r0.delete(r1, r5, r3)     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r0 = "[Database] deleted %s data %d"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r3 = "t_lr"
            r1[r2] = r3     // Catch:{ Throwable -> 0x0063 }
            r2 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x0063 }
            r1[r2] = r5     // Catch:{ Throwable -> 0x0063 }
            com.tencent.bugly.proguard.x.c(r0, r1)     // Catch:{ Throwable -> 0x0063 }
            monitor-exit(r4)
            return
        L_0x0061:
            r5 = move-exception
            goto L_0x0069
        L_0x0063:
            r5 = move-exception
            com.tencent.bugly.proguard.x.a(r5)     // Catch:{ all -> 0x0061 }
            monitor-exit(r4)
            return
        L_0x0069:
            throw r5     // Catch:{ all -> 0x006c }
        L_0x006a:
            monitor-exit(r4)
            return
        L_0x006c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x006f:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.p.a(java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (r7 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r6 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x0055, B:17:0x005c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(int r5, java.lang.String r6, com.tencent.bugly.proguard.o r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            com.tencent.bugly.proguard.q r1 = f79496b     // Catch:{ Throwable -> 0x005b }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Throwable -> 0x005b }
            if (r1 == 0) goto L_0x0053
            boolean r2 = com.tencent.bugly.proguard.z.a((java.lang.String) r6)     // Catch:{ Throwable -> 0x005b }
            if (r2 == 0) goto L_0x001b
            java.lang.String r6 = "_id = "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x005b }
            java.lang.String r5 = r6.concat(r5)     // Catch:{ Throwable -> 0x005b }
            goto L_0x0036
        L_0x001b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x005b }
            java.lang.String r3 = "_id = "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x005b }
            r2.append(r5)     // Catch:{ Throwable -> 0x005b }
            java.lang.String r5 = " and _tp = \""
            r2.append(r5)     // Catch:{ Throwable -> 0x005b }
            r2.append(r6)     // Catch:{ Throwable -> 0x005b }
            java.lang.String r5 = "\""
            r2.append(r5)     // Catch:{ Throwable -> 0x005b }
            java.lang.String r5 = r2.toString()     // Catch:{ Throwable -> 0x005b }
        L_0x0036:
            java.lang.String r6 = "t_pf"
            r2 = 0
            int r5 = r1.delete(r6, r5, r2)     // Catch:{ Throwable -> 0x005b }
            java.lang.String r6 = "[Database] deleted %s data %d"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x005b }
            java.lang.String r2 = "t_pf"
            r1[r0] = r2     // Catch:{ Throwable -> 0x005b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x005b }
            r3 = 1
            r1[r3] = r2     // Catch:{ Throwable -> 0x005b }
            com.tencent.bugly.proguard.x.c(r6, r1)     // Catch:{ Throwable -> 0x005b }
            if (r5 <= 0) goto L_0x0053
            r0 = 1
        L_0x0053:
            if (r7 == 0) goto L_0x0063
            java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x006a }
            goto L_0x0063
        L_0x0059:
            r5 = move-exception
            goto L_0x0065
        L_0x005b:
            r5 = move-exception
            com.tencent.bugly.proguard.x.a(r5)     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x0063
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x006a }
        L_0x0063:
            monitor-exit(r4)
            return r0
        L_0x0065:
            if (r7 == 0) goto L_0x006c
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x006a }
            goto L_0x006c
        L_0x006a:
            r5 = move-exception
            goto L_0x006d
        L_0x006c:
            throw r5     // Catch:{ all -> 0x006a }
        L_0x006d:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.p.a(int, java.lang.String, com.tencent.bugly.proguard.o):boolean");
    }

    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            pVar = f79495a;
        }
        return pVar;
    }

    private static r b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            r rVar = new r();
            rVar.f79508a = cursor.getLong(cursor.getColumnIndex("_id"));
            rVar.f79512e = cursor.getLong(cursor.getColumnIndex("_tm"));
            rVar.f79513f = cursor.getString(cursor.getColumnIndex("_tp"));
            rVar.g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return rVar;
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean b(com.tencent.bugly.proguard.r r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            if (r8 != 0) goto L_0x0006
            monitor-exit(r7)
            return r0
        L_0x0006:
            com.tencent.bugly.proguard.q r1 = f79496b     // Catch:{ Throwable -> 0x0038 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Throwable -> 0x0038 }
            if (r1 == 0) goto L_0x0034
            android.content.ContentValues r2 = d(r8)     // Catch:{ Throwable -> 0x0038 }
            if (r2 == 0) goto L_0x0034
            java.lang.String r3 = "t_pf"
            java.lang.String r4 = "_id"
            long r1 = r1.replace(r3, r4, r2)     // Catch:{ Throwable -> 0x0038 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0032
            java.lang.String r3 = "[Database] insert %s success."
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0038 }
            java.lang.String r6 = "t_pf"
            r5[r0] = r6     // Catch:{ Throwable -> 0x0038 }
            com.tencent.bugly.proguard.x.c(r3, r5)     // Catch:{ Throwable -> 0x0038 }
            r8.f79508a = r1     // Catch:{ Throwable -> 0x0038 }
            monitor-exit(r7)
            return r4
        L_0x0032:
            monitor-exit(r7)
            return r0
        L_0x0034:
            monitor-exit(r7)
            return r0
        L_0x0036:
            r8 = move-exception
            goto L_0x003e
        L_0x0038:
            r8 = move-exception
            com.tencent.bugly.proguard.x.a(r8)     // Catch:{ all -> 0x0036 }
            monitor-exit(r7)
            return r0
        L_0x003e:
            throw r8     // Catch:{ all -> 0x003f }
        L_0x003f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.p.b(com.tencent.bugly.proguard.r):boolean");
    }

    private static ContentValues c(r rVar) {
        if (rVar == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            if (rVar.f79508a > 0) {
                contentValues.put("_id", Long.valueOf(rVar.f79508a));
            }
            contentValues.put("_tp", Integer.valueOf(rVar.f79509b));
            contentValues.put("_pc", rVar.f79510c);
            contentValues.put("_th", rVar.f79511d);
            contentValues.put("_tm", Long.valueOf(rVar.f79512e));
            if (rVar.g != null) {
                contentValues.put("_dt", rVar.g);
            }
            return contentValues;
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    private static ContentValues d(r rVar) {
        if (rVar == null || z.a(rVar.f79513f)) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            if (rVar.f79508a > 0) {
                contentValues.put("_id", Long.valueOf(rVar.f79508a));
            }
            contentValues.put("_tp", rVar.f79513f);
            contentValues.put("_tm", Long.valueOf(rVar.f79512e));
            if (rVar.g != null) {
                contentValues.put("_dt", rVar.g);
            }
            return contentValues;
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A[SYNTHETIC, Splitter:B:42:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7 A[SYNTHETIC, Splitter:B:48:0x00a7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.util.List<com.tencent.bugly.proguard.r> c(int r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            com.tencent.bugly.proguard.q r1 = f79496b     // Catch:{ Throwable -> 0x0098, all -> 0x0095 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Throwable -> 0x0098, all -> 0x0095 }
            if (r1 == 0) goto L_0x00a2
            java.lang.String r2 = "_id = "
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch:{ Throwable -> 0x0098, all -> 0x0095 }
            java.lang.String r10 = r2.concat(r3)     // Catch:{ Throwable -> 0x0098, all -> 0x0095 }
            java.lang.String r3 = "t_pf"
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r1
            r5 = r10
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0098, all -> 0x0095 }
            if (r2 != 0) goto L_0x002a
            if (r2 == 0) goto L_0x0028
            r2.close()     // Catch:{ all -> 0x00ab }
        L_0x0028:
            monitor-exit(r11)
            return r0
        L_0x002a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0093 }
            r3.<init>()     // Catch:{ Throwable -> 0x0093 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0093 }
            r4.<init>()     // Catch:{ Throwable -> 0x0093 }
        L_0x0034:
            boolean r5 = r2.moveToNext()     // Catch:{ Throwable -> 0x0093 }
            r6 = 0
            if (r5 == 0) goto L_0x0060
            com.tencent.bugly.proguard.r r5 = b((android.database.Cursor) r2)     // Catch:{ Throwable -> 0x0093 }
            if (r5 == 0) goto L_0x0045
            r4.add(r5)     // Catch:{ Throwable -> 0x0093 }
            goto L_0x0034
        L_0x0045:
            java.lang.String r5 = "_tp"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ Throwable -> 0x0058 }
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Throwable -> 0x0058 }
            java.lang.String r7 = " or _tp = "
            r3.append(r7)     // Catch:{ Throwable -> 0x0058 }
            r3.append(r5)     // Catch:{ Throwable -> 0x0058 }
            goto L_0x0034
        L_0x0058:
            java.lang.String r5 = "[Database] unknown id."
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0093 }
            com.tencent.bugly.proguard.x.d(r5, r6)     // Catch:{ Throwable -> 0x0093 }
            goto L_0x0034
        L_0x0060:
            int r5 = r3.length()     // Catch:{ Throwable -> 0x0093 }
            if (r5 <= 0) goto L_0x008c
            java.lang.String r5 = " and _id = "
            r3.append(r5)     // Catch:{ Throwable -> 0x0093 }
            r3.append(r12)     // Catch:{ Throwable -> 0x0093 }
            r12 = 4
            java.lang.String r12 = r10.substring(r12)     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r3 = "t_pf"
            int r12 = r1.delete(r3, r12, r0)     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r1 = "[Database] deleted %s illegal data %d."
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r5 = "t_pf"
            r3[r6] = r5     // Catch:{ Throwable -> 0x0093 }
            r5 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Throwable -> 0x0093 }
            r3[r5] = r12     // Catch:{ Throwable -> 0x0093 }
            com.tencent.bugly.proguard.x.d(r1, r3)     // Catch:{ Throwable -> 0x0093 }
        L_0x008c:
            if (r2 == 0) goto L_0x0091
            r2.close()     // Catch:{ all -> 0x00ab }
        L_0x0091:
            monitor-exit(r11)
            return r4
        L_0x0093:
            r12 = move-exception
            goto L_0x009a
        L_0x0095:
            r12 = move-exception
            r2 = r0
            goto L_0x00a5
        L_0x0098:
            r12 = move-exception
            r2 = r0
        L_0x009a:
            com.tencent.bugly.proguard.x.a(r12)     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x00a2
            r2.close()     // Catch:{ all -> 0x00ab }
        L_0x00a2:
            monitor-exit(r11)
            return r0
        L_0x00a4:
            r12 = move-exception
        L_0x00a5:
            if (r2 == 0) goto L_0x00ad
            r2.close()     // Catch:{ all -> 0x00ab }
            goto L_0x00ad
        L_0x00ab:
            r12 = move-exception
            goto L_0x00ae
        L_0x00ad:
            throw r12     // Catch:{ all -> 0x00ab }
        L_0x00ae:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.p.c(int):java.util.List");
    }

    public final synchronized void b(int i) {
        String str;
        SQLiteDatabase writableDatabase = f79496b.getWritableDatabase();
        if (writableDatabase != null) {
            if (i >= 0) {
                try {
                    str = "_tp = ".concat(String.valueOf(i));
                } catch (Throwable th) {
                    x.a(th);
                    return;
                }
            } else {
                str = null;
            }
            x.c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", str, null)));
            return;
        }
        return;
    }

    private static r a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            r rVar = new r();
            rVar.f79508a = cursor.getLong(cursor.getColumnIndex("_id"));
            rVar.f79509b = cursor.getInt(cursor.getColumnIndex("_tp"));
            rVar.f79510c = cursor.getString(cursor.getColumnIndex("_pc"));
            rVar.f79511d = cursor.getString(cursor.getColumnIndex("_th"));
            rVar.f79512e = cursor.getLong(cursor.getColumnIndex("_tm"));
            rVar.g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return rVar;
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    private p(Context context, List<com.tencent.bugly.a> list) {
        f79496b = new q(context, list);
    }

    public static synchronized p a(Context context, List<com.tencent.bugly.a> list) {
        p pVar;
        synchronized (p.class) {
            if (f79495a == null) {
                f79495a = new p(context, list);
            }
            pVar = f79495a;
        }
        return pVar;
    }

    /* access modifiers changed from: private */
    public Map<String, byte[]> a(int i, o oVar) {
        HashMap hashMap = null;
        try {
            List<r> c2 = c(i);
            if (c2 == null) {
                return null;
            }
            HashMap hashMap2 = new HashMap();
            try {
                for (r next : c2) {
                    byte[] bArr = next.g;
                    if (bArr != null) {
                        hashMap2.put(next.f79513f, bArr);
                    }
                }
                return hashMap2;
            } catch (Throwable th) {
                th = th;
                hashMap = hashMap2;
                x.a(th);
                return hashMap;
            }
        } catch (Throwable th2) {
            th = th2;
            x.a(th);
            return hashMap;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r9 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        java.lang.Long.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r9 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long a(java.lang.String r7, android.content.ContentValues r8, com.tencent.bugly.proguard.o r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            com.tencent.bugly.proguard.q r2 = f79496b     // Catch:{ Throwable -> 0x0035 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ Throwable -> 0x0035 }
            if (r2 == 0) goto L_0x002d
            if (r8 == 0) goto L_0x002d
            java.lang.String r3 = "_id"
            long r2 = r2.replace(r7, r3, r8)     // Catch:{ Throwable -> 0x0035 }
            r8 = 0
            r4 = 1
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x0023
            java.lang.String r5 = "[Database] insert %s success."
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0035 }
            r4[r8] = r7     // Catch:{ Throwable -> 0x0035 }
            com.tencent.bugly.proguard.x.c(r5, r4)     // Catch:{ Throwable -> 0x0035 }
            goto L_0x002c
        L_0x0023:
            java.lang.String r5 = "[Database] replace %s error."
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0035 }
            r4[r8] = r7     // Catch:{ Throwable -> 0x0035 }
            com.tencent.bugly.proguard.x.d(r5, r4)     // Catch:{ Throwable -> 0x0035 }
        L_0x002c:
            r0 = r2
        L_0x002d:
            if (r9 == 0) goto L_0x003c
        L_0x002f:
            java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x003c
        L_0x0033:
            r7 = move-exception
            goto L_0x003e
        L_0x0035:
            r7 = move-exception
            com.tencent.bugly.proguard.x.a(r7)     // Catch:{ all -> 0x0033 }
            if (r9 == 0) goto L_0x003c
            goto L_0x002f
        L_0x003c:
            monitor-exit(r6)
            return r0
        L_0x003e:
            if (r9 == 0) goto L_0x0046
            java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0046
        L_0x0044:
            r7 = move-exception
            goto L_0x0047
        L_0x0046:
            throw r7     // Catch:{ all -> 0x0044 }
        L_0x0047:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.p.a(java.lang.String, android.content.ContentValues, com.tencent.bugly.proguard.o):long");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r6 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r6 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int a(java.lang.String r3, java.lang.String r4, java.lang.String[] r5, com.tencent.bugly.proguard.o r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            com.tencent.bugly.proguard.q r1 = f79496b     // Catch:{ Throwable -> 0x0017 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Throwable -> 0x0017 }
            if (r1 == 0) goto L_0x000f
            int r3 = r1.delete(r3, r4, r5)     // Catch:{ Throwable -> 0x0017 }
            r0 = r3
        L_0x000f:
            if (r6 == 0) goto L_0x001e
        L_0x0011:
            java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0026 }
            goto L_0x001e
        L_0x0015:
            r3 = move-exception
            goto L_0x0020
        L_0x0017:
            r3 = move-exception
            com.tencent.bugly.proguard.x.a(r3)     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            monitor-exit(r2)
            return r0
        L_0x0020:
            if (r6 == 0) goto L_0x0028
            java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r3 = move-exception
            goto L_0x0029
        L_0x0028:
            throw r3     // Catch:{ all -> 0x0026 }
        L_0x0029:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.p.a(java.lang.String, java.lang.String, java.lang.String[], com.tencent.bugly.proguard.o):int");
    }

    /* access modifiers changed from: private */
    public synchronized Cursor a(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, o oVar) {
        Cursor cursor;
        cursor = null;
        try {
            SQLiteDatabase writableDatabase = f79496b.getWritableDatabase();
            if (writableDatabase != null) {
                cursor = writableDatabase.query(z, str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
        } catch (Throwable th) {
            x.a(th);
        }
        return cursor;
        try {
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
