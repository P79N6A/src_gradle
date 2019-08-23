package com.ss.android.ugc.aweme.friends.friendlist;

import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.friends.adapter.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListViewModelMiddlewareBinding;", "Lcom/bytedance/jedi/arch/MiddlewareBinding;", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListState;", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListViewModel;", "()V", "bind0", "", "target", "binding", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendListViewModelMiddlewareBinding implements n<FriendListState, FriendListViewModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<FriendListState, ListState<c, k>, FriendListState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(2);
        }

        @NotNull
        public final FriendListState invoke(@NotNull FriendListState friendListState, @NotNull ListState<c, k> listState) {
            FriendListState friendListState2 = friendListState;
            ListState<c, k> listState2 = listState;
            if (PatchProxy.isSupport(new Object[]{friendListState2, listState2}, this, changeQuickRedirect, false, 46494, new Class[]{FriendListState.class, ListState.class}, FriendListState.class)) {
                return (FriendListState) PatchProxy.accessDispatch(new Object[]{friendListState2, listState2}, this, changeQuickRedirect, false, 46494, new Class[]{FriendListState.class, ListState.class}, FriendListState.class);
            }
            Intrinsics.checkParameterIsNotNull(friendListState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState2, AdvanceSetting.NETWORK_TYPE);
            return FriendListState.copy$default(friendListState2, false, listState2, 1, null);
        }
    }

    public final void binding(@NotNull FriendListViewModel friendListViewModel) {
        FriendListViewModel friendListViewModel2 = friendListViewModel;
        if (PatchProxy.isSupport(new Object[]{friendListViewModel2}, this, changeQuickRedirect, false, 46490, new Class[]{FriendListViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{friendListViewModel2}, this, changeQuickRedirect, false, 46490, new Class[]{FriendListViewModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(friendListViewModel2, "target");
        bind0(friendListViewModel);
    }

    private final void bind0(FriendListViewModel friendListViewModel) {
        FriendListViewModel friendListViewModel2 = friendListViewModel;
        if (PatchProxy.isSupport(new Object[]{friendListViewModel2}, this, changeQuickRedirect, false, 46491, new Class[]{FriendListViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{friendListViewModel2}, this, changeQuickRedirect, false, 46491, new Class[]{FriendListViewModel.class}, Void.TYPE);
            return;
        }
        ListMiddleware<FriendListState, c, k> listMiddleware = friendListViewModel2.friendListMiddleware;
        listMiddleware.a(e.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) a.INSTANCE);
        friendListViewModel2.a(listMiddleware);
    }
}
