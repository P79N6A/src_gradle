package com.bytedance.jedi.model.ext.cache.guava;

import com.bytedance.jedi.model.a.b;
import com.bytedance.jedi.model.guava.b.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\u001d\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u00100\fH\u0014J%\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\fH\u0014¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/jedi/model/ext/cache/guava/LruListCache;", "K", "V", "Lcom/bytedance/jedi/model/cache/AbstractListCache;", "maxSize", "", "(J)V", "delegate", "Lcom/bytedance/jedi/model/ext/cache/guava/ListCacheImpl;", "clearActual", "", "getActual", "", "k", "(Ljava/lang/Object;)Ljava/util/List;", "getAllActual", "Lkotlin/Pair;", "putActual", "v", "(Ljava/lang/Object;Ljava/util/List;)V", "ext_cache_guava_release"}, k = 1, mv = {1, 1, 15})
public class d<K, V> extends b<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final b<K, V> f21583b;

    public final void e() {
        this.f21583b.f21581a.invalidateAll();
    }

    @NotNull
    public final List<Pair<K, List<V>>> d() {
        b<K, V> bVar = this.f21583b;
        List<Pair<K, List<V>>> arrayList = new ArrayList<>();
        ConcurrentMap asMap = bVar.f21581a.asMap();
        Intrinsics.checkExpressionValueIsNotNull(asMap, "mRealCache.asMap()");
        for (Map.Entry entry : asMap.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Nullable
    public final List<V> b(K k) {
        return (List) this.f21583b.f21581a.getIfPresent(k);
    }

    private d(long j) {
        a aVar;
        if (j > 0) {
            aVar = com.bytedance.jedi.model.guava.b.b.a().a(j).d();
        } else {
            aVar = com.bytedance.jedi.model.guava.b.b.a().d();
        }
        Intrinsics.checkExpressionValueIsNotNull(aVar, "if (maxSize > 0) CacheBu…lder.newBuilder().build()");
        this.f21583b = new b<>(aVar);
    }

    public /* synthetic */ d(long j, int i) {
        this(-1);
    }

    public final void a(K k, @Nullable List<? extends V> list) {
        b<K, V> bVar = this.f21583b;
        if (list != null) {
            bVar.f21581a.put(k, list);
        } else {
            bVar.f21581a.invalidate(k);
        }
    }
}
