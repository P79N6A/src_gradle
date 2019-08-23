package com.bytedance.jedi.model.c;

import com.bytedance.jedi.model.h.a;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001c\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00060\u0005H&J!\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJE\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b2\u0006\u0010\n\u001a\u00028\u00002\"\u0010\f\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00000\r\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000H&¢\u0006\u0002\u0010\u000eJ,\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00060\u00100\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H&JU\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00060\u00100\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\"\u0010\f\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00000\r\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000H&¢\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJ\"\u0010\u0015\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00060\u00100\bH&¨\u0006\u0016"}, d2 = {"Lcom/bytedance/jedi/model/datasource/IDataSource;", "K", "V", "", "inheritance", "Lcom/bytedance/jedi/model/traceable/ITracePoint;", "Lkotlin/Pair;", "observe", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "k", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "exclude", "", "(Ljava/lang/Object;[Lcom/bytedance/jedi/model/datasource/IDataSource;)Lio/reactivex/Observable;", "observeAll", "", "debounce", "", "(Z[Lcom/bytedance/jedi/model/datasource/IDataSource;)Lio/reactivex/Observable;", "request", "requestAll", "model_release"}, k = 1, mv = {1, 1, 15})
public interface d<K, V> {
    @NotNull
    Observable<List<Pair<K, V>>> a();

    @NotNull
    Observable<f<V>> a(K k);

    @NotNull
    Observable<f<V>> a(K k, @NotNull d<?, ?>... dVarArr);

    @NotNull
    Observable<List<Pair<K, V>>> a(boolean z);

    @NotNull
    Observable<List<Pair<K, V>>> a(boolean z, @NotNull d<?, ?>... dVarArr);

    @NotNull
    Observable<f<V>> b(K k);

    @NotNull
    a<Pair<K, V>> c();
}
