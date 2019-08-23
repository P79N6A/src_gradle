package com.umeng.analytics.pro;

import android.content.Context;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static Context f80681a;

    static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final o f80682a = new o();

        private a() {
        }
    }

    private o() {
    }

    /* JADX INFO: finally extract failed */
    public JSONObject a() {
        try {
            JSONObject b2 = a.b(b.a(f80681a).a());
            b.a(f80681a).c();
            return b2;
        } catch (Exception unused) {
            by.e("upload agg date error");
            b.a(f80681a).c();
            return null;
        } catch (Throwable th) {
            b.a(f80681a).c();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public List<String> b() {
        try {
            List<String> c2 = a.c(b.a(f80681a).a());
            b.a(f80681a).c();
            return c2;
        } catch (Exception unused) {
            by.e("loadCKToMemory exception");
            b.a(f80681a).c();
            return null;
        } catch (Throwable th) {
            b.a(f80681a).c();
            throw th;
        }
    }

    public static o a(Context context) {
        f80681a = context;
        return a.f80682a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6.a(java.lang.Boolean.FALSE, false);
        com.umeng.analytics.pro.by.e("load agg data error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        com.umeng.analytics.pro.b.a(f80681a).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.umeng.analytics.pro.f r6) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = f80681a     // Catch:{ Exception -> 0x0047 }
            com.umeng.analytics.pro.b r1 = com.umeng.analytics.pro.b.a(r1)     // Catch:{ Exception -> 0x0047 }
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch:{ Exception -> 0x0047 }
            java.lang.String r2 = com.umeng.analytics.pro.a.a((android.database.sqlite.SQLiteDatabase) r1)     // Catch:{ Exception -> 0x0047 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0047 }
            java.lang.String r3 = com.umeng.analytics.pro.q.a(r3)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r4 = "0"
            boolean r4 = r2.equals(r4)     // Catch:{ Exception -> 0x0047 }
            if (r4 == 0) goto L_0x002e
            java.lang.String r1 = "faild"
            r6.a(r1, r0)     // Catch:{ Exception -> 0x0047 }
            android.content.Context r6 = f80681a
            com.umeng.analytics.pro.b r6 = com.umeng.analytics.pro.b.a(r6)
            r6.c()
            return
        L_0x002e:
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x0047 }
            if (r2 != 0) goto L_0x0038
            com.umeng.analytics.pro.a.a((android.database.sqlite.SQLiteDatabase) r1, (com.umeng.analytics.pro.f) r6)     // Catch:{ Exception -> 0x0047 }
            goto L_0x003b
        L_0x0038:
            com.umeng.analytics.pro.a.b((android.database.sqlite.SQLiteDatabase) r1, (com.umeng.analytics.pro.f) r6)     // Catch:{ Exception -> 0x0047 }
        L_0x003b:
            android.content.Context r6 = f80681a
            com.umeng.analytics.pro.b r6 = com.umeng.analytics.pro.b.a(r6)
            r6.c()
            return
        L_0x0045:
            r6 = move-exception
            goto L_0x0052
        L_0x0047:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0045 }
            r6.a(r1, r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = "load agg data error"
            com.umeng.analytics.pro.by.e((java.lang.String) r6)     // Catch:{ all -> 0x0045 }
            goto L_0x003b
        L_0x0052:
            android.content.Context r0 = f80681a
            com.umeng.analytics.pro.b r0 = com.umeng.analytics.pro.b.a(r0)
            r0.c()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.o.a(com.umeng.analytics.pro.f):void");
    }

    /* JADX INFO: finally extract failed */
    public JSONObject b(f fVar) {
        try {
            JSONObject a2 = a.a(fVar, b.a(f80681a).a());
            b.a(f80681a).c();
            return a2;
        } catch (Exception unused) {
            b.a(f80681a).c();
            return null;
        } catch (Throwable th) {
            b.a(f80681a).c();
            throw th;
        }
    }

    public void c(f fVar, Map<List<String>, i> map) {
        try {
            a.a(fVar, b.a(f80681a).b(), map.values());
        } catch (Exception unused) {
            by.e("cacheToData error");
        } catch (Throwable th) {
            b.a(f80681a).c();
            throw th;
        }
        b.a(f80681a).c();
    }

    public void b(f fVar, Map<String, k> map) {
        try {
            a.a(b.a(f80681a).b(), (Map) map, fVar);
        } catch (Exception unused) {
            by.e("arrgetated system buffer exception");
        } catch (Throwable th) {
            b.a(f80681a).c();
            throw th;
        }
        b.a(f80681a).c();
    }

    public void a(f fVar, List<String> list) {
        try {
            a.a(fVar, b.a(f80681a).b(), list);
        } catch (Exception unused) {
            by.e("saveToLimitCKTable exception");
        } catch (Throwable th) {
            b.a(f80681a).c();
            throw th;
        }
        b.a(f80681a).c();
    }

    public void a(f fVar, Map<List<String>, i> map) {
        try {
            a.a(b.a(f80681a).b(), map.values());
            fVar.a("success", false);
        } catch (Exception unused) {
            by.e("save agg data error");
        } catch (Throwable th) {
            b.a(f80681a).c();
            throw th;
        }
        b.a(f80681a).c();
    }

    public void a(f fVar, boolean z) {
        try {
            a.a(b.a(f80681a).b(), z, fVar);
        } catch (Exception unused) {
            by.e("notifyUploadSuccess error");
        } catch (Throwable th) {
            b.a(f80681a).c();
            throw th;
        }
        b.a(f80681a).c();
    }

    public void a(f fVar, String str, long j, long j2) {
        try {
            a.a(b.a(f80681a).b(), str, j, j2);
            fVar.a("success", false);
        } catch (Exception unused) {
            by.e("package size to big or envelopeOverflowPackageCount exception");
        } catch (Throwable th) {
            b.a(f80681a).c();
            throw th;
        }
        b.a(f80681a).c();
    }
}
