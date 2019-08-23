package com.monitor.cloudmessage.a;

import com.monitor.cloudmessage.d.b.b;
import com.monitor.cloudmessage.e.d;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, Long> f27310a = new ConcurrentHashMap<>();

    public abstract String a();

    public abstract boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception;

    protected static void b(com.monitor.cloudmessage.entity.a aVar) {
        b bVar = new b(0, false, aVar.f27362d, null);
        bVar.l = 2;
        com.monitor.cloudmessage.d.a.a(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[Catch:{ Exception -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.monitor.cloudmessage.entity.a r10) {
        /*
            r9 = this;
            java.lang.String r0 = r9.a()
            java.lang.String r1 = r10.f27360b
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            r0 = 1
            java.lang.String[] r2 = com.monitor.cloudmessage.a.g()     // Catch:{ Exception -> 0x0090 }
            if (r2 == 0) goto L_0x002e
            java.lang.String[] r2 = com.monitor.cloudmessage.a.g()     // Catch:{ Exception -> 0x0090 }
            int r3 = r2.length     // Catch:{ Exception -> 0x0090 }
            r4 = 0
        L_0x001b:
            if (r4 >= r3) goto L_0x002e
            r5 = r2[r4]     // Catch:{ Exception -> 0x0090 }
            java.lang.String r6 = r9.a()     // Catch:{ Exception -> 0x0090 }
            boolean r5 = r6.equals(r5)     // Catch:{ Exception -> 0x0090 }
            if (r5 == 0) goto L_0x002b
            r2 = 1
            goto L_0x002f
        L_0x002b:
            int r4 = r4 + 1
            goto L_0x001b
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 == 0) goto L_0x0048
            com.monitor.cloudmessage.d.b.b r2 = new com.monitor.cloudmessage.d.b.b     // Catch:{ Exception -> 0x0090 }
            r4 = 0
            r6 = 0
            java.lang.String r7 = r10.f27362d     // Catch:{ Exception -> 0x0090 }
            r8 = 0
            r3 = r2
            r3.<init>(r4, r6, r7, r8)     // Catch:{ Exception -> 0x0090 }
            r3 = 3
            r2.l = r3     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "当前云控指令已被sdk禁用"
            r2.m = r3     // Catch:{ Exception -> 0x0090 }
            com.monitor.cloudmessage.d.a.a((com.monitor.cloudmessage.d.b.b) r2)     // Catch:{ Exception -> 0x0090 }
            return r0
        L_0x0048:
            java.lang.String r2 = r10.f27362d     // Catch:{ Exception -> 0x0090 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r3 = f27310a     // Catch:{ Exception -> 0x0090 }
            boolean r3 = r3.containsKey(r2)     // Catch:{ Exception -> 0x0090 }
            if (r3 == 0) goto L_0x007a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r3 = f27310a     // Catch:{ Exception -> 0x0090 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x0090 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ Exception -> 0x0090 }
            long r3 = r3.longValue()     // Catch:{ Exception -> 0x0090 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0090 }
            r7 = 0
            long r5 = r5 - r3
            r3 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x006c
            r2 = 0
            goto L_0x0088
        L_0x006c:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r3 = f27310a     // Catch:{ Exception -> 0x0090 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0090 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0090 }
            r3.put(r2, r4)     // Catch:{ Exception -> 0x0090 }
            goto L_0x0087
        L_0x007a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r3 = f27310a     // Catch:{ Exception -> 0x0090 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0090 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0090 }
            r3.put(r2, r4)     // Catch:{ Exception -> 0x0090 }
        L_0x0087:
            r2 = 1
        L_0x0088:
            if (r2 == 0) goto L_0x008f
            boolean r2 = r9.c(r10)     // Catch:{ Exception -> 0x0090 }
            return r2
        L_0x008f:
            return r1
        L_0x0090:
            r2 = move-exception
            java.lang.String r3 = "系统错误：%s"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.io.StringWriter r4 = new java.io.StringWriter
            r4.<init>()
            java.io.PrintWriter r5 = new java.io.PrintWriter
            r5.<init>(r4)
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r2, (java.io.PrintWriter) r5)
            java.lang.String r2 = r4.toString()
            r0[r1] = r2
            java.lang.String r0 = java.lang.String.format(r3, r0)
            a((java.lang.String) r0, (com.monitor.cloudmessage.entity.a) r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.a.a.a(com.monitor.cloudmessage.entity.a):boolean");
    }

    protected static void a(String str, com.monitor.cloudmessage.entity.a aVar) {
        b bVar = new b(0, false, aVar.f27362d, null);
        bVar.l = 3;
        bVar.m = str;
        com.monitor.cloudmessage.d.a.a(bVar);
    }

    protected static boolean a(JSONObject jSONObject, com.monitor.cloudmessage.entity.a aVar) {
        if (jSONObject.optBoolean("wifiOnly", false)) {
            com.monitor.cloudmessage.a.a();
            if (!d.a(com.monitor.cloudmessage.a.b())) {
                b bVar = new b(0, false, aVar.f27362d, null);
                bVar.l = 0;
                bVar.m = "4G环境下不执行指令";
                com.monitor.cloudmessage.d.a.a(bVar);
                return true;
            }
        }
        return false;
    }

    protected static void a(String str, HashMap<String, String> hashMap, com.monitor.cloudmessage.entity.a aVar) {
        b bVar = new b(0, false, aVar.f27362d, hashMap);
        bVar.l = 3;
        bVar.m = str;
        com.monitor.cloudmessage.d.a.a(bVar);
    }
}
