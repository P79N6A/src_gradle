package com.douyin.share.d.a.a;

import com.douyin.share.a.b.a.d;
import com.douyin.share.a.b.c.b;
import com.douyin.share.a.c.e;
import com.douyin.share.a.c.h;
import com.douyin.share.a.c.k;
import com.douyin.share.a.c.m;
import com.douyin.share.a.c.q;
import com.douyin.share.a.c.s;
import com.douyin.share.d.a.a.b;
import com.douyin.share.profile.share.a.f;
import com.douyin.share.profile.share.a.g;
import java.util.HashMap;
import java.util.Map;

public final class c extends d {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<h, com.douyin.share.a.b.a.a.a<? extends b>> f23207d;

    /* renamed from: e  reason: collision with root package name */
    private com.douyin.share.a.b.a.b f23208e;

    static class a implements com.douyin.share.a.b.a.a.a<f> {
        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final /* synthetic */ Object a(com.douyin.share.a.b.a.b bVar) {
            return new f(bVar.a(), "1462309810");
        }
    }

    public final f a() {
        new g();
        return g.b(this.f23208e);
    }

    public final k b() {
        new m();
        return m.b(this.f23208e);
    }

    static {
        HashMap hashMap = new HashMap();
        f23207d = hashMap;
        hashMap.put(b.a.f23201a, new s());
        f23207d.put(b.a.f23202b, new q());
        f23207d.put(b.a.f23204d, new e());
        f23207d.put(b.a.f23205e, new com.douyin.share.a.c.g());
        f23207d.put(b.a.f23203c, new m());
        f23207d.put(b.a.f23206f, new g());
        f23207d.put(b.a.g, new com.douyin.share.profile.share.a.b());
        f23207d.put(b.a.h, new com.douyin.share.profile.share.a.d());
        f23207d.put(b.a.i, new a((byte) 0));
    }

    public c(com.douyin.share.a.b.a.b bVar) {
        super(bVar, com.douyin.share.a.b.c.c.class, f23207d);
        this.f23208e = bVar;
    }

    public final com.douyin.share.a.b.c.c a(h hVar) {
        com.douyin.share.a.b.c.b bVar;
        if (this.f23133c.contains(hVar)) {
            com.douyin.share.a.b.a.a.a aVar = this.f23131a.get(hVar);
            if (aVar != null) {
                bVar = (com.douyin.share.a.b.c.b) aVar.a(this.f23132b);
                return (com.douyin.share.a.b.c.c) bVar;
            }
        }
        bVar = null;
        return (com.douyin.share.a.b.c.c) bVar;
    }
}
