package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModelMiddlewareBinding;", "Lcom/bytedance/jedi/arch/MiddlewareBinding;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "()V", "bind0", "", "target", "binding", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendListViewModelMiddlewareBinding implements n<RecommendListState, RecommendListViewModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendPayload;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<RecommendListState, ListState<Object, d>, RecommendListState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(2);
        }

        @NotNull
        public final RecommendListState invoke(@NotNull RecommendListState recommendListState, @NotNull ListState<Object, d> listState) {
            RecommendListState recommendListState2 = recommendListState;
            ListState<Object, d> listState2 = listState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2, listState2}, this, changeQuickRedirect, false, 46859, new Class[]{RecommendListState.class, ListState.class}, RecommendListState.class)) {
                return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2, listState2}, this, changeQuickRedirect, false, 46859, new Class[]{RecommendListState.class, ListState.class}, RecommendListState.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState2, AdvanceSetting.NETWORK_TYPE);
            return RecommendListState.copy$default(recommendListState, false, null, 0, 0, false, 0, 0, false, 0, false, null, null, listState, 4095, null);
        }
    }

    public final void binding(@NotNull RecommendListViewModel recommendListViewModel) {
        RecommendListViewModel recommendListViewModel2 = recommendListViewModel;
        if (PatchProxy.isSupport(new Object[]{recommendListViewModel2}, this, changeQuickRedirect, false, 46855, new Class[]{RecommendListViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendListViewModel2}, this, changeQuickRedirect, false, 46855, new Class[]{RecommendListViewModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recommendListViewModel2, "target");
        bind0(recommendListViewModel);
    }

    private final void bind0(RecommendListViewModel recommendListViewModel) {
        RecommendListViewModel recommendListViewModel2 = recommendListViewModel;
        if (PatchProxy.isSupport(new Object[]{recommendListViewModel2}, this, changeQuickRedirect, false, 46856, new Class[]{RecommendListViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendListViewModel2}, this, changeQuickRedirect, false, 46856, new Class[]{RecommendListViewModel.class}, Void.TYPE);
            return;
        }
        ListMiddleware<RecommendListState, Object, d> listMiddleware = recommendListViewModel2.recommendListMiddleware;
        listMiddleware.a(b.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) a.INSTANCE);
        recommendListViewModel2.a(listMiddleware);
    }
}
