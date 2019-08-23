package com.ss.android.ugc.aweme.follow;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/LiveTagViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "isLiveTagShown", "", "getLiveTagShowType", "", "setLiveTagShown", "", "shown", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LiveTagViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47730a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f47731c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f47732b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/LiveTagViewModel$Companion;", "", "()V", "getViewModel", "Lcom/ss/android/ugc/aweme/follow/LiveTagViewModel;", "activity", "Landroid/support/v4/app/FragmentActivity;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47733a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final LiveTagViewModel a(@NotNull FragmentActivity fragmentActivity) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f47733a, false, 44614, new Class[]{FragmentActivity.class}, LiveTagViewModel.class)) {
                return (LiveTagViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f47733a, false, 44614, new Class[]{FragmentActivity.class}, LiveTagViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(LiveTagViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…TagViewModel::class.java)");
            return (LiveTagViewModel) viewModel;
        }
    }

    @JvmStatic
    @NotNull
    public static final LiveTagViewModel a(@NotNull FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity2}, null, f47730a, true, 44613, new Class[]{FragmentActivity.class}, LiveTagViewModel.class)) {
            return f47731c.a(fragmentActivity2);
        }
        return (LiveTagViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, null, f47730a, true, 44613, new Class[]{FragmentActivity.class}, LiveTagViewModel.class);
    }

    public final int a() {
        if (this.f47732b) {
            return 1;
        }
        return 0;
    }
}
