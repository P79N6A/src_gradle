package com.bytedance.jedi.model.h;

import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\bH&¨\u0006\t"}, d2 = {"Lcom/bytedance/jedi/model/traceable/ITraceableObserved;", "T", "", "fireTraceable", "", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "observeTraceable", "Lio/reactivex/Observable;", "model_release"}, k = 1, mv = {1, 1, 15})
public interface c<T> {
    @NotNull
    Observable<b<T>> b();

    void b(@NotNull b<T> bVar);
}
