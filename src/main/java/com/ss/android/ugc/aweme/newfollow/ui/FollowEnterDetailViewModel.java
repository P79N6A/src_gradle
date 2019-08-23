package com.ss.android.ugc.aweme.newfollow.ui;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/ui/FollowEnterDetailViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "enterDetail", "", "getEnterDetail", "()Z", "setEnterDetail", "(Z)V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowEnterDetailViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57206a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f57207c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f57208b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/ui/FollowEnterDetailViewModel$Companion;", "", "()V", "getViewModel", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowEnterDetailViewModel;", "tag", "", "activity", "Landroid/support/v4/app/FragmentActivity;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57209a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FollowEnterDetailViewModel a(@NotNull String str, @NotNull FragmentActivity fragmentActivity) {
            String str2 = str;
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{str2, fragmentActivity2}, this, f57209a, false, 61463, new Class[]{String.class, FragmentActivity.class}, FollowEnterDetailViewModel.class)) {
                return (FollowEnterDetailViewModel) PatchProxy.accessDispatch(new Object[]{str2, fragmentActivity2}, this, f57209a, false, 61463, new Class[]{String.class, FragmentActivity.class}, FollowEnterDetailViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "tag");
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get("FollowEnterDetailViewModel", FollowEnterDetailViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ailViewModel::class.java)");
            return (FollowEnterDetailViewModel) viewModel;
        }
    }

    @JvmStatic
    @NotNull
    public static final FollowEnterDetailViewModel a(@NotNull String str, @NotNull FragmentActivity fragmentActivity) {
        String str2 = str;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!PatchProxy.isSupport(new Object[]{str2, fragmentActivity2}, null, f57206a, true, 61462, new Class[]{String.class, FragmentActivity.class}, FollowEnterDetailViewModel.class)) {
            return f57207c.a(str2, fragmentActivity2);
        }
        return (FollowEnterDetailViewModel) PatchProxy.accessDispatch(new Object[]{str2, fragmentActivity2}, null, f57206a, true, 61462, new Class[]{String.class, FragmentActivity.class}, FollowEnterDetailViewModel.class);
    }
}
