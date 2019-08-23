package com.bytedance.jedi.model.h;

import com.bytedance.jedi.model.i.l;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00040\u0003B!\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00040\u0006¢\u0006\u0002\u0010\u0007J$\u0010\u000b\u001a\u00020\f2\u001a\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00040\nH\u0016J\"\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00040\n0\u000fH\u0016R(\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00040\n0\tX\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00040\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/jedi/model/traceable/TraceableObservedImpl;", "K", "V", "Lcom/bytedance/jedi/model/traceable/ITraceableObserved;", "Lkotlin/Pair;", "tracePoint", "Lcom/bytedance/jedi/model/traceable/ITracePoint;", "(Lcom/bytedance/jedi/model/traceable/ITracePoint;)V", "subject", "Lio/reactivex/subjects/Subject;", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "fireTraceable", "", "traceable", "observeTraceable", "Lio/reactivex/Observable;", "model_release"}, k = 1, mv = {1, 1, 15})
public final class f<K, V> implements c<Pair<? extends K, ? extends V>> {

    /* renamed from: a  reason: collision with root package name */
    private final Subject<b<Pair<K, V>>> f21704a;

    /* renamed from: b  reason: collision with root package name */
    private final a<Pair<K, V>> f21705b;

    @NotNull
    public final Observable<b<Pair<K, V>>> b() {
        Observable<b<Pair<K, V>>> share = this.f21704a.share();
        Intrinsics.checkExpressionValueIsNotNull(share, "subject.share()");
        return share;
    }

    public f(@NotNull a<Pair<K, V>> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "tracePoint");
        this.f21705b = aVar;
        Subject<b<Pair<K, V>>> serialized = PublishSubject.create().toSerialized();
        Intrinsics.checkExpressionValueIsNotNull(serialized, "PublishSubject.create<IT…K, V?>>>().toSerialized()");
        this.f21704a = serialized;
    }

    public final void b(@NotNull b<Pair<K, V>> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "traceable");
        Subject<b<Pair<K, V>>> subject = this.f21704a;
        l.a(bVar, this.f21705b);
        bVar.b(this.f21705b);
        subject.onNext(bVar);
    }
}
