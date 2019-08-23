package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/requesttask/idle/FetchUserInfoRequest;", "Lcom/ss/android/ugc/aweme/lego/LegoRequest;", "()V", "request", "", "context", "Landroid/content/Context;", "coldBoot", "", "type", "Lcom/ss/android/ugc/aweme/lego/RequestType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63631a;

    @NotNull
    public final e a() {
        if (PatchProxy.isSupport(new Object[0], this, f63631a, false, 70816, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f63631a, false, 70816, new Class[0], e.class);
        }
        try {
            a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            Boolean aB = b2.aB();
            Intrinsics.checkExpressionValueIsNotNull(aB, "SettingsReader.get().disableDelayFetchUserRequest");
            if (aB.booleanValue()) {
                return e.NORMAL;
            }
        } catch (Exception unused) {
        }
        if (com.ss.android.g.a.a()) {
            return e.NORMAL;
        }
        return e.IDLE;
    }

    public final void a(@NotNull Context context, boolean z) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63631a, false, 70817, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, this, f63631a, false, 70817, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        if (a2.isLogin()) {
            com.ss.android.ugc.aweme.account.d.a().queryUser();
            com.ss.android.ugc.aweme.account.d.a().refreshPassportUserInfo();
            com.ss.android.ugc.aweme.app.h.a();
        }
    }
}
