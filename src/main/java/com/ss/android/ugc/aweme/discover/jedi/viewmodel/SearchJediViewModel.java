package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.api.SearchApiNew;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchJediViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchState;", "()V", "listMiddleware", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchPayLoad;", "getListMiddleware", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "defaultState", "onStart", "", "updateState", "param", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchRequestParam;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchJediViewModel extends JediViewModel<SearchState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f42524d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final ListMiddleware<SearchState, com.ss.android.ugc.aweme.discover.mixfeed.a, e> f42525e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchPayLoad;", "kotlin.jvm.PlatformType", "state", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<SearchState, Observable<Pair<? extends List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, ? extends e>>> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(1);
        }

        public final Observable<Pair<List<com.ss.android.ugc.aweme.discover.mixfeed.a>, e>> invoke(@NotNull SearchState searchState) {
            SearchState searchState2 = searchState;
            if (PatchProxy.isSupport(new Object[]{searchState2}, this, changeQuickRedirect, false, 36735, new Class[]{SearchState.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{searchState2}, this, changeQuickRedirect, false, 36735, new Class[]{SearchState.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(searchState2, "state");
            f searchParam = searchState.getSearchParam();
            searchParam.g = ((e) searchState.getListState().getPayload()).f42532c;
            Observable<Pair<List<com.ss.android.ugc.aweme.discover.mixfeed.a>, e>> map = SearchApiNew.f42085c.a(searchParam, ((e) searchState.getListState().getPayload()).f21388b, 10).map(AnonymousClass1.f42527b);
            Intrinsics.checkExpressionValueIsNotNull(map, "SearchApiNew.searchMTMix…                        }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchPayLoad;", "kotlin.jvm.PlatformType", "state", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<SearchState, Observable<Pair<? extends List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, ? extends e>>> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(1);
        }

        public final Observable<Pair<List<com.ss.android.ugc.aweme.discover.mixfeed.a>, e>> invoke(@NotNull SearchState searchState) {
            SearchState searchState2 = searchState;
            if (PatchProxy.isSupport(new Object[]{searchState2}, this, changeQuickRedirect, false, 36737, new Class[]{SearchState.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{searchState2}, this, changeQuickRedirect, false, 36737, new Class[]{SearchState.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(searchState2, "state");
            Observable<Pair<List<com.ss.android.ugc.aweme.discover.mixfeed.a>, e>> map = SearchApiNew.f42085c.a(searchState.getSearchParam(), 0, 10).map(AnonymousClass1.f42529b);
            Intrinsics.checkExpressionValueIsNotNull(map, "SearchApiNew.searchMTMix…                        }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "list", "loadMore", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function2<List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(2);
        }

        @NotNull
        public final List<com.ss.android.ugc.aweme.discover.mixfeed.a> invoke(@NotNull List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list, @NotNull List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list2) {
            List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list3 = list;
            List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list4 = list2;
            if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 36739, new Class[]{List.class, List.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 36739, new Class[]{List.class, List.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(list3, "list");
            Intrinsics.checkParameterIsNotNull(list4, "loadMore");
            return CollectionsKt.distinct(CollectionsKt.plus((Collection<? extends T>) list3, (Iterable<? extends T>) list4));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<SearchState, SearchState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ f $param;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.$param = fVar;
        }

        @NotNull
        public final SearchState invoke(@NotNull SearchState searchState) {
            SearchState searchState2 = searchState;
            if (PatchProxy.isSupport(new Object[]{searchState2}, this, changeQuickRedirect, false, 36740, new Class[]{SearchState.class}, SearchState.class)) {
                return (SearchState) PatchProxy.accessDispatch(new Object[]{searchState2}, this, changeQuickRedirect, false, 36740, new Class[]{SearchState.class}, SearchState.class);
            }
            Intrinsics.checkParameterIsNotNull(searchState2, "$receiver");
            return SearchState.copy$default(searchState2, null, this.$param, 1, null);
        }
    }

    public SearchJediViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(b.INSTANCE, a.INSTANCE, null, c.INSTANCE, 4);
        this.f42525e = listMiddleware;
    }

    public final /* synthetic */ x c() {
        SearchState searchState;
        if (PatchProxy.isSupport(new Object[0], this, f42524d, false, 36732, new Class[0], SearchState.class)) {
            searchState = (SearchState) PatchProxy.accessDispatch(new Object[0], this, f42524d, false, 36732, new Class[0], SearchState.class);
        } else {
            searchState = new SearchState(null, null, 3, null);
        }
        return searchState;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f42524d, false, 36733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42524d, false, 36733, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        new SearchJediViewModelMiddlewareBinding().binding(this);
    }

    public final void a(@NotNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f42524d, false, 36734, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f42524d, false, 36734, new Class[]{f.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "param");
        c(new d(fVar2));
    }
}
