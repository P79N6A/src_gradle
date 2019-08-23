package com.bytedance.ad.symphony.b;

import com.bytedance.ad.symphony.ad.a;
import com.bytedance.ad.symphony.c.b;
import com.bytedance.ad.symphony.c.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static b f7593a = null;

    /* renamed from: b  reason: collision with root package name */
    public static c f7594b = null;

    /* renamed from: c  reason: collision with root package name */
    private static final String f7595c = "f";

    public static boolean a() {
        if (f7593a == null && f7594b == null) {
            return false;
        }
        return true;
    }

    public static void a(a aVar) {
        if (a() && aVar != null) {
            a("ad_sdk_slot_fill", aVar);
        }
    }

    public static void a(String str) {
        if (a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_placement_type_prefix", str);
            a("ad_request_chain_fail_reset", "", 0, null, hashMap);
        }
    }

    public static void a(String str, a aVar) {
        if (aVar != null && aVar.a() != null && !(aVar instanceof com.bytedance.ad.symphony.ad.b)) {
            com.bytedance.ad.symphony.model.b a2 = aVar.a();
            a2.a();
            a(str, a2.g, a2.f7648d, a2.f7649e, a2.a());
        }
    }

    public static void a(String str, String str2, long j, JSONObject jSONObject, Map<String, Object> map) {
        a(str, str2, j, jSONObject, map, false);
    }

    public static void a(String str, String str2, long j, JSONObject jSONObject, Map<String, Object> map, boolean z) {
        if (a()) {
            final String str3 = str;
            final String str4 = str2;
            final long j2 = j;
            final JSONObject jSONObject2 = jSONObject;
            final Map<String, Object> map2 = map;
            final boolean z2 = z;
            AnonymousClass1 r1 = new Runnable() {
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0071 */
                /* JADX WARNING: Removed duplicated region for block: B:22:0x0079 A[Catch:{ Exception -> 0x00b1 }] */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x007f A[Catch:{ Exception -> 0x00b1 }] */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x0098 A[Catch:{ Exception -> 0x00b1 }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r13 = this;
                        java.lang.String r0 = r2     // Catch:{ Exception -> 0x00b1 }
                        java.lang.String r1 = r3     // Catch:{ Exception -> 0x00b1 }
                        long r1 = r4     // Catch:{ Exception -> 0x00b1 }
                        org.json.JSONObject r3 = r6     // Catch:{ Exception -> 0x00b1 }
                        java.util.Map r4 = r7     // Catch:{ Exception -> 0x00b1 }
                        boolean r5 = r8     // Catch:{ Exception -> 0x00b1 }
                        com.bytedance.ad.symphony.c.b r6 = com.bytedance.ad.symphony.b.f.f7593a     // Catch:{ Exception -> 0x00b1 }
                        r7 = 1
                        if (r6 == 0) goto L_0x0071
                        org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b1 }
                        r6.<init>()     // Catch:{ Exception -> 0x00b1 }
                        if (r4 == 0) goto L_0x001e
                        java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x00b1 }
                        r8.<init>(r4)     // Catch:{ Exception -> 0x00b1 }
                        goto L_0x0023
                    L_0x001e:
                        java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x00b1 }
                        r8.<init>()     // Catch:{ Exception -> 0x00b1 }
                    L_0x0023:
                        org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0071 }
                        r9.<init>()     // Catch:{ Exception -> 0x0071 }
                        java.util.Set r10 = r8.keySet()     // Catch:{ Exception -> 0x0071 }
                        java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x0071 }
                    L_0x0030:
                        boolean r11 = r10.hasNext()     // Catch:{ Exception -> 0x0071 }
                        if (r11 == 0) goto L_0x0044
                        java.lang.Object r11 = r10.next()     // Catch:{ Exception -> 0x0071 }
                        java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0071 }
                        java.lang.Object r12 = r8.get(r11)     // Catch:{ Exception -> 0x0071 }
                        r9.put(r11, r12)     // Catch:{ Exception -> 0x0071 }
                        goto L_0x0030
                    L_0x0044:
                        java.lang.String r8 = "ad_extra_data"
                        java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0071 }
                        r6.put(r8, r9)     // Catch:{ Exception -> 0x0071 }
                        java.lang.String r8 = "is_ad_event"
                        r6.put(r8, r7)     // Catch:{ Exception -> 0x0071 }
                        java.lang.String r8 = "ad_slot_receive"
                        boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0071 }
                        if (r0 != 0) goto L_0x0066
                        java.lang.String r0 = "is_i18n_sdk"
                        r6.put(r0, r7)     // Catch:{ Exception -> 0x0071 }
                        java.lang.String r0 = "refer"
                        java.lang.String r8 = "sdk"
                        r6.put(r0, r8)     // Catch:{ Exception -> 0x0071 }
                    L_0x0066:
                        if (r3 == 0) goto L_0x0071
                        java.lang.String r0 = "log_extra"
                        java.lang.String r8 = r3.toString()     // Catch:{ Exception -> 0x0071 }
                        r6.put(r0, r8)     // Catch:{ Exception -> 0x0071 }
                    L_0x0071:
                        com.bytedance.ad.symphony.c.c r0 = com.bytedance.ad.symphony.b.f.f7594b     // Catch:{ Exception -> 0x00b1 }
                        if (r0 == 0) goto L_0x00b0
                        if (r5 != 0) goto L_0x00b0
                        if (r4 == 0) goto L_0x007f
                        java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x00b1 }
                        r0.<init>(r4)     // Catch:{ Exception -> 0x00b1 }
                        goto L_0x0084
                    L_0x007f:
                        java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x00b1 }
                        r0.<init>()     // Catch:{ Exception -> 0x00b1 }
                    L_0x0084:
                        java.lang.String r4 = "_ad_flag"
                        java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00b1 }
                        r0.put(r4, r5)     // Catch:{ Exception -> 0x00b1 }
                        java.lang.String r4 = "ad_id"
                        java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x00b1 }
                        r0.put(r4, r1)     // Catch:{ Exception -> 0x00b1 }
                        if (r3 == 0) goto L_0x00b0
                        java.util.Iterator r1 = r3.keys()     // Catch:{ Exception -> 0x00b1 }
                    L_0x009c:
                        boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00b1 }
                        if (r2 == 0) goto L_0x00b0
                        java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00b1 }
                        java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b1 }
                        java.lang.Object r4 = r3.opt(r2)     // Catch:{ Exception -> 0x00b1 }
                        r0.put(r2, r4)     // Catch:{ Exception -> 0x00b1 }
                        goto L_0x009c
                    L_0x00b0:
                        return
                    L_0x00b1:
                        r0 = move-exception
                        com.bytedance.ad.symphony.d.a(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ad.symphony.b.f.AnonymousClass1.run():void");
                }
            };
            com.bytedance.ad.symphony.g.a.a((Runnable) r1);
        }
    }
}
