package com.bytedance.android.livesdk.j;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.j.b.c;
import com.bytedance.android.livesdk.j.b.d;
import com.bytedance.android.livesdk.j.b.e;
import com.bytedance.android.livesdk.j.b.g;
import com.bytedance.android.livesdk.j.b.i;
import com.bytedance.android.livesdk.j.b.j;
import com.bytedance.android.livesdk.j.b.k;
import com.bytedance.android.livesdk.j.b.n;
import com.bytedance.android.livesdk.j.b.o;
import com.bytedance.android.livesdk.j.b.p;
import com.bytedance.android.livesdk.j.b.q;
import com.bytedance.android.livesdk.j.c.b;
import com.bytedance.android.livesdk.j.c.f;
import com.bytedance.android.livesdk.j.c.h;
import com.bytedance.android.livesdk.j.c.l;
import com.bytedance.android.livesdk.j.c.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15640a;

    /* renamed from: c  reason: collision with root package name */
    private static a f15641c;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class, g> f15642b = new HashMap();

    public static synchronized a a() {
        synchronized (a.class) {
            if (PatchProxy.isSupport(new Object[0], null, f15640a, true, 10856, new Class[0], a.class)) {
                a aVar = (a) PatchProxy.accessDispatch(new Object[0], null, f15640a, true, 10856, new Class[0], a.class);
                return aVar;
            }
            if (f15641c == null) {
                f15641c = new a();
            }
            a aVar2 = f15641c;
            return aVar2;
        }
    }

    private a() {
        if (PatchProxy.isSupport(new Object[0], this, f15640a, false, 10862, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15640a, false, 10862, new Class[0], Void.TYPE);
            return;
        }
        a(Room.class, (g<T>) new n<T>());
        a(b.class, (g<T>) new c<T>());
        a(com.bytedance.android.livesdk.j.c.n.class, (g<T>) new p<T>());
        a(m.class, (g<T>) new o<T>());
        a(l.class, (g<T>) new com.bytedance.android.livesdk.j.b.m<T>());
        a(com.bytedance.android.livesdk.j.c.c.class, (g<T>) new d<T>());
        a(h.class, (g<T>) new j<T>());
        a(f.class, (g<T>) new com.bytedance.android.livesdk.j.b.h<T>());
        k kVar = new k();
        kVar.a("event_page", "live_detail");
        a(com.bytedance.android.livesdk.j.c.j.class, (g<T>) kVar);
        a(User.class, (g<T>) new q<T>());
        a(com.bytedance.android.livesdk.j.c.g.class, (g<T>) new i<T>());
        a(com.bytedance.android.livesdk.j.c.a.class, (g<T>) new com.bytedance.android.livesdk.j.b.b<T>());
        a(com.bytedance.android.livesdk.j.c.d.class, (g<T>) new e<T>());
        a(com.bytedance.android.livesdk.j.c.e.class, (g<T>) new com.bytedance.android.livesdk.j.b.f<T>());
        a(com.bytedance.android.livesdk.j.c.k.class, (g<T>) new com.bytedance.android.livesdk.j.b.l<T>());
    }

    private void a(Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f15640a, false, 10858, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f15640a, false, 10858, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put(next.getKey(), next.getValue());
        }
        c.b().a("ttlive_eventlog", (Map<String, Object>) hashMap);
    }

    public final g a(Class cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f15640a, false, 10860, new Class[]{Class.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{cls}, this, f15640a, false, 10860, new Class[]{Class.class}, g.class);
        } else if (this.f15642b.containsKey(cls)) {
            return this.f15642b.get(cls);
        } else {
            return null;
        }
    }

    private <T> void a(Class<T> cls, g<T> gVar) {
        Class<T> cls2 = cls;
        g<T> gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{cls2, gVar2}, this, f15640a, false, 10861, new Class[]{Class.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2, gVar2}, this, f15640a, false, 10861, new Class[]{Class.class, g.class}, Void.TYPE);
            return;
        }
        this.f15642b.put(cls2, gVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r20, java.lang.Object... r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f15640a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 10859(0x2a6b, float:1.5217E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f15640a
            r15 = 0
            r16 = 10859(0x2a6b, float:1.5217E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            r2 = 0
            r3 = r19
            r3.a(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.j.a.a(java.lang.String, java.lang.Object[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, java.lang.Object... r18) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f15640a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r13] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 10857(0x2a69, float:1.5214E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0051
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f15640a
            r3 = 0
            r4 = 10857(0x2a69, float:1.5214E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r13] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0051:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map<java.lang.Class, com.bytedance.android.livesdk.j.b.g> r1 = r7.f15642b
            java.lang.Class<com.bytedance.android.livesdk.j.c.b> r2 = com.bytedance.android.livesdk.j.c.b.class
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x006d
            java.util.Map<java.lang.Class, com.bytedance.android.livesdk.j.b.g> r1 = r7.f15642b
            java.lang.Class<com.bytedance.android.livesdk.j.c.b> r2 = com.bytedance.android.livesdk.j.c.b.class
            java.lang.Object r1 = r1.get(r2)
            com.bytedance.android.livesdk.j.b.g r1 = (com.bytedance.android.livesdk.j.b.g) r1
            r1.a((java.util.Map<java.lang.String, java.lang.String>) r0)
        L_0x006d:
            if (r10 == 0) goto L_0x00ac
            int r1 = r10.length
        L_0x0070:
            if (r12 >= r1) goto L_0x00ac
            r2 = r10[r12]
            if (r2 == 0) goto L_0x00a9
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L_0x008e
            java.util.Map<java.lang.Class, com.bytedance.android.livesdk.j.b.g> r3 = r7.f15642b
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L_0x00a9
            java.util.Map<java.lang.Class, com.bytedance.android.livesdk.j.b.g> r3 = r7.f15642b
            java.lang.Object r2 = r3.get(r2)
            com.bytedance.android.livesdk.j.b.g r2 = (com.bytedance.android.livesdk.j.b.g) r2
            r2.a((java.util.Map<java.lang.String, java.lang.String>) r0)
            goto L_0x00a9
        L_0x008e:
            java.util.Map<java.lang.Class, com.bytedance.android.livesdk.j.b.g> r3 = r7.f15642b
            java.lang.Class r4 = r2.getClass()
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x00a9
            java.util.Map<java.lang.Class, com.bytedance.android.livesdk.j.b.g> r3 = r7.f15642b
            java.lang.Class r4 = r2.getClass()
            java.lang.Object r3 = r3.get(r4)
            com.bytedance.android.livesdk.j.b.g r3 = (com.bytedance.android.livesdk.j.b.g) r3
            r3.a((java.util.Map<java.lang.String, java.lang.String>) r0, r2)
        L_0x00a9:
            int r12 = r12 + 1
            goto L_0x0070
        L_0x00ac:
            if (r9 == 0) goto L_0x00b7
            int r1 = r17.size()
            if (r1 <= 0) goto L_0x00b7
            r0.putAll(r9)
        L_0x00b7:
            java.lang.String r1 = "livesdk_"
            boolean r1 = r8.startsWith(r1)
            if (r1 != 0) goto L_0x00ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "livesdk_"
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            goto L_0x00cf
        L_0x00ce:
            r1 = r8
        L_0x00cf:
            java.lang.String r2 = "_param_live_platform"
            boolean r2 = r0.containsKey(r2)
            if (r2 != 0) goto L_0x00de
            java.lang.String r2 = "_param_live_platform"
            java.lang.String r3 = "live"
            r0.put(r2, r3)
        L_0x00de:
            java.lang.String r2 = "sdk_version"
            java.lang.String r3 = "1150"
            r0.put(r2, r3)
            java.lang.String r2 = "livesdk_live_show"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0108
            java.lang.String r2 = "event_page"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x00fa
            java.lang.String r2 = "event_page"
            r0.get(r2)
        L_0x00fa:
            java.lang.String r2 = "event_module"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.String r2 = "event_module"
            r0.get(r2)
            goto L_0x0122
        L_0x0108:
            java.lang.String r2 = "enter_from"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0115
            java.lang.String r2 = "enter_from"
            r0.get(r2)
        L_0x0115:
            java.lang.String r2 = "source"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0122
            java.lang.String r2 = "source"
            r0.get(r2)
        L_0x0122:
            java.lang.Class<com.bytedance.android.livesdkapi.host.g> r2 = com.bytedance.android.livesdkapi.host.g.class
            com.bytedance.android.live.base.b r2 = com.bytedance.android.live.utility.b.a(r2)
            com.bytedance.android.livesdkapi.host.g r2 = (com.bytedance.android.livesdkapi.host.g) r2
            r2.a(r1, r0)
            r15.a((java.util.Map<java.lang.String, java.lang.String>) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.j.a.a(java.lang.String, java.util.Map, java.lang.Object[]):void");
    }
}
