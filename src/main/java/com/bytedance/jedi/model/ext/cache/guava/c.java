package com.bytedance.jedi.model.ext.cache.guava;

import com.bytedance.jedi.model.a.a;
import com.bytedance.jedi.model.guava.b.b;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00100\u000fH\u0014J\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u00002\b\u0010\u0012\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/jedi/model/ext/cache/guava/LruCache;", "K", "V", "Lcom/bytedance/jedi/model/cache/AbstractCache;", "maxSize", "", "(J)V", "delegate", "Lcom/bytedance/jedi/model/ext/cache/guava/CacheImpl;", "clearActual", "", "getActual", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "getAllActual", "", "Lkotlin/Pair;", "putActual", "v", "(Ljava/lang/Object;Ljava/lang/Object;)V", "ext_cache_guava_release"}, k = 1, mv = {1, 1, 15})
public class c<K, V> extends a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f21582a;

    @NotNull
    public final List<Pair<K, V>> c() {
        a<K, V> aVar = this.f21582a;
        List<Pair<K, V>> arrayList = new ArrayList<>();
        ConcurrentMap asMap = aVar.f21580a.asMap();
        Intrinsics.checkExpressionValueIsNotNull(asMap, "mRealCache.asMap()");
        for (Map.Entry entry : asMap.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Nullable
    public final V b(K k) {
        return this.f21582a.f21580a.getIfPresent(k);
    }

    private c(long j) {
        com.bytedance.jedi.model.guava.b.a aVar;
        if (j > 0) {
            aVar = b.a().a(j).d();
        } else {
            aVar = b.a().d();
        }
        Intrinsics.checkExpressionValueIsNotNull(aVar, "if (maxSize > 0) CacheBu…lder.newBuilder().build()");
        this.f21582a = new a<>(aVar);
    }

    public /* synthetic */ c(long j, int i) {
        this(-1);
    }

    public final void b(K k, @Nullable V v) {
        a<K, V> aVar = this.f21582a;
        if (v != null) {
            aVar.f21580a.put(k, v);
        } else {
            aVar.f21580a.invalidate(k);
        }
    }
}
