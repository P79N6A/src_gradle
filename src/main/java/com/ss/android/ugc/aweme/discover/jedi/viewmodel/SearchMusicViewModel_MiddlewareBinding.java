package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchMusicViewModel_MiddlewareBinding;", "Lcom/bytedance/jedi/arch/MiddlewareBinding;", "Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicListState;", "Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicViewModel;", "()V", "bind_0", "", "target", "binding", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMusicViewModel_MiddlewareBinding implements n<SearchMusicListState, SearchMusicViewModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicListState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchPayLoad;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<SearchMusicListState, ListState<SearchMusic, e>, SearchMusicListState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(2);
        }

        @NotNull
        public final SearchMusicListState invoke(@NotNull SearchMusicListState searchMusicListState, @NotNull ListState<SearchMusic, e> listState) {
            SearchMusicListState searchMusicListState2 = searchMusicListState;
            ListState<SearchMusic, e> listState2 = listState;
            if (PatchProxy.isSupport(new Object[]{searchMusicListState2, listState2}, this, changeQuickRedirect, false, 36759, new Class[]{SearchMusicListState.class, ListState.class}, SearchMusicListState.class)) {
                return (SearchMusicListState) PatchProxy.accessDispatch(new Object[]{searchMusicListState2, listState2}, this, changeQuickRedirect, false, 36759, new Class[]{SearchMusicListState.class, ListState.class}, SearchMusicListState.class);
            }
            Intrinsics.checkParameterIsNotNull(searchMusicListState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState2, AdvanceSetting.NETWORK_TYPE);
            return SearchMusicListState.copy$default(searchMusicListState2, listState2, null, 2, null);
        }
    }

    public final void binding(@NotNull SearchMusicViewModel searchMusicViewModel) {
        SearchMusicViewModel searchMusicViewModel2 = searchMusicViewModel;
        if (PatchProxy.isSupport(new Object[]{searchMusicViewModel2}, this, changeQuickRedirect, false, 36755, new Class[]{SearchMusicViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchMusicViewModel2}, this, changeQuickRedirect, false, 36755, new Class[]{SearchMusicViewModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchMusicViewModel2, "target");
        bind_0(searchMusicViewModel);
    }

    private final void bind_0(SearchMusicViewModel searchMusicViewModel) {
        SearchMusicViewModel searchMusicViewModel2 = searchMusicViewModel;
        if (PatchProxy.isSupport(new Object[]{searchMusicViewModel2}, this, changeQuickRedirect, false, 36756, new Class[]{SearchMusicViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchMusicViewModel2}, this, changeQuickRedirect, false, 36756, new Class[]{SearchMusicViewModel.class}, Void.TYPE);
            return;
        }
        ListMiddleware<SearchMusicListState, SearchMusic, e> listMiddleware = searchMusicViewModel2.f43252e;
        listMiddleware.a(c.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) a.INSTANCE);
        searchMusicViewModel2.a(listMiddleware);
    }
}
