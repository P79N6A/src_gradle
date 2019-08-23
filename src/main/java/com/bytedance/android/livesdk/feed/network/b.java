package com.bytedance.android.livesdk.feed.network;

import android.support.annotation.Nullable;
import com.bytedance.android.live.core.network.a;
import com.bytedance.android.live.core.network.c;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.android.livesdkapi.i.d;
import com.bytedance.android.livesdkapi.i.e;
import com.bytedance.retrofit2.Retrofit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14302a;

    /* renamed from: b  reason: collision with root package name */
    private h f14303b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private c f14304c;

    public final Retrofit c() {
        return null;
    }

    public final Map<String, String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f14302a, false, 8789, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f14302a, false, 8789, new Class[0], Map.class);
        }
        Map<String, String> a2 = this.f14303b.a();
        if (this.f14304c != null) {
            this.f14304c.a(a2);
        }
        return a2;
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f14302a, false, 8790, new Class[0], String.class)) {
            return this.f14303b.b();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f14302a, false, 8790, new Class[0], String.class);
    }

    public b(h hVar) {
        c cVar;
        boolean z;
        this.f14303b = hVar;
        if (PatchProxy.isSupport(new Object[0], null, a.f14301a, true, 8775, new Class[0], c.class)) {
            cVar = (c) PatchProxy.accessDispatch(new Object[0], null, a.f14301a, true, 8775, new Class[0], c.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, com.bytedance.android.livesdk.feed.l.c.f14220a, true, 8984, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.bytedance.android.livesdk.feed.l.c.f14220a, true, 8984, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = AdvanceSetting.CLEAR_NOTIFICATION.equals("i18n");
            }
            if (z) {
                cVar = new i();
            } else {
                cVar = new a();
            }
        }
        this.f14304c = cVar;
    }

    public final e<d> a(String str, List<com.bytedance.android.live.base.model.e> list) throws IOException {
        if (PatchProxy.isSupport(new Object[]{str, list}, this, f14302a, false, 8785, new Class[]{String.class, List.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{str, list}, this, f14302a, false, 8785, new Class[]{String.class, List.class}, e.class);
        } else if (this.f14304c == null) {
            return this.f14303b.a(str, list);
        } else {
            c.a a2 = this.f14304c.a(new c.a(str, list));
            return this.f14303b.a(a2.f7858a, a2.f7859b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdkapi.i.e<com.bytedance.android.livesdkapi.i.d> a(java.lang.String r18, java.util.List<com.bytedance.android.live.base.model.e> r19, java.lang.String r20, byte[] r21) throws java.io.IOException {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = 4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r8
            r14 = 1
            r0[r14] = r9
            r15 = 2
            r0[r15] = r10
            r16 = 3
            r0[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f14302a
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r15] = r1
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r16] = r1
            java.lang.Class<com.bytedance.android.livesdkapi.i.e> r6 = com.bytedance.android.livesdkapi.i.e.class
            r3 = 0
            r4 = 8786(0x2252, float:1.2312E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0067
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            r0[r14] = r9
            r0[r15] = r10
            r0[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f14302a
            r3 = 0
            r4 = 8786(0x2252, float:1.2312E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r15] = r1
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r16] = r1
            java.lang.Class<com.bytedance.android.livesdkapi.i.e> r6 = com.bytedance.android.livesdkapi.i.e.class
            r1 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.bytedance.android.livesdkapi.i.e r0 = (com.bytedance.android.livesdkapi.i.e) r0
            return r0
        L_0x0067:
            com.bytedance.android.live.core.network.c r0 = r7.f14304c
            if (r0 == 0) goto L_0x0081
            com.bytedance.android.live.core.network.c r0 = r7.f14304c
            com.bytedance.android.live.core.network.c$a r1 = new com.bytedance.android.live.core.network.c$a
            r1.<init>(r8, r9)
            com.bytedance.android.live.core.network.c$a r0 = r0.a((com.bytedance.android.live.core.network.c.a) r1)
            com.bytedance.android.livesdkapi.host.h r1 = r7.f14303b
            java.lang.String r2 = r0.f7858a
            java.util.List<com.bytedance.android.live.base.model.e> r0 = r0.f7859b
            com.bytedance.android.livesdkapi.i.e r0 = r1.a(r2, r0, r10, r11)
            return r0
        L_0x0081:
            com.bytedance.android.livesdkapi.host.h r0 = r7.f14303b
            com.bytedance.android.livesdkapi.i.e r0 = r0.a(r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.network.b.a(java.lang.String, java.util.List, java.lang.String, byte[]):com.bytedance.android.livesdkapi.i.e");
    }

    public final e<d> a(boolean z, int i, String str, List<com.bytedance.android.live.base.model.e> list, Object obj) throws IOException {
        String str2 = str;
        List<com.bytedance.android.live.base.model.e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), str2, list2, obj}, this, f14302a, false, 8787, new Class[]{Boolean.TYPE, Integer.TYPE, String.class, List.class, Object.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), str2, list2, obj}, this, f14302a, false, 8787, new Class[]{Boolean.TYPE, Integer.TYPE, String.class, List.class, Object.class}, e.class);
        } else if (this.f14304c == null) {
            return this.f14303b.a(z, i, str, list, obj);
        } else {
            c.a a2 = this.f14304c.a(new c.a(str2, list2));
            return this.f14303b.a(z, i, a2.f7858a, a2.f7859b, obj);
        }
    }

    public final e<d> a(int i, String str, List<com.bytedance.android.live.base.model.e> list, String str2, byte[] bArr, long j, String str3) throws IOException {
        String str4 = str;
        List<com.bytedance.android.live.base.model.e> list2 = list;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str4, list2, str2, bArr, new Long(j2), str3}, this, f14302a, false, 8788, new Class[]{Integer.TYPE, String.class, List.class, String.class, byte[].class, Long.TYPE, String.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str4, list2, str2, bArr, new Long(j2), str3}, this, f14302a, false, 8788, new Class[]{Integer.TYPE, String.class, List.class, String.class, byte[].class, Long.TYPE, String.class}, e.class);
        } else if (this.f14304c == null) {
            return this.f14303b.a(i, str, list, str2, bArr, j, str3);
        } else {
            c.a a2 = this.f14304c.a(new c.a(str4, list2));
            return this.f14303b.a(i, a2.f7858a, a2.f7859b, str2, bArr, j, str3);
        }
    }
}
