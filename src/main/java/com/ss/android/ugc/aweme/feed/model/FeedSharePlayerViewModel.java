package com.ss.android.ugc.aweme.feed.model;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.video.o;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/model/FeedSharePlayerViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "hasBindCover", "", "getHasBindCover", "()Z", "setHasBindCover", "(Z)V", "player", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "getPlayer", "()Lcom/ss/android/ugc/aweme/video/PlayerManager;", "setPlayer", "(Lcom/ss/android/ugc/aweme/video/PlayerManager;)V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FeedSharePlayerViewModel extends ViewModel {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean hasBindCover;
    @Nullable
    public o player;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/model/FeedSharePlayerViewModel$Companion;", "", "()V", "getPlayerManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "activity", "Landroid/support/v4/app/FragmentActivity;", "getViewModel", "Lcom/ss/android/ugc/aweme/feed/model/FeedSharePlayerViewModel;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final o getPlayerManager(@NotNull FragmentActivity fragmentActivity) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, changeQuickRedirect, false, 41460, new Class[]{FragmentActivity.class}, o.class)) {
                return (o) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, changeQuickRedirect, false, 41460, new Class[]{FragmentActivity.class}, o.class);
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
            return getViewModel(fragmentActivity2).player;
        }

        @JvmStatic
        @NotNull
        public final FeedSharePlayerViewModel getViewModel(@NotNull FragmentActivity fragmentActivity) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, changeQuickRedirect, false, 41459, new Class[]{FragmentActivity.class}, FeedSharePlayerViewModel.class)) {
                return (FeedSharePlayerViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, changeQuickRedirect, false, 41459, new Class[]{FragmentActivity.class}, FeedSharePlayerViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(FeedSharePlayerViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…yerViewModel::class.java)");
            return (FeedSharePlayerViewModel) viewModel;
        }
    }

    @JvmStatic
    @Nullable
    public static final o getPlayerManager(@NotNull FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity2}, null, changeQuickRedirect, true, 41458, new Class[]{FragmentActivity.class}, o.class)) {
            return Companion.getPlayerManager(fragmentActivity2);
        }
        return (o) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, null, changeQuickRedirect, true, 41458, new Class[]{FragmentActivity.class}, o.class);
    }

    @JvmStatic
    @NotNull
    public static final FeedSharePlayerViewModel getViewModel(@NotNull FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity2}, null, changeQuickRedirect, true, 41457, new Class[]{FragmentActivity.class}, FeedSharePlayerViewModel.class)) {
            return Companion.getViewModel(fragmentActivity2);
        }
        return (FeedSharePlayerViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, null, changeQuickRedirect, true, 41457, new Class[]{FragmentActivity.class}, FeedSharePlayerViewModel.class);
    }
}
