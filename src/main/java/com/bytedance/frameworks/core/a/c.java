package com.bytedance.frameworks.core.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.frameworks.core.a.b.e;
import java.util.HashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static long f19922a = 40000;

    /* renamed from: b  reason: collision with root package name */
    static final String[] f19923b = {"_id", "version_id", "data"};

    /* renamed from: c  reason: collision with root package name */
    static final String[] f19924c = {"_id", "type", "version_id", "data"};

    /* renamed from: d  reason: collision with root package name */
    static final String[] f19925d = {"_id", "version_code", "version_name", "manifest_version_code", "update_version_code"};
    private static HashMap<String, c> h = new HashMap<>();
    private static final Object i = new Object();
    private static String j = "SELECT count(*) from local_monitor_log WHERE is_sampled = 1";
    private static String k = "SELECT count(*) FROM local_monitor_log";

    /* renamed from: e  reason: collision with root package name */
    SQLiteDatabase f19926e;

    /* renamed from: f  reason: collision with root package name */
    public String f19927f;
    private volatile long g = -1;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:37|38|39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009f, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0094 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0095 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.List<com.bytedance.frameworks.core.a.b.d> r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            android.database.sqlite.SQLiteDatabase r0 = r6.f19926e     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x009e
            int r0 = r7.size()     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x000d
            goto L_0x009e
        L_0x000d:
            int r0 = r7.size()     // Catch:{ all -> 0x00a0 }
            long r0 = (long) r0     // Catch:{ all -> 0x00a0 }
            r6.c(r0)     // Catch:{ all -> 0x00a0 }
            android.database.sqlite.SQLiteDatabase r0 = r6.f19926e     // Catch:{ all -> 0x00a0 }
            r0.beginTransaction()     // Catch:{ all -> 0x00a0 }
            java.util.Iterator r0 = r7.iterator()     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            java.lang.String r1 = "INSERT INTO local_monitor_log(type, type2, create_time, version_id, data, is_sampled) VALUES ( ?, ?, ?, ?, ?, ?)"
            android.database.sqlite.SQLiteDatabase r2 = r6.f19926e     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            android.database.sqlite.SQLiteStatement r1 = r2.compileStatement(r1)     // Catch:{ Exception -> 0x0095, all -> 0x008e }
        L_0x0026:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            if (r2 == 0) goto L_0x0076
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            com.bytedance.frameworks.core.a.b.d r2 = (com.bytedance.frameworks.core.a.b.d) r2     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            r3 = 1
            java.lang.String r4 = r2.f19903b     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            if (r4 != 0) goto L_0x003a
            java.lang.String r4 = ""
            goto L_0x003c
        L_0x003a:
            java.lang.String r4 = r2.f19903b     // Catch:{ Exception -> 0x0095, all -> 0x008e }
        L_0x003c:
            r1.bindString(r3, r4)     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            r3 = 2
            java.lang.String r4 = r2.f19904c     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = ""
            goto L_0x0049
        L_0x0047:
            java.lang.String r4 = r2.f19904c     // Catch:{ Exception -> 0x0095, all -> 0x008e }
        L_0x0049:
            r1.bindString(r3, r4)     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            r3 = 3
            long r4 = r2.f19907f     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            r1.bindLong(r3, r4)     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            r3 = 4
            long r4 = r2.f19906e     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            r1.bindLong(r3, r4)     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            r3 = 5
            java.lang.String r4 = r2.f19905d     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            if (r4 != 0) goto L_0x0060
            java.lang.String r4 = ""
            goto L_0x0062
        L_0x0060:
            java.lang.String r4 = r2.f19905d     // Catch:{ Exception -> 0x0095, all -> 0x008e }
        L_0x0062:
            r1.bindString(r3, r4)     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            r3 = 6
            boolean r2 = r2.g     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            if (r2 == 0) goto L_0x006d
            r4 = 1
            goto L_0x006f
        L_0x006d:
            r4 = 0
        L_0x006f:
            r1.bindLong(r3, r4)     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            r1.executeInsert()     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            goto L_0x0026
        L_0x0076:
            android.database.sqlite.SQLiteDatabase r0 = r6.f19926e     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            long r0 = r6.g     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            int r7 = r7.size()     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            long r2 = (long) r7     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            long r0 = r0 + r2
            r6.g = r0     // Catch:{ Exception -> 0x0095, all -> 0x008e }
            android.database.sqlite.SQLiteDatabase r7 = r6.f19926e     // Catch:{ Exception -> 0x008c }
            r7.endTransaction()     // Catch:{ Exception -> 0x008c }
            monitor-exit(r6)
            return
        L_0x008c:
            monitor-exit(r6)
            return
        L_0x008e:
            r7 = move-exception
            android.database.sqlite.SQLiteDatabase r0 = r6.f19926e     // Catch:{ Exception -> 0x0094 }
            r0.endTransaction()     // Catch:{ Exception -> 0x0094 }
        L_0x0094:
            throw r7     // Catch:{ all -> 0x00a0 }
        L_0x0095:
            android.database.sqlite.SQLiteDatabase r7 = r6.f19926e     // Catch:{ Exception -> 0x009c }
            r7.endTransaction()     // Catch:{ Exception -> 0x009c }
            monitor-exit(r6)
            return
        L_0x009c:
            monitor-exit(r6)
            return
        L_0x009e:
            monitor-exit(r6)
            return
        L_0x00a0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.a(java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d A[Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096 A[SYNTHETIC, Splitter:B:27:0x0096] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.bytedance.frameworks.core.a.b.d> a(java.util.List<java.lang.String> r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            monitor-enter(r16)
            android.database.sqlite.SQLiteDatabase r2 = r1.f19926e     // Catch:{ all -> 0x00d5 }
            if (r2 != 0) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00d5 }
            monitor-exit(r16)
            return r0
        L_0x000f:
            r2 = 0
            java.lang.String r3 = "is_sampled = ? "
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0063
            int r6 = r17.size()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            if (r6 <= 0) goto L_0x0063
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            r6.<init>()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            r6.append(r3)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            java.lang.String r3 = " AND type IN ( "
            r6.append(r3)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            java.lang.String r3 = ","
            int r7 = r17.size()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            java.lang.String r8 = "?"
            java.util.List r7 = java.util.Collections.nCopies(r7, r8)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            java.lang.String r3 = android.text.TextUtils.join(r3, r7)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            r6.append(r3)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            java.lang.String r3 = " ) "
            r6.append(r3)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            java.lang.String r3 = r6.toString()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            int r6 = r17.size()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            int r6 = r6 + r5
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            java.lang.String r7 = "1"
            r6[r4] = r7     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            r7 = 0
        L_0x0051:
            int r8 = r17.size()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            if (r7 >= r8) goto L_0x0069
            int r8 = r7 + 1
            java.lang.Object r7 = r0.get(r7)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            r6[r8] = r7     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            r7 = r8
            goto L_0x0051
        L_0x0063:
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            java.lang.String r0 = "1"
            r6[r4] = r0     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
        L_0x0069:
            r10 = r3
            r11 = r6
            android.database.sqlite.SQLiteDatabase r7 = r1.f19926e     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            java.lang.String r8 = "local_monitor_log"
            java.lang.String[] r9 = f19924c     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            r12 = 0
            r13 = 0
            java.lang.String r14 = "_id ASC "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            r0.<init>()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            r3 = r18
            r0.append(r3)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            java.lang.String r15 = r0.toString()     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            android.database.Cursor r3 = r7.query(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x00cc, all -> 0x00c7 }
            int r0 = r3.getCount()     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            if (r0 != 0) goto L_0x0096
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            a((android.database.Cursor) r3)     // Catch:{ all -> 0x00d5 }
            monitor-exit(r16)
            return r0
        L_0x0096:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            r0.<init>()     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
        L_0x009b:
            boolean r2 = r3.moveToNext()     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            if (r2 == 0) goto L_0x00bd
            long r7 = r3.getLong(r4)     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            java.lang.String r9 = r3.getString(r5)     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            r2 = 2
            long r10 = r3.getLong(r2)     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            r2 = 3
            java.lang.String r12 = r3.getString(r2)     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            com.bytedance.frameworks.core.a.b.d r2 = new com.bytedance.frameworks.core.a.b.d     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            r6 = r2
            r6.<init>(r7, r9, r10, r12)     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            r0.add(r2)     // Catch:{ Throwable -> 0x00c5, all -> 0x00c2 }
            goto L_0x009b
        L_0x00bd:
            a((android.database.Cursor) r3)     // Catch:{ all -> 0x00d5 }
            monitor-exit(r16)
            return r0
        L_0x00c2:
            r0 = move-exception
            r2 = r3
            goto L_0x00c8
        L_0x00c5:
            r2 = r3
            goto L_0x00cc
        L_0x00c7:
            r0 = move-exception
        L_0x00c8:
            a((android.database.Cursor) r2)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00cc:
            a((android.database.Cursor) r2)     // Catch:{ all -> 0x00d5 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00d5 }
            monitor-exit(r16)
            return r0
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.a(java.util.List, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.database.sqlite.SQLiteDatabase r0 = r3.f19926e     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0023
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x000c
            goto L_0x0023
        L_0x000c:
            java.lang.String r0 = "create_time< ? "
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0021 }
            r2 = 0
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0021 }
            r1[r2] = r4     // Catch:{ Exception -> 0x0021 }
            android.database.sqlite.SQLiteDatabase r4 = r3.f19926e     // Catch:{ Exception -> 0x0021 }
            java.lang.String r5 = "local_monitor_log"
            r4.delete(r5, r0, r1)     // Catch:{ Exception -> 0x0021 }
            monitor-exit(r3)
            return
        L_0x0021:
            monitor-exit(r3)
            return
        L_0x0023:
            monitor-exit(r3)
            return
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.a(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void d() {
        /*
            r11 = this;
            monitor-enter(r11)
            android.database.sqlite.SQLiteDatabase r0 = r11.f19926e     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r11)
            return
        L_0x0007:
            android.database.sqlite.SQLiteDatabase r1 = r11.f19926e     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "local_monitor_log"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = "version_id"
            r10 = 0
            r3[r10] = r0     // Catch:{ all -> 0x0030 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "_id ASC "
            java.lang.String r9 = "1"
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x002e
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            long r0 = r0.getLong(r10)     // Catch:{ all -> 0x0030 }
            r11.e(r0)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r11)
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003b, code lost:
        return -1;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0031=Splitter:B:23:0x0031, B:14:0x0025=Splitter:B:14:0x0025} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long b() {
        /*
            r6 = this;
            monitor-enter(r6)
            android.database.sqlite.SQLiteDatabase r0 = r6.f19926e     // Catch:{ all -> 0x003c }
            r1 = -1
            if (r0 == 0) goto L_0x003a
            android.database.sqlite.SQLiteDatabase r0 = r6.f19926e     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0010
            goto L_0x003a
        L_0x0010:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r3 = r6.f19926e     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            java.lang.String r4 = k     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            android.database.Cursor r3 = r3.rawQuery(r4, r0)     // Catch:{ Exception -> 0x0035, all -> 0x0030 }
            boolean r0 = r3.moveToNext()     // Catch:{ Exception -> 0x002e, all -> 0x002a }
            if (r0 == 0) goto L_0x0025
            r0 = 0
            long r4 = r3.getLong(r0)     // Catch:{ Exception -> 0x002e, all -> 0x002a }
            r1 = r4
        L_0x0025:
            a((android.database.Cursor) r3)     // Catch:{ all -> 0x003c }
            monitor-exit(r6)
            return r1
        L_0x002a:
            r0 = move-exception
            r1 = r0
            r0 = r3
            goto L_0x0031
        L_0x002e:
            r0 = r3
            goto L_0x0035
        L_0x0030:
            r1 = move-exception
        L_0x0031:
            a((android.database.Cursor) r0)     // Catch:{ all -> 0x003c }
            throw r1     // Catch:{ all -> 0x003c }
        L_0x0035:
            a((android.database.Cursor) r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r6)
            return r1
        L_0x003a:
            monitor-exit(r6)
            return r1
        L_0x003c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.b():long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bytedance.frameworks.core.a.b.e c() {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            java.lang.String r8 = "_id DESC"
            android.database.sqlite.SQLiteDatabase r1 = r11.f19926e     // Catch:{ Throwable -> 0x0057, all -> 0x004f }
            java.lang.String r2 = "local_monitor_version"
            java.lang.String[] r3 = f19925d     // Catch:{ Throwable -> 0x0057, all -> 0x004f }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r9 = "1"
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0057, all -> 0x004f }
            int r2 = r1.getCount()     // Catch:{ Throwable -> 0x0049, all -> 0x004d }
            if (r2 != 0) goto L_0x001f
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x005b }
            monitor-exit(r11)
            return r0
        L_0x001f:
            boolean r2 = r1.moveToNext()     // Catch:{ Throwable -> 0x0049, all -> 0x004d }
            if (r2 == 0) goto L_0x0049
            r2 = 0
            long r4 = r1.getLong(r2)     // Catch:{ Throwable -> 0x0049, all -> 0x004d }
            r2 = 1
            java.lang.String r6 = r1.getString(r2)     // Catch:{ Throwable -> 0x0049, all -> 0x004d }
            r2 = 2
            java.lang.String r7 = r1.getString(r2)     // Catch:{ Throwable -> 0x0049, all -> 0x004d }
            r2 = 3
            java.lang.String r8 = r1.getString(r2)     // Catch:{ Throwable -> 0x0049, all -> 0x004d }
            r2 = 4
            java.lang.String r9 = r1.getString(r2)     // Catch:{ Throwable -> 0x0049, all -> 0x004d }
            com.bytedance.frameworks.core.a.b.e r2 = new com.bytedance.frameworks.core.a.b.e     // Catch:{ Throwable -> 0x0049, all -> 0x004d }
            r3 = r2
            r3.<init>(r4, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0049, all -> 0x004d }
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x005b }
            monitor-exit(r11)
            return r2
        L_0x0049:
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x004d:
            r0 = move-exception
            goto L_0x0053
        L_0x004f:
            r1 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
        L_0x0053:
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x0057:
            r1 = r0
            goto L_0x0049
        L_0x0059:
            monitor-exit(r11)
            return r0
        L_0x005b:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.c():com.bytedance.frameworks.core.a.b.e");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a() {
        /*
            r6 = this;
            monitor-enter(r6)
            android.database.sqlite.SQLiteDatabase r0 = r6.f19926e     // Catch:{ all -> 0x003b }
            r1 = -1
            if (r0 == 0) goto L_0x0039
            android.database.sqlite.SQLiteDatabase r0 = r6.f19926e     // Catch:{ all -> 0x003b }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0010
            goto L_0x0039
        L_0x0010:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r3 = r6.f19926e     // Catch:{ Exception -> 0x0034, all -> 0x002f }
            java.lang.String r4 = j     // Catch:{ Exception -> 0x0034, all -> 0x002f }
            android.database.Cursor r3 = r3.rawQuery(r4, r0)     // Catch:{ Exception -> 0x0034, all -> 0x002f }
            boolean r0 = r3.moveToNext()     // Catch:{ Exception -> 0x002d, all -> 0x0029 }
            if (r0 == 0) goto L_0x0025
            r0 = 0
            long r4 = r3.getLong(r0)     // Catch:{ Exception -> 0x002d, all -> 0x0029 }
            r1 = r4
        L_0x0025:
            a((android.database.Cursor) r3)     // Catch:{ all -> 0x003b }
            goto L_0x0037
        L_0x0029:
            r0 = move-exception
            r1 = r0
            r0 = r3
            goto L_0x0030
        L_0x002d:
            r0 = r3
            goto L_0x0034
        L_0x002f:
            r1 = move-exception
        L_0x0030:
            a((android.database.Cursor) r0)     // Catch:{ all -> 0x003b }
            throw r1     // Catch:{ all -> 0x003b }
        L_0x0034:
            a((android.database.Cursor) r0)     // Catch:{ all -> 0x003b }
        L_0x0037:
            monitor-exit(r6)
            return r1
        L_0x0039:
            monitor-exit(r6)
            return r1
        L_0x003b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.a():long");
    }

    private static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized long a(e eVar) {
        if (this.f19926e != null) {
            if (eVar != null) {
                return a(eVar.f19909b, eVar.f19910c, eVar.f19911d, eVar.f19912e);
            }
        }
        return -1;
    }

    private synchronized void c(long j2) {
        if (this.g <= 0) {
            this.g = b();
        }
        if (this.g + j2 >= f19922a) {
            d(1000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void e(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.database.sqlite.SQLiteDatabase r0 = r3.f19926e     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0023
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x000c
            goto L_0x0023
        L_0x000c:
            java.lang.String r0 = "_id< ? "
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0021 }
            r2 = 0
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0021 }
            r1[r2] = r4     // Catch:{ Exception -> 0x0021 }
            android.database.sqlite.SQLiteDatabase r4 = r3.f19926e     // Catch:{ Exception -> 0x0021 }
            java.lang.String r5 = "local_monitor_version"
            r4.delete(r5, r0, r1)     // Catch:{ Exception -> 0x0021 }
            monitor-exit(r3)
            return
        L_0x0021:
            monitor-exit(r3)
            return
        L_0x0023:
            monitor-exit(r3)
            return
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.e(long):void");
    }

    private synchronized void d(long j2) {
        if (this.f19926e != null) {
            try {
                this.f19926e.execSQL(" DELETE FROM local_monitor_log WHERE _id IN (SELECT _id FROM local_monitor_log ORDER BY _id ASC LIMIT " + 1000 + ")");
                this.g = this.g - 1000;
                d();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r0 = r4.f19926e     // Catch:{ all -> 0x002a }
            r1 = -1
            if (r0 == 0) goto L_0x0028
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x000d
            goto L_0x0028
        L_0x000d:
            android.database.sqlite.SQLiteDatabase r0 = r4.f19926e     // Catch:{ Exception -> 0x0026 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0026 }
            java.lang.String r3 = "delete from local_monitor_log where _id in ( "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0026 }
            r2.append(r5)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r5 = " )"
            r2.append(r5)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x0026 }
            r0.execSQL(r5)     // Catch:{ Exception -> 0x0026 }
            r1 = 1
        L_0x0026:
            monitor-exit(r4)
            return r1
        L_0x0028:
            monitor-exit(r4)
            return r1
        L_0x002a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.a(java.lang.String):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bytedance.frameworks.core.a.b.e b(long r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            java.lang.String r8 = "_id DESC"
            android.database.sqlite.SQLiteDatabase r1 = r11.f19926e     // Catch:{ Throwable -> 0x005d, all -> 0x0058 }
            java.lang.String r2 = "local_monitor_version"
            java.lang.String[] r3 = f19925d     // Catch:{ Throwable -> 0x005d, all -> 0x0058 }
            java.lang.String r4 = " _id = ?"
            r10 = 1
            java.lang.String[] r5 = new java.lang.String[r10]     // Catch:{ Throwable -> 0x005d, all -> 0x0058 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Throwable -> 0x005d, all -> 0x0058 }
            r13 = 0
            r5[r13] = r12     // Catch:{ Throwable -> 0x005d, all -> 0x0058 }
            r6 = 0
            r7 = 0
            java.lang.String r9 = "1"
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x005d, all -> 0x0058 }
            int r1 = r12.getCount()     // Catch:{ Throwable -> 0x0051, all -> 0x0055 }
            if (r1 != 0) goto L_0x0029
            a((android.database.Cursor) r12)     // Catch:{ all -> 0x0061 }
            monitor-exit(r11)
            return r0
        L_0x0029:
            boolean r1 = r12.moveToNext()     // Catch:{ Throwable -> 0x0051, all -> 0x0055 }
            if (r1 == 0) goto L_0x0051
            long r3 = r12.getLong(r13)     // Catch:{ Throwable -> 0x0051, all -> 0x0055 }
            java.lang.String r5 = r12.getString(r10)     // Catch:{ Throwable -> 0x0051, all -> 0x0055 }
            r13 = 2
            java.lang.String r6 = r12.getString(r13)     // Catch:{ Throwable -> 0x0051, all -> 0x0055 }
            r13 = 3
            java.lang.String r7 = r12.getString(r13)     // Catch:{ Throwable -> 0x0051, all -> 0x0055 }
            r13 = 4
            java.lang.String r8 = r12.getString(r13)     // Catch:{ Throwable -> 0x0051, all -> 0x0055 }
            com.bytedance.frameworks.core.a.b.e r13 = new com.bytedance.frameworks.core.a.b.e     // Catch:{ Throwable -> 0x0051, all -> 0x0055 }
            r2 = r13
            r2.<init>(r3, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0051, all -> 0x0055 }
            a((android.database.Cursor) r12)     // Catch:{ all -> 0x0061 }
            monitor-exit(r11)
            return r13
        L_0x0051:
            a((android.database.Cursor) r12)     // Catch:{ all -> 0x0061 }
            goto L_0x005f
        L_0x0055:
            r13 = move-exception
            r0 = r12
            goto L_0x0059
        L_0x0058:
            r13 = move-exception
        L_0x0059:
            a((android.database.Cursor) r0)     // Catch:{ all -> 0x0061 }
            throw r13     // Catch:{ all -> 0x0061 }
        L_0x005d:
            r12 = r0
            goto L_0x0051
        L_0x005f:
            monitor-exit(r11)
            return r0
        L_0x0061:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.b(long):com.bytedance.frameworks.core.a.b.e");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(com.bytedance.frameworks.core.a.b.d r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            android.database.sqlite.SQLiteDatabase r0 = r9.f19926e     // Catch:{ all -> 0x0063 }
            r1 = -1
            if (r0 == 0) goto L_0x0061
            if (r10 != 0) goto L_0x000a
            goto L_0x0061
        L_0x000a:
            r3 = 1
            r9.c(r3)     // Catch:{ Exception -> 0x005f }
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x005f }
            r0.<init>()     // Catch:{ Exception -> 0x005f }
            java.lang.String r5 = "type"
            java.lang.String r6 = r10.f19903b     // Catch:{ Exception -> 0x005f }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x005f }
            java.lang.String r5 = "type2"
            java.lang.String r6 = r10.f19904c     // Catch:{ Exception -> 0x005f }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x005f }
            java.lang.String r5 = "create_time"
            long r6 = r10.f19907f     // Catch:{ Exception -> 0x005f }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x005f }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x005f }
            java.lang.String r5 = "version_id"
            long r6 = r10.f19906e     // Catch:{ Exception -> 0x005f }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x005f }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x005f }
            java.lang.String r5 = "data"
            java.lang.String r6 = r10.f19905d     // Catch:{ Exception -> 0x005f }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x005f }
            java.lang.String r5 = "is_sampled"
            boolean r10 = r10.g     // Catch:{ Exception -> 0x005f }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x005f }
            r0.put(r5, r10)     // Catch:{ Exception -> 0x005f }
            android.database.sqlite.SQLiteDatabase r10 = r9.f19926e     // Catch:{ Exception -> 0x005f }
            java.lang.String r5 = "local_monitor_log"
            r6 = 0
            long r5 = r10.insert(r5, r6, r0)     // Catch:{ Exception -> 0x005f }
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x005d
            long r7 = r9.g     // Catch:{ Exception -> 0x005f }
            r10 = 0
            long r7 = r7 + r3
            r9.g = r7     // Catch:{ Exception -> 0x005f }
        L_0x005d:
            monitor-exit(r9)
            return r5
        L_0x005f:
            monitor-exit(r9)
            return r1
        L_0x0061:
            monitor-exit(r9)
            return r1
        L_0x0063:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.a(com.bytedance.frameworks.core.a.b.d):long");
    }

    public c(Context context, String str) {
        try {
            a aVar = new a(context, str);
            this.f19927f = str;
            this.f19926e = aVar.getWritableDatabase();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        return -1;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0036=Splitter:B:14:0x0036, B:21:0x003f=Splitter:B:21:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(long r6, long r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            android.database.sqlite.SQLiteDatabase r0 = r5.f19926e     // Catch:{ all -> 0x004b }
            r1 = -1
            if (r0 == 0) goto L_0x0049
            android.database.sqlite.SQLiteDatabase r0 = r5.f19926e     // Catch:{ all -> 0x004b }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0010
            goto L_0x0049
        L_0x0010:
            r0 = 0
            java.lang.String r3 = "SELECT count(*) FROM local_monitor_log WHERE create_time >= ? AND create_time <= ?"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            r7 = 0
            r4[r7] = r6     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            r6 = 1
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            r4[r6] = r8     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            android.database.sqlite.SQLiteDatabase r6 = r5.f19926e     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            android.database.Cursor r6 = r6.rawQuery(r3, r4)     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            boolean r8 = r6.moveToNext()     // Catch:{ Exception -> 0x0044, all -> 0x003b }
            if (r8 == 0) goto L_0x0035
            long r7 = r6.getLong(r7)     // Catch:{ Exception -> 0x0044, all -> 0x003b }
            goto L_0x0036
        L_0x0035:
            r7 = r1
        L_0x0036:
            a((android.database.Cursor) r6)     // Catch:{ all -> 0x004b }
            monitor-exit(r5)
            return r7
        L_0x003b:
            r7 = move-exception
            r0 = r6
            goto L_0x003f
        L_0x003e:
            r7 = move-exception
        L_0x003f:
            a((android.database.Cursor) r0)     // Catch:{ all -> 0x004b }
            throw r7     // Catch:{ all -> 0x004b }
        L_0x0043:
            r6 = r0
        L_0x0044:
            a((android.database.Cursor) r6)     // Catch:{ all -> 0x004b }
            monitor-exit(r5)
            return r1
        L_0x0049:
            monitor-exit(r5)
            return r1
        L_0x004b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.a(long, long):long");
    }

    private synchronized long a(String str, String str2, String str3, String str4) {
        if (this.f19926e == null) {
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("version_code", str);
            contentValues.put("version_name", str2);
            contentValues.put("manifest_version_code", str3);
            contentValues.put("update_version_code", str4);
            return this.f19926e.insert("local_monitor_version", null, contentValues);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093 A[Catch:{ Throwable -> 0x00ce, all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c A[SYNTHETIC, Splitter:B:27:0x009c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.bytedance.frameworks.core.a.b.d> a(long r18, long r20, java.util.List<java.lang.String> r22, java.lang.String r23) {
        /*
            r17 = this;
            r1 = r17
            r0 = r22
            monitor-enter(r17)
            android.database.sqlite.SQLiteDatabase r2 = r1.f19926e     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00de }
            monitor-exit(r17)
            return r0
        L_0x000f:
            r2 = 0
            java.lang.String r3 = "create_time >=? AND create_time <=? "
            r4 = 1
            r5 = 0
            r6 = 2
            if (r0 == 0) goto L_0x006d
            int r7 = r22.size()     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            if (r7 <= 0) goto L_0x006d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            r7.<init>()     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            r7.append(r3)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r3 = " AND type2 IN ( "
            r7.append(r3)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r3 = ","
            int r8 = r22.size()     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r9 = "?"
            java.util.List r8 = java.util.Collections.nCopies(r8, r9)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r3 = android.text.TextUtils.join(r3, r8)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            r7.append(r3)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r3 = " )"
            r7.append(r3)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r3 = r7.toString()     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            int r7 = r22.size()     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            int r7 = r7 + r6
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r8 = java.lang.String.valueOf(r18)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            r7[r5] = r8     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r8 = java.lang.String.valueOf(r20)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            r7[r4] = r8     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            r8 = 0
        L_0x005a:
            int r9 = r22.size()     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            if (r8 >= r9) goto L_0x007b
            int r9 = r8 + 2
            java.lang.Object r10 = r0.get(r8)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            r7[r9] = r10     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            int r8 = r8 + 1
            goto L_0x005a
        L_0x006d:
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            r7[r5] = r0     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r0 = java.lang.String.valueOf(r20)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            r7[r4] = r0     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
        L_0x007b:
            r11 = r3
            r12 = r7
            android.database.sqlite.SQLiteDatabase r8 = r1.f19926e     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            java.lang.String r9 = "local_monitor_log"
            java.lang.String[] r10 = f19923b     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            r13 = 0
            r14 = 0
            java.lang.String r15 = "_id ASC "
            r16 = r23
            android.database.Cursor r3 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Throwable -> 0x00d5, all -> 0x00d0 }
            int r0 = r3.getCount()     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            if (r0 != 0) goto L_0x009c
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            a((android.database.Cursor) r3)     // Catch:{ all -> 0x00de }
            monitor-exit(r17)
            return r0
        L_0x009c:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            r0.<init>()     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
        L_0x00a1:
            boolean r2 = r3.moveToNext()     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            if (r2 == 0) goto L_0x00c6
            long r7 = r3.getLong(r5)     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            long r9 = r3.getLong(r4)     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            java.lang.String r2 = r3.getString(r6)     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            com.bytedance.frameworks.core.a.b.d r11 = new com.bytedance.frameworks.core.a.b.d     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            r11.<init>()     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            com.bytedance.frameworks.core.a.b.d r9 = r11.a((long) r9)     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            com.bytedance.frameworks.core.a.b.d r2 = r9.c(r2)     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            r2.f19902a = r7     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            r0.add(r2)     // Catch:{ Throwable -> 0x00ce, all -> 0x00cb }
            goto L_0x00a1
        L_0x00c6:
            a((android.database.Cursor) r3)     // Catch:{ all -> 0x00de }
            monitor-exit(r17)
            return r0
        L_0x00cb:
            r0 = move-exception
            r2 = r3
            goto L_0x00d1
        L_0x00ce:
            r2 = r3
            goto L_0x00d5
        L_0x00d0:
            r0 = move-exception
        L_0x00d1:
            a((android.database.Cursor) r2)     // Catch:{ all -> 0x00de }
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00d5:
            a((android.database.Cursor) r2)     // Catch:{ all -> 0x00de }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00de }
            monitor-exit(r17)
            return r0
        L_0x00de:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.c.a(long, long, java.util.List, java.lang.String):java.util.List");
    }
}
