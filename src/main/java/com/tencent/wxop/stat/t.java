package com.tencent.wxop.stat;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.wxop.stat.a.b;
import com.tencent.wxop.stat.a.c;
import com.tencent.wxop.stat.a.f;
import com.tencent.wxop.stat.a.n;
import com.tencent.wxop.stat.b.e;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class t {
    /* access modifiers changed from: private */
    public static b h = n.c();
    private static Context i = null;
    private static t j = null;

    /* renamed from: a  reason: collision with root package name */
    f f79927a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f79928b;

    /* renamed from: c  reason: collision with root package name */
    c f79929c;

    /* renamed from: d  reason: collision with root package name */
    private ab f79930d;

    /* renamed from: e  reason: collision with root package name */
    private ab f79931e;

    /* renamed from: f  reason: collision with root package name */
    private String f79932f = "";
    private String g = "";
    private int k;
    private ConcurrentHashMap<e, String> l;
    private boolean m;
    private HashMap<String, String> n = new HashMap<>();

    private t(Context context) {
        try {
            this.f79927a = new f();
            i = context.getApplicationContext();
            this.l = new ConcurrentHashMap<>();
            this.f79932f = n.l(context);
            this.g = "pri_" + n.l(context);
            this.f79930d = new ab(i, this.f79932f);
            this.f79931e = new ab(i, this.g);
            a(true);
            a(false);
            d();
            b(i);
            g();
            h();
        } catch (Throwable unused) {
        }
    }

    public static t a() {
        return j;
    }

    public static t a(Context context) {
        if (j == null) {
            synchronized (t.class) {
                if (j == null) {
                    j = new t(context);
                }
            }
        }
        return j;
    }

    private static String a(List<ac> list) {
        StringBuilder sb = new StringBuilder(list.size() * 3);
        sb.append("event_id in (");
        int size = list.size();
        int i2 = 0;
        for (ac acVar : list) {
            sb.append(acVar.f79831a);
            if (i2 != size - 1) {
                sb.append(",");
            }
            i2++;
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(int r4, boolean r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f79928b     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            if (r0 <= 0) goto L_0x0072
            if (r4 <= 0) goto L_0x0072
            boolean r0 = com.tencent.wxop.stat.g.a()     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            if (r0 == 0) goto L_0x000e
            goto L_0x0072
        L_0x000e:
            boolean r0 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            if (r0 == 0) goto L_0x002e
            com.tencent.wxop.stat.a.b r0 = h     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            java.lang.String r2 = "Load "
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            int r2 = r3.f79928b     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            r1.append(r2)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            java.lang.String r2 = " unsent events"
            r1.append(r2)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            r0.a(r1)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
        L_0x002e:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            r0.<init>(r4)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            r3.b(r0, r4, r5)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            int r4 = r0.size()     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            if (r4 <= 0) goto L_0x0070
            boolean r4 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            if (r4 == 0) goto L_0x005e
            com.tencent.wxop.stat.a.b r4 = h     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            java.lang.String r2 = "Peek "
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            int r2 = r0.size()     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            r1.append(r2)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            java.lang.String r2 = " unsent events."
            r1.append(r2)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            r4.a(r1)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
        L_0x005e:
            r4 = 2
            r3.a((java.util.List<com.tencent.wxop.stat.ac>) r0, (int) r4, (boolean) r5)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            android.content.Context r4 = i     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            com.tencent.wxop.stat.aj r4 = com.tencent.wxop.stat.aj.a(r4)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            com.tencent.wxop.stat.z r1 = new com.tencent.wxop.stat.z     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            r1.<init>(r3, r0, r5)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
            r4.a((java.util.List<?>) r0, (com.tencent.wxop.stat.ai) r1)     // Catch:{ Throwable -> 0x0077, all -> 0x0074 }
        L_0x0070:
            monitor-exit(r3)
            return
        L_0x0072:
            monitor-exit(r3)
            return
        L_0x0074:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0077:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.t.a(int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a A[SYNTHETIC, Splitter:B:17:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[SYNTHETIC, Splitter:B:25:0x0061] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r9) {
        /*
            r8 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r9 = r8.b((boolean) r9)     // Catch:{ Throwable -> 0x005e, all -> 0x0054 }
            r9.beginTransaction()     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            r0.<init>()     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            java.lang.String r1 = "status"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            r0.put(r1, r3)     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            java.lang.String r1 = "events"
            java.lang.String r3 = "status=?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            r4 = 0
            r5 = 2
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            r2[r4] = r5     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            int r0 = r9.update(r1, r0, r3, r2)     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            boolean r1 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            if (r1 == 0) goto L_0x0048
            com.tencent.wxop.stat.a.b r1 = h     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            java.lang.String r3 = "update "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            r2.append(r0)     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            java.lang.String r0 = " unsent events."
            r2.append(r0)     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            java.lang.String r0 = r2.toString()     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            r1.a(r0)     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
        L_0x0048:
            r9.setTransactionSuccessful()     // Catch:{ Throwable -> 0x005f, all -> 0x0052 }
            if (r9 == 0) goto L_0x0051
            r9.endTransaction()     // Catch:{ Throwable -> 0x0051 }
        L_0x0051:
            return
        L_0x0052:
            r0 = move-exception
            goto L_0x0058
        L_0x0054:
            r9 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L_0x0058:
            if (r9 == 0) goto L_0x005d
            r9.endTransaction()     // Catch:{ Throwable -> 0x005d }
        L_0x005d:
            throw r0
        L_0x005e:
            r9 = r0
        L_0x005f:
            if (r9 == 0) goto L_0x0065
            r9.endTransaction()     // Catch:{ Throwable -> 0x0065 }
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.t.a(boolean):void");
    }

    private SQLiteDatabase b(boolean z) {
        return (!z ? this.f79930d : this.f79931e).getWritableDatabase();
    }

    private void d() {
        this.f79928b = e() + f();
    }

    private int e() {
        return (int) DatabaseUtils.queryNumEntries(this.f79930d.getReadableDatabase(), "events");
    }

    private int f() {
        return (int) DatabaseUtils.queryNumEntries(this.f79931e.getReadableDatabase(), "events");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r11 = this;
            r0 = 0
            com.tencent.wxop.stat.ab r1 = r11.f79930d     // Catch:{ Throwable -> 0x0059, all -> 0x004f }
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()     // Catch:{ Throwable -> 0x0059, all -> 0x004f }
            java.lang.String r3 = "config"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0059, all -> 0x004f }
        L_0x0013:
            boolean r0 = r1.moveToNext()     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            if (r0 == 0) goto L_0x0045
            r0 = 0
            int r0 = r1.getInt(r0)     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            r2 = 1
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            r3 = 2
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            r4 = 3
            int r4 = r1.getInt(r4)     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            com.tencent.wxop.stat.ag r5 = new com.tencent.wxop.stat.ag     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            r5.<init>(r0)     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            r5.f79840a = r0     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            r5.f79841b = r0     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            r5.f79842c = r3     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            r5.f79843d = r4     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            android.content.Context r0 = i     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            com.tencent.wxop.stat.d.a((android.content.Context) r0, (com.tencent.wxop.stat.ag) r5)     // Catch:{ Throwable -> 0x004d, all -> 0x004b }
            goto L_0x0013
        L_0x0045:
            if (r1 == 0) goto L_0x005e
            r1.close()
            return
        L_0x004b:
            r0 = move-exception
            goto L_0x0053
        L_0x004d:
            r0 = r1
            goto L_0x0059
        L_0x004f:
            r1 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
        L_0x0053:
            if (r1 == 0) goto L_0x0058
            r1.close()
        L_0x0058:
            throw r0
        L_0x0059:
            if (r0 == 0) goto L_0x005e
            r0.close()
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.t.g():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r11 = this;
            r0 = 0
            com.tencent.wxop.stat.ab r1 = r11.f79930d     // Catch:{ Throwable -> 0x003d, all -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()     // Catch:{ Throwable -> 0x003d, all -> 0x0033 }
            java.lang.String r3 = "keyvalues"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x003d, all -> 0x0033 }
        L_0x0013:
            boolean r0 = r1.moveToNext()     // Catch:{ Throwable -> 0x0031, all -> 0x002f }
            if (r0 == 0) goto L_0x0029
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r11.n     // Catch:{ Throwable -> 0x0031, all -> 0x002f }
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Throwable -> 0x0031, all -> 0x002f }
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Throwable -> 0x0031, all -> 0x002f }
            r0.put(r2, r3)     // Catch:{ Throwable -> 0x0031, all -> 0x002f }
            goto L_0x0013
        L_0x0029:
            if (r1 == 0) goto L_0x0042
            r1.close()
            return
        L_0x002f:
            r0 = move-exception
            goto L_0x0037
        L_0x0031:
            r0 = r1
            goto L_0x003d
        L_0x0033:
            r1 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            throw r0
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r0.close()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.t.h():void");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.f79927a.a(new aa(this, i2));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:34|(2:40|41)|42|43) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00c9 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6 A[SYNTHETIC, Splitter:B:40:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc A[SYNTHETIC, Splitter:B:46:0x00cc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.util.List<com.tencent.wxop.stat.ac> r7, boolean r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r7.size()     // Catch:{ all -> 0x00d5 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r6)
            return
        L_0x0009:
            boolean r0 = com.tencent.wxop.stat.d.b()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x002e
            com.tencent.wxop.stat.a.b r0 = h     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "Delete "
            r1.<init>(r2)     // Catch:{ all -> 0x00d5 }
            int r2 = r7.size()     // Catch:{ all -> 0x00d5 }
            r1.append(r2)     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = " events, important:"
            r1.append(r2)     // Catch:{ all -> 0x00d5 }
            r1.append(r8)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d5 }
            r0.a(r1)     // Catch:{ all -> 0x00d5 }
        L_0x002e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            int r1 = r7.size()     // Catch:{ all -> 0x00d5 }
            int r1 = r1 * 3
            r0.<init>(r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "event_id in ("
            r0.append(r1)     // Catch:{ all -> 0x00d5 }
            r1 = 0
            int r2 = r7.size()     // Catch:{ all -> 0x00d5 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x0047:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x00d5 }
            com.tencent.wxop.stat.ac r3 = (com.tencent.wxop.stat.ac) r3     // Catch:{ all -> 0x00d5 }
            long r3 = r3.f79831a     // Catch:{ all -> 0x00d5 }
            r0.append(r3)     // Catch:{ all -> 0x00d5 }
            int r3 = r2 + -1
            if (r1 == r3) goto L_0x0061
            java.lang.String r3 = ","
            r0.append(r3)     // Catch:{ all -> 0x00d5 }
        L_0x0061:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x0064:
            java.lang.String r7 = ")"
            r0.append(r7)     // Catch:{ all -> 0x00d5 }
            r7 = 0
            android.database.sqlite.SQLiteDatabase r8 = r6.b((boolean) r8)     // Catch:{ Throwable -> 0x00ca, all -> 0x00c0 }
            r8.beginTransaction()     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            java.lang.String r1 = "events"
            java.lang.String r3 = r0.toString()     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            int r7 = r8.delete(r1, r3, r7)     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            boolean r1 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            if (r1 == 0) goto L_0x00a8
            com.tencent.wxop.stat.a.b r1 = h     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "delete "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            r3.append(r2)     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            java.lang.String r2 = " event "
            r3.append(r2)     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            r3.append(r0)     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            java.lang.String r0 = ", success delete:"
            r3.append(r0)     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            r3.append(r7)     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            java.lang.String r0 = r3.toString()     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            r1.a(r0)     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
        L_0x00a8:
            int r0 = r6.f79928b     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            int r0 = r0 - r7
            r6.f79928b = r0     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            r8.setTransactionSuccessful()     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            r6.d()     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            if (r8 == 0) goto L_0x00d3
            r8.endTransaction()     // Catch:{ Throwable -> 0x00ba }
            monitor-exit(r6)
            return
        L_0x00ba:
            monitor-exit(r6)
            return
        L_0x00bc:
            r7 = move-exception
            goto L_0x00c4
        L_0x00be:
            r7 = r8
            goto L_0x00ca
        L_0x00c0:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x00c4:
            if (r8 == 0) goto L_0x00c9
            r8.endTransaction()     // Catch:{ Throwable -> 0x00c9 }
        L_0x00c9:
            throw r7     // Catch:{ all -> 0x00d5 }
        L_0x00ca:
            if (r7 == 0) goto L_0x00d3
            r7.endTransaction()     // Catch:{ Throwable -> 0x00d1 }
            monitor-exit(r6)
            return
        L_0x00d1:
            monitor-exit(r6)
            return
        L_0x00d3:
            monitor-exit(r6)
            return
        L_0x00d5:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.t.a(java.util.List, boolean):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:75|(0)|81|82|83) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(6:8|9|(2:11|12)|15|16|(7:17|18|(14:20|(1:25)(1:24)|26|(1:28)|29|(1:44)(12:33|(7:35|(1:37)|38|(2:50|(1:54))(1:49)|55|(1:57)|(1:59))|39|(1:43)|38|(1:47)|50|52|54|55|(0)|(0))|45|(0)|50|52|54|55|(0)|(0))(1:60)|(3:62|(1:67)(1:66)|68)|69|(2:71|72)|73))|74|91|92|93|94) */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c7, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d8, code lost:
        r3 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x01d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01e6 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b3 A[Catch:{ Throwable -> 0x01da, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0120 A[Catch:{ Throwable -> 0x01da, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0133 A[Catch:{ Throwable -> 0x01da, all -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01cb A[SYNTHETIC, Splitter:B:79:0x01cb] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[ExcHandler: Throwable (unused java.lang.Throwable), SYNTHETIC, Splitter:B:8:0x000b] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:91:0x01e6=Splitter:B:91:0x01e6, B:82:0x01d7=Splitter:B:82:0x01d7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.tencent.wxop.stat.a.c b(android.content.Context r19) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            com.tencent.wxop.stat.a.c r0 = r1.f79929c     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x000b
            com.tencent.wxop.stat.a.c r0 = r1.f79929c     // Catch:{ all -> 0x01ea }
            monitor-exit(r18)
            return r0
        L_0x000b:
            com.tencent.wxop.stat.ab r0 = r1.f79930d     // Catch:{ Throwable -> 0x01d8, all -> 0x01c6 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Throwable -> 0x01d8, all -> 0x01c6 }
            r0.beginTransaction()     // Catch:{ Throwable -> 0x01d8, all -> 0x01c6 }
            boolean r0 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x01d8, all -> 0x01c6 }
            if (r0 == 0) goto L_0x0026
            com.tencent.wxop.stat.a.b r0 = h     // Catch:{ Throwable -> 0x01d8, all -> 0x0022 }
            java.lang.String r3 = "try to load user info from db."
            r0.a(r3)     // Catch:{ Throwable -> 0x01d8, all -> 0x0022 }
            goto L_0x0026
        L_0x0022:
            r0 = move-exception
            r3 = 0
            goto L_0x01c9
        L_0x0026:
            com.tencent.wxop.stat.ab r0 = r1.f79930d     // Catch:{ Throwable -> 0x01d8, all -> 0x01c6 }
            android.database.sqlite.SQLiteDatabase r3 = r0.getReadableDatabase()     // Catch:{ Throwable -> 0x01d8, all -> 0x01c6 }
            java.lang.String r4 = "user"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x01d8, all -> 0x01c6 }
            boolean r0 = r3.moveToNext()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = r3.getString(r6)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r8 = com.tencent.wxop.stat.a.s.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            int r9 = r3.getInt(r7)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r10 = 2
            java.lang.String r11 = r3.getString(r10)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r12 = 3
            long r12 = r3.getLong(r12)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            long r14 = r14 / r4
            if (r9 == r7) goto L_0x0074
            long r12 = r12 * r4
            java.lang.String r12 = com.tencent.wxop.stat.a.n.a((long) r12)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            long r16 = r14 * r4
            java.lang.String r13 = com.tencent.wxop.stat.a.n.a((long) r16)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            boolean r12 = r12.equals(r13)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r12 != 0) goto L_0x0074
            r12 = 1
            goto L_0x0075
        L_0x0074:
            r12 = r9
        L_0x0075:
            java.lang.String r13 = com.tencent.wxop.stat.a.n.i(r19)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            boolean r11 = r11.equals(r13)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r11 != 0) goto L_0x0081
            r12 = r12 | 2
        L_0x0081:
            java.lang.String r11 = ","
            java.lang.String[] r11 = r8.split(r11)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r11 == 0) goto L_0x00ab
            int r13 = r11.length     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r13 <= 0) goto L_0x00ab
            r13 = r11[r6]     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r13 == 0) goto L_0x009b
            int r4 = r13.length()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r5 = 11
            if (r4 >= r5) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r2 = 0
            goto L_0x00b1
        L_0x009b:
            java.lang.String r4 = com.tencent.wxop.stat.a.s.a((android.content.Context) r19)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r4 == 0) goto L_0x0099
            int r5 = r4.length()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r2 = 10
            if (r5 <= r2) goto L_0x0099
            r13 = r4
            goto L_0x00b0
        L_0x00ab:
            java.lang.String r8 = com.tencent.wxop.stat.a.n.b((android.content.Context) r19)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r13 = r8
        L_0x00b0:
            r2 = 1
        L_0x00b1:
            if (r11 == 0) goto L_0x00cd
            int r4 = r11.length     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r4 < r10) goto L_0x00cd
            r4 = r11[r7]     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r5.<init>()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r5.append(r13)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r8 = ","
            r5.append(r8)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r5.append(r4)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r8 = r5.toString()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            goto L_0x00ee
        L_0x00cd:
            java.lang.String r4 = com.tencent.wxop.stat.a.n.c((android.content.Context) r19)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r4 == 0) goto L_0x00ee
            int r5 = r4.length()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r5 <= 0) goto L_0x00ee
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r2.<init>()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r2.append(r13)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r5 = ","
            r2.append(r5)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r2.append(r4)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r8 = r2.toString()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r2 = 1
        L_0x00ee:
            com.tencent.wxop.stat.a.c r5 = new com.tencent.wxop.stat.a.c     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r5.<init>(r13, r4, r12)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r1.f79929c = r5     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r4.<init>()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r5 = com.tencent.wxop.stat.a.s.b((java.lang.String) r8)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r8 = "uid"
            r4.put(r8, r5)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r5 = "user_type"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r4.put(r5, r8)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r5 = "app_ver"
            java.lang.String r8 = com.tencent.wxop.stat.a.n.i(r19)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r4.put(r5, r8)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r5 = "ts"
            java.lang.Long r8 = java.lang.Long.valueOf(r14)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r4.put(r5, r8)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r2 == 0) goto L_0x0131
            com.tencent.wxop.stat.ab r2 = r1.f79930d     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r5 = "user"
            java.lang.String r8 = "uid=?"
            java.lang.String[] r10 = new java.lang.String[r7]     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r10[r6] = r0     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r2.update(r5, r4, r8, r10)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
        L_0x0131:
            if (r12 == r9) goto L_0x0141
            com.tencent.wxop.stat.ab r0 = r1.f79930d     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r2 = "user"
            r5 = 0
            r0.replace(r2, r5, r4)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            goto L_0x0141
        L_0x0140:
            r7 = 0
        L_0x0141:
            if (r7 != 0) goto L_0x01ac
            java.lang.String r0 = com.tencent.wxop.stat.a.n.b((android.content.Context) r19)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r2 = com.tencent.wxop.stat.a.n.c((android.content.Context) r19)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r2 == 0) goto L_0x0168
            int r4 = r2.length()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r4 <= 0) goto L_0x0168
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r4.<init>()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r4.append(r0)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r5 = ","
            r4.append(r5)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r4.append(r2)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            goto L_0x0169
        L_0x0168:
            r4 = r0
        L_0x0169:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.String r5 = com.tencent.wxop.stat.a.n.i(r19)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r9.<init>()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r4 = com.tencent.wxop.stat.a.s.b((java.lang.String) r4)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r10 = "uid"
            r9.put(r10, r4)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r4 = "user_type"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r9.put(r4, r10)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r4 = "app_ver"
            r9.put(r4, r5)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r4 = "ts"
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r9.put(r4, r5)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            com.tencent.wxop.stat.ab r4 = r1.f79930d     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            java.lang.String r5 = "user"
            r7 = 0
            r4.insert(r5, r7, r9)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            com.tencent.wxop.stat.a.c r4 = new com.tencent.wxop.stat.a.c     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r4.<init>(r0, r2, r6)     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r1.f79929c = r4     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
        L_0x01ac:
            com.tencent.wxop.stat.ab r0 = r1.f79930d     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            r0.setTransactionSuccessful()     // Catch:{ Throwable -> 0x01da, all -> 0x01c4 }
            if (r3 == 0) goto L_0x01ba
            r3.close()     // Catch:{ Throwable -> 0x01e6 }
        L_0x01ba:
            com.tencent.wxop.stat.ab r0 = r1.f79930d     // Catch:{ Throwable -> 0x01e6 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Throwable -> 0x01e6 }
        L_0x01c0:
            r0.endTransaction()     // Catch:{ Throwable -> 0x01e6 }
            goto L_0x01e6
        L_0x01c4:
            r0 = move-exception
            goto L_0x01c9
        L_0x01c6:
            r0 = move-exception
            r7 = 0
            r3 = r7
        L_0x01c9:
            if (r3 == 0) goto L_0x01ce
            r3.close()     // Catch:{ Throwable -> 0x01d7 }
        L_0x01ce:
            com.tencent.wxop.stat.ab r2 = r1.f79930d     // Catch:{ Throwable -> 0x01d7 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ Throwable -> 0x01d7 }
            r2.endTransaction()     // Catch:{ Throwable -> 0x01d7 }
        L_0x01d7:
            throw r0     // Catch:{ all -> 0x01ea }
        L_0x01d8:
            r7 = 0
            r3 = r7
        L_0x01da:
            if (r3 == 0) goto L_0x01df
            r3.close()     // Catch:{ Throwable -> 0x01e6 }
        L_0x01df:
            com.tencent.wxop.stat.ab r0 = r1.f79930d     // Catch:{ Throwable -> 0x01e6 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Throwable -> 0x01e6 }
            goto L_0x01c0
        L_0x01e6:
            com.tencent.wxop.stat.a.c r0 = r1.f79929c     // Catch:{ all -> 0x01ea }
            monitor-exit(r18)
            return r0
        L_0x01ea:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.t.b(android.content.Context):com.tencent.wxop.stat.a.c");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:29|(2:35|36)|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d3 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cd A[SYNTHETIC, Splitter:B:35:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6 A[SYNTHETIC, Splitter:B:41:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r11 = this;
            boolean r0 = r11.m
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.util.concurrent.ConcurrentHashMap<com.tencent.wxop.stat.b.e, java.lang.String> r0 = r11.l
            monitor-enter(r0)
            java.util.concurrent.ConcurrentHashMap<com.tencent.wxop.stat.b.e, java.lang.String> r1 = r11.l     // Catch:{ all -> 0x0112 }
            int r1 = r1.size()     // Catch:{ all -> 0x0112 }
            if (r1 != 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            return
        L_0x0012:
            r1 = 1
            r11.m = r1     // Catch:{ all -> 0x0112 }
            boolean r2 = com.tencent.wxop.stat.d.b()     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x0048
            com.tencent.wxop.stat.a.b r2 = h     // Catch:{ all -> 0x0112 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = "insert "
            r3.<init>(r4)     // Catch:{ all -> 0x0112 }
            java.util.concurrent.ConcurrentHashMap<com.tencent.wxop.stat.b.e, java.lang.String> r4 = r11.l     // Catch:{ all -> 0x0112 }
            int r4 = r4.size()     // Catch:{ all -> 0x0112 }
            r3.append(r4)     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = " events ,numEventsCachedInMemory:"
            r3.append(r4)     // Catch:{ all -> 0x0112 }
            int r4 = com.tencent.wxop.stat.d.y     // Catch:{ all -> 0x0112 }
            r3.append(r4)     // Catch:{ all -> 0x0112 }
            java.lang.String r4 = ",numStoredEvents:"
            r3.append(r4)     // Catch:{ all -> 0x0112 }
            int r4 = r11.f79928b     // Catch:{ all -> 0x0112 }
            r3.append(r4)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0112 }
            r2.a(r3)     // Catch:{ all -> 0x0112 }
        L_0x0048:
            r2 = 0
            com.tencent.wxop.stat.ab r3 = r11.f79930d     // Catch:{ Throwable -> 0x00d4, all -> 0x00c9 }
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch:{ Throwable -> 0x00d4, all -> 0x00c9 }
            r3.beginTransaction()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.util.concurrent.ConcurrentHashMap<com.tencent.wxop.stat.b.e, java.lang.String> r4 = r11.l     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
        L_0x005c:
            boolean r5 = r4.hasNext()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            if (r5 == 0) goto L_0x00b9
            java.lang.Object r5 = r4.next()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.lang.Object r5 = r5.getKey()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            com.tencent.wxop.stat.b.e r5 = (com.tencent.wxop.stat.b.e) r5     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            r6.<init>()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.lang.String r7 = r5.b()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            boolean r8 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            if (r8 == 0) goto L_0x008c
            com.tencent.wxop.stat.a.b r8 = h     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.lang.String r9 = "insert content:"
            java.lang.String r10 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.lang.String r9 = r9.concat(r10)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            r8.a(r9)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
        L_0x008c:
            java.lang.String r7 = com.tencent.wxop.stat.a.s.b((java.lang.String) r7)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.lang.String r8 = "content"
            r6.put(r8, r7)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.lang.String r7 = "send_count"
            java.lang.String r8 = "0"
            r6.put(r7, r8)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.lang.String r7 = "status"
            java.lang.String r8 = java.lang.Integer.toString(r1)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            r6.put(r7, r8)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.lang.String r7 = "timestamp"
            long r8 = r5.f79871d     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            r6.put(r7, r5)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            java.lang.String r5 = "events"
            r3.insert(r5, r2, r6)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            r4.remove()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            goto L_0x005c
        L_0x00b9:
            r3.setTransactionSuccessful()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c5 }
            if (r3 == 0) goto L_0x00da
            r3.endTransaction()     // Catch:{ Throwable -> 0x00da }
        L_0x00c1:
            r11.d()     // Catch:{ Throwable -> 0x00da }
            goto L_0x00da
        L_0x00c5:
            r1 = move-exception
            goto L_0x00cb
        L_0x00c7:
            r2 = r3
            goto L_0x00d4
        L_0x00c9:
            r1 = move-exception
            r3 = r2
        L_0x00cb:
            if (r3 == 0) goto L_0x00d3
            r3.endTransaction()     // Catch:{ Throwable -> 0x00d3 }
            r11.d()     // Catch:{ Throwable -> 0x00d3 }
        L_0x00d3:
            throw r1     // Catch:{ all -> 0x0112 }
        L_0x00d4:
            if (r2 == 0) goto L_0x00da
            r2.endTransaction()     // Catch:{ Throwable -> 0x00da }
            goto L_0x00c1
        L_0x00da:
            r1 = 0
            r11.m = r1     // Catch:{ all -> 0x0112 }
            boolean r1 = com.tencent.wxop.stat.d.b()     // Catch:{ all -> 0x0112 }
            if (r1 == 0) goto L_0x0110
            com.tencent.wxop.stat.a.b r1 = h     // Catch:{ all -> 0x0112 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "after insert, cacheEventsInMemory.size():"
            r2.<init>(r3)     // Catch:{ all -> 0x0112 }
            java.util.concurrent.ConcurrentHashMap<com.tencent.wxop.stat.b.e, java.lang.String> r3 = r11.l     // Catch:{ all -> 0x0112 }
            int r3 = r3.size()     // Catch:{ all -> 0x0112 }
            r2.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = ",numEventsCachedInMemory:"
            r2.append(r3)     // Catch:{ all -> 0x0112 }
            int r3 = com.tencent.wxop.stat.d.y     // Catch:{ all -> 0x0112 }
            r2.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = ",numStoredEvents:"
            r2.append(r3)     // Catch:{ all -> 0x0112 }
            int r3 = r11.f79928b     // Catch:{ all -> 0x0112 }
            r2.append(r3)     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0112 }
            r1.a(r2)     // Catch:{ all -> 0x0112 }
        L_0x0110:
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            return
        L_0x0112:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0112 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.t.b():void");
    }

    /* access modifiers changed from: package-private */
    public final void b(ag agVar) {
        if (agVar != null) {
            this.f79927a.a(new y(this, agVar));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(e eVar, ai aiVar, boolean z, boolean z2) {
        if (this.f79927a != null) {
            f fVar = this.f79927a;
            x xVar = new x(this, eVar, aiVar, z, z2);
            fVar.a(xVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|(2:41|42)|43|44) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ab */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a8 A[SYNTHETIC, Splitter:B:41:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af A[SYNTHETIC, Splitter:B:49:0x00af] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.util.List<com.tencent.wxop.stat.ac> r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r5.size()     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            if (r7 != 0) goto L_0x000e
            int r0 = com.tencent.wxop.stat.d.f79888e     // Catch:{ all -> 0x00b8 }
            goto L_0x0010
        L_0x000e:
            int r0 = com.tencent.wxop.stat.d.f79889f     // Catch:{ all -> 0x00b8 }
        L_0x0010:
            r1 = 0
            android.database.sqlite.SQLiteDatabase r7 = r4.b((boolean) r7)     // Catch:{ Throwable -> 0x00ac, all -> 0x00a4 }
            r2 = 2
            if (r6 != r2) goto L_0x0035
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r2 = "update events set status="
            r0.<init>(r2)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            r0.append(r6)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r6 = ", send_count=send_count+1  where "
            r0.append(r6)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r5 = a((java.util.List<com.tencent.wxop.stat.ac>) r5)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            r0.append(r5)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r5 = r0.toString()     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            goto L_0x0066
        L_0x0033:
            r5 = move-exception
            goto L_0x00a6
        L_0x0035:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r3 = "update events set status="
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            r2.append(r6)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r6 = " where "
            r2.append(r6)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r5 = a((java.util.List<com.tencent.wxop.stat.ac>) r5)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            r2.append(r5)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r5 = r2.toString()     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            int r6 = r4.k     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            int r6 = r6 % 3
            if (r6 != 0) goto L_0x0060
            java.lang.String r6 = "delete from events where send_count>"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r6 = r6.concat(r0)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            r1 = r6
        L_0x0060:
            int r6 = r4.k     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            int r6 = r6 + 1
            r4.k = r6     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
        L_0x0066:
            boolean r6 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            if (r6 == 0) goto L_0x007b
            com.tencent.wxop.stat.a.b r6 = h     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r0 = "update sql:"
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            r6.a(r0)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
        L_0x007b:
            r7.beginTransaction()     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            r7.execSQL(r5)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            if (r1 == 0) goto L_0x0098
            com.tencent.wxop.stat.a.b r5 = h     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r6 = "update for delete sql:"
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            java.lang.String r6 = r6.concat(r0)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            r5.a(r6)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            r7.execSQL(r1)     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            r4.d()     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
        L_0x0098:
            r7.setTransactionSuccessful()     // Catch:{ Throwable -> 0x00ad, all -> 0x0033 }
            if (r7 == 0) goto L_0x00b6
            r7.endTransaction()     // Catch:{ Throwable -> 0x00a2 }
            monitor-exit(r4)
            return
        L_0x00a2:
            monitor-exit(r4)
            return
        L_0x00a4:
            r5 = move-exception
            r7 = r1
        L_0x00a6:
            if (r7 == 0) goto L_0x00ab
            r7.endTransaction()     // Catch:{ Throwable -> 0x00ab }
        L_0x00ab:
            throw r5     // Catch:{ all -> 0x00b8 }
        L_0x00ac:
            r7 = r1
        L_0x00ad:
            if (r7 == 0) goto L_0x00b6
            r7.endTransaction()     // Catch:{ Throwable -> 0x00b4 }
            monitor-exit(r4)
            return
        L_0x00b4:
            monitor-exit(r4)
            return
        L_0x00b6:
            monitor-exit(r4)
            return
        L_0x00b8:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.t.a(java.util.List, int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.util.List<com.tencent.wxop.stat.ac> r12, int r13, boolean r14) {
        /*
            r11 = this;
            r0 = 0
            if (r14 != 0) goto L_0x000e
            com.tencent.wxop.stat.ab r14 = r11.f79930d     // Catch:{ Throwable -> 0x0094, all -> 0x000a }
        L_0x0005:
            android.database.sqlite.SQLiteDatabase r14 = r14.getReadableDatabase()     // Catch:{ Throwable -> 0x0094, all -> 0x000a }
            goto L_0x0011
        L_0x000a:
            r12 = move-exception
            r13 = r0
            goto L_0x008e
        L_0x000e:
            com.tencent.wxop.stat.ab r14 = r11.f79931e     // Catch:{ Throwable -> 0x0094, all -> 0x000a }
            goto L_0x0005
        L_0x0011:
            r1 = r14
            java.lang.String r2 = "events"
            r3 = 0
            java.lang.String r4 = "status=?"
            r14 = 1
            java.lang.String[] r5 = new java.lang.String[r14]     // Catch:{ Throwable -> 0x0094, all -> 0x000a }
            java.lang.String r6 = java.lang.Integer.toString(r14)     // Catch:{ Throwable -> 0x0094, all -> 0x000a }
            r10 = 0
            r5[r10] = r6     // Catch:{ Throwable -> 0x0094, all -> 0x000a }
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = java.lang.Integer.toString(r13)     // Catch:{ Throwable -> 0x0094, all -> 0x000a }
            android.database.Cursor r13 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0094, all -> 0x000a }
        L_0x002c:
            boolean r0 = r13.moveToNext()     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            if (r0 == 0) goto L_0x0087
            long r7 = r13.getLong(r10)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            java.lang.String r0 = r13.getString(r14)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            boolean r1 = com.tencent.wxop.stat.d.n     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            if (r1 != 0) goto L_0x0042
            java.lang.String r0 = com.tencent.wxop.stat.a.s.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
        L_0x0042:
            r4 = r0
            r0 = 2
            int r5 = r13.getInt(r0)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            r0 = 3
            int r0 = r13.getInt(r0)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            com.tencent.wxop.stat.ac r9 = new com.tencent.wxop.stat.ac     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            r1 = r9
            r2 = r7
            r6 = r0
            r1.<init>(r2, r4, r5, r6)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            boolean r1 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            if (r1 == 0) goto L_0x0083
            com.tencent.wxop.stat.a.b r1 = h     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            java.lang.String r3 = "peek event, id="
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            r2.append(r7)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            java.lang.String r3 = ",send_count="
            r2.append(r3)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            r2.append(r0)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            java.lang.String r0 = ",timestamp="
            r2.append(r0)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            r0 = 4
            long r3 = r13.getLong(r0)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            r2.append(r3)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            java.lang.String r0 = r2.toString()     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            r1.a(r0)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
        L_0x0083:
            r12.add(r9)     // Catch:{ Throwable -> 0x0095, all -> 0x008d }
            goto L_0x002c
        L_0x0087:
            if (r13 == 0) goto L_0x009a
            r13.close()
            return
        L_0x008d:
            r12 = move-exception
        L_0x008e:
            if (r13 == 0) goto L_0x0093
            r13.close()
        L_0x0093:
            throw r12
        L_0x0094:
            r13 = r0
        L_0x0095:
            if (r13 == 0) goto L_0x009a
            r13.close()
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.t.b(java.util.List, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:38|(2:44|45)|46|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015e, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x010d */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a A[SYNTHETIC, Splitter:B:44:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0112 A[SYNTHETIC, Splitter:B:51:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011b A[SYNTHETIC, Splitter:B:56:0x011b] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144 A[SYNTHETIC, Splitter:B:64:0x0144] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(com.tencent.wxop.stat.b.e r7, com.tencent.wxop.stat.ai r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = com.tencent.wxop.stat.d.e()     // Catch:{ all -> 0x015f }
            if (r0 <= 0) goto L_0x015d
            int r0 = com.tencent.wxop.stat.d.y     // Catch:{ all -> 0x015f }
            if (r0 <= 0) goto L_0x0084
            if (r9 != 0) goto L_0x0084
            if (r10 == 0) goto L_0x0010
            goto L_0x0084
        L_0x0010:
            int r9 = com.tencent.wxop.stat.d.y     // Catch:{ all -> 0x015f }
            if (r9 <= 0) goto L_0x015d
            boolean r9 = com.tencent.wxop.stat.d.b()     // Catch:{ all -> 0x015f }
            if (r9 == 0) goto L_0x005e
            com.tencent.wxop.stat.a.b r9 = h     // Catch:{ all -> 0x015f }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "cacheEventsInMemory.size():"
            r10.<init>(r0)     // Catch:{ all -> 0x015f }
            java.util.concurrent.ConcurrentHashMap<com.tencent.wxop.stat.b.e, java.lang.String> r0 = r6.l     // Catch:{ all -> 0x015f }
            int r0 = r0.size()     // Catch:{ all -> 0x015f }
            r10.append(r0)     // Catch:{ all -> 0x015f }
            java.lang.String r0 = ",numEventsCachedInMemory:"
            r10.append(r0)     // Catch:{ all -> 0x015f }
            int r0 = com.tencent.wxop.stat.d.y     // Catch:{ all -> 0x015f }
            r10.append(r0)     // Catch:{ all -> 0x015f }
            java.lang.String r0 = ",numStoredEvents:"
            r10.append(r0)     // Catch:{ all -> 0x015f }
            int r0 = r6.f79928b     // Catch:{ all -> 0x015f }
            r10.append(r0)     // Catch:{ all -> 0x015f }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x015f }
            r9.a(r10)     // Catch:{ all -> 0x015f }
            com.tencent.wxop.stat.a.b r9 = h     // Catch:{ all -> 0x015f }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "cache event:"
            r10.<init>(r0)     // Catch:{ all -> 0x015f }
            java.lang.String r0 = r7.b()     // Catch:{ all -> 0x015f }
            r10.append(r0)     // Catch:{ all -> 0x015f }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x015f }
            r9.a(r10)     // Catch:{ all -> 0x015f }
        L_0x005e:
            java.util.concurrent.ConcurrentHashMap<com.tencent.wxop.stat.b.e, java.lang.String> r9 = r6.l     // Catch:{ all -> 0x015f }
            java.lang.String r10 = ""
            r9.put(r7, r10)     // Catch:{ all -> 0x015f }
            java.util.concurrent.ConcurrentHashMap<com.tencent.wxop.stat.b.e, java.lang.String> r7 = r6.l     // Catch:{ all -> 0x015f }
            int r7 = r7.size()     // Catch:{ all -> 0x015f }
            int r9 = com.tencent.wxop.stat.d.y     // Catch:{ all -> 0x015f }
            if (r7 < r9) goto L_0x0072
            r6.b()     // Catch:{ all -> 0x015f }
        L_0x0072:
            if (r8 == 0) goto L_0x015d
            java.util.concurrent.ConcurrentHashMap<com.tencent.wxop.stat.b.e, java.lang.String> r7 = r6.l     // Catch:{ all -> 0x015f }
            int r7 = r7.size()     // Catch:{ all -> 0x015f }
            if (r7 <= 0) goto L_0x007f
            r6.b()     // Catch:{ all -> 0x015f }
        L_0x007f:
            r8.a()     // Catch:{ all -> 0x015f }
            goto L_0x015d
        L_0x0084:
            r10 = 1
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r6.b((boolean) r9)     // Catch:{ Throwable -> 0x010e, all -> 0x0106 }
            r1.beginTransaction()     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            if (r9 != 0) goto L_0x00b1
            int r9 = r6.f79928b     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            int r2 = com.tencent.wxop.stat.d.e()     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            if (r9 <= r2) goto L_0x00b1
            com.tencent.wxop.stat.a.b r9 = h     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            java.lang.String r2 = "Too many events stored in db."
            r9.b(r2)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            int r9 = r6.f79928b     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            com.tencent.wxop.stat.ab r2 = r6.f79930d     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            java.lang.String r3 = "events"
            java.lang.String r4 = "event_id in (select event_id from events where timestamp in (select min(timestamp) from events) limit 1)"
            int r2 = r2.delete(r3, r4, r0)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            int r9 = r9 - r2
            r6.f79928b = r9     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
        L_0x00b1:
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            r9.<init>()     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            java.lang.String r2 = r7.b()     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            boolean r3 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            if (r3 == 0) goto L_0x00cf
            com.tencent.wxop.stat.a.b r3 = h     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            java.lang.String r4 = "insert 1 event, content:"
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            r3.a(r4)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
        L_0x00cf:
            java.lang.String r2 = com.tencent.wxop.stat.a.s.b((java.lang.String) r2)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            java.lang.String r3 = "content"
            r9.put(r3, r2)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            java.lang.String r2 = "send_count"
            java.lang.String r3 = "0"
            r9.put(r2, r3)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            java.lang.String r2 = "status"
            java.lang.String r3 = java.lang.Integer.toString(r10)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            r9.put(r2, r3)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            java.lang.String r2 = "timestamp"
            long r3 = r7.f79871d     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            r9.put(r2, r3)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            java.lang.String r2 = "events"
            long r2 = r1.insert(r2, r0, r9)     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            r1.setTransactionSuccessful()     // Catch:{ Throwable -> 0x0104, all -> 0x0102 }
            if (r1 == 0) goto L_0x0115
            r1.endTransaction()     // Catch:{ Throwable -> 0x0115 }
            goto L_0x0115
        L_0x0102:
            r7 = move-exception
            goto L_0x0108
        L_0x0104:
            r0 = r1
            goto L_0x010e
        L_0x0106:
            r7 = move-exception
            r1 = r0
        L_0x0108:
            if (r1 == 0) goto L_0x010d
            r1.endTransaction()     // Catch:{ Throwable -> 0x010d }
        L_0x010d:
            throw r7     // Catch:{ all -> 0x015f }
        L_0x010e:
            r2 = -1
            if (r0 == 0) goto L_0x0115
            r0.endTransaction()     // Catch:{ Throwable -> 0x0115 }
        L_0x0115:
            r0 = 0
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0144
            int r9 = r6.f79928b     // Catch:{ all -> 0x015f }
            int r9 = r9 + r10
            r6.f79928b = r9     // Catch:{ all -> 0x015f }
            boolean r9 = com.tencent.wxop.stat.d.b()     // Catch:{ all -> 0x015f }
            if (r9 == 0) goto L_0x013d
            com.tencent.wxop.stat.a.b r9 = h     // Catch:{ all -> 0x015f }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "directStoreEvent insert event to db, event:"
            r10.<init>(r0)     // Catch:{ all -> 0x015f }
            java.lang.String r7 = r7.b()     // Catch:{ all -> 0x015f }
            r10.append(r7)     // Catch:{ all -> 0x015f }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x015f }
            r9.g(r7)     // Catch:{ all -> 0x015f }
        L_0x013d:
            if (r8 == 0) goto L_0x015b
            r8.a()     // Catch:{ all -> 0x015f }
            monitor-exit(r6)
            return
        L_0x0144:
            com.tencent.wxop.stat.a.b r8 = h     // Catch:{ all -> 0x015f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x015f }
            java.lang.String r10 = "Failed to store event:"
            r9.<init>(r10)     // Catch:{ all -> 0x015f }
            java.lang.String r7 = r7.b()     // Catch:{ all -> 0x015f }
            r9.append(r7)     // Catch:{ all -> 0x015f }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x015f }
            r8.d(r7)     // Catch:{ all -> 0x015f }
        L_0x015b:
            monitor-exit(r6)
            return
        L_0x015d:
            monitor-exit(r6)
            return
        L_0x015f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.t.a(com.tencent.wxop.stat.b.e, com.tencent.wxop.stat.ai, boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:30|(2:36|37)|38|39|40|41) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00e3 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A[SYNTHETIC, Splitter:B:36:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(com.tencent.wxop.stat.ag r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            org.json.JSONObject r1 = r13.f79841b     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            java.lang.String r2 = com.tencent.wxop.stat.a.n.a((java.lang.String) r1)     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            r3.<init>()     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            java.lang.String r4 = "content"
            org.json.JSONObject r5 = r13.f79841b     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            java.lang.String r4 = "md5sum"
            r3.put(r4, r2)     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            r13.f79842c = r2     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            java.lang.String r2 = "version"
            int r4 = r13.f79843d     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            r3.put(r2, r4)     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            com.tencent.wxop.stat.ab r2 = r12.f79930d     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            android.database.sqlite.SQLiteDatabase r4 = r2.getReadableDatabase()     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
            java.lang.String r5 = "config"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x00e4, all -> 0x00d3 }
        L_0x0040:
            boolean r4 = r2.moveToNext()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0052
            int r4 = r2.getInt(r6)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            int r7 = r13.f79840a     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            if (r4 != r7) goto L_0x0040
            r4 = 1
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            com.tencent.wxop.stat.ab r7 = r12.f79930d     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            android.database.sqlite.SQLiteDatabase r7 = r7.getWritableDatabase()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r7.beginTransaction()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            if (r5 != r4) goto L_0x0078
            com.tencent.wxop.stat.ab r0 = r12.f79930d     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r4 = "config"
            java.lang.String r7 = "type=?"
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            int r13 = r13.f79840a     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r5[r6] = r13     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            int r13 = r0.update(r4, r3, r7, r5)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            long r3 = (long) r13     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            goto L_0x008f
        L_0x0078:
            java.lang.String r4 = "type"
            int r13 = r13.f79840a     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r3.put(r4, r13)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            com.tencent.wxop.stat.ab r13 = r12.f79930d     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            android.database.sqlite.SQLiteDatabase r13 = r13.getWritableDatabase()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r4 = "config"
            long r3 = r13.insert(r4, r0, r3)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
        L_0x008f:
            r5 = -1
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 != 0) goto L_0x00a5
            com.tencent.wxop.stat.a.b r13 = h     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r0 = "Failed to store cfg:"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r13.e(r0)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            goto L_0x00b4
        L_0x00a5:
            com.tencent.wxop.stat.a.b r13 = h     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r0 = "Sucessed to store cfg:"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r13.g(r0)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
        L_0x00b4:
            com.tencent.wxop.stat.ab r13 = r12.f79930d     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            android.database.sqlite.SQLiteDatabase r13 = r13.getWritableDatabase()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r13.setTransactionSuccessful()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            if (r2 == 0) goto L_0x00c2
            r2.close()     // Catch:{ all -> 0x00ea }
        L_0x00c2:
            com.tencent.wxop.stat.ab r13 = r12.f79930d     // Catch:{ Exception -> 0x00cd }
            android.database.sqlite.SQLiteDatabase r13 = r13.getWritableDatabase()     // Catch:{ Exception -> 0x00cd }
            r13.endTransaction()     // Catch:{ Exception -> 0x00cd }
            monitor-exit(r12)
            return
        L_0x00cd:
            monitor-exit(r12)
            return
        L_0x00cf:
            r13 = move-exception
            goto L_0x00d5
        L_0x00d1:
            r0 = r2
            goto L_0x00e4
        L_0x00d3:
            r13 = move-exception
            r2 = r0
        L_0x00d5:
            if (r2 == 0) goto L_0x00da
            r2.close()     // Catch:{ all -> 0x00ea }
        L_0x00da:
            com.tencent.wxop.stat.ab r0 = r12.f79930d     // Catch:{ Exception -> 0x00e3 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Exception -> 0x00e3 }
            r0.endTransaction()     // Catch:{ Exception -> 0x00e3 }
        L_0x00e3:
            throw r13     // Catch:{ all -> 0x00ea }
        L_0x00e4:
            if (r0 == 0) goto L_0x00ec
            r0.close()     // Catch:{ all -> 0x00ea }
            goto L_0x00ec
        L_0x00ea:
            r13 = move-exception
            goto L_0x00f7
        L_0x00ec:
            com.tencent.wxop.stat.ab r13 = r12.f79930d     // Catch:{ Exception -> 0x00f9 }
            android.database.sqlite.SQLiteDatabase r13 = r13.getWritableDatabase()     // Catch:{ Exception -> 0x00f9 }
            r13.endTransaction()     // Catch:{ Exception -> 0x00f9 }
            monitor-exit(r12)
            return
        L_0x00f7:
            monitor-exit(r12)
            throw r13
        L_0x00f9:
            monitor-exit(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.t.a(com.tencent.wxop.stat.ag):void");
    }

    static /* synthetic */ void a(t tVar, int i2, boolean z) {
        if (i2 == -1) {
            if (!z) {
                i2 = tVar.e();
            } else {
                i2 = tVar.f();
            }
        }
        if (i2 > 0) {
            int h2 = d.h() * 60 * d.g;
            if (i2 > h2 && h2 > 0) {
                i2 = h2;
            }
            int i3 = d.f79887d;
            int i4 = i2 / i3;
            int i5 = i2 % i3;
            if (d.b()) {
                b bVar = h;
                bVar.a("sentStoreEventsByDb sendNumbers=" + i2 + ",important=" + z + ",maxSendNumPerFor1Period=" + h2 + ",maxCount=" + i4 + ",restNumbers=" + i5);
            }
            for (int i6 = 0; i6 < i4; i6++) {
                tVar.a(i3, z);
            }
            if (i5 > 0) {
                tVar.a(i5, z);
            }
        }
    }
}
