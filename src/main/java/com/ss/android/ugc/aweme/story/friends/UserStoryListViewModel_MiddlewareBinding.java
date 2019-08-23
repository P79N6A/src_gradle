package com.ss.android.ugc.aweme.story.friends;

import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.story.api.model.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/UserStoryListViewModel_MiddlewareBinding;", "Lcom/bytedance/jedi/arch/MiddlewareBinding;", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListState;", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListViewModel;", "()V", "bind_0", "", "target", "binding", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryListViewModel_MiddlewareBinding implements n<UserStoryListState, UserStoryListViewModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<UserStoryListState, ListState<c, k>, UserStoryListState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(2);
        }

        @NotNull
        public final UserStoryListState invoke(@NotNull UserStoryListState userStoryListState, @NotNull ListState<c, k> listState) {
            UserStoryListState userStoryListState2 = userStoryListState;
            ListState<c, k> listState2 = listState;
            if (PatchProxy.isSupport(new Object[]{userStoryListState2, listState2}, this, changeQuickRedirect, false, 84516, new Class[]{UserStoryListState.class, ListState.class}, UserStoryListState.class)) {
                return (UserStoryListState) PatchProxy.accessDispatch(new Object[]{userStoryListState2, listState2}, this, changeQuickRedirect, false, 84516, new Class[]{UserStoryListState.class, ListState.class}, UserStoryListState.class);
            }
            Intrinsics.checkParameterIsNotNull(userStoryListState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState2, AdvanceSetting.NETWORK_TYPE);
            return UserStoryListState.copy$default(userStoryListState2, listState2, null, 2, null);
        }
    }

    public final void binding(@NotNull UserStoryListViewModel userStoryListViewModel) {
        UserStoryListViewModel userStoryListViewModel2 = userStoryListViewModel;
        if (PatchProxy.isSupport(new Object[]{userStoryListViewModel2}, this, changeQuickRedirect, false, 84512, new Class[]{UserStoryListViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStoryListViewModel2}, this, changeQuickRedirect, false, 84512, new Class[]{UserStoryListViewModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(userStoryListViewModel2, "target");
        bind_0(userStoryListViewModel);
    }

    private final void bind_0(UserStoryListViewModel userStoryListViewModel) {
        UserStoryListViewModel userStoryListViewModel2 = userStoryListViewModel;
        if (PatchProxy.isSupport(new Object[]{userStoryListViewModel2}, this, changeQuickRedirect, false, 84513, new Class[]{UserStoryListViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStoryListViewModel2}, this, changeQuickRedirect, false, 84513, new Class[]{UserStoryListViewModel.class}, Void.TYPE);
            return;
        }
        ListMiddleware<UserStoryListState, c, k> listMiddleware = userStoryListViewModel2.h;
        listMiddleware.a(b.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) a.INSTANCE);
        userStoryListViewModel2.a(listMiddleware);
    }
}
