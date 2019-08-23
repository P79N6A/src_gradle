package com.bytedance.jedi.model.h;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0016BG\b\u0002\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00126\u0010\u0004\u001a2\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005j\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u0006`\t¢\u0006\u0002\u0010\nJ!\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0002\"\u0004\b\u0001\u0010\r2\u0006\u0010\u000e\u001a\u0002H\rH\u0016¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016J\u001a\u0010\u0013\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016J\r\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016R\u0010\u0010\u0003\u001a\u00028\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u000bR>\u0010\u0004\u001a2\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005j\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u0006`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/jedi/model/traceable/Traceable;", "T", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "_payload", "mTraceStack", "Ljava/util/LinkedHashSet;", "Lkotlin/Pair;", "Lcom/bytedance/jedi/model/traceable/ITracePoint;", "", "Lkotlin/collections/LinkedHashSet;", "(Ljava/lang/Object;Ljava/util/LinkedHashSet;)V", "Ljava/lang/Object;", "clone", "V", "payload", "(Ljava/lang/Object;)Lcom/bytedance/jedi/model/traceable/ITraceable;", "containsTracing", "", "point", "latestTracing", "()Ljava/lang/Object;", "saveTracing", "Companion", "model_release"}, k = 1, mv = {1, 1, 15})
public final class e<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21701a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private T f21702b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<Pair<a<?>, Long>> f21703c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u00052\f\b\u0002\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/jedi/model/traceable/Traceable$Companion;", "", "()V", "create", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "T", "payload", "parent", "(Ljava/lang/Object;Lcom/bytedance/jedi/model/traceable/ITraceable;)Lcom/bytedance/jedi/model/traceable/ITraceable;", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public static <T> b<T> a(T t, @NotNull b<?> bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "parent");
            return bVar.a(t);
        }
    }

    public final T a() {
        return this.f21702b;
    }

    @Nullable
    public final Pair<a<?>, Long> b() {
        LinkedHashSet<Pair<a<?>, Long>> linkedHashSet = this.f21703c;
        if (!linkedHashSet.isEmpty()) {
            return (Pair) CollectionsKt.last((Iterable<? extends T>) linkedHashSet);
        }
        return null;
    }

    @NotNull
    public final <V> b<V> a(V v) {
        if (Intrinsics.areEqual((Object) this.f21702b, (Object) v)) {
            return this;
        }
        int size = this.f21703c.size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = (Pair) CollectionsKt.elementAt((Iterable<? extends T>) this.f21703c, i);
        }
        return new e<>(v, SetsKt.linkedSetOf(pairArr));
    }

    public final boolean b(@NotNull a<T> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "point");
        return this.f21703c.add(TuplesKt.to(aVar, Long.valueOf(System.currentTimeMillis())));
    }

    public final boolean a(@NotNull a<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "point");
        Iterable<Pair> iterable = this.f21703c;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Pair first : iterable) {
            arrayList.add((a) first.getFirst());
        }
        return ((List) arrayList).contains(aVar);
    }

    private e(T t, LinkedHashSet<Pair<a<?>, Long>> linkedHashSet) {
        this.f21702b = t;
        this.f21703c = linkedHashSet;
    }

    public /* synthetic */ e(Object obj, LinkedHashSet linkedHashSet, byte b2) {
        this(obj, linkedHashSet);
    }
}
