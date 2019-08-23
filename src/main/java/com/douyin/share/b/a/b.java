package com.douyin.share.b.a;

import com.douyin.share.a.b.a.d;
import com.douyin.share.a.b.c.c;
import com.douyin.share.a.c.h;
import com.douyin.share.a.c.m;
import com.douyin.share.a.c.q;
import com.douyin.share.a.c.s;
import com.douyin.share.d.a.a.f;
import java.util.HashMap;
import java.util.Map;

public final class b extends d {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<h, com.douyin.share.a.b.a.a.a<? extends com.douyin.share.a.b.c.b>> f23171d;

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

    static {
        HashMap hashMap = new HashMap();
        f23171d = hashMap;
        hashMap.put(c.f23172a, new s());
        f23171d.put(c.f23173b, new q());
        f23171d.put(c.f23174c, new com.douyin.share.profile.share.a.b());
        f23171d.put(c.f23175d, new com.douyin.share.profile.share.a.d());
        f23171d.put(c.f23176e, new a((byte) 0));
        f23171d.put(c.g, new m());
    }

    public b(com.douyin.share.a.b.a.b bVar) {
        super(bVar, c.class, f23171d);
    }
}
