package com.ss.android.ugc.aweme.qrcode.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.qrcode.b.a;
import kotlin.jvm.internal.Intrinsics;

public final class f extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f63354c;

    public f(a.C0684a aVar) {
        super(aVar);
    }

    public final boolean a(String str, int i) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f63354c, false, 70408, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f63354c, false, 70408, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{str2}, null, ParentalPlatformManager.f2598a, true, 21752, new Class[]{String.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, ParentalPlatformManager.f2598a, true, 21752, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (!TextUtils.isEmpty(str2) && str2 != null && ParentalPlatformManager.f2599b.a(str2)) {
                IAccountUserService a2 = d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                if (!a2.isLogin()) {
                    FullScreenLoginActivity.a aVar = FullScreenLoginActivity.f32892b;
                    com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                    Activity a3 = b2.a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "AppTracker.get().currentActivity");
                    Context context = a3;
                    if (PatchProxy.isSupport(new Object[]{context, "qr_code_detail", "auto"}, aVar, FullScreenLoginActivity.a.f32893a, false, 21123, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
                        FullScreenLoginActivity.a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{context, "qr_code_detail", "auto"}, aVar2, FullScreenLoginActivity.a.f32893a, false, 21123, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(context, "context");
                        Intrinsics.checkParameterIsNotNull("qr_code_detail", "enterForm");
                        Intrinsics.checkParameterIsNotNull("auto", "enterMethod");
                        Intent intent = new Intent(context, FullScreenLoginActivity.class);
                        intent.putExtra("enter_method", "auto");
                        intent.putExtra("enter_from", "qr_code_detail");
                        context.startActivity(intent);
                    }
                    com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.b7t).a();
                } else if (b.f33436b.b() == b.a.CLOSE) {
                    com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.b21).a();
                } else {
                    x a4 = x.a();
                    Intrinsics.checkExpressionValueIsNotNull(a4, "CommonSharePrefCache.inst()");
                    an<Boolean> l = a4.l();
                    Intrinsics.checkExpressionValueIsNotNull(l, "CommonSharePrefCache.inst().isForceMinor");
                    Object c2 = l.c();
                    Intrinsics.checkExpressionValueIsNotNull(c2, "CommonSharePrefCache.inst().isForceMinor.cache");
                    if (((Boolean) c2).booleanValue()) {
                        com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.ah_).a();
                    }
                }
                z = true;
            }
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }
}
