package com.ss.android.ugc.aweme.freeflowcard.a;

import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/strategy/MobileStrategyV2;", "Lcom/ss/android/ugc/aweme/freeflowcard/strategy/IPlayStrategy;", "()V", "mHasShowToast", "", "canHandle", "isMobile", "onNetworkChanged", "", "event", "Lcom/ss/android/ugc/aweme/qrcode/event/NetStateChangeEvent;", "shouldPlay", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3320a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f3321b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f3322c;

    private e() {
    }

    static {
        e eVar = new e();
        f3321b = eVar;
        bg.c(eVar);
    }

    private final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3320a, false, 46156, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3320a, false, 46156, new Class[0], Boolean.TYPE)).booleanValue();
        }
        m a2 = m.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "NetworkStateManager.getInstance()");
        if (a2.c()) {
            m a3 = m.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "NetworkStateManager.getInstance()");
            if (!a3.b()) {
                z = true;
            }
        }
        return z;
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f3320a, false, 46153, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3320a, false, 46153, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        AbTestModel d2 = a2.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "AbTestManager.getInstance().abTestSettingModel");
        if (d2.newFlowStrategy != 1 || !a()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f3320a, false, 46154, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3320a, false, 46154, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!f3322c && !a.f48550c) {
            f3322c = true;
            a.c(GlobalContext.getContext(), (int) C0906R.string.bbz).a();
            d dVar = new d();
            dVar.a("enter_from", a.f48549b);
            r.a("no_wifi_toast", (Map) dVar.f34114b);
        }
        return true;
    }

    @Subscribe(c = 1)
    public final void onNetworkChanged(@NotNull com.ss.android.ugc.aweme.qrcode.a.a aVar) {
        com.ss.android.ugc.aweme.qrcode.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3320a, false, 46155, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3320a, false, 46155, new Class[]{com.ss.android.ugc.aweme.qrcode.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
        if (a()) {
            f3322c = false;
        }
    }
}
