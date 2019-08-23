package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class c extends a {

    /* renamed from: d  reason: collision with root package name */
    protected HashMap<String, byte[]> f79458d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, Object> f79459e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private i f79460f = new i();

    public void b() {
        this.f79458d = new HashMap<>();
    }

    public byte[] a() {
        if (this.f79458d == null) {
            return super.a();
        }
        j jVar = new j(0);
        jVar.a(this.f79401b);
        jVar.a((Map<K, V>) this.f79458d, 0);
        return l.a(jVar.a());
    }

    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public void a(byte[] bArr) {
        try {
            super.a(bArr);
        } catch (Exception unused) {
            this.f79460f.a(bArr);
            this.f79460f.a(this.f79401b);
            HashMap hashMap = new HashMap(1);
            hashMap.put("", new byte[0]);
            this.f79458d = this.f79460f.a((Map<K, V>) hashMap, 0, false);
        }
    }

    public <T> void a(String str, T t) {
        if (this.f79458d == null) {
            super.a(str, t);
        } else if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        } else if (t == null) {
            throw new IllegalArgumentException("put value can not is null");
        } else if (!(t instanceof Set)) {
            j jVar = new j();
            jVar.a(this.f79401b);
            jVar.a((Object) t, 0);
            this.f79458d.put(str, l.a(jVar.a()));
        } else {
            throw new IllegalArgumentException("can not support Set");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T b(java.lang.String r6, T r7) throws com.tencent.bugly.proguard.b {
        /*
            r5 = this;
            java.util.HashMap<java.lang.String, byte[]> r0 = r5.f79458d
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0048
            java.util.HashMap<java.lang.String, byte[]> r0 = r5.f79458d
            boolean r0 = r0.containsKey(r6)
            if (r0 != 0) goto L_0x0010
            return r2
        L_0x0010:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r5.f79459e
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x001f
            java.util.HashMap<java.lang.String, java.lang.Object> r7 = r5.f79459e
            java.lang.Object r6 = r7.get(r6)
            return r6
        L_0x001f:
            java.util.HashMap<java.lang.String, byte[]> r0 = r5.f79458d
            java.lang.Object r0 = r0.get(r6)
            byte[] r0 = (byte[]) r0
            com.tencent.bugly.proguard.i r2 = r5.f79460f     // Catch:{ Exception -> 0x0041 }
            r2.a((byte[]) r0)     // Catch:{ Exception -> 0x0041 }
            com.tencent.bugly.proguard.i r0 = r5.f79460f     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = r5.f79401b     // Catch:{ Exception -> 0x0041 }
            r0.a((java.lang.String) r2)     // Catch:{ Exception -> 0x0041 }
            com.tencent.bugly.proguard.i r0 = r5.f79460f     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r7 = r0.a(r7, (int) r3, (boolean) r1)     // Catch:{ Exception -> 0x0041 }
            if (r7 == 0) goto L_0x0040
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r5.f79459e     // Catch:{ Exception -> 0x0041 }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x0041 }
        L_0x0040:
            return r7
        L_0x0041:
            r6 = move-exception
            com.tencent.bugly.proguard.b r7 = new com.tencent.bugly.proguard.b
            r7.<init>((java.lang.Exception) r6)
            throw r7
        L_0x0048:
            java.util.HashMap r0 = r5.f79400a
            boolean r0 = r0.containsKey(r6)
            if (r0 != 0) goto L_0x0051
            return r2
        L_0x0051:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r5.f79459e
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x0060
            java.util.HashMap<java.lang.String, java.lang.Object> r7 = r5.f79459e
            java.lang.Object r6 = r7.get(r6)
            return r6
        L_0x0060:
            java.util.HashMap r0 = r5.f79400a
            java.lang.Object r0 = r0.get(r6)
            java.util.HashMap r0 = (java.util.HashMap) r0
            byte[] r2 = new byte[r3]
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0088
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            byte[] r2 = (byte[]) r2
        L_0x0088:
            com.tencent.bugly.proguard.i r0 = r5.f79460f     // Catch:{ Exception -> 0x00a0 }
            r0.a((byte[]) r2)     // Catch:{ Exception -> 0x00a0 }
            com.tencent.bugly.proguard.i r0 = r5.f79460f     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r5.f79401b     // Catch:{ Exception -> 0x00a0 }
            r0.a((java.lang.String) r2)     // Catch:{ Exception -> 0x00a0 }
            com.tencent.bugly.proguard.i r0 = r5.f79460f     // Catch:{ Exception -> 0x00a0 }
            java.lang.Object r7 = r0.a(r7, (int) r3, (boolean) r1)     // Catch:{ Exception -> 0x00a0 }
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r5.f79459e     // Catch:{ Exception -> 0x00a0 }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x00a0 }
            return r7
        L_0x00a0:
            r6 = move-exception
            com.tencent.bugly.proguard.b r7 = new com.tencent.bugly.proguard.b
            r7.<init>((java.lang.Exception) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.c.b(java.lang.String, java.lang.Object):java.lang.Object");
    }
}
