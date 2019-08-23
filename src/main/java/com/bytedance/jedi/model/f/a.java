package com.bytedance.jedi.model.f;

import com.bytedance.jedi.model.g.b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJh\u0010\t\u001a\u00020\u0002\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b\"\u0004\b\u0002\u0010\f\"\u0004\b\u0003\u0010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000b0\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u000f2\u001e\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u0012H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/jedi/model/repository/Repository;", "Lcom/bytedance/jedi/model/repository/IRepository;", "Lcom/bytedance/jedi/model/sync/ISyncReceipt;", "Lcom/bytedance/jedi/model/repository/SyncExtensions;", "()V", "receipts", "Lcom/bytedance/jedi/model/sync/CompositeReceipt;", "release", "", "sync", "K", "V", "K1", "V1", "from", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "to", "mergeStrategy", "Lcom/bytedance/jedi/model/merge/MergeStrategy;", "model_release"}, k = 1, mv = {1, 1, 15})
public abstract class a extends b implements b {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.jedi.model.g.a f21585a = new com.bytedance.jedi.model.g.a();

    public final void a() {
        this.f21585a.a();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.bytedance.jedi.model.g.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0039, code lost:
        if (r3 == null) goto L_0x003b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    @android.support.annotation.RestrictTo({android.support.annotation.RestrictTo.Scope.SUBCLASSES})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V, K1, V1> com.bytedance.jedi.model.g.b a(@org.jetbrains.annotations.NotNull com.bytedance.jedi.model.c.d<K, V> r2, @org.jetbrains.annotations.NotNull com.bytedance.jedi.model.c.d<K1, V1> r3, @org.jetbrains.annotations.NotNull com.bytedance.jedi.model.e.a<K, V, K1, V1> r4) {
        /*
            r1 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "to"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = "mergeStrategy"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "from"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "to"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = "mergeStrategy"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            com.bytedance.jedi.model.g.d r0 = new com.bytedance.jedi.model.g.d
            r0.<init>(r2, r3, r4)
            com.bytedance.jedi.model.c.d<K, V> r2 = r0.f21589a
            if (r2 == 0) goto L_0x0094
            com.bytedance.jedi.model.h.c r2 = (com.bytedance.jedi.model.h.c) r2
            io.reactivex.Observable r2 = r2.b()
            com.bytedance.jedi.model.i.i r3 = com.bytedance.jedi.model.i.i.f21737e
            kotlin.jvm.functions.Function0<? extends io.reactivex.Scheduler> r3 = com.bytedance.jedi.model.i.h.f21731a
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r3.invoke()
            io.reactivex.Scheduler r3 = (io.reactivex.Scheduler) r3
            if (r3 != 0) goto L_0x0048
        L_0x003b:
            kotlin.Lazy r3 = com.bytedance.jedi.model.i.i.f21736d
            java.lang.Object r3 = r3.getValue()
            io.reactivex.Scheduler r3 = (io.reactivex.Scheduler) r3
            java.lang.String r4 = "defaultScheduler"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
        L_0x0048:
            io.reactivex.Observable r2 = r2.observeOn(r3)
            com.bytedance.jedi.model.g.d$d r3 = new com.bytedance.jedi.model.g.d$d
            r3.<init>(r0)
            io.reactivex.functions.Predicate r3 = (io.reactivex.functions.Predicate) r3
            io.reactivex.Observable r2 = r2.filter(r3)
            com.bytedance.jedi.model.g.d$e r3 = new com.bytedance.jedi.model.g.d$e
            r3.<init>(r0)
            io.reactivex.functions.Function r3 = (io.reactivex.functions.Function) r3
            io.reactivex.Observable r2 = r2.flatMap(r3)
            com.bytedance.jedi.model.g.d$f r3 = new com.bytedance.jedi.model.g.d$f
            r3.<init>(r0)
            io.reactivex.functions.Consumer r3 = (io.reactivex.functions.Consumer) r3
            com.bytedance.jedi.model.g.d$g r4 = com.bytedance.jedi.model.g.d.g.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            if (r4 == 0) goto L_0x0075
            com.bytedance.jedi.model.g.e r0 = new com.bytedance.jedi.model.g.e
            r0.<init>(r4)
            r4 = r0
        L_0x0075:
            io.reactivex.functions.Consumer r4 = (io.reactivex.functions.Consumer) r4
            io.reactivex.disposables.Disposable r2 = r2.subscribe(r3, r4)
            com.bytedance.jedi.model.g.c r3 = new com.bytedance.jedi.model.g.c
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            r3.<init>(r2)
            com.bytedance.jedi.model.g.b r3 = (com.bytedance.jedi.model.g.b) r3
            com.bytedance.jedi.model.g.a r2 = r1.f21585a
            java.lang.String r4 = "receipt"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r4)
            io.reactivex.internal.util.OpenHashSet<com.bytedance.jedi.model.g.b> r2 = r2.f21586a
            r2.add(r3)
            return r3
        L_0x0094:
            kotlin.TypeCastException r2 = new kotlin.TypeCastException
            java.lang.String r3 = "null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceableObserved<kotlin.Pair<K, V?>>"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.model.f.a.a(com.bytedance.jedi.model.c.d, com.bytedance.jedi.model.c.d, com.bytedance.jedi.model.e.a):com.bytedance.jedi.model.g.b");
    }
}
