package com.bytedance.jedi.model.c;

import com.bytedance.jedi.model.h.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u001f\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0016R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/jedi/model/datasource/DataSourceMapperImpl;", "K", "V", "Lcom/bytedance/jedi/model/datasource/IDataSourceMapper;", "creator", "Lkotlin/Function0;", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "(Lkotlin/jvm/functions/Function0;)V", "_dataSource", "asDataSource", "model_release"}, k = 1, mv = {1, 1, 15})
public final class b<K, V> implements e<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private d<K, V> f21552a;

    /* renamed from: b  reason: collision with root package name */
    private final Function0<d<K, V>> f21553b;

    @NotNull
    public final d<K, V> a() {
        d<K, V> dVar = this.f21552a;
        if (dVar != null) {
            return dVar;
        }
        d<K, V> dVar2 = (d) this.f21553b.invoke();
        this.f21552a = dVar2;
        a c2 = dVar2.c();
        c cVar = c.f21554a;
        cVar.a(c2.getClass() + '_' + c2.hashCode(), dVar2);
        return dVar2;
    }

    public b(@NotNull Function0<? extends d<K, V>> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "creator");
        this.f21553b = function0;
    }
}
