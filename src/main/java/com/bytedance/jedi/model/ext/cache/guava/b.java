package com.bytedance.jedi.model.ext.cache.guava;

import com.bytedance.jedi.model.guava.b.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u001b\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u000e0\u0006J#\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006¢\u0006\u0002\u0010\u0011R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/jedi/model/ext/cache/guava/ListCacheImpl;", "K", "V", "", "mRealCache", "Lcom/bytedance/jedi/model/guava/cache/Cache;", "", "(Lcom/bytedance/jedi/model/guava/cache/Cache;)V", "clearActual", "", "getActual", "k", "(Ljava/lang/Object;)Ljava/util/List;", "getAllActual", "Lkotlin/Pair;", "putActual", "v", "(Ljava/lang/Object;Ljava/util/List;)V", "ext_cache_guava_release"}, k = 1, mv = {1, 1, 15})
public final class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    final a<K, List<V>> f21581a;

    public b(@NotNull a<K, List<V>> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mRealCache");
        this.f21581a = aVar;
    }
}
