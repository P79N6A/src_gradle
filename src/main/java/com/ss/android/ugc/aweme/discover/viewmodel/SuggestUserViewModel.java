package com.ss.android.ugc.aweme.discover.viewmodel;

import a.g;
import a.i;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestUserResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rR,\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/SuggestUserViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "suggestUserLiveData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "Lcom/ss/android/ugc/aweme/discover/api/common/ResultModel;", "", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestUser;", "getSuggestUserLiveData", "()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "setSuggestUserLiveData", "(Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;)V", "refreshSuggestUsers", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SuggestUserViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43265a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public b<com.ss.android.ugc.aweme.discover.api.a.a<List<SuggestUser>>> f43266b = new b<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestUserResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    public static final class a<TTaskResult, TContinuationResult> implements g<SuggestUserResponse, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SuggestUserViewModel f43268b;

        public a(SuggestUserViewModel suggestUserViewModel) {
            this.f43268b = suggestUserViewModel;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f43267a, false, 38205, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f43267a, false, 38205, new Class[]{i.class}, Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                if (iVar.d()) {
                    b<com.ss.android.ugc.aweme.discover.api.a.a<List<SuggestUser>>> bVar = this.f43268b.f43266b;
                    Exception f2 = iVar.f();
                    Intrinsics.checkExpressionValueIsNotNull(f2, "it.error");
                    bVar.setValue(new com.ss.android.ugc.aweme.discover.api.a.a(f2));
                } else {
                    this.f43268b.f43266b.setValue(new com.ss.android.ugc.aweme.discover.api.a.a(((SuggestUserResponse) iVar.e()).data));
                }
            }
            return Unit.INSTANCE;
        }
    }
}
