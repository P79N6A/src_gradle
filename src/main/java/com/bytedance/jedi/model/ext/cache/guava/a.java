package com.bytedance.jedi.model.ext.cache.guava;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0015\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000e0\rJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0011R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/jedi/model/ext/cache/guava/CacheImpl;", "K", "V", "", "mRealCache", "Lcom/bytedance/jedi/model/guava/cache/Cache;", "(Lcom/bytedance/jedi/model/guava/cache/Cache;)V", "clearActual", "", "getActual", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "getAllActual", "", "Lkotlin/Pair;", "putActual", "v", "(Ljava/lang/Object;Ljava/lang/Object;)V", "ext_cache_guava_release"}, k = 1, mv = {1, 1, 15})
public final class a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.jedi.model.guava.b.a<K, V> f21580a;

    public a(@NotNull com.bytedance.jedi.model.guava.b.a<K, V> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mRealCache");
        this.f21580a = aVar;
    }
}
