package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchJediViewModelMiddlewareBinding;", "Lcom/bytedance/jedi/arch/MiddlewareBinding;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchState;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchJediViewModel;", "()V", "bind0", "", "target", "binding", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchJediViewModelMiddlewareBinding implements n<SearchState, SearchJediViewModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchPayLoad;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<SearchState, ListState<com.ss.android.ugc.aweme.discover.mixfeed.a, e>, SearchState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(2);
        }

        @NotNull
        public final SearchState invoke(@NotNull SearchState searchState, @NotNull ListState<com.ss.android.ugc.aweme.discover.mixfeed.a, e> listState) {
            SearchState searchState2 = searchState;
            ListState<com.ss.android.ugc.aweme.discover.mixfeed.a, e> listState2 = listState;
            if (PatchProxy.isSupport(new Object[]{searchState2, listState2}, this, changeQuickRedirect, false, 36745, new Class[]{SearchState.class, ListState.class}, SearchState.class)) {
                return (SearchState) PatchProxy.accessDispatch(new Object[]{searchState2, listState2}, this, changeQuickRedirect, false, 36745, new Class[]{SearchState.class, ListState.class}, SearchState.class);
            }
            Intrinsics.checkParameterIsNotNull(searchState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState2, AdvanceSetting.NETWORK_TYPE);
            return SearchState.copy$default(searchState2, listState2, null, 2, null);
        }
    }

    public final void binding(@NotNull SearchJediViewModel searchJediViewModel) {
        SearchJediViewModel searchJediViewModel2 = searchJediViewModel;
        if (PatchProxy.isSupport(new Object[]{searchJediViewModel2}, this, changeQuickRedirect, false, 36741, new Class[]{SearchJediViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchJediViewModel2}, this, changeQuickRedirect, false, 36741, new Class[]{SearchJediViewModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchJediViewModel2, "target");
        bind0(searchJediViewModel);
    }

    private final void bind0(SearchJediViewModel searchJediViewModel) {
        SearchJediViewModel searchJediViewModel2 = searchJediViewModel;
        if (PatchProxy.isSupport(new Object[]{searchJediViewModel2}, this, changeQuickRedirect, false, 36742, new Class[]{SearchJediViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchJediViewModel2}, this, changeQuickRedirect, false, 36742, new Class[]{SearchJediViewModel.class}, Void.TYPE);
            return;
        }
        ListMiddleware<SearchState, com.ss.android.ugc.aweme.discover.mixfeed.a, e> listMiddleware = searchJediViewModel2.f42525e;
        listMiddleware.a(a.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) a.INSTANCE);
        searchJediViewModel2.a(listMiddleware);
    }
}