package com.ss.android.ugc.aweme.newfollow.ui;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/ui/FriendTabViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "scrollData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/newfollow/ui/ScrollData;", "getScrollData", "()Landroid/arch/lifecycle/MutableLiveData;", "userVisibleHintData", "Lcom/ss/android/ugc/aweme/newfollow/ui/UserVisibleHintData;", "getUserVisibleHintData", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendTabViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57250a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f57251d = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final MutableLiveData<m> f57252b = new MutableLiveData<>();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final MutableLiveData<n> f57253c = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/ui/FriendTabViewModel$Companion;", "", "()V", "getFriendTabViewModel", "Lcom/ss/android/ugc/aweme/newfollow/ui/FriendTabViewModel;", "activity", "Landroid/support/v4/app/FragmentActivity;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57254a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FriendTabViewModel a(@NotNull FragmentActivity fragmentActivity) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f57254a, false, 61613, new Class[]{FragmentActivity.class}, FriendTabViewModel.class)) {
                return (FriendTabViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f57254a, false, 61613, new Class[]{FragmentActivity.class}, FriendTabViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(FriendTabViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…TabViewModel::class.java)");
            return (FriendTabViewModel) viewModel;
        }
    }

    @JvmStatic
    @NotNull
    public static final FriendTabViewModel a(@NotNull FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity2}, null, f57250a, true, 61612, new Class[]{FragmentActivity.class}, FriendTabViewModel.class)) {
            return f57251d.a(fragmentActivity2);
        }
        return (FriendTabViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, null, f57250a, true, 61612, new Class[]{FragmentActivity.class}, FriendTabViewModel.class);
    }
}
