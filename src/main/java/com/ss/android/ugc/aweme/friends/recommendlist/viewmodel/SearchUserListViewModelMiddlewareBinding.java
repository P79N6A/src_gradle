package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListViewModelMiddlewareBinding;", "Lcom/bytedance/jedi/arch/MiddlewareBinding;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListViewModel;", "()V", "bind0", "", "target", "binding", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchUserListViewModelMiddlewareBinding implements n<SearchUserListState, SearchUserListViewModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<SearchUserListState, ListState<SearchUser, k>, SearchUserListState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(2);
        }

        @NotNull
        public final SearchUserListState invoke(@NotNull SearchUserListState searchUserListState, @NotNull ListState<SearchUser, k> listState) {
            if (PatchProxy.isSupport(new Object[]{searchUserListState, listState}, this, changeQuickRedirect, false, 46898, new Class[]{SearchUserListState.class, ListState.class}, SearchUserListState.class)) {
                return (SearchUserListState) PatchProxy.accessDispatch(new Object[]{searchUserListState, listState}, this, changeQuickRedirect, false, 46898, new Class[]{SearchUserListState.class, ListState.class}, SearchUserListState.class);
            }
            Intrinsics.checkParameterIsNotNull(searchUserListState, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState, AdvanceSetting.NETWORK_TYPE);
            return SearchUserListState.copy$default(searchUserListState, null, false, null, listState, 7, null);
        }
    }

    public final void binding(@NotNull SearchUserListViewModel searchUserListViewModel) {
        SearchUserListViewModel searchUserListViewModel2 = searchUserListViewModel;
        if (PatchProxy.isSupport(new Object[]{searchUserListViewModel2}, this, changeQuickRedirect, false, 46894, new Class[]{SearchUserListViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchUserListViewModel2}, this, changeQuickRedirect, false, 46894, new Class[]{SearchUserListViewModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchUserListViewModel2, "target");
        bind0(searchUserListViewModel);
    }

    private final void bind0(SearchUserListViewModel searchUserListViewModel) {
        SearchUserListViewModel searchUserListViewModel2 = searchUserListViewModel;
        if (PatchProxy.isSupport(new Object[]{searchUserListViewModel2}, this, changeQuickRedirect, false, 46895, new Class[]{SearchUserListViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchUserListViewModel2}, this, changeQuickRedirect, false, 46895, new Class[]{SearchUserListViewModel.class}, Void.TYPE);
            return;
        }
        ListMiddleware<SearchUserListState, SearchUser, k> listMiddleware = searchUserListViewModel2.searchUserListMiddleware;
        listMiddleware.a(f.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) a.INSTANCE);
        searchUserListViewModel2.a(listMiddleware);
    }
}
