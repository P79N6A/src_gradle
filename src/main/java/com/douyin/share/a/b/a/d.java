package com.douyin.share.a.b.a;

import com.douyin.share.a.b.a.a.a;
import com.douyin.share.a.b.c.b;
import com.douyin.share.a.c.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class d {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<h, a<? extends b>> f23130d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    protected final Map<h, a<? extends b>> f23131a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    protected final b f23132b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<h> f23133c = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private final Class<? extends b> f23134e;

    public d(b bVar, Class<? extends b> cls, Map<h, a<? extends b>> map) {
        if (bVar != null) {
            this.f23132b = bVar;
            this.f23134e = cls;
            this.f23131a.putAll(map);
            for (h next : this.f23131a.keySet()) {
                if (com.douyin.share.a.a.a.a.a(next.mShareletClass, this.f23134e)) {
                    this.f23133c.add(next);
                }
            }
            return;
        }
        throw new IllegalArgumentException("share context is null");
    }
}
