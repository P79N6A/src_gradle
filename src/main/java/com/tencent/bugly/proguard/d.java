package com.tencent.bugly.proguard;

import com.taobao.android.dexposed.ClassUtils;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public final class d extends c {

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<String, byte[]> f79461f;
    private static HashMap<String, HashMap<String, byte[]>> g;

    /* renamed from: e  reason: collision with root package name */
    private f f79462e = new f();

    public d() {
        this.f79462e.f79464a = 2;
    }

    public final void b() {
        super.b();
        this.f79462e.f79464a = 3;
    }

    public final byte[] a() {
        if (this.f79462e.f79464a != 2) {
            if (this.f79462e.f79466c == null) {
                this.f79462e.f79466c = "";
            }
            if (this.f79462e.f79467d == null) {
                this.f79462e.f79467d = "";
            }
        } else if (this.f79462e.f79466c.equals("")) {
            throw new IllegalArgumentException("servantName can not is null");
        } else if (this.f79462e.f79467d.equals("")) {
            throw new IllegalArgumentException("funcName can not is null");
        }
        j jVar = new j(0);
        jVar.a(this.f79401b);
        if (this.f79462e.f79464a == 2) {
            jVar.a((Map<K, V>) this.f79400a, 0);
        } else {
            jVar.a((Map<K, V>) this.f79458d, 0);
        }
        this.f79462e.f79468e = l.a(jVar.a());
        j jVar2 = new j(0);
        jVar2.a(this.f79401b);
        this.f79462e.a(jVar2);
        byte[] a2 = l.a(jVar2.a());
        int length = a2.length + 4;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length).put(a2).flip();
        return allocate.array();
    }

    public final void b(int i) {
        this.f79462e.f79465b = 1;
    }

    public final void c(String str) {
        this.f79462e.f79467d = str;
    }

    public final void b(String str) {
        this.f79462e.f79466c = str;
    }

    public final void a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                i iVar = new i(bArr, 4);
                iVar.a(this.f79401b);
                this.f79462e.a(iVar);
                if (this.f79462e.f79464a == 3) {
                    i iVar2 = new i(this.f79462e.f79468e);
                    iVar2.a(this.f79401b);
                    if (f79461f == null) {
                        HashMap<String, byte[]> hashMap = new HashMap<>();
                        f79461f = hashMap;
                        hashMap.put("", new byte[0]);
                    }
                    this.f79458d = iVar2.a((Map<K, V>) f79461f, 0, false);
                    return;
                }
                i iVar3 = new i(this.f79462e.f79468e);
                iVar3.a(this.f79401b);
                if (g == null) {
                    g = new HashMap<>();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("", new byte[0]);
                    g.put("", hashMap2);
                }
                this.f79400a = iVar3.a((Map<K, V>) g, 0, false);
                new HashMap();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new IllegalArgumentException("decode package must include size head");
        }
    }

    public final <T> void a(String str, T t) {
        if (!str.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            super.a(str, t);
            return;
        }
        throw new IllegalArgumentException("put name can not startwith . , now is ".concat(String.valueOf(str)));
    }
}
