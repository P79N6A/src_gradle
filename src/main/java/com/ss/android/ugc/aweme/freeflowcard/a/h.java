package com.ss.android.ugc.aweme.freeflowcard.a;

import a.i;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.base.utils.s;
import com.ss.android.ugc.aweme.freeflowcard.data.FreeflowNoticeApi;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/strategy/WifiStrategyV2;", "Lcom/ss/android/ugc/aweme/freeflowcard/strategy/WifiStrategy;", "()V", "canHandle", "", "sendFreeflowNotice", "", "shouldPlay", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h extends g {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f48573c;

    /* renamed from: d  reason: collision with root package name */
    public static final h f48574d = new h();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/freeflowcard/strategy/WifiStrategyV2$sendFreeflowNotice$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "onFailure", "", "t", "", "onSuccess", "result", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements k<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48575a;

        public final void onFailure(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f48575a, false, 46171, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f48575a, false, 46171, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "t");
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }

        a() {
        }
    }

    private h() {
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f48573c, false, 46168, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48573c, false, 46168, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        AbTestModel d2 = a2.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "AbTestManager.getInstance().abTestSettingModel");
        if (d2.newFlowStrategy == 1) {
            m a3 = m.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "NetworkStateManager.getInstance()");
            if (a3.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f48573c, false, 46169, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48573c, false, 46169, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!super.c()) {
            if (PatchProxy.isSupport(new Object[0], this, f48573c, false, 46170, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48573c, false, 46170, new Class[0], Void.TYPE);
            } else {
                IAccountUserService a2 = d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                if (a2.isLogin()) {
                    l.a(FreeflowNoticeApi.f48600c.a(String.valueOf(s.b(com.ss.android.ugc.aweme.app.k.a()))), new a(), i.f1052b);
                }
            }
        }
        return true;
    }
}
