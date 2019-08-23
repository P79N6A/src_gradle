package com.bytedance.jedi.model.ext.cache.guava;

import com.bytedance.jedi.model.a.b;
import com.ss.android.ugc.aweme.miniapp.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0014J\u001d\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0014¢\u0006\u0002\u0010\u000bJ \u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\r0\u0007H\u0014J%\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0014¢\u0006\u0002\u0010\u0010R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/model/ext/cache/guava/UnitListCache;", "V", "Lcom/bytedance/jedi/model/cache/AbstractListCache;", "", "Lcom/bytedance/jedi/model/cache/AbstractUnitListCache;", "()V", "value", "", "clearActual", "getActual", "k", "(Lkotlin/Unit;)Ljava/util/List;", "getAllActual", "Lkotlin/Pair;", "putActual", "v", "(Lkotlin/Unit;Ljava/util/List;)V", "ext_cache_guava_release"}, k = 1, mv = {1, 1, 15})
public class e<V> extends b<Unit, V> {

    /* renamed from: b  reason: collision with root package name */
    private List<? extends V> f21584b;

    public final void e() {
        this.f21584b = null;
    }

    @NotNull
    public final List<Pair<Unit, List<V>>> d() {
        List<? extends V> list = this.f21584b;
        if (list != null) {
            List<Pair<Unit, List<V>>> listOf = CollectionsKt.listOf(new Pair(Unit.INSTANCE, list));
            if (listOf != null) {
                return listOf;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final /* synthetic */ List b(Object obj) {
        Intrinsics.checkParameterIsNotNull((Unit) obj, k.f55809b);
        return this.f21584b;
    }

    public final /* synthetic */ void a(Object obj, List list) {
        Intrinsics.checkParameterIsNotNull((Unit) obj, k.f55809b);
        this.f21584b = list;
    }
}
