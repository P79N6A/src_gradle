package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.FileCache;
import com.facebook.cache.disk.b;
import com.facebook.cache.disk.d;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.Executor;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private d f23915a;

    public c(d dVar) {
        this.f23915a = dVar;
    }

    public final FileCache get(b bVar) {
        return buildDiskStorageCache(bVar, this.f23915a.get(bVar));
    }

    public static d buildDiskStorageCache(b bVar, com.facebook.cache.disk.c cVar) {
        return buildDiskStorageCache(bVar, cVar, h.a(m.a(p.FIXED).a(1).a()));
    }

    public static d buildDiskStorageCache(b bVar, com.facebook.cache.disk.c cVar, Executor executor) {
        d.b bVar2 = new d.b(bVar.f23454f, bVar.f23453e, bVar.f23452d);
        d dVar = new d(cVar, bVar.g, bVar2, bVar.i, bVar.h, bVar.j, executor, bVar.l);
        return dVar;
    }
}
