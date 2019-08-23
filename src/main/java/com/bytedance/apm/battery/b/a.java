package com.bytedance.apm.battery.b;

import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.f.b;
import com.bytedance.apm.k.i;
import com.ss.android.common.util.ToolUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f18907a;

    /* renamed from: b  reason: collision with root package name */
    public String f18908b;

    /* renamed from: c  reason: collision with root package name */
    String f18909c;

    /* renamed from: d  reason: collision with root package name */
    String f18910d;

    /* renamed from: e  reason: collision with root package name */
    boolean f18911e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedList<b> f18912f;
    private com.bytedance.frameworks.core.apm.a.b.a g;

    /* renamed from: com.bytedance.apm.battery.b.a$a  reason: collision with other inner class name */
    static class C0139a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18916a = new a((byte) 0);
    }

    public static a a() {
        return C0139a.f18916a;
    }

    public final void b() {
        com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
            public final void run() {
                LinkedList linkedList;
                boolean z;
                a aVar = a.this;
                b bVar = new b();
                List<b> a2 = aVar.a(true, 0);
                if (!i.a(a2)) {
                    try {
                        z = aVar.a(bVar, a2);
                    } catch (Exception unused) {
                        z = false;
                    }
                    b bVar2 = a2.get(a2.size() - 1);
                    long j = bVar2.f18981a;
                    long j2 = bVar2.f18983c;
                    if (!z) {
                        if (c.d()) {
                            new String[1][0] = "report main proccess data failed, clean data and stop calc data of other process";
                        }
                        aVar.a(j);
                    } else {
                        if (c.d()) {
                            new String[1][0] = "report main proccess data over, begin handle other process data";
                        }
                        List<b> a3 = aVar.a(false, j2);
                        HashMap hashMap = new HashMap(4);
                        for (b next : a3) {
                            String str = next.j;
                            if (hashMap.containsKey(str)) {
                                ((List) hashMap.get(str)).add(next);
                            } else {
                                LinkedList linkedList2 = new LinkedList();
                                linkedList2.add(next);
                                hashMap.put(str, linkedList2);
                            }
                        }
                        try {
                            for (List a4 : hashMap.values()) {
                                aVar.a(bVar, a4);
                            }
                        } catch (Exception unused2) {
                        }
                        bVar.h = (long) bVar.t;
                        bVar.f18921e = (long) bVar.w;
                        bVar.f18922f = (long) bVar.u;
                        bVar.i = bVar.x;
                        bVar.g = (long) bVar.v;
                        bVar.f18917a = bVar.r;
                        bVar.m = (long) bVar.y;
                        bVar.j = (long) bVar.B;
                        bVar.k = (long) bVar.z;
                        bVar.n = bVar.C;
                        bVar.l = (long) bVar.A;
                        bVar.f18918b = bVar.s;
                        bVar.o = false;
                        bVar.p = "all_process";
                        try {
                            bVar.a(false);
                        } catch (Exception unused3) {
                        }
                        aVar.a(j);
                    }
                }
                a.this.f18907a = true;
                synchronized (a.this.f18912f) {
                    linkedList = new LinkedList(a.this.f18912f);
                    a.this.f18912f.clear();
                }
                Iterator it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    a.this.a((b) it2.next());
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public com.bytedance.frameworks.core.apm.a.b.a c() {
        if (this.g == null) {
            this.g = new com.bytedance.frameworks.core.apm.a.b.a();
        }
        return this.g;
    }

    private a() {
        this.f18908b = "";
        this.f18911e = true;
        this.f18912f = new LinkedList<>();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(long j) {
        try {
            c().b(j);
        } catch (Exception unused) {
        }
    }

    public final void a(final b bVar) {
        if (bVar != null) {
            if (c.d()) {
                new String[1][0] = "record batteryLog: " + bVar.toString();
            }
            com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
                public final void run() {
                    a aVar = a.this;
                    b bVar = bVar;
                    if (c.d()) {
                        new String[1][0] = "record batteryLog: " + bVar.toString() + " , sReportedInMainProcess: " + aVar.f18907a;
                    }
                    if (!aVar.f18907a) {
                        if (TextUtils.isEmpty(aVar.f18910d)) {
                            aVar.f18911e = ToolUtils.isMainProcess(c.a());
                            aVar.f18910d = ToolUtils.getCurProcessName(c.a());
                        }
                        if (aVar.f18911e) {
                            bVar.f18986f = aVar.f18908b;
                            synchronized (aVar.f18912f) {
                                if (aVar.f18912f.size() > 100) {
                                    aVar.f18912f.poll();
                                }
                                aVar.f18912f.add(bVar);
                            }
                            return;
                        }
                    }
                    if (TextUtils.isEmpty(aVar.f18909c)) {
                        aVar.f18909c = String.valueOf(System.currentTimeMillis());
                    }
                    bVar.k = aVar.f18911e;
                    bVar.j = aVar.f18910d;
                    bVar.l = aVar.f18909c;
                    if (TextUtils.isEmpty(bVar.f18986f)) {
                        bVar.f18986f = aVar.f18908b;
                    }
                    try {
                        if (c.d()) {
                            new String[1][0] = "saveBatteryLog into db: " + bVar;
                        }
                        aVar.c().a(bVar);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public final List<b> a(boolean z, long j) {
        try {
            return c().a(z, j);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(b bVar, List<b> list) throws Exception {
        boolean z;
        b(bVar, list);
        int i = 0;
        if (!bVar.o || (bVar.b() && bVar.c())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            bVar.a();
            if (c.d()) {
                new String[1][0] = "main process front or back duration is not valid, stop report ";
            }
            return false;
        }
        List<com.bytedance.apm.battery.c.i> list2 = com.bytedance.apm.battery.a.a().f1919a;
        int size = list.size();
        int i2 = bVar.f18919c;
        int i3 = bVar.f18920d;
        if (i3 - i2 <= 0) {
            return false;
        }
        if (i2 >= 0 && i2 < size) {
            i = i2;
        }
        if (i3 <= 0 || i3 >= size) {
            i3 = size - 1;
        }
        for (com.bytedance.apm.battery.c.i a2 : list2) {
            a2.a(bVar, list, i, i3);
        }
        return bVar.a(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(com.bytedance.apm.battery.b.b r27, java.util.List<com.bytedance.apm.f.b> r28) {
        /*
            r0 = r27
            r1 = r28
            int r2 = r28.size()
            int r3 = r28.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            r10 = 0
            r15 = r3
            r12 = r10
            r3 = 0
            r4 = -1
            r6 = 0
            r10 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r20 = 0
        L_0x0024:
            if (r3 >= r2) goto L_0x00e6
            java.lang.Object r22 = r1.get(r3)
            r8 = r22
            com.bytedance.apm.f.b r8 = (com.bytedance.apm.f.b) r8
            java.lang.String r9 = r8.f18984d
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x00d9
            java.lang.String r9 = r8.l
            if (r12 != 0) goto L_0x0045
            r5.append(r9)
            java.lang.String r12 = ","
            r5.append(r12)
        L_0x0042:
            r25 = r2
            goto L_0x0074
        L_0x0045:
            if (r12 == 0) goto L_0x0042
            boolean r22 = android.text.TextUtils.equals(r12, r9)
            if (r22 != 0) goto L_0x0042
            r22 = 0
            int r16 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r16 <= 0) goto L_0x0062
            java.lang.Object r16 = r1.get(r15)
            r25 = r2
            r2 = r16
            com.bytedance.apm.f.b r2 = (com.bytedance.apm.f.b) r2
            long r0 = r2.f18983c
            long r0 = r0 - r10
            long r13 = r13 + r0
            goto L_0x0064
        L_0x0062:
            r25 = r2
        L_0x0064:
            r5.append(r12)
            java.lang.String r0 = ","
            r5.append(r0)
            r10 = 0
            r16 = 0
            r18 = 0
            r20 = 0
        L_0x0074:
            boolean r0 = r8.a()
            if (r0 == 0) goto L_0x00ab
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x00a6
            long r10 = r8.f18983c
            int r2 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x009f
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x009f
            r26 = r9
            long r8 = r8.f18983c
            long r20 = r8 - r18
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x009c
            long r6 = r6 + r20
            r0 = -1
            r18 = 0
            r20 = 0
            goto L_0x00a2
        L_0x009c:
            r20 = r8
            goto L_0x00a1
        L_0x009f:
            r26 = r9
        L_0x00a1:
            r0 = -1
        L_0x00a2:
            if (r4 != r0) goto L_0x00a9
            r4 = r3
            goto L_0x00a9
        L_0x00a6:
            r26 = r9
            r0 = -1
        L_0x00a9:
            r15 = r3
            goto L_0x00d6
        L_0x00ab:
            r26 = r9
            r0 = -1
            boolean r1 = r8.f18982b
            if (r1 == 0) goto L_0x00d6
            r23 = 0
            int r1 = (r16 > r23 ? 1 : (r16 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x00d6
            int r1 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d6
            long r1 = r8.f18983c
            long r16 = r1 - r10
            int r9 = (r16 > r23 ? 1 : (r16 == r23 ? 0 : -1))
            if (r9 < 0) goto L_0x00c9
            long r13 = r13 + r16
            r1 = r23
            r10 = r1
        L_0x00c9:
            int r9 = (r18 > r23 ? 1 : (r18 == r23 ? 0 : -1))
            if (r9 != 0) goto L_0x00d4
            long r8 = r8.f18983c
            r16 = r1
            r18 = r8
            goto L_0x00d6
        L_0x00d4:
            r16 = r1
        L_0x00d6:
            r12 = r26
            goto L_0x00dc
        L_0x00d9:
            r25 = r2
            r0 = -1
        L_0x00dc:
            int r3 = r3 + 1
            r2 = r25
            r0 = r27
            r1 = r28
            goto L_0x0024
        L_0x00e6:
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            r0 = r28
            java.lang.Object r1 = r0.get(r15)
            com.bytedance.apm.f.b r1 = (com.bytedance.apm.f.b) r1
            long r1 = r1.f18983c
            long r1 = r1 - r10
            long r13 = r13 + r1
            goto L_0x00fb
        L_0x00f9:
            r0 = r28
        L_0x00fb:
            r1 = r27
            r1.f18917a = r6
            r1.f18918b = r13
            r1.f18919c = r4
            r1.f18920d = r15
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.bytedance.apm.f.b r0 = (com.bytedance.apm.f.b) r0
            boolean r2 = r0.k
            r1.o = r2
            java.lang.String r2 = r0.j
            r1.p = r2
            java.lang.String r2 = r5.toString()
            r1.q = r2
            boolean r1 = com.bytedance.apm.c.d()
            if (r1 == 0) goto L_0x0146
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "computeValidIndexAndDuration ret, frontDuraion: "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = "ms, backTotalDuration: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = " ms, processName: "
            r2.append(r3)
            java.lang.String r0 = r0.j
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            r1[r2] = r0
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.b.a.b(com.bytedance.apm.battery.b.b, java.util.List):void");
    }
}
