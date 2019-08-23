package com.bytedance.jedi.arch.ext.list.differ;

import com.bytedance.jedi.arch.ext.list.differ.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"asPrefetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "enablePrefetch", "", "prefetchDistance", "", "ext_list_release"}, k = 2, mv = {1, 1, 15})
public final class f {
    /* access modifiers changed from: private */
    @NotNull
    public static e a(@NotNull e.b bVar, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "$this$asPrefetcher");
        e.a aVar = new e.a(bVar);
        aVar.f21384b = z;
        aVar.f21383a = i;
        if (!aVar.f21384b || aVar.f21383a > 0) {
            return new e(aVar.f21385c, aVar.f21384b, aVar.f21383a, (byte) 0);
        }
        throw new IllegalArgumentException("Prefetch distance must be a positive number when prefetch is enabled");
    }
}
