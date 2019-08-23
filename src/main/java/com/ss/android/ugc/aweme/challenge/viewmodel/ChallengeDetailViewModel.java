package com.ss.android.ugc.aweme.challenge.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006R#\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "awemeModel", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/challenge/presenter/ChallengeAwemeModel;", "getAwemeModel", "()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "listSortType", "getListSortType", "type", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ChallengeDetailViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35726a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f35727d = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final b<Integer> f35728b = new b<>();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final b<Pair<Integer, com.ss.android.ugc.aweme.challenge.c.a>> f35729c = new b<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel$Companion;", "", "()V", "inst", "Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel;", "activity", "Landroid/support/v4/app/FragmentActivity;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35730a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ChallengeDetailViewModel a(@NotNull FragmentActivity fragmentActivity) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f35730a, false, 26437, new Class[]{FragmentActivity.class}, ChallengeDetailViewModel.class)) {
                return (ChallengeDetailViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f35730a, false, 26437, new Class[]{FragmentActivity.class}, ChallengeDetailViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(ChallengeDetailViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ailViewModel::class.java)");
            return (ChallengeDetailViewModel) viewModel;
        }
    }

    @JvmStatic
    @NotNull
    public static final ChallengeDetailViewModel a(@NotNull FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity2}, null, f35726a, true, 26436, new Class[]{FragmentActivity.class}, ChallengeDetailViewModel.class)) {
            return f35727d.a(fragmentActivity2);
        }
        return (ChallengeDetailViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, null, f35726a, true, 26436, new Class[]{FragmentActivity.class}, ChallengeDetailViewModel.class);
    }
}
