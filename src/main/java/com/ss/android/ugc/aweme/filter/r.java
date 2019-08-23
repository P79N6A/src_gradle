package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.MutableLiveData;
import com.google.common.a.n;
import com.google.common.collect.ay;
import com.google.common.collect.bd;
import com.google.common.collect.be;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.c.b;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxMerger;", "", "()V", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47642a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f47643b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ$\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J$\u0010\u0013\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002J8\u0010\u0019\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J0\u0010\u001a\u001a\u00020\f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00152\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e0\u001dH\u0007J\u001c\u0010\u001f\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010 2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u001e\u0010!\u001a\u00020\f2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015H\u0007J\u0016\u0010!\u001a\u00020\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0007J\u0012\u0010#\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010 H\u0007J$\u0010$\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001e\u0010%\u001a\u00020&*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010(\u001a\u00020)*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002J&\u0010*\u001a\u0004\u0018\u00010+*\u0004\u0018\u00010 2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 \u0018\u00010,H\u0002J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxMerger$Companion;", "", "()V", "doMerge", "", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "allFilters", "prepared", "filtersToMerge", "mergeStrategy", "Lcom/ss/android/ugc/aweme/filter/merger/IFilterMergeStrategy;", "fillCategoryEffectMap", "", "categoryEffectMap", "", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "patch", "Lcom/ss/android/ugc/aweme/filter/FilterBoxPatch;", "fillCategorySourcesValueWithInsertedItems", "categorySourcesValue", "Lcom/google/common/collect/ListMultimap;", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryResponse;", "fillFilterFolderIfNeeded", "filter", "merge", "mergeAggregated", "multimap", "preparedFilterSources", "Landroid/arch/lifecycle/MutableLiveData;", "", "mergeFilterToPreparedSource", "Lcom/ss/android/ugc/aweme/filter/FilterBoxFilterBean;", "regenerateFilterIndex", "values", "removeFilterInPreparedSource", "removeItemsInPatch", "containsFilter", "", "newFilter", "findIndexOfFilter", "", "getFilterCategory", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "Lcom/google/common/collect/Multimap;", "removeFilter", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47644a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u00020\u00012H\u0010\u0002\u001aD\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u0001 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "kotlin.jvm.PlatformType", "Lcom/ss/android/ugc/aweme/filter/FilterBoxFilterBean;", "", "apply"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.filter.r$a$a  reason: collision with other inner class name */
        static final class C0570a<T> implements n<Map.Entry<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47645a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ t f47646b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ay f47647c;

            C0570a(t tVar, ay ayVar) {
                this.f47646b = tVar;
                this.f47647c = ayVar;
            }

            public final /* synthetic */ boolean apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                if (PatchProxy.isSupport(new Object[]{entry}, this, f47645a, false, 44149, new Class[]{Map.Entry.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{entry}, this, f47645a, false, 44149, new Class[]{Map.Entry.class}, Boolean.TYPE)).booleanValue();
                }
                bd<EffectCategoryModel, o> bdVar = this.f47646b.f47651c;
                if (entry == null) {
                    Intrinsics.throwNpe();
                }
                if (bdVar.containsEntry(entry.getKey(), entry.getValue()) || this.f47647c.containsValue(entry.getValue())) {
                    return true;
                }
                return false;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private final void a(h hVar) {
            h hVar2 = hVar;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f47644a, false, 44136, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2}, this, f47644a, false, 44136, new Class[]{h.class}, Void.TYPE);
            } else if (hVar2 != null) {
                CharSequence charSequence = hVar2.j;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    z = false;
                }
                if (z) {
                    hVar2.j = v.a().a(hVar2);
                }
            }
        }

        private final EffectCategoryModel a(@Nullable o oVar, bd<EffectCategoryModel, o> bdVar) {
            o oVar2 = oVar;
            if (PatchProxy.isSupport(new Object[]{oVar2, bdVar}, this, f47644a, false, 44139, new Class[]{o.class, bd.class}, EffectCategoryModel.class)) {
                return (EffectCategoryModel) PatchProxy.accessDispatch(new Object[]{oVar2, bdVar}, this, f47644a, false, 44139, new Class[]{o.class, bd.class}, EffectCategoryModel.class);
            } else if (oVar2 == null || bdVar == null) {
                return null;
            } else {
                Set<EffectCategoryModel> keySet = bdVar.keySet();
                if (keySet != null) {
                    for (EffectCategoryModel effectCategoryModel : keySet) {
                        Intrinsics.checkExpressionValueIsNotNull(effectCategoryModel, "effectCategoryModel");
                        if (Intrinsics.areEqual((Object) effectCategoryModel.name, (Object) oVar2.n)) {
                            return effectCategoryModel;
                        }
                    }
                }
                return null;
            }
        }

        private final int b(@Nullable List<? extends h> list, h hVar) {
            h hVar2 = hVar;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{list, hVar2}, this, f47644a, false, 44138, new Class[]{List.class, h.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{list, hVar2}, this, f47644a, false, 44138, new Class[]{List.class, h.class}, Integer.TYPE)).intValue();
            } else if (list == null || hVar2 == null) {
                return -1;
            } else {
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (((h) next).f47598b == hVar2.f47598b) {
                        return i;
                    }
                    i = i2;
                }
                return -1;
            }
        }

        @JvmStatic
        public final void a(@Nullable o oVar, @Nullable t tVar) {
            o oVar2 = oVar;
            t tVar2 = tVar;
            if (PatchProxy.isSupport(new Object[]{oVar2, tVar2}, this, f47644a, false, 44134, new Class[]{o.class, t.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{oVar2, tVar2}, this, f47644a, false, 44134, new Class[]{o.class, t.class}, Void.TYPE);
            } else if (oVar2 != null && tVar2 != null) {
                bd<EffectCategoryModel, o> bdVar = tVar2.f47650b;
                an d2 = com.ss.android.ugc.aweme.port.in.a.d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "AVEnv.getFilterSources()");
                MutableLiveData<List<h>> a2 = d2.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AVEnv.getFilterSources().preparedFilterSources");
                List list = (List) a2.getValue();
                if (list == null) {
                    list = new ArrayList();
                }
                Intrinsics.checkExpressionValueIsNotNull(list, "AVEnv.getFilterSources()….value ?: mutableListOf()");
                a aVar = this;
                h hVar = oVar2;
                if (aVar.b(list, hVar) == -1 && aVar.a(oVar2, tVar2.f47650b) != null) {
                    Collection values = bdVar.values();
                    Intrinsics.checkExpressionValueIsNotNull(values, "allItems.values()");
                    List<h> a3 = aVar.a(CollectionsKt.toList(values), list, hVar, new com.ss.android.ugc.aweme.filter.c.a());
                    an d3 = com.ss.android.ugc.aweme.port.in.a.d();
                    Intrinsics.checkExpressionValueIsNotNull(d3, "AVEnv.getFilterSources()");
                    MutableLiveData<List<h>> a4 = d3.a();
                    Intrinsics.checkExpressionValueIsNotNull(a4, "AVEnv.getFilterSources().preparedFilterSources");
                    a4.setValue(a3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(@Nullable List<? extends h> list, h hVar) {
            h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{list, hVar2}, this, f47644a, false, 44137, new Class[]{List.class, h.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, hVar2}, this, f47644a, false, 44137, new Class[]{List.class, h.class}, Boolean.TYPE)).booleanValue();
            } else if (list == null || hVar2 == null) {
                return true;
            } else {
                for (h hVar3 : list) {
                    if (hVar3.f47598b == hVar2.f47598b) {
                        return true;
                    }
                }
                return false;
            }
        }

        @NotNull
        private List<h> a(@NotNull List<? extends h> list, @NotNull List<? extends h> list2, @NotNull h hVar, @Nullable b bVar) {
            List<? extends h> list3 = list;
            List<? extends h> list4 = list2;
            h hVar2 = hVar;
            b bVar2 = bVar;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{list3, list4, hVar2, bVar2}, this, f47644a, false, 44135, new Class[]{List.class, List.class, h.class, b.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list3, list4, hVar2, bVar2}, this, f47644a, false, 44135, new Class[]{List.class, List.class, h.class, b.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(list3, "allFilters");
            Intrinsics.checkParameterIsNotNull(list4, "prepared");
            Intrinsics.checkParameterIsNotNull(hVar2, "filtersToMerge");
            a aVar = this;
            if (aVar.a(list4, hVar2)) {
                return list4;
            }
            int indexOf = list3.indexOf(hVar2);
            h hVar3 = null;
            int i2 = 0;
            for (Object next : list3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                h hVar4 = (h) next;
                if (i2 < indexOf && bVar2.a(hVar4)) {
                    hVar3 = hVar4;
                }
                i2 = i3;
            }
            List<h> arrayList = new ArrayList<>();
            if (hVar3 == null) {
                arrayList.add(hVar2);
                arrayList.addAll(list4);
            } else {
                int b2 = aVar.b(list4, hVar3);
                for (Object next2 : list4) {
                    int i4 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    h hVar5 = (h) next2;
                    if (i != b2) {
                        r.f47643b.a(hVar5);
                        arrayList.add(hVar5);
                    } else {
                        r.f47643b.a(hVar5);
                        arrayList.add(hVar5);
                        r.f47643b.a(hVar2);
                        arrayList.add(hVar2);
                    }
                    i = i4;
                }
            }
            return arrayList;
        }
    }

    @JvmStatic
    public static final void a(@Nullable ay<EffectCategoryResponse, h> ayVar) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{ayVar}, null, f47642a, true, 44132, new Class[]{ay.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ayVar}, null, f47642a, true, 44132, new Class[]{ay.class}, Void.TYPE);
            return;
        }
        a aVar = f47643b;
        if (PatchProxy.isSupport(new Object[]{ayVar}, aVar, a.f47644a, false, 44147, new Class[]{ay.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ayVar}, aVar, a.f47644a, false, 44147, new Class[]{ay.class}, Void.TYPE);
        } else if (ayVar != null) {
            synchronized (ayVar) {
                ay b2 = be.a().b().b();
                b2.putAll(ayVar);
                Collection<h> values = b2.values();
                Intrinsics.checkExpressionValueIsNotNull(values, "filters.values()");
                for (h hVar : values) {
                    Intrinsics.checkExpressionValueIsNotNull(hVar, "filterBean");
                    int i2 = i + 1;
                    hVar.f47602f = i;
                    i = i2;
                }
            }
        }
    }

    @JvmStatic
    public static final void a(@NotNull List<h> list) {
        List<h> list2 = list;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f47642a, true, 44131, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, null, f47642a, true, 44131, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a aVar = f47643b;
        if (PatchProxy.isSupport(new Object[]{list2}, aVar, a.f47644a, false, 44146, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, aVar, a.f47644a, false, 44146, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "values");
        synchronized (list) {
            for (h hVar : list) {
                int i2 = i + 1;
                hVar.f47602f = i;
                i = i2;
            }
        }
    }
}
