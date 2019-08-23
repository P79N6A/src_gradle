package com.bytedance.jedi.model.b;

import com.bytedance.jedi.model.c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022&\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B7\b\u0016\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bB-\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\u0010\nJ@\u0010\u000b\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\rH\u0017J@\u0010\u000e\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\rH\u0017J@\u0010\u000f\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\rH\u0017J@\u0010\u0010\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\rH\u0017¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/model/combine/SimpleCombine;", "K", "V", "Lcom/bytedance/jedi/model/combine/GenericCombine;", "fetcher", "Lcom/bytedance/jedi/model/fetcher/IFetcher;", "cache", "Lcom/bytedance/jedi/model/cache/ICache;", "(Lcom/bytedance/jedi/model/fetcher/IFetcher;Lcom/bytedance/jedi/model/cache/ICache;)V", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "(Lcom/bytedance/jedi/model/datasource/IDataSource;Lcom/bytedance/jedi/model/datasource/IDataSource;)V", "cacheKey", "convert", "Lkotlin/Function1;", "cacheVal", "fetcherKey", "fetcherVal", "model_release"}, k = 1, mv = {1, 1, 15})
public final class b<K, V> extends a<K, V, K, V, K, V> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull d<K, V> dVar, @NotNull d<K, V> dVar2) {
        super(dVar, dVar2);
        Intrinsics.checkParameterIsNotNull(dVar, "fetcher");
        Intrinsics.checkParameterIsNotNull(dVar2, "cache");
        this.f21528d = AnonymousClass1.INSTANCE;
        this.f21529e = AnonymousClass2.INSTANCE;
        this.f21526b = AnonymousClass3.INSTANCE;
        this.f21527c = AnonymousClass4.INSTANCE;
    }
}
