package com.ss.android.ugc.aweme.filter;

import com.google.common.collect.aj;
import com.google.common.collect.bd;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.filter.an;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0006R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxPatch;", "", "()V", "allItems", "Lcom/google/common/collect/Multimap;", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxFilterBean;", "getAllItems", "()Lcom/google/common/collect/Multimap;", "setAllItems", "(Lcom/google/common/collect/Multimap;)V", "insertedFilterIds", "", "", "getInsertedFilterIds", "()Ljava/util/Set;", "insertedItems", "getInsertedItems", "removedFilterIds", "getRemovedFilterIds", "removedItems", "getRemovedItems", "insert", "", "category", "filter", "isEmpty", "", "remove", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47649a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public bd<EffectCategoryModel, o> f47650b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final bd<EffectCategoryModel, o> f47651c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final bd<EffectCategoryModel, o> f47652d;

    public t() {
        aj of = aj.of();
        Intrinsics.checkExpressionValueIsNotNull(of, "ImmutableListMultimap.of()");
        this.f47650b = of;
        an.c c2 = an.c.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "FilterSources.SpecializedMultimap.create()");
        this.f47651c = c2;
        an.c c3 = an.c.c();
        Intrinsics.checkExpressionValueIsNotNull(c3, "FilterSources.SpecializedMultimap.create()");
        this.f47652d = c3;
    }

    @NotNull
    public final Set<Integer> a() {
        if (PatchProxy.isSupport(new Object[0], this, f47649a, false, 44153, new Class[0], Set.class)) {
            return (Set) PatchProxy.accessDispatch(new Object[0], this, f47649a, false, 44153, new Class[0], Set.class);
        }
        Collection values = this.f47651c.values();
        Intrinsics.checkExpressionValueIsNotNull(values, "insertedItems.values()");
        Iterable<o> iterable = values;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (o oVar : iterable) {
            Intrinsics.checkExpressionValueIsNotNull(oVar, AdvanceSetting.NETWORK_TYPE);
            arrayList.add(Integer.valueOf(oVar.f47598b));
        }
        return CollectionsKt.toSet((List) arrayList);
    }

    public final void a(@NotNull EffectCategoryModel effectCategoryModel, @NotNull o oVar) {
        if (PatchProxy.isSupport(new Object[]{effectCategoryModel, oVar}, this, f47649a, false, 44155, new Class[]{EffectCategoryModel.class, o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectCategoryModel, oVar}, this, f47649a, false, 44155, new Class[]{EffectCategoryModel.class, o.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effectCategoryModel, "category");
        Intrinsics.checkParameterIsNotNull(oVar, "filter");
        this.f47651c.put(effectCategoryModel, oVar);
        this.f47652d.remove(effectCategoryModel, oVar);
    }
}
