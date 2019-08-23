package com.bytedance.frameworks.core.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.frameworks.core.a.b.e;
import com.bytedance.frameworks.core.a.c.a;
import com.bytedance.frameworks.core.a.c.d;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f19883a = true;

    /* renamed from: b  reason: collision with root package name */
    int f19884b = 120;

    /* renamed from: c  reason: collision with root package name */
    int f19885c = 100;

    /* renamed from: d  reason: collision with root package name */
    public c f19886d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f19887e;

    /* renamed from: f  reason: collision with root package name */
    String f19888f;
    private long g;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4 A[Catch:{ Exception -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8 A[Catch:{ Exception -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de A[Catch:{ Exception -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ef A[Catch:{ Exception -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff A[Catch:{ Exception -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0102 A[Catch:{ Exception -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0106 A[Catch:{ Exception -> 0x0110 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r21 = this;
            r8 = r21
            boolean r0 = r8.f19883a
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.frameworks.core.a.c r2 = r8.f19886d
            long r2 = r2.a()
            int r4 = r8.f19885c
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0026
            long r2 = r8.g
            long r2 = r0 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            int r4 = r8.f19884b
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0135
        L_0x0026:
            r8.g = r0
            java.lang.String r0 = r8.f19888f
            java.util.List r0 = com.bytedance.frameworks.core.a.a.c.a(r0)
            if (r0 == 0) goto L_0x0135
            java.util.Iterator r9 = r0.iterator()
        L_0x0034:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r9.next()
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = r8.f19888f
            java.util.List r0 = com.bytedance.frameworks.core.a.a.c.a((java.lang.String) r0, (java.lang.String) r10)
            com.bytedance.frameworks.core.a.c r1 = r8.f19886d
            r2 = 100
            java.util.List r0 = r1.a((java.util.List<java.lang.String>) r0, (int) r2)
            if (r0 == 0) goto L_0x0034
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x0034
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x0132 }
            r1.<init>()     // Catch:{ Exception -> 0x0132 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0132 }
            r2.<init>()     // Catch:{ Exception -> 0x0132 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x0132 }
            r3.<init>()     // Catch:{ Exception -> 0x0132 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0132 }
            r11.<init>()     // Catch:{ Exception -> 0x0132 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ Exception -> 0x0132 }
            r13 = -1
            r16 = 1
            r4 = r3
            r5 = r13
            r17 = 1
            r18 = 0
            r3 = r2
            r2 = r1
        L_0x007b:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x0132 }
            if (r0 == 0) goto L_0x0116
            java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x0132 }
            r7 = r0
            com.bytedance.frameworks.core.a.b.d r7 = (com.bytedance.frameworks.core.a.b.d) r7     // Catch:{ Exception -> 0x0132 }
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0090
            long r5 = r7.f19906e     // Catch:{ Exception -> 0x0132 }
        L_0x008e:
            r13 = r7
            goto L_0x00bc
        L_0x0090:
            long r0 = r7.f19906e     // Catch:{ Exception -> 0x0132 }
            int r19 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r19 == 0) goto L_0x008e
            r19 = 0
            r0 = r21
            r1 = r10
            r13 = r7
            r7 = r19
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r7)     // Catch:{ Exception -> 0x0132 }
            if (r0 == 0) goto L_0x00a8
            if (r17 == 0) goto L_0x00a8
            r0 = 1
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            long r5 = r13.f19906e     // Catch:{ Exception -> 0x0132 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0132 }
            r2.<init>()     // Catch:{ Exception -> 0x0132 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x0132 }
            r3.<init>()     // Catch:{ Exception -> 0x0132 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x0132 }
            r4.<init>()     // Catch:{ Exception -> 0x0132 }
            r17 = r0
        L_0x00bc:
            long r0 = r13.f19902a     // Catch:{ Exception -> 0x0132 }
            java.lang.String r7 = r13.f19903b     // Catch:{ Exception -> 0x0132 }
            java.lang.String r13 = r13.f19905d     // Catch:{ Exception -> 0x0132 }
            if (r18 != 0) goto L_0x00c8
            r11.append(r0)     // Catch:{ Exception -> 0x0132 }
            goto L_0x00d0
        L_0x00c8:
            java.lang.String r14 = ","
            r11.append(r14)     // Catch:{ Exception -> 0x0132 }
            r11.append(r0)     // Catch:{ Exception -> 0x0132 }
        L_0x00d0:
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x0110 }
            r14.<init>(r13)     // Catch:{ Exception -> 0x0110 }
            int r13 = r7.hashCode()     // Catch:{ Exception -> 0x0110 }
            r15 = 94851343(0x5a7510f, float:1.5734381E-35)
            if (r13 == r15) goto L_0x00ef
            r15 = 110364485(0x6940745, float:5.5682094E-35)
            if (r13 == r15) goto L_0x00e4
            goto L_0x00fa
        L_0x00e4:
            java.lang.String r13 = "timer"
            boolean r7 = r7.equals(r13)     // Catch:{ Exception -> 0x0110 }
            if (r7 == 0) goto L_0x00fa
            r20 = 1
            goto L_0x00fc
        L_0x00ef:
            java.lang.String r13 = "count"
            boolean r7 = r7.equals(r13)     // Catch:{ Exception -> 0x0110 }
            if (r7 == 0) goto L_0x00fa
            r20 = 0
            goto L_0x00fc
        L_0x00fa:
            r20 = -1
        L_0x00fc:
            switch(r20) {
                case 0: goto L_0x0106;
                case 1: goto L_0x0102;
                default: goto L_0x00ff;
            }     // Catch:{ Exception -> 0x0110 }
        L_0x00ff:
            java.lang.String r7 = "log_id"
            goto L_0x010a
        L_0x0102:
            r4.put(r14)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0110
        L_0x0106:
            r3.put(r14)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0110
        L_0x010a:
            r14.put(r7, r0)     // Catch:{ Exception -> 0x0110 }
            r2.put(r14)     // Catch:{ Exception -> 0x0110 }
        L_0x0110:
            int r18 = r18 + 1
            r13 = -1
            goto L_0x007b
        L_0x0116:
            r7 = 0
            r0 = r21
            r1 = r10
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r7)     // Catch:{ Exception -> 0x0132 }
            if (r0 == 0) goto L_0x0123
            if (r17 == 0) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r16 = 0
        L_0x0125:
            if (r16 == 0) goto L_0x0034
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0132 }
            com.bytedance.frameworks.core.a.c r1 = r8.f19886d     // Catch:{ Exception -> 0x0132 }
            r1.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0132 }
            goto L_0x0034
        L_0x0132:
            goto L_0x0034
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.b.a():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4 A[Catch:{ Throwable -> 0x01d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.frameworks.core.a.b.g r32) {
        /*
            r31 = this;
            r8 = r31
            r0 = r32
            long r9 = r0.f19919a     // Catch:{ Throwable -> 0x01d6 }
            long r11 = r0.f19920b     // Catch:{ Throwable -> 0x01d6 }
            java.util.List<java.lang.String> r0 = r0.f19921c     // Catch:{ Throwable -> 0x01d6 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Throwable -> 0x01d6 }
            r1.<init>()     // Catch:{ Throwable -> 0x01d6 }
            if (r0 == 0) goto L_0x0070
            int r2 = r0.size()     // Catch:{ Throwable -> 0x01d6 }
            if (r2 != 0) goto L_0x0018
            goto L_0x0070
        L_0x0018:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x01d6 }
        L_0x001c:
            boolean r2 = r0.hasNext()     // Catch:{ Throwable -> 0x01d6 }
            if (r2 == 0) goto L_0x0093
            java.lang.Object r2 = r0.next()     // Catch:{ Throwable -> 0x01d6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x01d6 }
            java.lang.String r3 = r8.f19888f     // Catch:{ Throwable -> 0x01d6 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x01d6 }
            if (r4 != 0) goto L_0x0045
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.frameworks.core.a.a.b> r4 = com.bytedance.frameworks.core.a.a.c.f19882b     // Catch:{ Throwable -> 0x01d6 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Throwable -> 0x01d6 }
            if (r4 == 0) goto L_0x0045
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.frameworks.core.a.a.b> r4 = com.bytedance.frameworks.core.a.a.c.f19882b     // Catch:{ Throwable -> 0x01d6 }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ Throwable -> 0x01d6 }
            com.bytedance.frameworks.core.a.a.b r3 = (com.bytedance.frameworks.core.a.a.b) r3     // Catch:{ Throwable -> 0x01d6 }
            java.lang.String r3 = r3.e()     // Catch:{ Throwable -> 0x01d6 }
            goto L_0x004b
        L_0x0045:
            com.bytedance.frameworks.core.a.a.b r3 = com.bytedance.frameworks.core.a.a.c.f19881a     // Catch:{ Throwable -> 0x01d6 }
            java.lang.String r3 = r3.e()     // Catch:{ Throwable -> 0x01d6 }
        L_0x004b:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x01d6 }
            if (r4 != 0) goto L_0x001c
            boolean r4 = r1.containsKey(r3)     // Catch:{ Throwable -> 0x01d6 }
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r1.get(r3)     // Catch:{ Throwable -> 0x01d6 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ Throwable -> 0x01d6 }
            r4.add(r2)     // Catch:{ Throwable -> 0x01d6 }
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x01d6 }
            goto L_0x001c
        L_0x0064:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x01d6 }
            r4.<init>()     // Catch:{ Throwable -> 0x01d6 }
            r4.add(r2)     // Catch:{ Throwable -> 0x01d6 }
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x01d6 }
            goto L_0x001c
        L_0x0070:
            java.lang.String r0 = r8.f19888f     // Catch:{ Throwable -> 0x01d6 }
            java.util.List r0 = com.bytedance.frameworks.core.a.a.c.a(r0)     // Catch:{ Throwable -> 0x01d6 }
            if (r0 != 0) goto L_0x0079
            return
        L_0x0079:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x01d6 }
        L_0x007d:
            boolean r2 = r0.hasNext()     // Catch:{ Throwable -> 0x01d6 }
            if (r2 == 0) goto L_0x0093
            java.lang.Object r2 = r0.next()     // Catch:{ Throwable -> 0x01d6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x01d6 }
            java.lang.String r3 = r8.f19888f     // Catch:{ Throwable -> 0x01d6 }
            java.util.List r3 = com.bytedance.frameworks.core.a.a.c.a((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ Throwable -> 0x01d6 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x01d6 }
            goto L_0x007d
        L_0x0093:
            java.util.Set r0 = r1.entrySet()     // Catch:{ Throwable -> 0x01d6 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ Throwable -> 0x01d6 }
            r0 = 0
            r1 = 1
            r2 = 0
        L_0x009e:
            boolean r3 = r13.hasNext()     // Catch:{ Throwable -> 0x01d6 }
            if (r3 == 0) goto L_0x01d5
            java.lang.Object r3 = r13.next()     // Catch:{ Throwable -> 0x01d6 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Throwable -> 0x01d6 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ Throwable -> 0x01d6 }
            r16 = r4
            java.util.List r16 = (java.util.List) r16     // Catch:{ Throwable -> 0x01d6 }
            java.lang.Object r3 = r3.getKey()     // Catch:{ Throwable -> 0x01d6 }
            r17 = r3
            java.lang.String r17 = (java.lang.String) r17     // Catch:{ Throwable -> 0x01d6 }
            r7 = r0
            r18 = r1
            r19 = r2
        L_0x00bf:
            com.bytedance.frameworks.core.a.c r0 = r8.f19886d     // Catch:{ Throwable -> 0x01d6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01d6 }
            r1.<init>()     // Catch:{ Throwable -> 0x01d6 }
            r1.append(r7)     // Catch:{ Throwable -> 0x01d6 }
            java.lang.String r2 = ",400"
            r1.append(r2)     // Catch:{ Throwable -> 0x01d6 }
            java.lang.String r6 = r1.toString()     // Catch:{ Throwable -> 0x01d6 }
            r1 = r9
            r3 = r11
            r5 = r16
            java.util.List r0 = r0.a((long) r1, (long) r3, (java.util.List<java.lang.String>) r5, (java.lang.String) r6)     // Catch:{ Throwable -> 0x01d6 }
            if (r0 == 0) goto L_0x01bf
            int r1 = r0.size()     // Catch:{ Throwable -> 0x01d6 }
            if (r1 <= 0) goto L_0x01bf
            int r20 = r0.size()     // Catch:{ Throwable -> 0x01d6 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Throwable -> 0x01d6 }
            r1.<init>()     // Catch:{ Throwable -> 0x01d6 }
            java.util.Iterator r21 = r0.iterator()     // Catch:{ Throwable -> 0x01d6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01d6 }
            r5.<init>()     // Catch:{ Throwable -> 0x01d6 }
            r22 = -1
            r26 = r18
            r24 = r22
            r27 = 0
            r18 = r1
        L_0x00fe:
            boolean r0 = r21.hasNext()     // Catch:{ Throwable -> 0x01d6 }
            if (r0 == 0) goto L_0x0183
            java.lang.Object r0 = r21.next()     // Catch:{ Exception -> 0x0179 }
            r6 = r0
            com.bytedance.frameworks.core.a.b.d r6 = (com.bytedance.frameworks.core.a.b.d) r6     // Catch:{ Exception -> 0x0179 }
            int r0 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r0 != 0) goto L_0x011b
            long r0 = r6.f19906e     // Catch:{ Exception -> 0x0179 }
            r24 = r0
            r14 = r5
            r15 = r6
            r29 = r9
            r3 = r18
            r9 = r7
            goto L_0x015a
        L_0x011b:
            long r0 = r6.f19906e     // Catch:{ Exception -> 0x0179 }
            int r2 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r2 == 0) goto L_0x0153
            r3 = 0
            r4 = 0
            r28 = 1
            r0 = r31
            r1 = r17
            r2 = r18
            r14 = r5
            r15 = r6
            r5 = r24
            r29 = r9
            r9 = r7
            r7 = r28
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r7)     // Catch:{ Exception -> 0x017d }
            if (r0 == 0) goto L_0x013e
            if (r26 == 0) goto L_0x013e
            r0 = 1
            goto L_0x013f
        L_0x013e:
            r0 = 0
        L_0x013f:
            long r1 = r15.f19906e     // Catch:{ Exception -> 0x0150 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x014b }
            r3.<init>()     // Catch:{ Exception -> 0x014b }
            r26 = r0
            r24 = r1
            goto L_0x015a
        L_0x014b:
            r26 = r0
            r24 = r1
            goto L_0x017d
        L_0x0150:
            r26 = r0
            goto L_0x017d
        L_0x0153:
            r14 = r5
            r15 = r6
            r29 = r9
            r9 = r7
            r3 = r18
        L_0x015a:
            long r0 = r15.f19902a     // Catch:{ Exception -> 0x0176 }
            if (r27 != 0) goto L_0x0162
            r14.append(r0)     // Catch:{ Exception -> 0x0176 }
            goto L_0x016a
        L_0x0162:
            java.lang.String r2 = ","
            r14.append(r2)     // Catch:{ Exception -> 0x0176 }
            r14.append(r0)     // Catch:{ Exception -> 0x0176 }
        L_0x016a:
            int r27 = r27 + 1
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0176 }
            java.lang.String r1 = r15.f19905d     // Catch:{ Exception -> 0x0176 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0176 }
            r3.put(r0)     // Catch:{ Exception -> 0x0176 }
        L_0x0176:
            r18 = r3
            goto L_0x017d
        L_0x0179:
            r14 = r5
            r29 = r9
            r9 = r7
        L_0x017d:
            r7 = r9
            r5 = r14
            r9 = r29
            goto L_0x00fe
        L_0x0183:
            r14 = r5
            r29 = r9
            r9 = r7
            r3 = 0
            r4 = 0
            r7 = 1
            r0 = r31
            r1 = r17
            r2 = r18
            r5 = r24
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r7)     // Catch:{ Throwable -> 0x01d6 }
            if (r0 == 0) goto L_0x019c
            if (r26 == 0) goto L_0x019c
            r0 = 1
            goto L_0x019d
        L_0x019c:
            r0 = 0
        L_0x019d:
            if (r0 == 0) goto L_0x01af
            java.lang.String r1 = r14.toString()     // Catch:{ Throwable -> 0x01d6 }
            com.bytedance.frameworks.core.a.c r2 = r8.f19886d     // Catch:{ Throwable -> 0x01d6 }
            int r1 = r2.a((java.lang.String) r1)     // Catch:{ Throwable -> 0x01d6 }
            if (r1 > 0) goto L_0x01ac
            goto L_0x01af
        L_0x01ac:
            r15 = r19
            goto L_0x01b0
        L_0x01af:
            r15 = 1
        L_0x01b0:
            if (r15 == 0) goto L_0x01b7
            int r7 = r9 + 400
            r18 = r0
            goto L_0x01ba
        L_0x01b7:
            r18 = r0
            r7 = r9
        L_0x01ba:
            r19 = r15
            r0 = r20
            goto L_0x01c4
        L_0x01bf:
            r29 = r9
            r9 = r7
            r7 = r9
            r0 = 0
        L_0x01c4:
            r1 = 400(0x190, float:5.6E-43)
            if (r0 == r1) goto L_0x01d1
            r0 = r7
            r1 = r18
            r2 = r19
            r9 = r29
            goto L_0x009e
        L_0x01d1:
            r9 = r29
            goto L_0x00bf
        L_0x01d5:
            return
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.a.b.a(com.bytedance.frameworks.core.a.b.g):void");
    }

    protected b(Context context, String str, c cVar) {
        this.f19888f = str;
        this.f19886d = cVar;
        a aVar = new a(context, str, "monitor");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty("monitor")) {
            ConcurrentHashMap<String, com.bytedance.frameworks.core.a.c.b> concurrentHashMap = d.f19940a;
            concurrentHashMap.put(str + "monitor", aVar);
        }
    }

    private boolean a(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, long j, boolean z) {
        boolean z2;
        try {
            JSONObject jSONObject = new JSONObject();
            if (com.bytedance.frameworks.core.a.d.a.a(jSONArray)) {
                jSONObject.put("data", jSONArray);
            }
            if (com.bytedance.frameworks.core.a.d.a.a(jSONArray2)) {
                jSONObject.put("count", jSONArray2);
            }
            if (com.bytedance.frameworks.core.a.d.a.a(jSONArray3)) {
                jSONObject.put("timer", jSONArray3);
            }
            if (jSONObject.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 || this.f19887e == null) {
                return true;
            }
            JSONObject jSONObject2 = new JSONObject(this.f19887e.toString());
            e b2 = this.f19886d.b(j);
            if (b2 != null) {
                if (!TextUtils.isEmpty(b2.f19909b)) {
                    jSONObject2.put("version_code", b2.f19909b);
                }
                if (!TextUtils.isEmpty(b2.f19910c)) {
                    jSONObject2.put("version_name", b2.f19910c);
                }
                if (!TextUtils.isEmpty(b2.f19911d)) {
                    jSONObject2.put("manifest_version_code", b2.f19911d);
                }
                if (!TextUtils.isEmpty(b2.f19912e)) {
                    jSONObject2.put("update_version_code", b2.f19912e);
                }
            }
            jSONObject2.put("debug_fetch", z ? 1 : 0);
            jSONObject.put("header", jSONObject2);
            String str2 = this.f19888f;
            String jSONObject3 = jSONObject.toString();
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(jSONObject3)) {
                    ConcurrentHashMap<String, com.bytedance.frameworks.core.a.c.b> concurrentHashMap = d.f19940a;
                    com.bytedance.frameworks.core.a.c.b bVar = concurrentHashMap.get(str2 + str);
                    if (bVar.a()) {
                        return false;
                    }
                    return bVar.a(jSONObject3);
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
