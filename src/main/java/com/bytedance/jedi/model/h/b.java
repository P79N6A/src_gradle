package com.bytedance.jedi.model.h;

import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J!\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0000\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH&J\u001a\u0010\u000b\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&J\r\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH&¨\u0006\u0010"}, d2 = {"Lcom/bytedance/jedi/model/traceable/ITraceable;", "T", "", "clone", "V", "payload", "(Ljava/lang/Object;)Lcom/bytedance/jedi/model/traceable/ITraceable;", "containsTracing", "", "point", "Lcom/bytedance/jedi/model/traceable/ITracePoint;", "latestTracing", "Lkotlin/Pair;", "", "()Ljava/lang/Object;", "saveTracing", "model_release"}, k = 1, mv = {1, 1, 15})
public interface b<T> {
    @NotNull
    <V> b<V> a(V v);

    T a();

    boolean a(@NotNull a<?> aVar);

    @Nullable
    Pair<a<?>, Long> b();

    boolean b(@NotNull a<T> aVar);
}
