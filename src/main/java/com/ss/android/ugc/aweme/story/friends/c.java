package com.ss.android.ugc.aweme.story.friends;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0001\u0010\u0004\u001a\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0006*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\r2!\b\u0002\u0010\u000f\u001a\u001b\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"listLoadMore", "", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListViewModel;", "listRefresh", "listSubscribe", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "subscriber", "Lcom/bytedance/jedi/arch/ISubscriber;", "adapter", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "refreshListener", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "loadMoreListener", "onHasMore", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "awemestory_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73116a;

    public static final void a(@NotNull UserStoryListViewModel userStoryListViewModel) {
        UserStoryListViewModel userStoryListViewModel2 = userStoryListViewModel;
        if (PatchProxy.isSupport(new Object[]{userStoryListViewModel2}, null, f73116a, true, 84518, new Class[]{UserStoryListViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStoryListViewModel2}, null, f73116a, true, 84518, new Class[]{UserStoryListViewModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(userStoryListViewModel2, "$this$listRefresh");
        userStoryListViewModel2.h.refresh();
    }
}
