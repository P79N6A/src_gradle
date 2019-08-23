package com.ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.model.SearchEnterParam;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchEnterViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "enterParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchEnterParam;", "getEnterParam", "()Lcom/ss/android/ugc/aweme/discover/model/SearchEnterParam;", "setEnterParam", "(Lcom/ss/android/ugc/aweme/discover/model/SearchEnterParam;)V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchEnterViewModel extends ViewModel {

    /* renamed from: b  reason: collision with root package name */
    public static final a f43247b = new a((byte) 0);
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public SearchEnterParam f43248a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchEnterViewModel$Companion;", "", "()V", "get", "Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchEnterViewModel;", "activity", "Landroid/support/v4/app/FragmentActivity;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43249a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SearchEnterViewModel a(@NotNull FragmentActivity fragmentActivity) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f43249a, false, 38184, new Class[]{FragmentActivity.class}, SearchEnterViewModel.class)) {
                return (SearchEnterViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f43249a, false, 38184, new Class[]{FragmentActivity.class}, SearchEnterViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(SearchEnterViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…terViewModel::class.java)");
            return (SearchEnterViewModel) viewModel;
        }
    }
}
